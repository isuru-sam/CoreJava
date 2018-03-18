package com.corejava.threads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

public class StampLockDemo {
	ExecutorService executor = Executors.newFixedThreadPool(2);
    Map<String, String> map = new HashMap<>();
    StampedLock lock = new StampedLock();
    
    public void test() {

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                Thread.sleep(100);
                map.put("test", "INDIA");
            } catch (Exception e) {
            } finally {
                lock.unlockWrite(stamp);
            }
        });

        Runnable readTask = () -> {
            long stamp = lock.readLock();
            try {
                System.out.println(map.get("test"));
                Thread.sleep(100);
            } catch (Exception e) {
            } finally {
                lock.unlockRead(stamp);
            }
        };

        executor.submit(readTask);
        executor.submit(readTask);
    }
    
    public void testOptimistic() {
    	executor.submit(() -> {
            long stamp = lock.tryOptimisticRead();
            try {
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                Thread.sleep(100);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                Thread.sleep(1000);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
            } catch (Exception e) {
            } finally {
                lock.unlock(stamp);
            }
        });

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                System.out.println("Write Lock acquired");
                Thread.sleep(100);
            } catch (Exception e) {
            } finally {
                lock.unlock(stamp);
                System.out.println("Write done");
            }
        });
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StampLockDemo d = new StampLockDemo();
		d.testOptimistic();
	}

}

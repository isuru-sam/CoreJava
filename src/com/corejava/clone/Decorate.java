package com.corejava.clone;

import java.awt.Color;

public class Decorate {
public int x=10;
public Integer y = 100;

public Color color = Color.RED;

@Override
public String toString() {
	return "Decorate [x=" + x + ", y=" + y + ", color=" + color + "]";
}
}

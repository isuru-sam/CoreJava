package com.corejava.strings;

import java.awt.Color;

public class ColorPointComposition {
Point point;
Color color;
public ColorPointComposition(Point point, Color color) {
	
	this.point = point;
	this.color = color;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + ((point == null) ? 0 : point.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ColorPointComposition other = (ColorPointComposition) obj;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	if (point == null) {
		if (other.point != null)
			return false;
	} else if (!point.equals(other.point))
		return false;
	return true;
}
}

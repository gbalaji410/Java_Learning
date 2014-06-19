package com.balaji.math;

public class Line {
	
	private int slope;
	
	private int yintercept;
	
	private boolean infinity = false;
	
	private static final double epsilon = 0.0001;
	
	public Line(Point a, Point b) {
		if(Math.abs(a.getX() - b.getX()) > epsilon) {
			this.slope = (a.getY() - b.getY())/(a.getX() - b.getX()); //y = mx + b; m ==> slope
			this.yintercept = a.getY() - (a.getX() * getSlope()); //Using Y, X and Slope (m), calculate b.
		}
		else {
			infinity = true;
		}
	}

	private boolean isEqual (double a, double b){
		return Math.abs(a - b) < epsilon;
	}

	public int getSlope() {
		return slope;
	}

	public void setSlope(int slope) {
		this.slope = slope;
	}

	public int getYintercept() {
		return yintercept;
	}

	public void setYintercept(int yintercept) {
		this.yintercept = yintercept;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Line) {
			Line l = (Line) o;
			if(isEqual(getSlope(), l.getSlope()) && isEqual(getYintercept(), l.getYintercept()) &&
					l.infinity == this.infinity)
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int x = slope * 1000;
		int y = yintercept * 1000;
		return x | y;
	}
}

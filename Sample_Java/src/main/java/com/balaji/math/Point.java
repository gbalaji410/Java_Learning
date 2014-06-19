package com.balaji.math;


public class Point implements Comparable<Point> {
	private int x;
	private int y;
	private double distance = 0;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		double d = this.getDistance() - o.getDistance();
		if(d<0) {
			return -1;
		}
		else if (d>0) {
			return 1;
		}
		return 0;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
}

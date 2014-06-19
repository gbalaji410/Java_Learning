package com.balaji.intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntervalsImpl implements Intervals {
	
	private List<Point> points = new ArrayList<>();
	
	@Override
	public void addInterval(int from, int to) {
		Point p = new Point(from, to);
		points.add(p);
	}

	@Override
	public int getTotalCoveredLength() {
		int dist = 0;
		Collections.sort(points);
		Point curr = new Point(0,0);
		for(Point p : points) {
			if(p.x > curr.y) {
				dist = dist + (p.y - p.x);
			}
			else if (p.x < curr.y){
				dist = dist + (p.y - curr.y);
			}
			else if (p.x == curr.x) {
				dist = dist + (p.y - curr.y);
			}
			curr = p;
		}
		return dist;
	}

	static public void main (String[] args){
		Intervals in = new IntervalsImpl();
		in.addInterval(12, 15);
		in.addInterval(3, 6);
		in.addInterval(1, 5);
		in.addInterval(8, 9);
		in.addInterval(12, 15);
		
		System.out.println(in.getTotalCoveredLength());
	}
	
	class Point implements Comparable<Point> {
		public Point(int from, int to){
			this.x = from;
			this.y = to;
		}
		int x;
		int y;
		@Override
		public int compareTo(Point o) {
			return o == null ? 0 : (this.x - o.x);
		}
	}
}

package com.balaji.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinePassingthroughMaximumPoints {
	
	private static List<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
		points.add(point);
    }
	
	public static void main(String[] args) {
		
		LinePassingthroughMaximumPoints p = new LinePassingthroughMaximumPoints();

		p.addPoint(new Point(1, 1));
		p.addPoint(new Point(2, 2));
		p.addPoint(new Point(3, 3));
		p.addPoint(new Point(5, 5));
		p.addPoint(new Point(4, 4));
		p.addPoint(new Point(-3, 1));
		p.addPoint(new Point(6, 5));
		p.addPoint(new Point(4, 2));
		
		Line max = max(points);
		
		System.out.println(max.getSlope() + ":" + max.getYintercept());
	}

	public static Line max (List<Point> points){
		
		Line best = null;
		
		Map<Line, Integer> lineCounter = new HashMap<>();
		
		for(int i=0; i<points.size();i++){
			for(int j=1; j<points.size();j++){
				Line l = new Line(points.get(i), points.get(j));
				if(!lineCounter.containsKey(l)) {
					lineCounter.put(l, 0);
				}
				lineCounter.put(l, lineCounter.get(l) + 1);
				if(best == null || lineCounter.get(l) > lineCounter.get(best)) {
					best = l;
				}
			}		
		}
		
		return best;		
	}
}

package com.balaji.math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

public class PointsOnAPlaneImpl implements PointsOnAPlane {
	
	private List<Point> points = new ArrayList<>();
	 /**
     * Stores a given point in an internal data structure
     */
	@Override
    public void addPoint(Point point) {
		points.add(point);
    }

    /**
     * For given 'center' point returns a subset of 'm' stored points that are
     * closer to the center than others.
     *
     * E.g. Stored: (0, 1) (0, 2) (0, 3) (0, 4) (0, 5)
     *
     * findNearest(new Point(0, 0), 3) -> (0, 1), (0, 2), (0, 3)
     */
	@Override
    public Collection<Point> findNearest(Point center, int m) {
		
		PriorityQueue<Point> pq = new PriorityQueue<>();
		
		List<Point> list = new ArrayList<>();
		
		if(points.size() <= m){
			return points;
		}
		
		for(Point p:points){
			double dist = Math.sqrt(Math.pow((p.getX() - center.getX()), 2) + Math.pow((p.getY() - center.getY()), 2));
			p.setDistance(dist);
			pq.add(p);
		}
		
		for(int i=0;i<m;i++){
			list.add(pq.poll());
		}
		return list;
	}
	
	static public void main (String[] args){
		PointsOnAPlane p = new PointsOnAPlaneImpl();
		p.addPoint(new Point(0, 0));
		p.addPoint(new Point(0, 1));
		p.addPoint(new Point(1, 0));
		p.addPoint(new Point(1, 1));
		p.addPoint(new Point(2, 0));
		p.addPoint(new Point(2, 1));
		p.addPoint(new Point(3, 0));
		p.addPoint(new Point(3, 1));
		p.addPoint(new Point(4, 0));
		p.addPoint(new Point(4, 1));
		
		Collection<Point> findNearest = p.findNearest(new Point(1, 0), 4);
		
		for(Point x:findNearest){
			System.out.println("{" + x.getX() + "," + x.getY() + "}");
		}
	}
}

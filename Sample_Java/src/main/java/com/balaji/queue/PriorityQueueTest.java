package com.balaji.queue;


public class PriorityQueueTest {

	public static void main(String[] args) {
		int[] a = {19,4,12,3,5,88,190,1,5,3,2,9};
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		for(int in : a){
//			pq.offer(in);
//		}
//		
//		//while(!pq.isEmpty()){
//			//System.out.println(pq.remove());
//		//}
		System.out.println(nthSmallest(a, 5));
	}
	
	public static int nthSmallest (int[] a, int n){
		int len = a.length;
		int p = a[len/2];
		
		int[] s = new int[len];
		int[] b = new int[len];
		
		for(int i = 0;i<len;i++){
			if(a[i]<p){
				s[i] = a[i];
			}
			else{
				b[i] = a[i];
			}
		}
		
		if(s.length == n){
			return p;
		}
		if(s.length>n){
			return nthSmallest(s, n);
		}
		else{
			return nthSmallest(b, n);
		}
		//return 0;
	}
}

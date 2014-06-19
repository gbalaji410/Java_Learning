package com.balaji.arrays;

public class BinarySearchStringArrayWithEmptyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"","aaa","","cat","dog","","help","","tie","tied"};
		System.out.println(search(a, "tied", 0, a.length - 1));
	}
	
	public static int search (String[] a, String s, int low, int high) {
		int mid = low + (high - low)/2;
		
		if(mid > high)
			return -1;
		
		if(a[mid].isEmpty()) {
			int f = mid - 1;
			int l = mid + 1;
			while(true) {
				if(f < low && l > high) return -1;
				if(l<=high && !a[l].isEmpty()) {
					mid = l;
					break;
				}
				if(f>= low && !a[f].isEmpty()) {
					mid = f;
					break;
				}
				f--;
				l++;
			}
		}
		
		if(a[mid].equalsIgnoreCase(s)) {
			return mid;
		}
		else if (a[mid].compareTo(s) > 0) {
			return search(a, s, low, mid -1);
		}
		else {
			return search(a, s, mid + 1, high);
		}
	}
}

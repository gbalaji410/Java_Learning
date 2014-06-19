package com.balaji.nestedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NestedIntegerTest {

	/** 
	* Given a nested list of integers, returns the sum of all integers in the list weighted by their depth 
	* For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one 2 at depth 1) 
	* Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, one 6 at depth2) 
	*/ 
	
	public static void main(String[] args) {
		
		List<NestedInteger> l1 = new ArrayList<>();
		l1.add(new NestedIntegerImpl(6));
		List<NestedInteger> l2 = new ArrayList<>();
		l2.add(new NestedIntegerImpl(4)); l2.add(new NestedIntegerImpl(l1));//l2.add(new NestedIntegerImpl(4));

		NestedInteger e1 = new NestedIntegerImpl(l2);

		List<NestedInteger> finalList = new ArrayList<>();
		
		finalList.add(new NestedIntegerImpl(1)); 
		finalList.add(e1);

		
		System.out.println(depthSum(finalList));

	}
	
	/** 
	* Given a nested list of integers, returns the sum of all integers in the list weighted by their depth 
	* For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one 2 at depth 1) 
	* Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, one 6 at depth2) 
	*/ 
	public static int depthSum (List<NestedInteger> input)
	{
		
	    int sum = 0;	      
	    int depth = 1;
	    /**
	     * The Idea here is to create a list with the Integer and its corresponding depth so that it can be multiplied accordingly
	     * Given the list {1,{4,{6}}}, the final list will contain [1,1] [4,2] [6,3] i.e. 1*1 + 4*2 + 6*3 = sum
	     * */
	    while (!input.isEmpty()) {
	        
	        NestedInteger n = input.remove(0);
	        
	        if(n.isInteger()) {
	        	sum = sum + (n.getInteger() * depth);
	        }
	        else {
	        	List<NestedInteger> list = n.getList();
	        	
	        	int temp = depth + 1;

	        	while(!list.isEmpty()){
	        		NestedInteger nn = list.remove(0);
	        		if(nn.isInteger()) {
	    	        	sum = sum + (nn.getInteger() * temp);
	        		}
	        		else {
	        			temp = temp + 1;
	        			list.addAll(nn.getList());
	        		}
	        	}     
	        }
	    }
	  
	    return sum;
	}

	public static int getNestedValue (NestedInteger n, int seed){
		
		int sum = 0;
		if(n.isInteger()) {
			sum = sum + (seed * n.getInteger());
		}
		else {
			getNestedValue (n, seed + 1);

		}
		return sum;
	}
}

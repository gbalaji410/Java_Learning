package com.balaji.nestedlist;

import java.util.List;

public class NestedIntegerImpl implements NestedInteger {
	
	/** 
	* Given a nested list of integers, returns the sum of all integers in the list weighted by their depth 
	* For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one 2 at depth 1) 
	* Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, one 6 at depth2) 
	*/ 
	
	private Integer value;
	private List<NestedInteger> list;
	private boolean isInteger;
	
	public NestedIntegerImpl(Integer value){
		this.value = value;
		list = null;
		this.isInteger = true;
	}
	
	public NestedIntegerImpl(List<NestedInteger> list){
		this.list = list;
		this.value = null;
		this.isInteger = false;
	}
	
	@Override
	public boolean isInteger() {
		return this.isInteger;
	}

	@Override
	public Integer getInteger() {
		return this.value;
	}

	@Override
	public List<NestedInteger> getList() {
		return this.list;
	}

}

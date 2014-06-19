package com.balaji.designpatterns;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class SingletonClassTester implements Callable<SingletonClass>{

	@Test
	public void testSingleton() {
		
		SingletonClass a = SingletonClass.getInstance();
		SingletonClass b = SingletonClass.getInstance();
		
		//Double check if the reference are the same as well as the objects. 
		if(a!=b || !a.equals(b))
			fail("Your singleton implementation is broken.");
	}
	
	@Test
    public void testSingletonConcurrent(){
        
		ExecutorService executor = Executors.newFixedThreadPool(100);		
                      
        Set<SingletonClass> set = new HashSet<>();
        
        List<SingletonClassTester> workers = new ArrayList<>();

        try {
        	for (int i = 0; i < 500000; i++) {
        		workers.add(new SingletonClassTester());
        	}
            
            List<Future<SingletonClass>> all = executor.invokeAll(workers);

            for(Future<SingletonClass> result : all) {
            	SingletonClass s = result.get();
            	//System.out.println(s.hashCode());
            	if(set.isEmpty()) {
            		set.add(s);
            	}
            	else if(!set.contains(s)) {
        			fail("Your singleton implementation is broken.");
            	}
            }
        }
        catch(Exception e){}
        
    }

	@Override
	public SingletonClass call() throws Exception {
		return SingletonClass.getInstance();
	}

}

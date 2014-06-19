package com.balaji.designpatterns;

import java.io.ObjectStreamException;
import java.util.Date;

public class SingletonClass {
    
    private static volatile SingletonClass instance;
    
    private SingletonClass () {}
    
    public static SingletonClass getInstance() {
        
        if(instance == null) {
        	//Just printing the time to show multiple threads can enter here at the same time.
        	System.out.println(new Date().getTime());
            synchronized (SingletonClass.class) {
                if(instance == null) 
                {
                    instance = new SingletonClass();           
                }
            }
        }
        return instance;
    }   
    
    //Singleton even during deserialization.
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
package com.balaji.jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class JMXTest {
	
	private static MBeanServer mbs;
	
	public JMXTest() {
		mbs = ManagementFactory.getPlatformMBeanServer();
	}
	
	public static void main(String[] args) {
		JMXTest jmx = new JMXTest();
		
		Hello h = new Hello();
        ObjectName helloName = null;
        
        try {
			helloName = new ObjectName("Test:name=Hello");
	        mbs.registerMBean(h, helloName);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        h.sayHello();
        
        try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

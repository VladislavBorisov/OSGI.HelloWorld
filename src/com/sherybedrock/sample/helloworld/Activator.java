package com.sherybedrock.sample.helloworld;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	private MyThread myThread;

	public void start(BundleContext context) throws Exception {
		System.out.println("Starting com.sherybedrock.sample.helloworld");
		myThread = new MyThread();
		myThread.start();
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping com.sherybedrock.sample.helloworld");
		myThread.stopThread();
		myThread.join();
	}

}

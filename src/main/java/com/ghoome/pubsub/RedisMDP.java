package com.ghoome.pubsub;

public class RedisMDP {
	
	public void handleMessage(String message) {
		System.out.println("Received message " + message);
	}

	public void anotherHandle(String message) {
		System.out.println("Received message " + message);
	}
	
}

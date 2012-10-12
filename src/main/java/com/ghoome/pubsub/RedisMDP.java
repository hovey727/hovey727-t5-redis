/**
 * ZTE ALL RIGHT RESERVED
 */
package com.ghoome.pubsub;

/**
 * @author <a href="mailto:li.wei158@zte.com.cn">liwei</a>
 * @since 2012-10-12 下午4:48:34
 */
public class RedisMDP {
	
	public void handleMessage(String message) {
		System.out.println("Received message " + message);
	}

	public void anotherHandle(String message) {
		System.out.println("Received message " + message);
	}
	
}

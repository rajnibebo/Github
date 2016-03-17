/**
 * 
 */
package com.rajni.springbasics.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author rajni.ubhi
 *
 */
public class MessageEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public MessageEvent(Object source,String msg) {
		super(source);
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}

}

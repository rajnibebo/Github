/**
 * 
 */
package com.rajni.common.logger;

/**
 * @author rajni.ubhi
 *
 */
public class LogTest {
	private static Log logger = new Log("LogTest", "com.rajni.common.logger");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.setLevel("com.rajni", "DEBUG");
		logger.debug("Hii!!!");
		logger.info(logger.formatMessage("Running successfully..."));
	}

}

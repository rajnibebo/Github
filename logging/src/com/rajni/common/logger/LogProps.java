/**
 * 
 */
package com.rajni.common.logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author rajni.ubhi
 *
 */
public class LogProps {
	public static String appConfigDirectory = "C://Outpost/Properties/";
	public static String defaultPropFileName = appConfigDirectory+"logger.properties";
	public static int debugLevel = 0;
	public static boolean requestTimeLog = true;
	static {
		String str1 = null;
		String str2 = null;
		if(appConfigDirectory == null) {
			System.out.println("No Logger.properties found");
		} else {
			System.out.println("********* Loading logger.properties **********");
			try {
				FileInputStream fis = new FileInputStream(defaultPropFileName);
				Properties localProperties = new Properties();
				localProperties.load(fis);
				fis.close();
				str1 = "debugLevel";
				str2 = localProperties.getProperty(str1);
				if(str2 != null) {
					debugLevel = Integer.parseInt(str2);
				}
				str1 = "requestTimeLog";
				str2 = localProperties.getProperty(str1);
				if(str2 != null && str2.equalsIgnoreCase("false")) {
					requestTimeLog = false;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


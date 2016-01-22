/**
 * 
 */
package com.rajni.common.logger;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Category;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * @author rajni.ubhi
 * 
 */
public class Log {
	
	public static final Level ALL = Level.ALL;
	public static final Level INFO = Level.INFO;
	public static final Level DEBUG = Level.DEBUG;
	public static final Level ERROR = Level.ERROR;
	public static final Level FATAL = Level.FATAL;
	public static final Level OFF = Level.OFF;
	public static final Level WARN = Level.WARN;

	private Category cat = null;
	private static boolean groupNameFlag = false;
	private String groupName = null;
	private static int debugLevel;

	static {
		String path = "C://Outpost/Properties/";
		String file = path+"log.xml";
		if(new File(file).exists()) {
			configure(file);
		} else {
			path += "logger.properties";
			configure1(path);
		}
		debugLevel = LogProps.debugLevel;
	}
	
	public static void configure(String paramString) {
		if(!new File(paramString).exists()) {
			System.out.println("Please configure file : "+paramString);	
		}
		DOMConfigurator.configure(paramString);
	}
	
	public static void configure1(String paramString) {
		PropertyConfigurator.configure(paramString);
	}
	//GIT TESTING Hello hello again
	public Log(String param) {
		// TODO Auto-generated constructor stub
		cat = Category.getInstance(param);
	}
	
	public Log(Class className) {
		// TODO Auto-generated constructor stub
		cat = Category.getInstance(className.getName());
	}

	public Log(String param1, String param2) {
		// TODO Auto-generated constructor stub
		this.groupName = param1;
		this.cat = Category.getInstance(param2);
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName
	 *            the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public static void setLevel(String param) {
		Logger.getRootLogger().setLevel(Level.toLevel(param));
	}

	public static void setLevel(String paramString1, String paramString2) {
		Logger.getLogger(paramString1).setLevel(Level.toLevel(paramString2));
	}

	public static int setdebugLevel(int paramInt) {
		if (paramInt < 1 && paramInt > 3) {
			return -1;
		}
		debugLevel = paramInt;
		return debugLevel;
	}

	public static int getdebugLevel() {
		return debugLevel;
	}

	public void debug(String param) {
		this.cat.debug(param);
	}

	public void debug0(String paramString) {
		if ((debugLevel > -1) && (debugLevel < 4))
			this.cat.debug(paramString);
	}

	public void debug1(String paramString) {
		if ((debugLevel > 0) && (debugLevel < 4))
			this.cat.debug(paramString);
	}

	public void debug2(String paramString) {
		if ((debugLevel > 1) && (debugLevel < 4))
			this.cat.debug(paramString);
	}

	public void debug3(String paramString) {
		if ((debugLevel > 2) && (debugLevel < 4))
			this.cat.debug(paramString);
	}
	
	public void info(String paramString) {
		this.cat.info(paramString);
	}
	
	public void warn(String paramString) {
		this.cat.warn(paramString);
	}
	
	public void error(String paramString) {
		this.cat.error(paramString);
	}
	
	public void err(String paramString) {
		this.cat.error(paramString);
	}
	
	public void crit(String paramString) {
		this.cat.error("[CRITICAL ERROR]:"+paramString);
	}
	
	public void error(Exception exception) {
		StringWriter str = new StringWriter();
		PrintWriter ptr = new PrintWriter(str, true);
		exception.printStackTrace(ptr);
		System.out.println(str.toString());
		this.cat.error(exception.getMessage());
	}
	
	public void error(Exception exception, String paramString) {
		this.cat.error(paramString);
		error(exception);
	}
	
	public void fatal(String paramString) {
		this.cat.fatal(paramString);
	}
	
	public String formatMessage(String paramString) {
		if(this.groupName != null && groupNameFlag == true) {
			paramString = "["+groupName+"]"+paramString;
		}
		return paramString;
	}
	
	public static void main(String[] args) {
		new Log(Log.class).info("here i am");
	}
}

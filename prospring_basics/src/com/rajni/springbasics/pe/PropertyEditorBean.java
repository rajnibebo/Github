/**
 * 
 */
package com.rajni.springbasics.pe;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class PropertyEditorBean {
	
	private byte[] bytes;
	
	private Class<?> cls;
	
	private Boolean trueOrFalse;
	
	private List<String> stringList;
	
	private Date date;
	
	private Float floatValue;
	
	private File file;
	
	private InputStream stream;
	
	private Locale locale;
	
	private Pattern pattern;
	
	private Properties properties;
	
	private String trimSize;
	
	private URL url;

	/**
	 * @return the bytes
	 */
	public byte[] getBytes() {
		return bytes;
	}

	/**
	 * @param bytes the bytes to set
	 */
	public void setBytes(byte[] bytes) {
		System.out.println("Setting bytes :"+bytes);
		this.bytes = bytes;
	}

	/**
	 * @return the cls
	 */
	public Class<?> getCls() {
		return cls;
	}

	/**
	 * @param cls the cls to set
	 */
	public void setCls(Class<?> cls) {
		System.out.println("Setting Cls : "+cls);
		this.cls = cls;
	}

	/**
	 * @return the trueOrFalse
	 */
	public Boolean getTrueOrFalse() {
		return trueOrFalse;
	}

	/**
	 * @param trueOrFalse the trueOrFalse to set
	 */
	public void setTrueOrFalse(Boolean trueOrFalse) {
		System.out.println("Setting trueOrFalse : "+trueOrFalse);
		this.trueOrFalse = trueOrFalse;
	}

	/**
	 * @return the stringList
	 */
	public List<String> getStringList() {
		return stringList;
	}

	/**
	 * @param stringList the stringList to set
	 */
	public void setStringList(List<String> stringList) {
		System.out.println("Setting stringList : "+stringList);
		this.stringList = stringList;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		System.out.println("Setting date : "+date);
		this.date = date;
	}

	/**
	 * @return the floatValue
	 */
	public Float getFloatValue() {
		return floatValue;
	}

	/**
	 * @param floatValue the floatValue to set
	 */
	public void setFloatValue(Float floatValue) {
		System.out.println("Setting FloatValue : "+floatValue);
		this.floatValue = floatValue;
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		System.out.println("Setting file : "+file);
		this.file = file;
	}

	/**
	 * @return the stream
	 */
	public InputStream getStream() {
		return stream;
	}

	/**
	 * @param stream the stream to set
	 */
	public void setStream(InputStream stream) {
		System.out.println("Setting stream :"+stream);
		this.stream = stream;
	}

	/**
	 * @return the locale
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * @param locale the locale to set
	 */
	public void setLocale(Locale locale) {
		System.out.println("Setting Locale : "+locale);
		this.locale = locale;
	}

	/**
	 * @return the pattern
	 */
	public Pattern getPattern() {
		return pattern;
	}

	/**
	 * @param pattern the pattern to set
	 */
	public void setPattern(Pattern pattern) {
		System.out.println("Setting pattern : "+pattern);
		this.pattern = pattern;
	}

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		System.out.println("Setting properties : "+properties);
		this.properties = properties;
	}

	/**
	 * @return the url
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(URL url) {
		System.out.println("Setting url : "+url);
		this.url = url;
	}

	/**
	 * @return the trimSize
	 */
	public String getTrimSize() {
		return trimSize;
	}

	/**
	 * @param trimSize the trimSize to set
	 */
	public void setTrimSize(String trimSize) {
		System.out.println("Setting trimSize : "+trimSize);
		this.trimSize = trimSize;
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/pe/builtin.xml");
		ctx.refresh();
		
		PropertyEditorBean bean = (PropertyEditorBean) ctx.getBean("builtin");
		System.out.println(bean);
	}
}

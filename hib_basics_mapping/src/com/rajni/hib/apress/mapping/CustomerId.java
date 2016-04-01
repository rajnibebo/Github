/**
 * 
 */
package com.rajni.hib.apress.mapping;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author rajni.ubhi
 *
 */
public class CustomerId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String countryCode;
	private String idCardNo;
	
	public CustomerId(String countryCode, String idCardNo) {
		// TODO Auto-generated constructor stub
		this.countryCode = countryCode;
		this.idCardNo = idCardNo;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the idCardNo
	 */
	public String getIdCardNo() {
		return idCardNo;
	}
	/**
	 * @param idCardNo the idCardNo to set
	 */
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	
	public String toString() {
		return "Customer : CountryCode: "+countryCode+" , Card Id : "+idCardNo;
	}
	
	public boolean equals(Object object) {
		if(!(object instanceof CustomerId)) {
			return false;
		}
		CustomerId other = (CustomerId) object;
		return new EqualsBuilder().append(countryCode, other.countryCode).append(idCardNo, other.idCardNo).isEquals();
	}
	
	public int hashCode() {
		return new HashCodeBuilder().append(countryCode).append(idCardNo).toHashCode();
	}
}

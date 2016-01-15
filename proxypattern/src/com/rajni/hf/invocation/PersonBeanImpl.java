/**
 * 
 */
package com.rajni.hf.invocation;

/**
 * @author rajni.ubhi
 *
 */
public class PersonBeanImpl implements PersonBean {

	private String name;
	private String gender;
	private int rating;
	private int ratingCount = 0;
	private String interests;
	
	/* (non-Javadoc)
	 * @see com.rajni.hf.invocation.PersonBean#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/* (non-Javadoc)
	 * @see com.rajni.hf.invocation.PersonBean#getGender()
	 */
	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	/* (non-Javadoc)
	 * @see com.rajni.hf.invocation.PersonBean#getInterests()
	 */
	@Override
	public String getInterests() {
		// TODO Auto-generated method stub
		return interests;
	}

	/* (non-Javadoc)
	 * @see com.rajni.hf.invocation.PersonBean#getHotOrNotRating()
	 */
	@Override
	public int getHotOrNotRating() {
		// TODO Auto-generated method stub
		if(ratingCount == 0) {
			return 0;
		}
		return rating/ratingCount;
	}

	/* (non-Javadoc)
	 * @see com.rajni.hf.invocation.PersonBean#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.rajni.hf.invocation.PersonBean#setGender(java.lang.String)
	 */
	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;
	}

	/* (non-Javadoc)
	 * @see com.rajni.hf.invocation.PersonBean#setInterests(java.lang.String)
	 */
	@Override
	public void setInterests(String interests) {
		// TODO Auto-generated method stub
		this.interests = interests;
	}

	/* (non-Javadoc)
	 * @see com.rajni.hf.invocation.PersonBean#setHotOrNotRating(int)
	 */
	@Override
	public void setHotOrNotRating(int i) {
		// TODO Auto-generated method stub
		this.rating += i;
		this.ratingCount++;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

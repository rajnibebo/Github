package com.rajni.spring.ch10.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ContactTelDetails.class)
public abstract class ContactTelDetails_ {

	public static volatile SingularAttribute<ContactTelDetails, Long> id;
	public static volatile SingularAttribute<ContactTelDetails, Contact> contact;
	public static volatile SingularAttribute<ContactTelDetails, Integer> version;
	public static volatile SingularAttribute<ContactTelDetails, String> telType;
	public static volatile SingularAttribute<ContactTelDetails, String> telNumber;

}


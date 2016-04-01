
CREATE TABLE CONTACT (
	ID INT NOT NULL AUTO_INCREMENT, 
	FIRST_NAME VARCHAR(60) NOT NULL, 
	LAST_NAME VARCHAR(40) NOT NULL, 
	BIRTH_DATE DATE, 
	UNIQUE UQ_CONTACT_1 (FIRST_NAME, LAST_NAME), 
	PRIMARY KEY (ID)
);
CREATE TABLE CONTACT_TEL_DETAIL (
ID INT NOT NULL AUTO_INCREMENT
, CONTACT_ID INT NOT NULL
, TEL_TYPE VARCHAR(20) NOT NULL
, TEL_NUMBER VARCHAR(20) NOT NULL
, UNIQUE UQ_CONTACT_TEL_DETAIL_1 (CONTACT_ID, TEL_TYPE)
, PRIMARY KEY (ID)
, CONSTRAINT FK_CONTACT_TEL_DETAIL_1 FOREIGN KEY (CONTACT_ID)
REFERENCES CONTACT (ID)
);

insert into contact (first_name, last_name, birth_date) values ('Clarence', 'Ho','1980-07-30');
insert into contact (first_name, last_name, birth_date) values ('Scott', 'Tiger','1990-11-02');
insert into contact (first_name, last_name, birth_date) values ('John', 'Smith','1964-02-28');
insert into contact_tel_detail (contact_id, tel_type, tel_number) values (1, 'Mobile','1234567890');
insert into contact_tel_detail (contact_id, tel_type, tel_number) values (1, 'Home','1234567890');
insert into contact_tel_detail (contact_id, tel_type, tel_number) values (2, 'Home','1234567890');
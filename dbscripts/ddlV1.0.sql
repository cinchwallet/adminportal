CREATE TABLE MERCHANT (
  UID INT(11) NOT NULL AUTO_INCREMENT,
  MERCHANT_ID VARCHAR(25) DEFAULT NULL,
  NAME VARCHAR(50) DEFAULT NULL,
  DESCRIPTION VARCHAR(50) DEFAULT NULL,
  ADDRESS VARCHAR(100) DEFAULT NULL,
  CITY VARCHAR(15) DEFAULT NULL,
  PIN VARCHAR(10) DEFAULT NULL,
  STATE VARCHAR(20) DEFAULT NULL,
  COUNTRY VARCHAR(20) DEFAULT NULL,
  PHONE VARCHAR(15) DEFAULT NULL,
  MOBILE VARCHAR(15) DEFAULT NULL,
  EMAIL VARCHAR(50) DEFAULT NULL,
  WEBSITE VARCHAR(50) DEFAULT NULL,
  STATUS BOOLEAN  DEFAULT NULL,
  CREATED_TIMESTAMP DATETIME DEFAULT NULL,
  UPDATED_TIMESTAMP DATETIME DEFAULT NULL,
  PRIMARY KEY (UID)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=UTF8;


CREATE TABLE STORE (
  UID INT(11) NOT NULL AUTO_INCREMENT,
  MERCHANT_ID INT(11) NOT NULL,
  STORE_ID VARCHAR(25) NOT NULL,
  NAME VARCHAR(50) DEFAULT NULL,
  DESCRIPTION VARCHAR(50) DEFAULT NULL,
  ADDRESS VARCHAR(100) DEFAULT NULL,
  CITY VARCHAR(15) DEFAULT NULL,
  PIN VARCHAR(10) DEFAULT NULL,
  STATE VARCHAR(20) DEFAULT NULL,
  COUNTRY VARCHAR(20) DEFAULT NULL,
  PHONE VARCHAR(15) DEFAULT NULL,
  MOBILE VARCHAR(15) DEFAULT NULL,
  EMAIL VARCHAR(50) DEFAULT NULL,
  WEBSITE VARCHAR(50) DEFAULT NULL,
  STATUS BOOLEAN  DEFAULT NULL,
  CREATED_TIMESTAMP DATETIME DEFAULT NULL,
  UPDATED_TIMESTAMP DATETIME DEFAULT NULL,
  PRIMARY KEY (UID)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=UTF8;


CREATE TABLE USER (
  `UID` int(11) NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` varchar(50) DEFAULT NULL,
  `LAST_NAME` varchar(50) DEFAULT NULL,
  `ADDRESS` varchar(100) DEFAULT NULL,
  `CITY` varchar(15) DEFAULT NULL,
  `PIN` varchar(10) DEFAULT NULL,
  `STATE` varchar(20) DEFAULT NULL,
  `COUNTRY` varchar(20) DEFAULT NULL,
  `PHONE` varchar(15) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `STATUS` tinyint(1) DEFAULT NULL,
  `CREATED_TIMESTAMP` datetime DEFAULT NULL,
  `UPDATED_TIMESTAMP` datetime DEFAULT NULL,
  PRIMARY KEY (`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8



CREATE TABLE `USER_LOGIN` (
  `UID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(50) DEFAULT NULL,
  `PASSWORD` varchar(50) DEFAULT NULL,
  `USER_TYPE` int(11) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `STATUS` tinyint(1) DEFAULT NULL,
  `CREATED_TIMESTAMP` datetime DEFAULT NULL,
  `UPDATED_TIMESTAMP` datetime DEFAULT NULL,
  PRIMARY KEY (`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8


CREATE TABLE CARD_PRODUCT (
  UID int(11) NOT NULL AUTO_INCREMENT,
  UPC VARCHAR(20) DEFAULT NULL,
  NAME VARCHAR(50) DEFAULT NULL,
  DESCRIPTION VARCHAR(50) DEFAULT NULL,
  CURRENCY VARCHAR(3) DEFAULT NULL,
  ISSUING_MERCHANT VARCHAR(50) DEFAULT NULL,
  POINT_PROGRAM BOOLEAN DEFAULT NULL,
  STATUS BOOLEAN DEFAULT NULL,
  CARD_TYPE VARCHAR(20) DEFAULT NULL, 
  RELOAD_LIMIT DOUBLE DEFAULT NULL,
  REDEEM_LIMIT DOUBLE DEFAULT NULL,
  SUPPORTED_TXN VARCHAR(50) DEFAULT NULL,
  ONLINE_PIN_REQUIRED BOOLEAN DEFAULT NULL,
  CREATED_TIMESTAMP DATETIME DEFAULT NULL,
  UPDATED_TIMESTAMP DATETIME DEFAULT NULL,
  PRIMARY KEY (UID)
) ENGINE=INNODB AUTO_INCREMENT=8 DEFAULT CHARSET=UTF8;



  CREATE TABLE TXN_TYPE (
	UID int(11) NOT NULL AUTO_INCREMENT,
	TXN_NAME VARCHAR(15) NOT NULL,
	TXN_CODE VARCHAR(10) NOT NULL,
	DESCRIPTION VARCHAR(30) DEFAULT NULL,
	CREATED_TIMESTAMP DATETIME DEFAULT NULL,
	UPDATED_TIMESTAMP DATETIME DEFAULT NULL,
	PRIMARY KEY (UID)
  )ENGINE=INNODB AUTO_INCREMENT=8 DEFAULT CHARSET=UTF8;

  
  
CREATE TABLE OLTP_TXN_LOG (
  OLTP_TXN_LOG_ID int(11) NOT NULL AUTO_INCREMENT,
  LEG VARCHAR(10) DEFAULT NULL,
  PAN VARCHAR(200) DEFAULT NULL,
  PAN_HINT VARCHAR(20) DEFAULT NULL,
  TXN_AMOUNT DOUBLE DEFAULT NULL,
  DT_TRANSMISSION TIMESTAMP NULL DEFAULT NULL,
  STAN VARCHAR(12) DEFAULT NULL,
  DT_TRANSACTION TIMESTAMP NULL DEFAULT NULL,
  APPROVAL_CD VARCHAR(6) DEFAULT NULL,
  REASON_CD VARCHAR(4) DEFAULT NULL,
  RESULT_CD VARCHAR(4) DEFAULT NULL,
  TID VARCHAR(16) DEFAULT NULL,
  SID VARCHAR(35) DEFAULT NULL,
  MID VARCHAR(35) DEFAULT NULL,
  TRANSACTION_TYPE VARCHAR(16) DEFAULT NULL,
  PRIMARY KEY (txn_log_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


CREATE TABLE CARD (
  UID INT(11) NOT NULL AUTO_INCREMENT,
  NUMBER VARCHAR(20) DEFAULT NULL,
  PROXY_NUMBER VARCHAR(100) DEFAULT NULL,
  CARD_PRODUCT VARCHAR(20) NOT NULL,
  PRELOADED_AMOUNT DOUBLE DEFAULT NULL,
  EXPIRY_DATE VARCHAR(4)  DEFAULT NULL,
  BALANCE DOUBLE DEFAULT NULL,
  STATUS BOOLEAN DEFAULT NULL,
  CREATED_TIMESTAMP DATETIME DEFAULT NULL,
  UPDATED_TIMESTAMP DATETIME DEFAULT NULL,
  PRIMARY KEY (UID)
) ENGINE=INNODB AUTO_INCREMENT=8 DEFAULT CHARSET=UTF8;


CREATE TABLE CUSTOMER (
  ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  CUSTOMER_ID VARCHAR(50) NOT NULL,
  TITLE VARCHAR(4) DEFAULT NULL,
  FIRST_NAME VARCHAR(50) DEFAULT NULL,
  MIDDLE_NAME VARCHAR(50) DEFAULT NULL,
  LAST_NAME VARCHAR(50) DEFAULT NULL,
  ADDRESS_LINE1 VARCHAR(100) DEFAULT NULL,
  ADDRESS_LINE2 VARCHAR(100) DEFAULT NULL,
  CITY VARCHAR(50) DEFAULT NULL,
  STATE VARCHAR(50) DEFAULT NULL,
  COUNTRY VARCHAR(50) DEFAULT NULL,
  PHONE_WORK VARCHAR(20) DEFAULT NULL,
  PHONE_HOME VARCHAR(20) DEFAULT NULL,
  PHONE_MOBILE VARCHAR(20) DEFAULT NULL,
  EMAIL_ADDRESS VARCHAR(50) DEFAULT NULL,
  IS_ACTIVE CHAR(1) DEFAULT NULL,
  CREATED_TS DATETIME DEFAULT NULL,
  UPDATED_TS DATETIME DEFAULT NULL,
  PRIMARY KEY (ID),
  UNIQUE KEY CUSTOMER_ID_UNIQUE (CUSTOMER_ID)
  )ENGINE=INNODB AUTO_INCREMENT=8 DEFAULT CHARSET=UTF8;



  CREATE TABLE CUSTOMER_CARD (
  ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  CUSTOMER_ID VARCHAR(50) NOT NULL,
  CARD_NUMBER VARCHAR(20) DEFAULT NULL,
  CREATED_TS DATETIME DEFAULT NULL,
  UPDATED_TS DATETIME DEFAULT NULL,
  PRIMARY KEY (ID)
  )ENGINE=INNODB AUTO_INCREMENT=8 DEFAULT CHARSET=UTF8;



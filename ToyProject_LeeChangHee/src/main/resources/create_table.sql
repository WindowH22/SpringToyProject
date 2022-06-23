DROP TABLE WOORI_BANK;
DROP TABLE KBSTAR_BANK;

CREATE TABLE WOORI_BANK(
	ACCOUNT_NUMBER VARCHAR2(20) PRIMARY KEY, 
	NAME VARCHAR2(30) NOT NULL,
	BALANCE NUMBER(9) NOT NULL, 
	RECEIPT_DATE DATE DEFAULT CURRENT_DATE,
	WITHDRAW_DATE DATE DEFAULT CURRENT_DATE
);

INSERT INTO WOORI_BANK VALUES('027-145612-45-325', '홍길동', 7500000, CURRENT_DATE, CURRENT_DATE);

CREATE TABLE KBSTAR_BANK(
	ACCOUNT_NUMBER VARCHAR2(20) PRIMARY KEY, 
	NAME VARCHAR2(30) NOT NULL,
	BALANCE NUMBER(9) NOT NULL,
	RECEIPT_DATE DATE DEFAULT CURRENT_DATE,
	WITHDRAW_DATE DATE DEFAULT CURRENT_DATE
);

INSERT INTO KBSTAR_BANK VALUES('001-234512-02-007', '홍길동', 1200000, CURRENT_DATE, CURRENT_DATE);

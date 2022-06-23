package com.ssamz.biz.service;

import java.sql.Date;

import lombok.Data;

// 1. VO(Value Object) 클래스
@Data
public class BankVO {
	// 계좌번호, 이름, 잔핵, 입금 날짜, 인출 날짜
	private String accountNumber;
	private String name;
	private int balance;
	private Date receiptDate;
	private Date withdrawalDate;
	
	private int amount;
	private String bankName;
	private String transferAccount;
}

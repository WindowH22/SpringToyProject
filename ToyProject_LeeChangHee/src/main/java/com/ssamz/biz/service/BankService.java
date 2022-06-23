package com.ssamz.biz.service;

// 3. Service 인터페이스
public interface BankService {

	// 우리은행 계좌 정보
	public BankVO getAccountWoori(BankVO vo) ;
	
	
	// 국민은행 계좌 정보
	public BankVO getAccountKB(BankVO vo) ;
		
	

	public void transfer(BankVO vo);


}
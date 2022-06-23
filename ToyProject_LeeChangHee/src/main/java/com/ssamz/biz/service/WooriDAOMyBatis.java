package com.ssamz.biz.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

// 2. DAO(Data Access Object) 클래스
//@Repository
public class WooriDAOMyBatis  {
	
	@Autowired
	private SqlSessionTemplate mybatis;
		
	public BankVO getAccount(BankVO vo) {
		System.out.println("===> MyBatis 기반으로 getAccount() 기능 처리(Woori)");
		return (BankVO)mybatis.selectOne("WooriBankDAO.getAccount", vo);
	}
	
	
	// 이체하기
	public void transfer(BankVO vo) {
		System.out.println("===> MyBatis 기반으로 transfer() 기능 처리");
//		vo.setReceiptDate(null);
//		vo.setWithdrawalDate(null);
		
		mybatis.update("WooriBankDAO.transfer",vo);
	}


}















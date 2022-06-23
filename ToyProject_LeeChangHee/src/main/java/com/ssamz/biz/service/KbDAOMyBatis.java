package com.ssamz.biz.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// 2. DAO(Data Access Object) 클래스
//@Repository
public class KbDAOMyBatis  {
	
	@Autowired
	private SqlSessionTemplate mybatis;
		
	public BankVO getAccount(BankVO vo) {
		System.out.println("===> MyBatis 기반으로 getAccount() 기능 처리(KB)");
		return (BankVO)mybatis.selectOne("KbStarBankDAO.getAccount", vo);
	}
	
	
	
	// 이체하기
	public void transfer(BankVO vo) {
		System.out.println("===> MyBatis 기반으로 transfer() 기능 처리");
		mybatis.update("KbStarBankDAO.transfer",vo);
	}


}















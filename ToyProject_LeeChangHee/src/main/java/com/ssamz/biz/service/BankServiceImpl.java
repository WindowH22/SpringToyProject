package com.ssamz.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 4. Service 구현 클래스(비즈니스 클래스)
@Service("bankService")
public class BankServiceImpl implements BankService {

	@Autowired
	private WooriDAOMyBatis wooriBankDAO;
	
	@Autowired
	private KbDAOMyBatis KbStarBankDAO;
	
	public BankServiceImpl() {
		System.out.println("===> BankServiceImpl 생성");
	}
	
	@Override
	public void transfer(BankVO vo) {
		if(vo.getBalance() >= vo.getAmount()) {
			wooriBankDAO.transfer(vo);
		}else {
			System.out.println("계좌에 존재하는 금액보다 이체할 금액이 큽니다.");
		}
				
	}


	@Override
	public BankVO getAccountWoori(BankVO vo) {
		return wooriBankDAO.getAccount(vo);
	}


	@Override
	public BankVO getAccountKB(BankVO vo) {
		return KbStarBankDAO.getAccount(vo);
	}

}

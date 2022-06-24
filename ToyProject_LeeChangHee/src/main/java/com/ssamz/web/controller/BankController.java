package com.ssamz.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssamz.biz.service.BankService;
import com.ssamz.biz.service.BankVO;

@Controller
public class BankController {

	@Autowired
	private BankService bankService;

	// 잔액 조회 화면 이동
	@RequestMapping("/getbalanceView.do")
	public String getbalanceView() {
		return "getBalance";
	}

	// 계좌 조회
	@RequestMapping("/getbalance.do")
	public String getBalance(BankVO vo, Model model) {
			
		model.addAttribute("bank", bankService.getAccountWoori(vo));
		System.out.println(bankService.getAccountWoori(vo).toString());
		return "getBalance";
	}

	@RequestMapping("/transfer.do")
	public String transfer(BankVO vo, Model model) {
		//woori은행데이터 가져오기
		model.addAttribute("bankWoori", bankService.getAccountWoori(vo));
		return "transfer";
	}

	// 계좌이체
	@RequestMapping("/transferResult.do")
	public String transferResult(BankVO vo, Model model) {
		
		if (vo.getBankName().equals("KB")) {
			// KB계좌번호와 입력계좌번호 비교
			if(vo.getTransferAccount().equals(bankService.getAccountKB(vo).getAccountNumber())) {
				bankService.transfer(vo);
				bankService.deposit(vo);
				model.addAttribute("bankWoori", bankService.getAccountWoori(vo));
				model.addAttribute("bankKb", bankService.getAccountKB(vo));
				return "transferResult";	
			}
			model.addAttribute("bankWoori", bankService.getAccountWoori(vo));
			return "transfer";
		} else {
			return "forward:/index.jsp";
		}
	}
}

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

	// 잔액 조회
	@RequestMapping("/getbalance.do")
	public String getBalance(BankVO vo, Model model) {
		model.addAttribute("bank", bankService.getAccountWoori(vo));
		System.out.println(bankService.getAccountWoori(vo).toString());
		return "getBalance";
	}

	@RequestMapping("/transfer.do")
	public String transfer(BankVO vo, Model model) {
		model.addAttribute("bank", bankService.getAccountWoori(vo));
		System.out.println(bankService.getAccountWoori(vo).toString());
		return "transfer";
	}

	// 계좌이체
	@RequestMapping("/transferResult.do")
	public String transferResult(BankVO vo, Model model) {

		if (vo.getBankName().equals("KB")) {
			System.out.println(bankService.getAccountWoori(vo).toString());
			// 이체할 금액이 계좌에 있는 금액보다 작을시

			bankService.transfer(vo);
			model.addAttribute("bank", bankService.getAccountWoori(vo));
			return "transferResult";

		} else {
			return "forward:/index.jsp";

		}

	}

}

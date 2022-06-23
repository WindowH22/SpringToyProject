<%@page import="com.ssamz.biz.service.BankVO"%>
<%@page contentType="text/html; charset=UTF-8" %>

<!-- 
	EL(Expression Lanaguage)이란?
	request, session, application 내장객체에 등록된 데이터를 접근하기 위한 표현식
	
	JSTL(JSP Standard Tag Library)이란?
	JSP 파일에서 if, for, switch 같은 자바 코드를 대체하기 위한 표준 태그
-->



<center>
<h1>계좌 이체결과</h1>
<br>
<h3> 은행</h3>
<form action="getbalance.do" method="post">

<table width="600" border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2" align="center">
		${bank.name} 님의 계좌 현황 입니다.
		</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="140">계좌 번호</td>
		<td align="left">${bank.accountNumber} </td>
	</tr>
	<tr>
		<td bgcolor="orange" width="140">보유 잔액</td>
		<td align="left">${bank.balance }원</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="140">마지막 출금날짜</td>
		<td align="left">${bank.receiptDate }</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="140">마지막입금날짜</td>
		<td align="left">${bank.withdrawalDate }</td>
	</tr>

</table>
</form>
<br>




</center>


 

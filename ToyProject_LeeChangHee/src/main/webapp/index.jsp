<%@page import="com.ssamz.biz.service.BankVO"%>
<%@ page contentType="text/html; charset=UTF-8"%>



<center>
<h1>WOORI 은행 계좌번호를 입력하세요.</h1>
<form action="getbalance.do" method="post">
<table border="1" width="600"cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="orange">계좌번호</td>
		<td><input type="text" name="accountNumber"  /></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="잔액 확인" />
		</td>
	</tr>
</table>
</form>
</center>




<%@page import="com.ssamz.biz.service.BankVO"%>
<%@page contentType="text/html; charset=UTF-8" %>

<!-- 
	EL(Expression Lanaguage)이란?
	request, session, application 내장객체에 등록된 데이터를 접근하기 위한 표현식
	
	JSTL(JSP Standard Tag Library)이란?
	JSP 파일에서 if, for, switch 같은 자바 코드를 대체하기 위한 표준 태그
-->



<center>
<h1>계좌 이체하기</h1>
<form action="transferResult.do" method="post">

<table width="600" border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="orange" width="140">계좌번호</td>
		<td align="left"><input type="hidden" name="accountNumber" value="${bank.accountNumber }">${bank.accountNumber }</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="140">이체 가능금액</td>
		<td align="left"><input type="hidden" name="balance" value="${bank.balance }">${bank.balance }원</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="140">이체 금액</td>
		<td align="left"><input type="number" name="amount" size="20" /></td>
	</tr>
	<tr>
		<td bgcolor="orange" width="140">이체할 은행</td>
		<td align="left">
			<select name="bankName">
				<option value="KB" selected> KB국민은행</option>			
				<option value="WOORI" selected>우리은행</option>
			</select>
		
		</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="140">이체할 계좌 번호</td>
		<td align="left"><input type="text" name="transferAcoount"></td>
		<!-- 계좌번호가 맞는지 확인해야함 -->
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="이체하기"/>
		</td>
	</tr>
</table>
</form>
<br>


</center>


 

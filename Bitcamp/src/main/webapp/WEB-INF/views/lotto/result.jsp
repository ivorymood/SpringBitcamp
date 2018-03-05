<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<section id= "wrapper">	
	<article>
			구매 금액 : <input id="money" type="text" name="money" value = "${money}"/>
			<button id="btn-money">전 송</button>
	</article>
	<article>
	<div>
		<table>
		<tr>
			<th>No.</th>
			<th>로또번호</th>
		</tr>
		<c:forEach var="i" items="${lottos}" step="1" varStatus="status">
		<tr>
			<td>${status.count}</td>
			<td>${i.lottoNumber}</td>
		</tr>
		</c:forEach>
		</table>
	</div>
	</article>
</section>
<script>

</script>

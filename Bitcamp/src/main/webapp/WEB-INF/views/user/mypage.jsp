<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<article>
	<table id="mypage_table">
		<tr>
			<td id = "profile" rowspan="6"><img src=""></td>
			<td class = "column">ID</td>
			<td class="content"></td>
			<td class = "column">SSN</td>
			<td class="content"></td>
		</tr>
		<tr>
			<td class = "column">PASS</td>
			<td class="content"></td>
			<td class = "column">빈칸</td>
			<td class="content"></td>
		</tr>
		<tr>
			<td class = "column">NAME</td>
			<td class="content"></td>
			<td class = "column">EMAIL</td>
			<td class="content"></td>
		</tr>
		<tr>
			<td class = "column">GENDER</td>
			<td class="content"></td>
			<td class = "column">ADDRESS</td>
			<td class="content"></td>
		</tr>
		<tr>
			<td class = "column">ACCOUNT</td>
			<td></td>
			<td class = "column">MONEY</td>
			<td></td>
		</tr>
		<tr>
			<td class = "column">PHONE</td>
			<td></td>
			<td class = "column">REGDATE</td>
			<td></td>
		</tr>
	</table>
	<button id="pass_change_btn">비밀번호 변경</button>
	<button id="btn-mypage-leave">회원탈퇴</button>
	<button id="btn-mypage-change">정보수정</button>
</article>
<script>
$(function(){
	
$('#btn-mypage-change').on('click', function(){
	alert('마이페이지 확인');		
});
});
</script>

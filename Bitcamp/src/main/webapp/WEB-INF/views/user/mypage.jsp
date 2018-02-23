<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>mypage</title>
	<script src="${js}/jquery-3.3.1.min.js "> </script>	
</head>
<body>
<button id="nav_btn">네비 바 이동</button>
<article>
	<form id="profile_form" action="">
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
	<input type="hidden" name="cmd" value="move"/>
	<input type="hidden" name="page" value="change_pass"/>
	<input type="hidden" name="dir" value="bitcamp"/>
	</form>
	<button id="delete_btn">회원탈퇴</button>
</article>
</body>
<script>
$('#nav_btn').on('click', function(){
	location.href = "${context}/nav";
});



</script>
</html>
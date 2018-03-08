<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

	<div id="wrapper">
		<header id="index_header">
			<h1><a id="home_text">BIT CAMP SAMPLE PROJECT</a></h1>
		</header>
		<section id="index_section">
			<article>
				<table id="index_table">
					<tr id="first_child">
						<td colspan="5">
								<table id="index_login_box" >
				 					<tr>
				 						<td > 
					 						<input id="index_input_id" type="text" name="id" placeholder="id"/>
				 						</td>
				 						<td  rowspan="2">
					 					<button id="index_login_btn">로그인</button>
										</td>
				 					</tr>
				 					<tr>
				 						<td >
				 						<input id="index_input_pw" type="text" name="pass" placeholder="pass"/>
				 						</td>
				 					</tr>
				 				</table>
							<a id="go_admin_link" >관리자</a>
							<a id="go_join_link" >회원가입</a>
							<a id="go_jdbc_link" >JDBC TEST</a>
							<!--값을 넘겨줄 것이 없는건 a태그+js외부파일  -->
						</td>
					</tr>
				</table>	
			</article>
		</section>
	</div>

<script>
$('#index_login_btn').on('click', function(){
	var userid = $('#index_input_id').val();
	var password = $('#index_input_pw').val();
	location.href ="${path.ctx}/login/"+userid+"/"+password;
});
</script>

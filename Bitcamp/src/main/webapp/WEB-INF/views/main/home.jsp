<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<button id = "btn" >
		로그인
	</button>
<script>
$('#btn').on('click', function(){
	location.href = "${path.ctx}/login";
});
//$: document.get~By ID ~  on(): addEventListener
</script>


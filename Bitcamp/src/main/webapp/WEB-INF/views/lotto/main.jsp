<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section id= "wrapper">	
	<article>
			구매 금액 : <input id="money" type="text" name="money" placeholder = "게임당 1000원 최대 5게임"/>
			<button id="btn-money">전 송</button>
	</article>
</section>
<script>
$('#btn-money').on('click', function(){
	var money = $('#money').val();
	alert("입금 받은 돈은 "+money+"입니다");
	location.href = "${path.ctx}/lotto/"+money;
})
</script>

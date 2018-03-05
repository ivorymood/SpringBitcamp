<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
    .navbar-brand {
        padding-top: 1px;
    }
</style>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
    	<div class="navbar-header">
        	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">
          	<img src="${path.img}/common/logo.jpg"  />
          </a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
        	<ul class="nav navbar-nav">
	            <li class="active">
	            <a href="#">
	            	<span class="glyphicon glyphicon-grain" aria-hidden="true">&nbsp;HOME</span>
	            </a></li>
	            <!-- HOME END -->
	            <li><a href="#about">
	            	<span class="glyphicon glyphicon-road" aria-hidden="true">&nbsp;MAIL</span>
	            </a></li>
	            <!-- MAIL END -->
	            <li><a id="a-login" href="#contact">
	            	<span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;LOGIN</span>
	            </a></li>
	            <!-- LOGIN END -->
		   		<li class=:dropdown>
		   			<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
		   			aria-expanaded="false">유틸리티
		   			<span class="caret"></span>
		   			</a>
		   			<ul id="ul-util" role="menu">
		   				<li><a>로또</a></li>
		   				<li><a>햄버거주문</a></li>
		   				<li role="presentation" class="divider"></li>
		   			</ul>
		   		</li>
          </ul>
		</div>
	</div>
</nav>
<script>
$('#a-login').on('click', function(){
	location.href = "${path.ctx}/login";
});
var $ulUtil = $("#ul-util");
$ulUtil.addClass("dropdown-menu");
$('.dropdown-menu a').eq(0).on('click', function(){
	location.href="${path.ctx}/lotto";
});
$('.dropdown-menu a').eq(1).on('click', function(){
	location.href="${path.ctx}/burgerking";
});

</script>
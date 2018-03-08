<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
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
	           
	           	<li>
	           		<a href="" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
	           		aria-expanaded="false">회원
	           		<span class="caret"></span>
	           		</a>
	           		<ul id="ul-user" role="menu">
	            <c:choose>
	                <c:when test="${user eq null}">
	                    <li class="dropdown">
	                        <a id="a-login" href="#"> 
	                            <span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;LOGIN</span>
	                        </a>
                        </li>
                        <li>
	                        <a id="a-join" href="#"> 
	                            <span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;JOIN</span>
	                        </a>
	                    </li>
	                </c:when>
	                <c:otherwise>
	                    <li>
	                    	<a id="a-mypage" href="#">
	                    		<span class="glyphicon glyphicon-user">&nbsp;마이페이지</span>
	                    	</a>
	                    </li>
	                    <li>
	                        <a id="a-logout" href="#">
	                            <span class="glyphicon glyphicon-remove-circle" aria-hidden="true">&nbsp;LOGOUT</span>
	                        </a>
	                    </li>                
	                </c:otherwise>
          	     </c:choose>
	           		</ul>
	           	</li>
	            
	            <!-- LOGIN END -->
		   		<li class=:dropdown>
		   			<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
		   			aria-expanaded="false">유틸리티
		   			<span class="caret"></span>
		   			</a>
		   			<ul id="ul-util" role="menu">
		   				<li><a id="a-burgerking" href="#"> 버거킹 </a></li>
			            <li><a id="a-kakao" href="#"> 카카오뱅크 </a></li>
			            <li><a id="a-bitcamp" href="#"> 비트캠프 </a></li>
			            <li><a id="a-mobile" href="#"> 모바일 </a></li>
			            <li><a id="a-lotto" href="#"> 로또 </a></li>
		   				<li role="presentation" class="divider"></li>
		   			</ul>
		   		</li>
          </ul>
		</div>
	</div>
</nav>
<script>

$('#a-login').on('click', function(){
	location.href = "${path.ctx}/move/user/login";
});
$('#a-logout').on('click', function(){
	location.href = "${path.ctx}/logout";
})
$('#a-join').on('click', function(){
	location.href = "${path.ctx}/move/user/join";
});
var $ulUtil = $("#ul-util");
$ulUtil.addClass("dropdown-menu");
$('.dropdown-menu a').eq(0).on('click', function(){
	location.href="${path.ctx}/move/burgerking/main";
});
$('.dropdown-menu a').eq(1).on('click', function(){
	location.href = "${path.ctx}/move/kakao/main";
});
$('.dropdown-menu a').eq(2).on('click', function(){
	location.href = "${path.ctx}/move/bitcamp/main";
});
$('.dropdown-menu a').eq(3).on('click', function(){
	location.href="${path.ctx}/move/mobile/main";
});
$('.dropdown-menu a').eq(4).on('click', function(){
	location.href="${path.ctx}/move/lotto/main";
});
</script>
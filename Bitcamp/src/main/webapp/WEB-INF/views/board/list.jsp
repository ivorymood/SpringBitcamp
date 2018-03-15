<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<div class="container">
	<button id="btn-write">글쓰기</button>
	<div class="form-group">
		<label for="search"></label>
		<div>
			<input type="text" name="" />
		</div>
	</div>
	<div>
		총 게시글 수 : ${page.totalCount }개
	</div>
<!-- 
<div class="btn-group">
  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
    Action <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" role="menu">
    <li><a href="#">Action</a></li>
    <li><a href="#">Another action</a></li>
    <li><a href="#">Something else here</a></li>
    <li class="divider"></li>
    <li><a href="#">Separated link</a></li>
  </ul>
</div> -->


<table class="class">
	<tr>
		<th>글번호</th>
		<th>제  목</th>
		<th>작성자</th>
		<th>작성일</th>
	</tr>
	
	<c:forEach items="${list}" step="1" var="article" varStatus="">
		<tr>
			<td>${article.bbsSeq }</td>
			<td>
				<a id="a-detail" href="#"
				onclick="app.boardDetail('${article.bbsSeq}'); return false;">
					${article.title }
				</a>
			</td>
			<td>${article.id }</td>
			<td>${article.regdate }</td>
		</tr>
	</c:forEach>
	
</table>
<nav>
  <ul class="pagination">
     <c:if test="${page.prevBlock}">
	     <li>
	      <a href="#" aria-label="Previous" onclick="app.boardList('${page.pageStart-1}'); return false;">
	        <span aria-hidden="true">&laquo;</span>
	      </a>
	    </li> 
     </c:if>
    
    <c:forEach begin="${page.pageStart }" end="${page.pageEnd }" step="1" varStatus="i">
	     <c:choose>
		     <c:when test="${i.index eq page.pageNum }">
		   		<li class="active">
		   		<a href="#" onclick="app.boardList('${i.index}'); return false;">${i.index}</a></li>
		     </c:when>
		     <c:otherwise>
			     <li class="disabled">
			     <a	href="#" onclick="app.boardList('${i.index}'); return false;">${i.index}</a></li>
		     </c:otherwise>
	     </c:choose>
    </c:forEach>
    
     <c:if test="${page.nextBlock}">
     
		     <li>
		      <a href="#" aria-label="Next" onclick="app.boardList('${page.pageEnd+1}'); return false;">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li> 
     
     
     </c:if>
  </ul>
</nav>
</div>
<script>

$('#btn-write').on('click', function(){
	app.move("board/write");
});
</script>
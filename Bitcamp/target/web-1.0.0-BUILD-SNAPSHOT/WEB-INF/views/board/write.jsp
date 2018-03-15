<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="container">
글쓰기
<form class="form-write">
  <div class="form-group">
    <label for="inputEmail" class="col-sm-2 control-label"> 닉네임</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="inputEmail3" placeholder="닉네임">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">제목</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword3" placeholder="제목">
    </div>
  </div>
  <div class="form-group">
	  <label for="inputcontent" class="col-sm-2 control-label">내용	</label>
  	<div class="col-sm-10">
			<textarea name="content" id="content" cols="50" rows="20"></textarea>
  	</div>
  </div>
   <div class="form-group">
	  <label for="inputfile" class="col-sm-2 control-label">파일	</label>
  	<div class="col-sm-10">
			<input type="file" name="fileName" />
  	</div>
  </div>
   <div class="form-group">
  	<div class="col-sm-10">
			<button name="btn-submit">전송</button>
			<button name="btn-cancle">취소</button>
  	</div>
  </div>
</form>
</div>
<script>
$('#btn-submit').on('click', function(){
	var content = $('#content').text();
	var alias = $('#alias').val();
	var title = $('#title').val();
	$('#form-write')
	.attr('action','${path.ctx}/write')
	.attr('method', 'post')
	.submit();
	
});
</script>
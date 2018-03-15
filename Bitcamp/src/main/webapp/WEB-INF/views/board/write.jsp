<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
<h1>글쓰기</h1>
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
  		<textarea class="form-control col-sm-2 " id="input-content" rows="5"></textarea>
  	</div>
  	<div class="col-sm-10">
  		<div class="grid-container">
			<div class="grid-item item1">
  					<img src="${path.img}/${uploadImage}" alt="" />
			</div>
  			
  		</div>
  	</div>
  </div>
   <div class="form-group">
  	<div class="col-sm-10">
  	</div>
  </div>
   <div class="form-group">
  	<div class="col-sm-10">
			<button id="btn-submit" class="btn btn-success">전송</button>
			<button id="btn-cancle" class="btn btn-default">취소</button>
  	</div>
  </div>
</form>
</div>

<!-- link that opens popup -->
<a class="popup-with-form" href="#test-form">Open form</a>

<!-- form itself -->
<form id="test-form" class="white-popup mfp-hide jumbotron"
method="post" enctype="multipart/form-data" action="${path.ctx}/board/fileupload" >
	<div class="container">
		<h1 class="text-center">ATTACH FILES</h1>
		<div class="row"></div>
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<div class="input-group">
				<input class="form-control" type="file" placeholder="file" name="file"/>
			</div>	
			<div class="btn-group">
				<input type="submit" value="파일업로드" class="btn btn-primary " />
				<input type="reset" value="취소" class="btn btn-default "/>
			</div>
		</div>
</div>
</form>
<script>
$(document).ready(function(){
	$('.popup-with-form').magnificPopup({
		type: 'inline',
		preloader: false,
		focus: '#name',

		// When elemened is focused, some mobile browsers in some cases zoom in
		// It looks not nice, so we disable it:
		callbacks: {
			beforeOpen: function() {
				if($(window).width() < 700) {
					this.st.focus = false;
				} else {
					this.st.focus = '#name';
				}
			}
		}
	});
});

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
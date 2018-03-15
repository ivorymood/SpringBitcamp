<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="container">
	<div class="page-header">
		<h1>ATTACH FILES</h1>
		<br/>
	</div>
	<div class="center-block">
		<input type="file" />
	</div>	
	<div>
		<button id="btn-cancel" class="btn btn-default">Cancel</button>
		<button id="btn-attach" class="btn btn-success">Attach files</button>
	</div>
</div>
<script>
$('#btn-cancel').on('click', function(){
	app.move("board/write");
});
$('#btn-attach').on('click', function(){
	app.boardUpload(xxxxxxxx);
});
</script>
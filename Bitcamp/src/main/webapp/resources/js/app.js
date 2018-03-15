/**
 * 공통 JavaScript 기능
 */

var app = app || {};
var route = route || {};
app = (()=>{
	var init = x=>{
		route.init(x);
		onCreate();
	};
	var onCreate=()=>{
		setContentView();
		app.board.init();
	};
	var setContentView=()=>{
		move("user/login");
	};
	var move = x=>{
		location.href=route.$()+"/move/"+x;
	}
	var boardList = x=>{
		app.board.list(x);
	};
	var boardDetail =x=>{
		app.board.detail(x);
	};
	var boardUpload = x=>{
		app.board.upload(x);
	}
	return {
		init : init,
		move : move,
		boardList: boardList,
		boardDetail: boardDetail,
		boardUpload: boardUpload
	}; 
})();
app.board=(()=>{
	var init=()=>{
		onCreate();
	};
	var onCreate=()=>{
		setContentView();
		list();
	};
	var setContentView=()=>{
		
	};
	var list = x=>{
		location.href=route.$() + "/board/list?pageNum="+x;
	};
	var detail = x=>{
		location.href = route.$() + "/board/detail/"+x;
	};
	var upload = x=>{
		location.href = route.$() + "/board/upload/" + x;
	}
	return {
		onCreate: onCreate,
		list: list, 
		detail: detail,
		upload: upload};
})();
route = (()=>{
	return {
				init : x => 
				{
					console.log('context is '+x);
					sessionStorage.setItem('x', x);
				}, 
				$ : ()=>{
					return sessionStorage.getItem('x');
				},
				$j : ()=>{
					return sessionStorage.getItem('x')+'/resources/js';
				},
				$c : ()=>{
					return sessionStorage.getItem('x')+'/resources/css';
				},
				$i : ()=>{
					return sessionStorage.getItem('x')+'/resources/img';
				}
				
			};
})();
	
	
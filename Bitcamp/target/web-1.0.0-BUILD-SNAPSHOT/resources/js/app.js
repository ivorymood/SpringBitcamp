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
	var boardList = ()=>{
		app.board.list();
	};
	var boardDetail =x=>{
		app.board.detail(x);
	};
	return {
		init : init,
		move : move,
		boardList: boardList,
		boardDetail: boardDetail
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
	var list = ()=>{
		location.href=route.$() + "/board/list";
	};
	var detail = x=>{
		location.href = route.$() + "/board/detail/"+x;
	};
	return {
		onCreate: onCreate,
		list: list, 
		detail: detail};
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
	
	
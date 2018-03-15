/**
 * 공통 JavaScript 기능
 */

var board = board || {};
var route = route || {};
board=(()=>{
	var list = x=>{
		route.init(x);
		location.href = route.$()+"/board/list";
	};
	return {list : list};
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
	
	
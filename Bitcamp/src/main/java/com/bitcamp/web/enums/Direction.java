package com.bitcamp.web.enums;

public enum Direction {
	resources, js, img, css,
	JS{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "/"+resources+"/"+js;
		}
	},
	IMG{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "/"+resources+"/"+img;
		}
	},
	CSS{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "/"+resources+"/"+css;
		}
	};
}

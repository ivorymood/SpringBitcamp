package com.bitcamp.web.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.web.command.Path;
import com.bitcamp.web.enums.Direction;
@Component
//추상은 객체가 될수 없으므로 contextFactory에 component붙임
public class ContextFactory extends Factory{
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	
	@Autowired ContextFactory contextFactory;
	@Autowired Path path;
	@Override
	public Object create() {
		/*ServletRequestAttributes o = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		String o2 = o.getRequest().getContextPath();*/
		
		return ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath()		//jsp에서 가져다 쓰게되면 느림. 그래서  getcontextPath
				;
	}
	public Path path() {
		
		logger.info("ContextFactory path()에 리턴되는 경로 값은  {}  이다", create());
		path.setCtx((String) create());
		path.setCss(create()+Direction.CSS.toString());
		path.setImg(create()+Direction.IMG.toString());
		path.setJs(create()+Direction.JS.toString());
		return path;
	}
	
	//왜 추상팩토리? new를 해버리면, 그냥 밀고 새것이 됨.
	//인증할때 넣었던 데이터를 유지하기 위해서. interface는 상속구조 잡을 수 X
	//그렇게 때문에 abstract로 추팩. 
}

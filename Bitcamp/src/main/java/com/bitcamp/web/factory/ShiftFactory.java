package com.bitcamp.web.factory;

import org.springframework.stereotype.Component;

@Component
public class ShiftFactory extends Factory{

    @Override
    public Object create() {
        // TODO Auto-generated method stub
        return null;
    }
    public String create(String p1,String p2) {
        return String.format("public:%s/%s.tiles", p1,p2);
    }
    public String redirect(String p1, String p2) {
        return String.format("redirect:/move/%s/%s", p1,p2);
    }
//오버로딩해서 계속 추가 가능 추팩!
}

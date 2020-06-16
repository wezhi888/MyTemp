package top.lwzp.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TemplateController {
    @RequestMapping("/freemarker")
    public String freemarkerDemo(Map<String, Object> map){
        map.put("name","张三");
        map.put("address",1);
        List<String> list = new ArrayList<String>();
        list.add("tomcat");
        list.add("tomdog");
        map.put("listResult",list);
        return "demo";
    }
}

package top.lwzp.test.controller;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import top.lwzp.test.controller.base.BaseController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TemplateController extends BaseController {
    @RequestMapping("/freemarker")
    public String freemarkerDemo(Map<String, Object> map){
        map.put("name","张三");
        map.put("address",1);
        List<String> list = new ArrayList<String>();
        list.add("tomcat");
        list.add("tomdog");
        map.put("listResult",list);
        return "freemarker/demo";
    }
    @RequestMapping("/upload")
    public String upload(@RequestParam MultipartFile file){
        return "freemarker/captcha";
    }
}

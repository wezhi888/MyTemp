package top.lwzp.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lwzp.test.controller.base.BaseController;
import top.lwzp.test.vo.RestTemplateTestVo;

import java.util.Date;

@Controller
public class TestController extends BaseController {
    @ResponseBody
    @RequestMapping("/api/{name}/{age}")
    public String api(@PathVariable("name") String name, @PathVariable("age")int age,String other) throws JsonProcessingException {
        RestTemplateTestVo vo = new RestTemplateTestVo(age,name,new Date());
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(vo);
    }
}

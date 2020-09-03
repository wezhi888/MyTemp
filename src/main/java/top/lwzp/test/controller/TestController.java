package top.lwzp.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.lwzp.test.controller.base.BaseController;
import top.lwzp.test.vo.RestTemplateTestVo;

import java.util.Date;

@Controller
@ResponseBody
public class TestController extends BaseController {
    private ObjectMapper mapper = new ObjectMapper();
    @RequestMapping(value = "/api/{name}/{age}",method = RequestMethod.GET)
    public String apiGet(@PathVariable("name") String name, @PathVariable("age")int age,String other) throws JsonProcessingException {
        RestTemplateTestVo vo = new RestTemplateTestVo(age,name,new Date());
        return mapper.writeValueAsString(vo);
    }

    @PostMapping(value = "/post")
    public String apiPost(String name,int age) throws JsonProcessingException {
        RestTemplateTestVo vo = new RestTemplateTestVo(age,name,new Date());
        return mapper.writeValueAsString(vo);
    }

}

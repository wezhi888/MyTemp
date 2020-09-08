package top.lwzp.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.lwzp.test.controller.base.BaseController;
import top.lwzp.test.vo.RestTemplateTestVo;

import java.io.BufferedReader;
import java.io.IOException;
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
    public String apiPost() throws JsonProcessingException {
        BufferedReader reader;
        String body = "";
        try {
            reader = request.getReader();
            String temp = null;
             while ((temp = reader.readLine()) != null){
                 body += temp;
             }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("body is:" + body);

        RestTemplateTestVo vo = new RestTemplateTestVo(15,"zhangsan",new Date());
        return mapper.writeValueAsString(vo);
    }

}

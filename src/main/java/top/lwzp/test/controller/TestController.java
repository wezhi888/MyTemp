package top.lwzp.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.lwzp.test.controller.base.BaseController;

@Controller
@ResponseBody
public class TestController extends BaseController {
    private ObjectMapper mapper = new ObjectMapper();


    @RequestMapping("/test")
    public String test(){
        return "hello";
    }

}

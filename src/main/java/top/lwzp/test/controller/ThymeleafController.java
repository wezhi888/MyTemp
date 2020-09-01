package top.lwzp.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {
    @RequestMapping("/thymeleaf")
    public ModelAndView thymeleafDemo(ModelAndView mav){
        mav.setViewName("/thymeleaf/thymeleaf");//此处指向模板文件
        mav.addObject("user","张三");
        List<String> books = new ArrayList<>();
        books.add("huaxue");
        books.add("wuli");
        mav.addObject("books",books);
        return mav;
    }

    @RequestMapping("/thymeleaf2")
    public String thymeleaf2Demo(Model m){
        m.addAttribute("user","张三");
        List<String> books = new ArrayList<>();
        books.add("huaxue");
        books.add("wuli");
        m.addAttribute("books",books);
        return "/thymeleaf/thymeleaf";
    }
}

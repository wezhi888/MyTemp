package top.lwzp.test.controller;

import com.wf.captcha.GifCaptcha;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lwzp.test.controller.base.BaseController;
import top.lwzp.test.service.test.TestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 验证码示例页
 */
@Controller
public class CaptchaController extends BaseController {
    private TestService testService;
    @Autowired
    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/captcha")
    public void checkCaptcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //设置位数
        CaptchaUtil.out(6,request, response);
        //默认宽高是130/48.如果指定验证码图片的宽、高和位数。宽高应该和HTML页面相适应
//        CaptchaUtil.out(180,60,5,request,response);
        //使用git验证码
//        GifCaptcha gifCaptcha = new GifCaptcha(130,48,4);
//        CaptchaUtil.out(gifCaptcha,request,response);
    }

    @RequestMapping("/captcha/index")
    public String captchaPage(){
//        testService.printHeaders();
        return "freemarker/captcha";
    }

    @RequestMapping("/captcha/valid")
    @ResponseBody
    public String validCaptcha(String code){
        String result = null;
        if (CaptchaUtil.ver(code,request)){
            result = "{\"msg\":\"success\"}";
        } else {
            result = "{\"msg\":\"fail\"}";
        }
        //从session里清除验证码，以使使用过的验证码失效
        CaptchaUtil.clear(request);
        return result;
    }
}

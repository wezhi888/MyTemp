package top.lwzp.test.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import top.lwzp.test.vo.JsonTestVo;
import java.io.IOException;
import java.util.*;

public class RunAsMain {
    public static void main(String[] args) throws IOException {
        testJackson();
    }

    private static void testJackson() throws IOException {
        MultiValueMap<String,String> map = new LinkedMultiValueMap<>();
        map.add("name","张三");
        map.add("name","李四");
        System.out.println(map);
    }
}

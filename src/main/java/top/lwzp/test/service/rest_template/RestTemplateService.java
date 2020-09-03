package top.lwzp.test.service.rest_template;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import top.lwzp.test.service.spring.SpringUtil;
import top.lwzp.test.vo.RestTemplateTestVo;

import java.util.Map;

@Service
public class RestTemplateService {
    private RestTemplate restTemplate;
    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public String get(String url, Map<String,String> params){
        RestTemplate template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<String> entity = new HttpEntity<>("{}",headers);
        ResponseEntity<JSONObject> exchange = template.exchange(url, HttpMethod.GET, entity, JSONObject.class);
        System.out.println(exchange.getBody());
        return exchange.getBody().toString();
    }

    public String getForEntity(String url){
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        return entity.getBody();
    }

    public RestTemplateTestVo getForObject(String url){
        RestTemplateTestVo vo = restTemplate.getForObject(url, RestTemplateTestVo.class);
        return vo;
    }
}

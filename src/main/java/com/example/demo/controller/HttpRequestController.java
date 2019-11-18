package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.RequestEntityTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HttpRequestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/http_request/test", method = RequestMethod.GET)
    public HashMap test_for_restful() throws InterruptedException{
        Thread.sleep(3000);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", "test");
        hashMap.put("age", 18);
        return hashMap;
    }

    @RequestMapping(value = "/http_request/get")
    public String http_get() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        try{
            ResponseEntity re =  restTemplate.exchange("http://127.0.0.1:8080/http_request/test", HttpMethod.GET, entity, String.class);
            System.out.println(re.getStatusCode() + "!!!!!!!!!!!!!!!!!!!!!!!!");
            if(re.getStatusCode() ==HttpStatus.OK){
                String content = (String) re.getBody();
                JSONObject jo = JSON.parseObject(content);
                for (Map.Entry<String, Object> en : jo.getInnerMap().entrySet()){
                    System.out.println("key=>" + en.getKey() +",value+" + en.getValue());
                }
                return content;
            }else{
                return "system error." + re.getStatusCode();
            }
        }catch (Exception e){
            return e.toString();
        }

    }

    @RequestMapping(value = "/http_request/test_post", method = RequestMethod.POST)
    public RequestEntityTest test_for_restful_post(@RequestBody RequestEntityTest rtt){
        System.out.println("name=>" + rtt.getName() + ",size=>" + rtt.getSize());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        rtt.setDate(sdf.format(new Date()));
        return rtt;
    }


    @RequestMapping("/http_request/post")
    public String http_post(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        RequestEntityTest rtt = new RequestEntityTest();
        rtt.setName("post_api");
        rtt.setSize(111);
        HttpEntity<RequestEntityTest> entity = new HttpEntity<RequestEntityTest>(rtt, headers);
        return restTemplate.exchange("http://127.0.0.1:8080/http_request/test_post", HttpMethod.POST, entity, String.class).getBody();
    }



}

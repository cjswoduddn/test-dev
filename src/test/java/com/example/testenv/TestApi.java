package com.example.testenv;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class TestApi {

    RestTemplate restTemplate2 = new RestTemplate();
    AsyncRestTemplate restTemplate = new AsyncRestTemplate();

    @Test
    public void test() throws Exception{
        String URL = "http://localhost:9100/auth/callback";
        HashMap<String, String> map = new HashMap<>();
        map.put("redirect_url_key", "hello");
        for(int i = 0; i < 100; i++) {
            restTemplate.getForEntity(URL, String.class, map);
        }
    }

    @Test
    public void test2() throws Exception{
        String URL = "http://localhost:9100/auth/callback?redirect_url_key=sdjfklds";
        restTemplate.getForEntity(URL, String.class);
    }

    @Test
    public void test3() throws Exception{
        String URL = "http://localhost:8080/hello";
        restTemplate2.getForEntity(URL, String.class);
    }
}

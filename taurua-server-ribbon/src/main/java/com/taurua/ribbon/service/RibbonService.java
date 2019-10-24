package com.taurua.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author cl, lu.chen.@htouhui.com
 * @version 1.0
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public String homeService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }
}

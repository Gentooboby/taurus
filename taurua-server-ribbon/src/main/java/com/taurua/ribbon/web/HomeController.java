package com.taurua.ribbon.web;

import com.taurua.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cl, lu.chen.@htouhui.com
 * @version 1.0
 */
@RestController
public class HomeController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon_hi")
    public String hi(@RequestParam String name) {
        return ribbonService.homeService(name);
    }
}

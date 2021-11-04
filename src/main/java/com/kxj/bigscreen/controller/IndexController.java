package com.kxj.bigscreen.controller;

/**
 * @Acthor Tao.Lee @date 2021/9/23 14:26
 * @Description
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/T/")
public class IndexController {
    @RequestMapping("Index")
    public String demo() {
        return "index"; // 地址指向index.hml
    }
}


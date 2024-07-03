package com.zhiwu.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpRequest;
import java.util.Map;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/3 0:03
 */
@Controller
public class MyController {

    @RequestMapping("/c1/hello")
    public String hello() {
        System.out.println("******** 开始请求***********");
        return "hello";
    }

    /**
     * 返回值为void的时候，跳转的是方法路径名的视图
     */
    @RequestMapping("/index")
    public void testVoid() {
        System.out.println("******** 开始请求***********");
//        return "hello";
    }

    @RequestMapping("/c2/hello")
    public ModelAndView testMAV() {
        ModelAndView modelAndView = new ModelAndView();
        Map<String, Object> model = modelAndView.getModel();
        model.put("name", "外包仔");
        modelAndView.setViewName("zhiwu");
        return modelAndView;
    }

    @RequestMapping("/c2/hello2")
    public String setRequest(Model model) {
        model.addAttribute("name", "外包仔2");
        return "zhiwu";
    }

    @RequestMapping("/c2/hello3")
    public String setRequest2(ModelMap model) {
        model.addAttribute("name", "外包仔2");
        return "zhiwu";
    }

    @RequestMapping("/c2/hello4")
    public String setRequest3(Map map) {
        map.put("name", "外包仔2");
        return "zhiwu";
    }

    @RequestMapping("/c2/hello5")
    public String setRequest(HttpServletRequest httpRequest) {
        httpRequest.setAttribute("name", "外包仔2");
        return "zhiwu";
    }


}

package com.example.demo.pageController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/pages")
public class PageController {

    @RequestMapping(value = "/index")
    public String index()
    {
        return "Index";
    }

    @RequestMapping(value = "/test")
    public String test()
    {
        return "Test";
    }
}

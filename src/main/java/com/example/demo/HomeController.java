package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {return "home";}

    @RequestMapping("/about")
    public String aboutPage() {return "about";}

    @RequestMapping("/authors")
    public String authorsPage() {return "authors";}

    @RequestMapping("/blogEntry1")
    public String blogEntry1Page() {return "blogEntry1";}

    @RequestMapping("/blogEntry2")
    public String blogEntry2Page() {return "blogEntry2";}

    @RequestMapping("/blogEntry3")
    public String blogEntry3Page() {return "blogEntry3";}

    @RequestMapping("/blogEntry4")
    public String blogEntry4Page() {return "blogEntry4";}

    @RequestMapping("/blogEntry5")
    public String blogEntry5Page() {return "blogEntry5";}

    @RequestMapping("/blogEntry6")
    public String blogEntry6Page() {return "blogEntry6";}




}


package com.detroilabs.piclibrary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhotoController {


    @RequestMapping("/")
    public String displayFiveRandomPicturesOnHomePage(){
        return "home";
    }


}

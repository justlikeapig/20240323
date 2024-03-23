package org.kklt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class MyController {

    public MyController(MyService myService) {
        this.myService = myService;
    }

    public MyService getMyService() {

        return myService;
    }

    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    @Autowired
    private MyService myService;

    @ResponseBody
    @GetMapping("/say")
    public String sayHello() {
        getClass();

        String pubg = myService.sayHello("pubg");
        return pubg;
    }










}

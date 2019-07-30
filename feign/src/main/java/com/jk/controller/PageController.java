package com.jk.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PageController {
    @RequestMapping(value = "/toMain", method = RequestMethod.GET)
    public ModelAndView toMain() {
        ModelAndView mv = new ModelAndView("main");
        return mv;
    }

    @RequestMapping(value = "/toShow", method = RequestMethod.GET)
    public ModelAndView toShow() {
        ModelAndView mv = new ModelAndView("VipShow");
        return mv;
    }

    @RequestMapping(value = "/toadd", method = RequestMethod.GET)
    public ModelAndView toadd() {
        ModelAndView mv = new ModelAndView("add");
        return mv;
    }

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public ModelAndView toLogin() {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }

    @RequestMapping(value = "/addUserDialog", method = RequestMethod.GET)
    public ModelAndView addUserDialog() {
        ModelAndView mv = new ModelAndView("addUserDialog");
        return mv;
    }
}

package org.application.schooldiary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {

    @RequestMapping(value = "/")
    public ModelAndView home() {

        return new ModelAndView("home");
    }
}

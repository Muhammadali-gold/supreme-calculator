package com.dreamsoft.supremecalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   @RequestMapping(value="/greeting",method = RequestMethod.GET)
   public String getGreeting(){
       return "hello heroku";
   }
}

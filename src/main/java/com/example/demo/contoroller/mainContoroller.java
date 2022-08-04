package com.example.demo.contoroller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.player;

@Controller
@RequestMapping("/test")
public class mainContoroller{

    @GetMapping("/form")
    public String readForm(@ModelAttribute player player) {
      return "test.html";
    }

    @PostMapping("/form")
    public String create(@ModelAttribute player player) {
      return "test2.html";
    }
}

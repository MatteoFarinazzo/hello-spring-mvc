package org.learning.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(@RequestParam int maxNum, Model model){
        Random random = new Random();
        int randomNum = random.nextInt(1, maxNum);
        model.addAttribute("randomNumber", randomNum);
        return "index";
    }


}

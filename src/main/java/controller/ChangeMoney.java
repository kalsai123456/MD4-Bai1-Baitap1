package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeMoney {
    @GetMapping("/change")
    public String show(){
        return "convert";
    }
    @PostMapping("/convert")
    public String convert (@RequestParam ("usd") float usd,
                           @RequestParam ("exchange_Rate") float exchange_Rate, Model model){
        float vnd = usd * exchange_Rate;
        model.addAttribute("usd" , usd);
        model.addAttribute("exchange_Rate" , exchange_Rate);
        model.addAttribute("vnd" , vnd);
        return "index";
    }
}

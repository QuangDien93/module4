package greet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class greet {
    @GetMapping("/greeting")
    public String greeting(Model model, @RequestParam(defaultValue = "Lâm") String name){
//        name  = "Hoàng";
        model.addAttribute("name",name);
        return "greet";
    }
}

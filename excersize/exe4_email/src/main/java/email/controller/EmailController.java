package email.controller;

import email.model.Email;
import email.repository.EmailRepository;
import email.repository.EmailRepositoryImpl;
import email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

    @Autowired
    EmailService emailService;

    @GetMapping("home")
    public String homeEmail(Model model){
        model.addAttribute("email",emailService.getEmail());
        return "email/home";
    }
    @GetMapping("editSetting")
    public String update(Model model){
        model.addAttribute("languages", EmailRepositoryImpl.languages);
        model.addAttribute("pageSizes",EmailRepositoryImpl.pageSizes);
        model.addAttribute("email",emailService.getEmail());
        return "email/setting";
    }
    @PostMapping("setting")
    public String update(@ModelAttribute("email") Email email){
        emailService.update(email);
        System.out.println(email.getSignature());
        return "redirect:home";
    }
}

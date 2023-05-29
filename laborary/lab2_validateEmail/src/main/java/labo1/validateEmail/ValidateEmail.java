package labo1.validateEmail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Controller
public class ValidateEmail {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;
    private Matcher matcher;
    public ValidateEmail() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    private boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    @GetMapping("/email")
    public String inputEmail(){
        return "email";
    }
    @PostMapping("/validate")
    public String validateEmmail(@RequestParam("email") String email, Model model){
        if(!validate(email)){
            model.addAttribute("message","Email is invalid");
            return "email";
        } else {
            model.addAttribute("email",email);
            return "emailResult";
        }
    }

}

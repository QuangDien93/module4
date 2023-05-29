package formDataBinding.controller;

import formDataBinding.dao.UserDao;
import formDataBinding.models.Login;
import formDataBinding.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/loginForm")
    public String home(Model model){
        model.addAttribute("login", new Login());
        return "user/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") Login login, Model model){
        User user = UserDao.checkLogin(login);
        if(user == null){
            return "user/error";
        } else {
            model.addAttribute("user", user);
            return "user/loginSuccess";
        }
    }
}

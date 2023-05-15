package transferControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class transfer {
    @GetMapping("/transfer")
    public String transfer(Model model, @RequestParam (defaultValue = "0") int usd){
        int vnd = usd*24000;
        model.addAttribute("vnd", vnd);
        model.addAttribute("usd", usd);
        return "transferMoney";
    }

}

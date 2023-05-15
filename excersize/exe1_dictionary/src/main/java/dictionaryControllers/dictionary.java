package dictionaryControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionary {

    @GetMapping("/dictionary")
    public String getTranslate(){
        return "dictionary";
    }

    @GetMapping("/translate")
    public String translate(Model model,@RequestParam String english){
        String vietnamese = DataDictionary.map.get(english.toLowerCase());
        model.addAttribute("vietnamese",vietnamese);
        model.addAttribute("english",english);
        return "translate";
    }

}

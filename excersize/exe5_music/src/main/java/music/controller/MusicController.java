package music.controller;

import music.entity.Music;
import music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("music")
public class MusicController {
    @Autowired
    MusicService musicService;
    @GetMapping("/list")
    public String showAll(Model model){
        model.addAttribute("musics", musicService.findAll() );
        return "music/list";
    }
    @GetMapping("/create")
    public String showCreatePage(Model model){
        model.addAttribute("music", new Music());
        return "music/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("music") Music music){
        musicService.create(music);
        return "redirect:/music/list";
    }
    @GetMapping("/update")
    public String update(@RequestParam("id") int id,Model model){
        model.addAttribute("music", musicService.findById(id));
        return "music/update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("music")Music music){
        musicService.update(music);
        return "redirect:/music/list";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        musicService.deleteById(id);
        return "redirect:/music/list";
    }
}

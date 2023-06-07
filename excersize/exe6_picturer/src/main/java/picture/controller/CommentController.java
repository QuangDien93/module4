package picture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import picture.entity.Comment;
import picture.service.CommentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/picture")
    public String showPicture(Model model) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now();
        String todayString =  today.format(formatter);
        model.addAttribute("comments", commentService.findAllToday(todayString));
        model.addAttribute("comment", new Comment());
        return "picture";
    }
    @PostMapping("/saveComment")
    public String saveComment(@ModelAttribute("comment") Comment comment){
        commentService.addComment(comment);
        return "redirect:/picture";
    }
    @GetMapping("/likeComment")
    public String likeComment(@RequestParam("id")int id){
        commentService.addLike(commentService.findById(id));
        return "redirect:/picture";
    }
}

package blog.controller;

import blog.entity.Blog;
import blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/newBlog")
    public String ShowCreatePage(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }
    @PostMapping("/newBlog")
    public String newBlog(@ModelAttribute("blog") Blog blog){
        blogService.create(blog);
        return "redirect:/blog/list";
    }
    @GetMapping("/list")
    public String showListBlog(Model model){
        model.addAttribute("blogs",blogService.findAll());
        return "list";
    }
    @GetMapping("/view")
    public String viewBlog(@RequestParam("id")int id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "view";
    }
    @GetMapping("/update")
    public String ShowUpdatePage(@RequestParam("id") int id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "update";
    }
    @PostMapping("/update")
    public String updateBlog(@ModelAttribute("blog") Blog blog){
        blogService.update(blog);
        return "redirect:/blog/list";
    }
    @GetMapping("/delete")
    public String deleteBlog(@RequestParam("id") int id){
        blogService.deleteById(id);
        return "redirect:/blog/list";
    }
}

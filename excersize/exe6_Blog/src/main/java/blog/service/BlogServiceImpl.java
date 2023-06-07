package blog.service;

import blog.entity.Blog;
import blog.repo.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public boolean create(Blog blog) {
         blogRepository.save(blog);
        return true;
    }

    @Override
    public boolean update(Blog blog) {
        if(blogRepository.existsById(blog.getId())){
            blogRepository.save(blog);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        if(blogRepository.existsById(id)){
            blogRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> findAll() {
        return (List<Blog>) blogRepository.findAll();
    }
}

package blog.service;

import blog.entity.Blog;

import java.util.List;

public interface BlogService {
boolean create(Blog blog);
boolean update(Blog blog);
boolean deleteById(int id);
Blog findById(int id);
List<Blog> findAll();

}

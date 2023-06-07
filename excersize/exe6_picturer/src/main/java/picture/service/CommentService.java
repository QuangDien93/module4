package picture.service;

import picture.entity.Comment;

import java.time.LocalDate;
import java.util.List;

public interface CommentService {
    List<Comment> findAll();
    List<Comment> findAllToday(String date);
    Comment findById(int id);
    boolean addComment(Comment comment);
    void addLike(Comment comment);
}

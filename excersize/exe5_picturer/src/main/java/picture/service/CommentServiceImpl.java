package picture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import picture.entity.Comment;
import picture.repository.CommentRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentRepository commentRepository;
    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public List<Comment> findAllToday(String date) {
        return commentRepository.findAllToday(date);
    }

    @Override
    public Comment findById(int id) {
        return commentRepository.findById(id);
    }

    @Override
    public boolean addComment(Comment comment) {
        commentRepository.addComment(comment);
        return true;
    }

    @Override
    public boolean addLike(Comment comment) {
        commentRepository.addLike(comment);
        return true;
    }
}

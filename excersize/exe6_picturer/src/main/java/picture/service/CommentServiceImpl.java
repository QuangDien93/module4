package picture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picture.entity.Comment;
import picture.repoJPA.CommentRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepository commentRepository;
    @Override
    public List<Comment> findAll() {
        return (List<Comment>) commentRepository.findAll();
    }

    @Override
    public List<Comment> findAllToday(String date) {
        return commentRepository.findAllToday(date);
    }

    @Override
    public Comment findById(int id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public boolean addComment(Comment comment) {
        comment.setDate();
        commentRepository.save(comment);
        return true;
    }

    @Override
    public void addLike(Comment comment) {
        comment.setLikes(comment.getLikes()+1);
        commentRepository.save(comment);
    }
}

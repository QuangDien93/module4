package picture.repository;

import org.springframework.stereotype.Repository;
import picture.entity.Comment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public class CommentRepositoryImpl implements CommentRepository{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Comment> findAll() {
        return entityManager.createQuery("select c from Comment c ").getResultList();
    }

    @Override
    public List<Comment> findAllToday(String date) {
        return entityManager.createQuery("select c from Comment c where c.date=?1").setParameter(1,date).getResultList();
    }

    @Override
    public Comment findById(int id) {
        return entityManager.find(Comment.class,id);
    }

    @Override
    public boolean addComment(Comment comment) {
        comment.setDate();
        entityManager.persist(comment);
        return true;
    }

    @Override
    public boolean addLike(Comment comment) {
        comment.setLikes(comment.getLikes()+1);
        entityManager.merge(comment);
        return false;
    }
}

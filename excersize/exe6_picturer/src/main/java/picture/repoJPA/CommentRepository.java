package picture.repoJPA;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import picture.entity.Comment;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Integer> {
    @Query(value = "select c from Comment c where c.date= :date")
    List<Comment> findAllToday(@Param("date") String date);
}

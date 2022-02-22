package om.nimap.demo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import om.nimap.demo.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
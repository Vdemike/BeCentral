package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface CommentRepo extends JpaRepository<Comment,Integer> {

}

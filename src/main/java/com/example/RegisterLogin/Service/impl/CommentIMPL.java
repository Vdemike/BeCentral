package com.example.RegisterLogin.Service.impl;

import com.example.RegisterLogin.Dto.CommentDTO;
import com.example.RegisterLogin.Entity.Comment;
import com.example.RegisterLogin.Repo.CommentRepo;
import com.example.RegisterLogin.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CommentIMPL implements CommentService {

    @Autowired
    private CommentRepo commentRepo;



    @Override
    public String addComment(CommentDTO commentDTO) {
        Comment comment = new Comment(
               commentDTO.getCommentid(),
                commentDTO.getComment()

        );

        commentRepo.save(comment);
        return comment.getComment();
    }

}

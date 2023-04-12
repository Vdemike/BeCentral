package com.example.RegisterLogin.CommentController;

import com.example.RegisterLogin.Dto.CommentDTO;
import com.example.RegisterLogin.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/comment")


public class CommentController {

    @Autowired
    private CommentService commentService;


    @PostMapping(path = "/save")
    public String saveComment(@Validated @RequestBody CommentDTO commentDTO)
    {
        String id = commentService.addComment(commentDTO);
        return id;
    }
}

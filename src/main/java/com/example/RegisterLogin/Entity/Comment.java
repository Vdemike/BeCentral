package com.example.RegisterLogin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Table(name = "comment")

@Entity
public class Comment {

    @Id
    @Column(name="comment_id", length = 11)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int commentid;

    @Column(name="comment", length = 255)
    private String comment;



    public Comment() {
    }

    public Comment(int commentid, String comment) {
        this.commentid = commentid;
        this.comment = comment;
    }

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public String getComment() {
        return comment;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "commentid=" + commentid +
                ", comment='" + comment + '\'' +
                '}';
    }
}

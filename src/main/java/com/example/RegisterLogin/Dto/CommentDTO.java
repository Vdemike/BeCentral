package com.example.RegisterLogin.Dto;

public class CommentDTO {


    private int commentid;
    private String comment;


    public CommentDTO(int commentid, String comment) {
        this.commentid = commentid;
        this.comment = comment;

    }
    public CommentDTO() {

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

    public void setComment(String Comment) {
        this.comment = comment;
    }


    @Override
    public String toString() {
        return "CommentDTO{" +
                "commentid=" + commentid +
                ", comment='" + comment + '\'' +
                '}';
    }
}



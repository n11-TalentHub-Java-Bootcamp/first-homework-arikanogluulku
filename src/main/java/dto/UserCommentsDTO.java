package dto;

import java.util.Date;

public class UserCommentsDTO {
    private Long userId;
    private String userName;
    private String productName;
    private String comment;
    private Date dateOfComment;

    public UserCommentsDTO(){

    }

    public UserCommentsDTO(Long userId, String userName, String productName, String comment, Date dateOfComment) {
        this.userId = userId;
        this.userName = userName;
        this.productName = productName;
        this.comment = comment;
        this.dateOfComment = dateOfComment;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(Date dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    @Override
    public String toString() {
        return "UserCommentsDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                ", comment='" + comment + '\'' +
                ", dateOfComment='" + dateOfComment + '\'' +
                '}';
    }
}

package dto;

import java.math.BigDecimal;
import java.util.Date;

public class ProductCommentDetailDTO {
    private String productName;
    private String categoryName;
    private BigDecimal productPrice;
    private String firstName;
    private String lastName;
    private String userEmail;
    private String userPhone;
    private String productReview;
    private Date dateOfReview;

    public ProductCommentDetailDTO(){

    }

    public ProductCommentDetailDTO(String productName, String categoryName, BigDecimal productPrice, String firstName, String lastName, String userEmail, String userPhone, String productReview, Date dateOfReview) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.productPrice = productPrice;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.productReview = productReview;
        this.dateOfReview = dateOfReview;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getProductReview() {
        return productReview;
    }

    public void setProductReview(String productReview) {
        this.productReview = productReview;
    }

    public Date getDateOfReview() {
        return dateOfReview;
    }

    public void setDateOfReview(Date dateOfReview) {
        this.dateOfReview = dateOfReview;
    }

    @Override
    public String toString() {
        return "ProductReviewDetailDto{" +
                "productName='" + productName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", productPrice=" + productPrice +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", productReview='" + productReview + '\'' +
                ", dateOfReview=" + dateOfReview +
                '}';
    }
}

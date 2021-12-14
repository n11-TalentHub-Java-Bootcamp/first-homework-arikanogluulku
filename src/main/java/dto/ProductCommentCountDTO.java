package dto;

import java.math.BigDecimal;

public class ProductCommentCountDTO {
    private Long productId;
    private String productName;
    private BigDecimal productPrice;
    private Long reviewCount;

    public ProductCommentCountDTO(){

    }

    public ProductCommentCountDTO(Long productId, String productName, BigDecimal productPrice, Long reviewCount) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.reviewCount = reviewCount;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Long getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Long reviewCount) {
        this.reviewCount = reviewCount;
    }

    @Override
    public String toString() {
        return "ProductReviewCountDto{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", reviewCount=" + reviewCount +
                '}';
    }
}

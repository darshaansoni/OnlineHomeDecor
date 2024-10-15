package com.yash.onlineHomeDecor.domain;


public class Product {

    private int productId;
    private String productName;
    private int productPrice;
    private String productDescription;
    private int productQuantity;
    private int productCategoryId;
    private int productSubCategoryId;
    private int userId;
    private String productImage;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public int getProductSubCategoryId() {
        return productSubCategoryId;
    }

    public void setProductSubCategoryId(int productSubCategoryId) {
        this.productSubCategoryId = productSubCategoryId;
    }

    public int getUser() {
        return userId;
    }

    public void setUser(int userId) {
        this.userId = userId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Product(int productId, String productName, int productPrice, String productDescription, int productQuantity, int productCategoryId, int productSubCategoryId, int userId, String productImage) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
        this.productCategoryId = productCategoryId;
        this.productSubCategoryId = productSubCategoryId;
        this.userId = userId;
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productDescription='" + productDescription + '\'' +
                ", productQuantity=" + productQuantity +
                ", productCategoryId=" + productCategoryId +
                ", productSubCategoryId=" + productSubCategoryId +
                ", userId=" + userId +
                ", productImage='" + productImage + '\'' +
                '}';
    }

    public Product() {
    }


}

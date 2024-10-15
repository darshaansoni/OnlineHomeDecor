package com.yash.onlineHomeDecor.domain;


public class ProductSubCategories {

    private int productSubCategoryId;

    private String productSubCategoryName;

    private String productSubCategoryDescription;

    public int getProductSubCategoryId() {
        return productSubCategoryId;
    }

    public void setProductSubCategoryId(int productSubCategoryId) {
        this.productSubCategoryId = productSubCategoryId;
    }

    public String getProductSubCategoryName() {
        return productSubCategoryName;
    }

    public void setProductSubCategoryName(String productSubCategoryName) {
        this.productSubCategoryName = productSubCategoryName;
    }

    public String getProductSubCategoryDescription() {
        return productSubCategoryDescription;
    }

    public void setProductSubCategoryDescription(String productSubCategoryDescription) {
        this.productSubCategoryDescription = productSubCategoryDescription;
    }

    public ProductSubCategories(int productSubCategoryId, String productSubCategoryName, String productSubCategoryDescription) {
        this.productSubCategoryId = productSubCategoryId;
        this.productSubCategoryName = productSubCategoryName;
        this.productSubCategoryDescription = productSubCategoryDescription;
    }

    public ProductSubCategories() {
    }

    @Override
    public String toString() {
        return "ProductSubCategories{" +
                "productSubCategoryId=" + productSubCategoryId +
                ", productSubCategoryName='" + productSubCategoryName + '\'' +
                ", productSubCategoryDescription='" + productSubCategoryDescription + '\'' +
                '}';
    }
}

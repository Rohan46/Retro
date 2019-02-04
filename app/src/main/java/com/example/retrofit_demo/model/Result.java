package com.example.retrofit_demo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("category_name")
    @Expose
    private String categoryName;
    @SerializedName("listing_id")
    @Expose
    private Integer listingId;
    @SerializedName("listing_name")
    @Expose
    private String listingName;
    @SerializedName("listing_img")
    @Expose
    private String listingImg;
    @SerializedName("listing_address")
    @Expose
    private String listingAddress;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getListingId() {
        return listingId;
    }

    public void setListingId(Integer listingId) {
        this.listingId = listingId;
    }

    public String getListingName() {
        return listingName;
    }

    public void setListingName(String listingName) {
        this.listingName = listingName;
    }

    public String getListingImg() {
        return listingImg;
    }

    public void setListingImg(String listingImg) {
        this.listingImg = listingImg;
    }

    public String getListingAddress() {
        return listingAddress;
    }

    public void setListingAddress(String listingAddress) {
        this.listingAddress = listingAddress;
    }


}

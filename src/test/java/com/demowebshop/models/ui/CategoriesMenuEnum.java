package com.demowebshop.models.ui;

public enum CategoriesMenuEnum {

    BOOKS("Books"),
    COMPUTERS("Computers"),
    ELECTRONICS("Electronics"),
    APPAREL_AND_SHOES("Apparel & Shoes"),
    DIGITAL_DOWNLOADS("Digital downloads"),
    JEWELRY("Jewelry"),
    GIFT_CARDS("Gift Cards");

    public final String linkName;

    CategoriesMenuEnum(String linkName) {
        this.linkName = linkName;
    }
}

package com.demowebshop.models.ui;

public enum NavigationMenuLinkEnum {

    BOOKS("Books"),
    COMPUTERS("Computers"),
    ELECTRONICS("Electronics"),
    APPAREL_AND_SHOES("Apparel & Shoes"),
    DIGITAL_DOWNLOADS("Digital downloads"),
    JEWELRY("Jewelry"),
    GIFT_CARDS("Gift Cards");

    public final String linkName;

    NavigationMenuLinkEnum(String linkName) {
        this.linkName = linkName;
    }
/*
    public String getLinkName() {
        return linkName;
    }*/
}

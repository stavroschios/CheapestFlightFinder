package com.eventxorizons;

public class Quote {
    private final String site;
    private final float price;

    public Quote(String site, float price) {
        this.site = site;
        this.price = price;
    }

    public String getSite() {
        return site;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "site='" + site + '\'' +
                ", price=" + price +
                '}';
    }


}

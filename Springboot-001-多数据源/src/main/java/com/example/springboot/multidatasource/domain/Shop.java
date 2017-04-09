package com.example.springboot.multidatasource.domain;

/**
 * Author: 王俊超
 * Date: 2017-04-09 08:58
 * All Rights Reserved !!!
 */
public class Shop {
    private int id;
    private String shopName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                '}';
    }
}

package com.example.springboot.multidatasource.controller;

import com.example.springboot.multidatasource.annotation.DataSourceTypeAnno;
import com.example.springboot.multidatasource.common.DataSourceEnum;
import com.example.springboot.multidatasource.domain.Shop;
import com.example.springboot.multidatasource.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 王俊超
 * Date: 2017-04-09 09:12
 * All Rights Reserved !!!
 */
@RestController
public class ShopController {
    @Autowired
    private ShopService service;

    @RequestMapping(value = "/getShop")
    public Shop getShop(@RequestParam("id") int id) {
        return service.getShop(id);
    }

    @RequestMapping(value = "/getMasterShopByHandle")
    public Shop getMasterShopByHandle(int id) {
        return service.getMasterShopByHandle(id);
    }

    @RequestMapping(value = "/getSlaverShopByHandle")
    public Shop getSlaverShopByHandle(int id) {
        return service.getSlaverShopByHandle(id);
    }

    @RequestMapping(value = "/getMasterShopByAnnotation")
    @DataSourceTypeAnno(DataSourceEnum.master)
    public Shop getMasterShopByAnnotation(int id) {
        return service.getMasterShopByAnnotation(id);
    }

    @RequestMapping(value = "/getSlaverShopByAnnotation")
    public Shop getSlaverShopByAnnotation(int id) {
        return service.getSlaverShopByAnnotation(id);
    }
}

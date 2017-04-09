package com.example.springboot.multidatasource.service;

import com.example.springboot.multidatasource.annotation.DataSourceTypeAnno;
import com.example.springboot.multidatasource.common.DataSourceEnum;
import com.example.springboot.multidatasource.dao.ShopDao;
import com.example.springboot.multidatasource.domain.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: 王俊超
 * Date: 2017-04-09 09:09
 * All Rights Reserved !!!
 */
@Service("shopService")
public class ShopService {
    @Autowired
    private ShopDao dao;

    public Shop getShop(int id) {
        return dao.getShop(id);
    }

    public Shop getMasterShopByHandle(int id) {
        return dao.getMasterShopByHandle(id);
    }

    public Shop getSlaverShopByHandle(int id) {
        return dao.getSlaverShopByHandle(id);
    }

    @DataSourceTypeAnno(DataSourceEnum.master)
    public Shop getMasterShopByAnnotation(int id) {
        return dao.getMasterShopByAnnotation(id);
    }

    @DataSourceTypeAnno(DataSourceEnum.slaver)
    public Shop getSlaverShopByAnnotation(int id) {
        return dao.getSlaverShopByAnnotation(id);
    }
}

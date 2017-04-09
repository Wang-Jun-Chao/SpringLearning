package com.example.springboot.multidatasource.dao;

import com.example.springboot.multidatasource.annotation.DataSourceTypeAnno;
import com.example.springboot.multidatasource.common.DataSourceContextHolder;
import com.example.springboot.multidatasource.common.DataSourceEnum;
import com.example.springboot.multidatasource.domain.Shop;
import com.example.springboot.multidatasource.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Author: 王俊超
 * Date: 2017-04-09 09:10
 * All Rights Reserved !!!
 */
@Repository("shopDao")
public class ShopDao {
    @Autowired
    private ShopMapper mapper;

    /**
     * 获取shop
     */
    public Shop getShop(int id) {
        return mapper.getShop(id);
    }

    public Shop getMasterShopByHandle(int id) {
        DataSourceContextHolder.setDataSourceType(DataSourceEnum.master);
        Shop shop = mapper.getShop(id);
        DataSourceContextHolder.resetDataSourceType();
        return shop;
    }

    public Shop getSlaverShopByHandle(int id) {
        DataSourceContextHolder.setDataSourceType(DataSourceEnum.slaver);
        Shop shop = mapper.getShop(id);
        DataSourceContextHolder.resetDataSourceType();
        return shop;
    }

    @DataSourceTypeAnno(DataSourceEnum.master)
    public Shop getMasterShopByAnnotation(int id) {
        return mapper.getShop(id);
    }

    @DataSourceTypeAnno(DataSourceEnum.slaver)
    public Shop getSlaverShopByAnnotation(int id) {
        return mapper.getShop(id);
    }
}

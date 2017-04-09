package com.example.springboot.multidatasource.mapper;

import com.example.springboot.multidatasource.domain.Shop;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Author: 王俊超
 * Date: 2017-04-09 08:58
 * All Rights Reserved !!!
 */

public interface ShopMapper {
    @Select("SELECT * FROM t_shop WHERE id = #{id}")
    @Results(value = { @Result(id = true, column = "id", property = "id"),
            @Result(column = "shop_name", property = "shopName") })
    public Shop getShop(@Param("id") int id);
}

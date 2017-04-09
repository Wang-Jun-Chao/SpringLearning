package com.example.springboot.multidatasource.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Author: 王俊超
 * Date: 2017-04-09 08:30
 * All Rights Reserved !!!
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSourceType();
    }
}

package com.example.common;


import org.hibernate.cfg.ImprovedNamingStrategy;

/**
 * Created by Administrator on 2017/3/6.
 */
public class MySQLUpperCaseStrategy extends ImprovedNamingStrategy {


    @Override
    public String tableName(String tableName) {
        return tableName.toUpperCase();
    }

}

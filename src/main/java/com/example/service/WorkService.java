package com.example.service;

import com.example.dao.WorkDao;
import com.example.entity.WorkEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/7.
 */

@Service
public class WorkService {
    @Autowired
    private WorkDao workDao;// 資源表

    public List<WorkEntity> findAll() {
        List<WorkEntity> list = workDao.findAll();
        System.out.println(list);
        return list;
    }
}

package com.example.dao;

import com.example.entity.WorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/3/7.
 */
public interface WorkDao extends JpaRepository<WorkEntity, String> {
}

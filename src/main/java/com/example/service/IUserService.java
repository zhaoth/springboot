package com.example.service;

import com.example.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/3/8.
 */
public interface IUserService extends JpaRepository<UserEntity, Integer>, JpaSpecificationExecutor<UserEntity> {

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED) /*http://blog.didispace.com/springboottransactional/ 事物详细参数*/
    UserEntity findById(Integer id);

    UserEntity findByUserName(String userName);

    UserEntity findByUserNameAndPassword(String userName, String password);

    List<UserEntity> findByUserNameLike(String username);

    List<UserEntity> findByUserNameNotLike(String username);

    List<UserEntity> findByUserNameNot(String username);

    @Query("FROM UserEntity u WHERE u.userName=?1 AND u.password IS NOT NULL")
    List<UserEntity> findAll(String userName);

    @Query("UPDATE UserEntity u SET u.password=?2 WHERE u.userName=?1")
    @Modifying
    @Transactional
    void updatePwd(String userName, String pwd);

    @Query("DELETE FROM UserEntity u WHERE u.userName=?1")
    @Modifying
    @Transactional
    void deleteByUserName(String userName);

    @Query("UPDATE UserEntity u SET u.email= :email WHERE u.userName = :user")
    @Modifying
    @Transactional
    void updateEmail(@Param("user") String userName, @Param("email") String email);
}

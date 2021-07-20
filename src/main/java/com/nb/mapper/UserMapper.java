package com.nb.mapper;

import com.nb.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
     * 登录
     */
    Long getIdByUsernameAndPassword(@Param("account") String account, @Param("pwd") String password);

    /**
     * 修改密码
     */
    int changePassById(@Param("id") Long id, @Param("newpwd") String newPassword);

    /**
     * 查找用户(注册)
     */
    Long registerCheck(@Param("account") String NewAccount);

    /**
     * 注册新用户
     */
    int addByNameAndPass(@Param("account") String NewAccount, @Param("acountpwd") String NewAccountPwd);

    /**
     * 查找用户信息（订单需要）
     */
    User selectByPrimaryKey(Long id);

    /*注销用户*/
    //int discardById(@Param("id") Long id);

    /*插入*/
    //int insert(User record);

    /*展示用户列表*/
    //List<User> selectAll();

    /*更新*/
    //int updateByPrimaryKey(User record);
}
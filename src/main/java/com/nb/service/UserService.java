package com.nb.service;

import com.nb.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserService {

    /**
     * 登录
     */
    Long getIdByUsernameAndPassword(String account, String password);

    /**
     * 修改密码
     */
    int changePassById(@Param("id") Long id, @Param("newpwd") String newPassword);

    /**
     * 注册新用户
     */
    boolean addByNameAndPass(@Param("account") String NewAccount, @Param("acountpwd") String NewAccountPwd);

    /**
     * 查找用户信息（订单需要）
     */
    User selectByPrimaryKey(Long id);

    /**
     * 查找用户
     */
    boolean registerCheck(String NewAccount);

    /**
     * 查找用户密码（修改密码）
     */
    boolean changePwdCheck(String account, String password);

    /**
     * 修改密码
     */
    boolean changePassByAccount(@Param("account") String account, @Param("newpwd") String changePwd);


}

package com.nb.mapper;

import com.nb.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * 登录
     */
    Long getIdByUsernameAndPassword(@Param("account") String account, @Param("pwd") String password);


    /**
     * @Params [account, password]
     * @Return {@link String}
     * @Author 谭庆山
     * @Date 2021/7/21 8:09
     * @Description 登录成功时取出用户名，用作主页展示。
     */
    String getUsernameOnLogin(String account, String password);

    /**
     * 修改密码
     */
    int changePassByAccount(@Param("account") String account, @Param("newpwd") String changePwd);

    /**
     * 查询账户及密码（修改密码所需）
     */
    Long changePwdCheck(@Param("account") String account, @Param("password") String password);

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
    List<User> selectByPrimaryKey(@Param("id") Long id);
}
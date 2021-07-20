package com.nb.service.impl;

import com.nb.entity.User;
import com.nb.mapper.UserMapper;
import com.nb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    /**
     * 登录
     */

    @Override
    public Long getIdByUsernameAndPassword(String account, String password) {
        return mapper.getIdByUsernameAndPassword(account, password);
    }

    /**
     * 修改密码
     */
    @Override
    public int changePassById(Long id, String newPassword) {
        return 0;
    }

    /**
     * 注册新用户
     */
    @Override
    public boolean registerCheck(String NewAccount) {
        return mapper.registerCheck(NewAccount) == null;
    }

    @Override
    public boolean addByNameAndPass(String NewAccount, String NewAccountPwd) {
        return mapper.addByNameAndPass(NewAccount, NewAccountPwd) != 0;
    }

    /**
     * 查找用户信息（订单需要）
     */
    @Override
    public User selectByPrimaryKey(Long id) {
        return null;
    }


    @Override
    public boolean changePwdCheck(String account, String pasword) {
        return mapper.changePwdCheck(account, pasword) != null;
    }

    /**
     * 修改密码
     */
    @Override
    public boolean changePassByAccount(String account, String changePwd) {
        return mapper.changePassByAccount(account, changePwd) != 0;
    }

}

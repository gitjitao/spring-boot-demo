
package com.b2b.crm.dao;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

import com.b2b.crm.dao.mapper.BaseMapper;
import com.b2b.crm.dao.mapper.UserMapper;
import com.b2b.crm.model.User;


@Repository
public class UserDao extends BaseDao<User> {

    @Resource
    private UserMapper userMapper;

    @Override
    protected BaseMapper<User> getMapper() {
        return userMapper;
    }
}

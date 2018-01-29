package com.wk.dao;

import com.wk.pojo.User;

/**
 * Created by WK on 2018/1/29.
 */
public interface UserDao {
    int deleteByPrimaryKey(Integer id);
    int insert(User reord);
    int insertSelective(User record);
    User selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(User record);
    int updateByPrIMARYKey(User record);
}

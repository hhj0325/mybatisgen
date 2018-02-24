package com.jd.jw.auth.dao;

import com.jd.jw.auth.domain.JwUser;

public interface JwUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JwUser record);

    int insertSelective(JwUser record);

    JwUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JwUser record);

    int updateByPrimaryKey(JwUser record);
}
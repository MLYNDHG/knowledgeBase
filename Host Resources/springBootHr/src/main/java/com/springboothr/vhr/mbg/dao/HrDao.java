package com.springboothr.vhr.mbg.dao;

import com.springboothr.vhr.mbg.model.Hr;

public interface HrDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);
}
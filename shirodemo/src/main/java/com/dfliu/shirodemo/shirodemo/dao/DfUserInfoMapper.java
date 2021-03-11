package com.dfliu.shirodemo.shirodemo.dao;

import com.dfliu.shirodemo.shirodemo.entity.DfUserInfoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DfUserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DfUserInfoEntity record);

    int insertSelective(DfUserInfoEntity record);

    DfUserInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DfUserInfoEntity record);

    int updateByPrimaryKey(DfUserInfoEntity record);
}
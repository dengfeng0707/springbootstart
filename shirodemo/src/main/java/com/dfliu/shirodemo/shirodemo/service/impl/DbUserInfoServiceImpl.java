package com.dfliu.shirodemo.shirodemo.service.impl;

import com.dfliu.shirodemo.shirodemo.dao.DfUserInfoMapper;
import com.dfliu.shirodemo.shirodemo.entity.DfUserInfoEntity;
import com.dfliu.shirodemo.shirodemo.service.IDdUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbUserInfoServiceImpl implements IDdUserInfoService {

    @Autowired
    private DfUserInfoMapper dfUserInfoMapper;

    /**
     * 获取用户信息
     *
     * @param id 用户主键id
     * @return
     */
    @Override
    public DfUserInfoEntity getUserInfo(Long id) {
        try {
            DfUserInfoEntity dfUserInfoEntity = this.dfUserInfoMapper.selectByPrimaryKey(id);
            return dfUserInfoEntity;
        } catch (Exception ex) {
            String exMsg = ex.getMessage();
        }
        return null;
    }
}

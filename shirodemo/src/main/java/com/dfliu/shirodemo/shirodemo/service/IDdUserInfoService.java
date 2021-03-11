package com.dfliu.shirodemo.shirodemo.service;

import com.dfliu.shirodemo.shirodemo.entity.DfUserInfoEntity;

public interface IDdUserInfoService {
    /**
     * 获取用户信息
     * @param id
     * @return
     */
    DfUserInfoEntity getUserInfo(Long id);
}

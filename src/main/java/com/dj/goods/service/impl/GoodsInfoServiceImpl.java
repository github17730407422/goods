package com.dj.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.goods.dao.GoodsInfoDao;
import com.dj.goods.entity.GoodsInfo;
import com.dj.goods.service.GoodsInfoService;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService{
    
    
    @Autowired
    private GoodsInfoDao goodsInfoDao;

    @Override
    public int updateGoodsInfoByUuid(String uuid) {
        return 0;
    }

    @Override
    public List<GoodsInfo> findByuuid(String uuid) {
        return goodsInfoDao.findByDyid(uuid);
    }

}

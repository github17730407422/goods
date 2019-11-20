package com.dj.goods.service;

import java.util.List;
import com.dj.goods.entity.GoodsInfo;

public interface GoodsInfoService {
    
    int updateGoodsInfoByUuid(String uuid);
    
    List<GoodsInfo> findByuuid(String uuid);

}

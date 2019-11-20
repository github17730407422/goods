package com.dj.goods.dao;

import java.util.List;

import com.dj.goods.entity.GoodsInfo;

/**
 * 
 * @author tengzhq
 *
 */
public interface GoodsInfoDao {
	/**
     * 
     * @Description: 根据id查询商品
     * @param dyid
     * @return
     */
    public List<GoodsInfo> findByDyid(String uuid);
    
}

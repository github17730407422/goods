package com.dj.goods.repository;

import com.dj.goods.entity.GoodsInfo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsInforepository extends JpaRepository<GoodsInfo, String>{
    
    @Override
    default Optional<GoodsInfo> findById(String id) {
        return null;
    }
    
    @Override
    List<GoodsInfo> findAll();

}

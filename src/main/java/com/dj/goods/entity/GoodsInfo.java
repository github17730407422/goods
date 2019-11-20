package com.dj.goods.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods")
public class GoodsInfo {
    
    @Id
    private String uuid;
    
    private String goodsName;
    
    private String price;
    
    private String category;
    
    @Override
    public String toString() {
        return "GoodsInfo [uuid=" + uuid + ", goodsName=" + goodsName + ", price=" + price + ", category=" + category
                + ", details=" + details + "]";
    }

    private String details;

    public String getUuid() {
        return uuid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDetails() {
        return details;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}

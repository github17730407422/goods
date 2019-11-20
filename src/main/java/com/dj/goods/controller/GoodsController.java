package com.dj.goods.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.battcn.swagger.properties.ApiDataType;
import com.battcn.swagger.properties.ApiParamType;
import com.dj.goods.entity.GoodsInfo;
import com.dj.goods.service.GoodsInfoService;
import com.dj.goods.util.Jsonresult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/goods")
@Api(tags = "1.1",description = "商品测试接口",value="商品测试接口")
public class GoodsController {
    
    @Autowired
    private GoodsInfoService goodsInfoService;
    
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);
    
/*    @ApiImplicitParams({
        @ApiImplicitParam(name = "username", value = "用户名", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY),
        @ApiImplicitParam(name = "password", value = "密码", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY),
    })*/
    //@ApiImplicitParams  可以是多个参数
    @ApiOperation(value = "查找商品接口")
    @ApiImplicitParams({@ApiImplicitParam(name = "uuid",value="商品id",dataType = ApiDataType.STRING,paramType = ApiParamType.QUERY)})
    @RequestMapping(value="/findByuuid" , method = RequestMethod.GET)
    public Jsonresult<List<GoodsInfo>> findByuuid(@RequestParam String uuid) {
        Jsonresult<List<GoodsInfo>> jsonResult = new Jsonresult<List<GoodsInfo>>();
        try {
            List<GoodsInfo> goodsInfos = goodsInfoService.findByuuid(uuid);
            jsonResult.setFlag(Jsonresult.SUCCESS);
            jsonResult.setInfo(goodsInfos);
            jsonResult.setMsg("查询成功");
            jsonResult.setTotal(goodsInfos.size());
        } catch (Exception e) {
            jsonResult.setFlag(Jsonresult.FALL);
            jsonResult.setMsg("查询失败");
            logger.error(e.getMessage(),e);
        }
        return jsonResult;
    }
    
    
   /* @PutMapping("/{id}")
    @ApiOperation(value = "修改用户（DONE）")
    public void put(@PathVariable Long id, @RequestBody User user) {
        log.info("如果你不想写 @ApiImplicitParam 那么 swagger 也会使用默认的参数名作为描述信息 ");
    }*/

}

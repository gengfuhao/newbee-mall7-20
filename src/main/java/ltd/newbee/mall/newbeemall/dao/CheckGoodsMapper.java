package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.CheckGoods;

public interface CheckGoodsMapper {

	List<CheckGoods> findCheckGoodsByUserId(@Param("userId") int userId, @Param("number") int number);
}

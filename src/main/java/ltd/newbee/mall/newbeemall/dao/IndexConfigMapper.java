package ltd.newbee.mall.newbeemall.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.IndexConfig;

public interface IndexConfigMapper {

	List<IndexConfig> findIndexConfigsByTypeAndNum(@Param("configType") int configType, @Param("number") int number);
} 
package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.IndexConfig;

public interface NewBeeMallIndexConfigService {
	List<IndexConfig> getConfigGoodsesForIndex(int configType ,int number);
}
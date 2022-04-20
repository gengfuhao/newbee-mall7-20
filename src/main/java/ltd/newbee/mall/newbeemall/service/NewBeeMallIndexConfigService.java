package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCategoryVO;

public interface NewBeeMallIndexConfigService {
	List<NewBeeMallGoodsDetailVO> getConfigGoodsesForIndex(int configType ,int number);
	List<NewBeeMallIndexCategoryVO> getCategoriesForIndex();

	
}
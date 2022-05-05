package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;

public interface NewBeeMallCheckGoodsService {
	//自己做的分2步的方法
	List<NewBeeMallGoodsDetailVO> getCheckGoodsesForIndex(long userId ,int number);
	//方法2
	List<NewBeeMallGoodsDetailVO> getRescentCheckGoodsesForIndex(long userId ,int number);
}

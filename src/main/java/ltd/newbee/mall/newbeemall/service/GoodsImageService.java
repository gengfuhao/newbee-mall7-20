package ltd.newbee.mall.newbeemall.service;

import java.util.ArrayList;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsImage;
import ltd.newbee.mall.newbeemall.vo.GoodsImageVO;

public interface GoodsImageService {
	List<ArrayList<GoodsImage>> GetGoodsImagesByGoodsId(long goodsId);
}

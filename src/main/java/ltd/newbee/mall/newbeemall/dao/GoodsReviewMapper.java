package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;

public interface GoodsReviewMapper {
	List<GoodsReview>findGoodsReviewByGoodsId(long start,long number,long goodsId);
	
	List<GoodsReview> checkGoodsReview(long goodsId, long userId);
	int insertGoodsReview(List<GoodsReview> list);
}

package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewCountAndAvgVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;

public interface GoodsReviewService {
	List<GoodsReviewVO> getGoodsReview(int rating, long start,long number,long goodsId);
	
	List<GoodsReview> checkGoodsReview(long goodsId, long userId);

	int insertGoodsReview2(Map<String,Object> review);
	
	GoodsReviewCountAndAvgVO getReviewsCountAndAverage(long goodsId);
	
	//List<GoodsReview> countReviewsByRating(long goodsId);
}

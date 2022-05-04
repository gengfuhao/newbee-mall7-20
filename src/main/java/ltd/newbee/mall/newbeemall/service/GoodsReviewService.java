package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewCountAndAvgVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;

public interface GoodsReviewService {
	//task1
	List<GoodsReviewVO> getGoodsReview(int rating, long start,long number,long goodsId);
	
	//task2
	List<GoodsReview> checkGoodsReview(long goodsId, long userId);

	int insertGoodsReview2(Map<String,Object> review);
	//task3
	GoodsReviewCountAndAvgVO getReviewsCountAndAverage(long goodsId);

	//task4
	int checkReviewLike(long goodsId, long userId);
	int insertReviewLike(Map<String,Object> reviewLike);
}

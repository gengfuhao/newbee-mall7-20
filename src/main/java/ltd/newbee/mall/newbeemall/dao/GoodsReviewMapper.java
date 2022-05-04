package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.entity.GoodsReviewCountAndAvg;

public interface GoodsReviewMapper {
	//task1 显示review
	List<GoodsReview>findGoodsReviewByGoodsId(int rating,long start,long number,long goodsId);
	
	//task2 check and insert review
	List<GoodsReview> checkGoodsReview(long goodsId, long userId);
	
	int insertGoodsReview2(Map<String,Object> review);
	//採番
	long findMaxReviewId();
	
	//task3 一覧
	List<GoodsReviewCountAndAvg> countReviewsAndAverageRating(long goodsId);
	List<GoodsReviewCountAndAvg> countReviewsByRating(long goodsId);
	//方法２
	List<GoodsReviewCountAndAvg> countReviewsByRating2(long goodsId);

	//task4 check and insert review_like
	int checkReviewLike(long reviewId, long userId);
	int insertReviewLike(Map<String,Object> reviewLike);
	
}

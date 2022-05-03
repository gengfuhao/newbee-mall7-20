package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;

public interface GoodsReviewMapper {
	//task1 显示review
	List<GoodsReview>findGoodsReviewByGoodsId(int rating,long start,long number,long goodsId);
	
	//task2 check and insert
	List<GoodsReview> checkGoodsReview(long goodsId, long userId);
	
	int insertGoodsReview(Map<String,Object> review);
	//採番
	long findMaxReviewId();
	
	//task3 一覧
	List<GoodsReview> countReviewsAndAverageRating(long goodsId);
	
	List<GoodsReview> countReviewsByRating(long goodsId);

	Map<String,Integer> countReviewsHashMap(Map<String,Integer> map);
}

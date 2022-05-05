package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsReviewMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.entity.GoodsReviewCountAndAvg;
import ltd.newbee.mall.newbeemall.service.GoodsReviewService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewCountAndAvgSecondVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewCountAndAvgVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;

@Service
public class GoodsReviewServiceImpl implements GoodsReviewService {

	@Resource
	GoodsReviewMapper goodsReviewMapper;
	//task1
	@Override
	public List<GoodsReviewVO> getGoodsReview(int rating, long start, long number, long goodsId) {

		List<GoodsReview> entityList = goodsReviewMapper.findGoodsReviewByGoodsId(rating, start, number, goodsId);
		List<GoodsReviewVO> VoList = BeanUtil.copyList(entityList, GoodsReviewVO.class);
		return VoList;
	}
	//task2
	@Override
	public List<GoodsReview> checkGoodsReview(long goodsId, long userId) {
		return goodsReviewMapper.checkGoodsReview(goodsId, userId);
	}

	@Override
	public int insertGoodsReview2(Map<String, Object> review) {
		// 採番
		long newReviewId = goodsReviewMapper.findMaxReviewId() + 1;
		review.replace("reviewId", newReviewId);
		// 插入当下时间
		review.replace("reviewDate", new Date());
		return goodsReviewMapper.insertGoodsReview2(review);
	}
	//task3
	@Override
	public GoodsReviewCountAndAvgVO getReviewsCountAndAverage(long goodsId) {
		//平均分，总评分件数和总评价内容件数
		GoodsReviewCountAndAvg entity = goodsReviewMapper.countReviewsAndAverageRating(goodsId);
		//每个星级的件数
		List<GoodsReviewCountAndAvg> ratingEntity = goodsReviewMapper.countReviewsByRating2(goodsId);

		// ->vo
		GoodsReviewCountAndAvgVO vo = new GoodsReviewCountAndAvgVO();
		BeanUtil.copyProperties(entity, vo);
		//第二层vo
		List<GoodsReviewCountAndAvgSecondVO> voList = BeanUtil.copyList(ratingEntity,GoodsReviewCountAndAvgSecondVO.class);
		vo.setGoodsReviewCountAndAvgSecondVOS(voList);
	
		return vo;
	}
	//task4
	@Override
	public int checkReviewLike(long reviewId, long userId) {
		return goodsReviewMapper.checkReviewLike(reviewId, userId);
	}

	@Override
	public int insertReviewLike(Map<String, Object> reviewLike) {
		reviewLike.replace("likeDate", new Date());
		return goodsReviewMapper.insertReviewLike(reviewLike);
	}
}

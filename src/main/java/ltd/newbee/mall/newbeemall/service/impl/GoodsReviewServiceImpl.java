package ltd.newbee.mall.newbeemall.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsReviewMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.service.GoodsReviewService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;

@Service
public class GoodsReviewServiceImpl implements GoodsReviewService {

	@Resource
	GoodsReviewMapper goodsReviewMapper;

	@Override
	public List<GoodsReviewVO> getGoodsReview(int rating,long start,long number,long goodsId) {

		List<GoodsReview> entityList = goodsReviewMapper.findGoodsReviewByGoodsId(rating,start, number, goodsId);
		List<GoodsReviewVO> VoList = BeanUtil.copyList(entityList, GoodsReviewVO.class);

		return VoList;
	}

	@Override
	public List<GoodsReview> checkGoodsReview(long goodsId, long userId) {		
		return goodsReviewMapper.checkGoodsReview(goodsId,userId);
	}
	
	@Override
	public int insertGoodsReview(Map<String, Object> review) {
		//採番
		long newReviewId = goodsReviewMapper.findMaxReviewId()+1;
		review.replace("reviewId", newReviewId);
		//插入当下时间
		review.replace("reviewDate",new Date());
		return goodsReviewMapper.insertGoodsReview(review);
	}
}

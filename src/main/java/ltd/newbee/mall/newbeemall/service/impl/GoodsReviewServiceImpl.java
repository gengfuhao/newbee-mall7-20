package ltd.newbee.mall.newbeemall.service.impl;

import java.util.Date;
import java.util.List;

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
	public List<GoodsReviewVO> getGoodsReview(long start, long number, long goodsId) {

		List<GoodsReview> entityList = goodsReviewMapper.findGoodsReviewByGoodsId(start, number, goodsId);
		List<GoodsReviewVO> VoList = BeanUtil.copyList(entityList, GoodsReviewVO.class);

		return VoList;
	}

	@Override
	public int insertGoodsReview(List<GoodsReview> list) {
		/*
		 * int count = goodsReviewMapper.insertGoodsReview(list);
		 * 
		 * //List<GoodsReview> list = goodsReviewMapper.insertReview(); GoodsReview re1
		 * = new GoodsReview();
		 * 
		 * List<GoodsReview> entityList1 = goodsReviewMapper.findGoodsReviewByGoodsId(0,
		 * 999999999, goodsId); long maxReview = entityList1.size();
		 * 
		 * List<GoodsReview> entityList2 = goodsReviewMapper.checkGoodsReview(goodsId,
		 * userId);
		 * 
		 * if (entityList2.size() > 0) { re1.setReviewId(maxReview + 1);
		 * re1.setOrderId((entityList2.get(0)).getOrderId()); re1.setGoodsId(goodsId);
		 * re1.setNickName("user"); re1.setRating(5); re1.setTitle("good");
		 * re1.setContent("reviewcontent"); re1.setPhoto1(null); re1.setPhoto2(null);
		 * re1.setPhoto3(null); re1.setPhoto4(null); re1.setPhoto5(null);
		 * re1.setReviewDate(new Date()); list.add(re1); }else { count=0; }
		 * 
		 * return count;
		 */
		return goodsReviewMapper.insertGoodsReview(list);
	}
}

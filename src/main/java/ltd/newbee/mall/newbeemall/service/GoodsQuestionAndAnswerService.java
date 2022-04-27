package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.GoodsQuestionAndAnswerVO;

public interface GoodsQuestionAndAnswerService {
	List<GoodsQuestionAndAnswerVO> getGoodsQA(int pageNo, int number,long goodsId);

}
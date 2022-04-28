package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.GoodsQuestionAndAnswerNumberVO;

public interface GoodsQuestionAndAnswerService {
	List<GoodsQuestionAndAnswerNumberVO> getGoodsQA(int pageNo, int number,long goodsId,String orderByCol);
}
package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.vo.GoodsQuestionAndAnswerNumberVO;

public interface GoodsQuestionAndAnswerService {
	List<GoodsQuestionAndAnswerNumberVO> getGoodsQA(int pageNo, int number,long goodsId,String orderByCol);
	int insertGoodsQuestion(Map<String,Object> question);
}
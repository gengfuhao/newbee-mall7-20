package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsQuestionAndAnswer;

public interface GoodsQuestionAndAnswerMapper {
	List<GoodsQuestionAndAnswer> findGoodsQAByGoodsId(int start, int number, long goodsId, String orderByCol);
	int findGoodsQANumberAndPage(long goodsId);
}
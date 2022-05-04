package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsQuestionAndAnswer;

public interface GoodsQuestionAndAnswerMapper {
	List<GoodsQuestionAndAnswer> findGoodsQAByGoodsId(int start, int number, long goodsId, String orderByCol);

	int findGoodsQANumberAndPage(long goodsId);

	// insert question
	int insertGoodsQuestion(Map<String, Object> question);

	long findMaxQuestionId();

	// check and insert qa_like
	int checkQaLike(long answerId, long userId);

	int insertQaLike(Map<String, Object> qaLike);

}
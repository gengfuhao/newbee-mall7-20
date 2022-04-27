package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsQuestionAndAnswerMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsQuestionAndAnswer;
import ltd.newbee.mall.newbeemall.service.GoodsQuestionAndAnswerService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.GoodsQuestionAndAnswerVO;

@Service
public class GoodsQuestionAndAnswerServiceImpl implements GoodsQuestionAndAnswerService {

	@Resource
	GoodsQuestionAndAnswerMapper goodsQuestionAndAnswerMapper;

	@Override
	public List<GoodsQuestionAndAnswerVO> getGoodsQA(int pageNo, int number, long goodsId) {

		int start = (pageNo - 1) * number;
		List<GoodsQuestionAndAnswer> entityList = new ArrayList<GoodsQuestionAndAnswer>();
		entityList = goodsQuestionAndAnswerMapper.findGoodsQAByGoodsId(start, number, goodsId);

		//List<GoodsQuestionAndAnswerVO> voList = BeanUtil.copyList(entityList, GoodsQuestionAndAnswerVO.class);

		List<GoodsQuestionAndAnswerVO> voList = new ArrayList<>();

		int totalCount = goodsQuestionAndAnswerMapper.findGoodsQAByGoodsId(goodsId);
		int currentPage = pageNo;

		int totalPage = 0;
		if (totalCount != 0 && totalCount % number != 0) {
			totalPage = (totalCount / number) + 1;
		} else if (totalCount != 0 && totalCount % number == 0) {
			totalCount = totalCount / number;
		}
		
		GoodsQuestionAndAnswerVO vo = new GoodsQuestionAndAnswerVO();
		vo.setTotalCount("全"+ totalCount +"件");
		vo.setPageNumber("ページ"+currentPage+"//"+totalPage);
		voList.add(vo);
		
		BeanUtil.copyProperties(entityList, vo);
		
		return voList;
	}

}

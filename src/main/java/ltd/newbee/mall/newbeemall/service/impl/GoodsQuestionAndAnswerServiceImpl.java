package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ltd.newbee.mall.newbeemall.dao.GoodsQuestionAndAnswerMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsQuestionAndAnswer;
import ltd.newbee.mall.newbeemall.service.GoodsQuestionAndAnswerService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.GoodsQuestionAndAnswerNumberVO;
import ltd.newbee.mall.newbeemall.vo.GoodsQuestionAndAnswerVO;

@Service
public class GoodsQuestionAndAnswerServiceImpl implements GoodsQuestionAndAnswerService {

	@Resource
	GoodsQuestionAndAnswerMapper goodsQuestionAndAnswerMapper;

	@Override
	public List<GoodsQuestionAndAnswerNumberVO> getGoodsQA(int pageNo, int number, long goodsId, String orderByCol) {
		
		int start = (pageNo - 1) * number;
		List<GoodsQuestionAndAnswer> entityList = new ArrayList<GoodsQuestionAndAnswer>();
		entityList = goodsQuestionAndAnswerMapper.findGoodsQAByGoodsId(start, number, goodsId, orderByCol);
		
		int currentPage = pageNo;
		int totalCount = goodsQuestionAndAnswerMapper.findGoodsQANumberAndPage(goodsId);

		int totalPage = 0;
		if (totalCount != 0 && totalCount % number != 0) {
			totalPage = (totalCount / number) + 1;
		} else if (totalCount != 0 && totalCount % number == 0) {
			totalCount = totalCount / number;
		}
		// ->vo
		List<GoodsQuestionAndAnswerNumberVO> voList = new ArrayList<>();
		GoodsQuestionAndAnswerNumberVO vo = new GoodsQuestionAndAnswerNumberVO();
		
		vo.setTotalCount(totalCount);
		vo.setCurrentPage(currentPage);
		vo.setTotalPage(totalPage);
		List<GoodsQuestionAndAnswerVO> voList1 = BeanUtil.copyList(entityList,GoodsQuestionAndAnswerVO.class);
		vo.setGoodsQuestionAndAnswerVOS(voList1);
		voList.add(vo);

		return voList;
	}
}

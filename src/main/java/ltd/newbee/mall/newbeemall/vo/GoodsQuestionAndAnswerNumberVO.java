package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GoodsQuestionAndAnswerNumberVO implements Serializable {
	
	private Integer totalCount;
	
	private Integer currentPage;
	
	private Integer totalPage;
	
	private List<GoodsQuestionAndAnswerVO> GoodsQuestionAndAnswerVOS;

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<GoodsQuestionAndAnswerVO> getGoodsQuestionAndAnswerVOS() {
		return GoodsQuestionAndAnswerVOS;
	}

	public void setGoodsQuestionAndAnswerVOS(List<GoodsQuestionAndAnswerVO> goodsQuestionAndAnswerVOS) {
		GoodsQuestionAndAnswerVOS = goodsQuestionAndAnswerVOS;
	}

}
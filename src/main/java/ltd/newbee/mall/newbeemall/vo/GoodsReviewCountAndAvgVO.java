package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GoodsReviewCountAndAvgVO implements Serializable {

	private Double ratingAvg;
	
	private Integer reviewCount;
	
	private Integer titleCount;

	public Double getRatingAvg() {
		return ratingAvg;
	}

	public void setRatingAvg(Double ratingAvg) {
		this.ratingAvg = ratingAvg;
	}

	public Integer getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}

	public Integer getTitleCount() {
		return titleCount;
	}

	public void setTitleCount(Integer titleCount) {
		this.titleCount = titleCount;
	}

}
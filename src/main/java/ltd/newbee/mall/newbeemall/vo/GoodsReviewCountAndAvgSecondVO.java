package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GoodsReviewCountAndAvgSecondVO implements Serializable {

	private Integer rating;

	private Integer ratingCount;

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(Integer ratingCount) {
		this.ratingCount = ratingCount;
	}

}
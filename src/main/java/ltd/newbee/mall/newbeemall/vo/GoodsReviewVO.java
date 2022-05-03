package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GoodsReviewVO implements Serializable {

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.rating")
    private Integer rating;
    
	
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.nick_name")
    private String nickName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.1351359+09:00", comments="Source field: review.review_date")
    public Date getReviewDate() {
        return reviewDate;
    }
	
private Long goodsId;
	
	private String goodsName;
	
	private Integer count;
	
	private Double ratingAvg;
	
	private Integer reviewCount;
	
	private Integer titleCount;

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	

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

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.title")
	    private String title;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.content")
	    private String content;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo1")
	    private String photo1;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo2")
	    private String photo2;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo3")
	    private String photo3;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo4")
	    private String photo4;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.1351359+09:00", comments="Source field: review.photo5")
	    private String photo5;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.1351359+09:00", comments="Source field: review.review_date")
	    private Date reviewDate;


	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.nick_name")
	    public String getNickName() {
	        return nickName;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.nick_name")
	    public void setNickName(String nickName) {
	        this.nickName = nickName == null ? null : nickName.trim();
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.rating")
	    public Integer getRating() {
	        return rating;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.rating")
	    public void setRating(Integer rating) {
	        this.rating = rating;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.title")
	    public String getTitle() {
	        return title;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.title")
	    public void setTitle(String title) {
	        this.title = title == null ? null : title.trim();
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.content")
	    public String getContent() {
	        return content;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.content")
	    public void setContent(String content) {
	        this.content = content == null ? null : content.trim();
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo1")
	    public String getPhoto1() {
	        return photo1;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo1")
	    public void setPhoto1(String photo1) {
	        this.photo1 = photo1 == null ? null : photo1.trim();
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo2")
	    public String getPhoto2() {
	        return photo2;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo2")
	    public void setPhoto2(String photo2) {
	        this.photo2 = photo2 == null ? null : photo2.trim();
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo3")
	    public String getPhoto3() {
	        return photo3;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo3")
	    public void setPhoto3(String photo3) {
	        this.photo3 = photo3 == null ? null : photo3.trim();
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo4")
	    public String getPhoto4() {
	        return photo4;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.134137+09:00", comments="Source field: review.photo4")
	    public void setPhoto4(String photo4) {
	        this.photo4 = photo4 == null ? null : photo4.trim();
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.1351359+09:00", comments="Source field: review.photo5")
	    public String getPhoto5() {
	        return photo5;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.1351359+09:00", comments="Source field: review.photo5")
	    public void setPhoto5(String photo5) {
	        this.photo5 = photo5 == null ? null : photo5.trim();
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-28T20:00:59.1351359+09:00", comments="Source field: review.review_date")
	    public void setReviewDate(Date reviewDate) {
	        this.reviewDate = reviewDate;
	    }

}
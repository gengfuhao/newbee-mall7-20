package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Questions {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.question_id")
    private Long questionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.question_date")
    private Date questionDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.proved")
    private Integer proved;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.question_contents")
    private String questionContents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.question_id")
    public Long getQuestionId() {
        return questionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.question_id")
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.question_date")
    public Date getQuestionDate() {
        return questionDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.question_date")
    public void setQuestionDate(Date questionDate) {
        this.questionDate = questionDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.proved")
    public Integer getProved() {
        return proved;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.proved")
    public void setProved(Integer proved) {
        this.proved = proved;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.question_contents")
    public String getQuestionContents() {
        return questionContents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:00:17.963311+09:00", comments="Source field: questions.question_contents")
    public void setQuestionContents(String questionContents) {
        this.questionContents = questionContents == null ? null : questionContents.trim();
    }
}
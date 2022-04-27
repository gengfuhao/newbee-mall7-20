package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Answers {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0159589+09:00", comments="Source field: answers.answer_id")
    private Long answerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0159589+09:00", comments="Source field: answers.employee_id")
    private Long employeeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.answer_date")
    private Date answerDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.answer_contents")
    private String answerContents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.question_id")
    private Long questionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0159589+09:00", comments="Source field: answers.answer_id")
    public Long getAnswerId() {
        return answerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0159589+09:00", comments="Source field: answers.answer_id")
    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0159589+09:00", comments="Source field: answers.employee_id")
    public Long getEmployeeId() {
        return employeeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.employee_id")
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.answer_date")
    public Date getAnswerDate() {
        return answerDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.answer_date")
    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.answer_contents")
    public String getAnswerContents() {
        return answerContents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.answer_contents")
    public void setAnswerContents(String answerContents) {
        this.answerContents = answerContents == null ? null : answerContents.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.question_id")
    public Long getQuestionId() {
        return questionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:41:22.0169573+09:00", comments="Source field: answers.question_id")
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}
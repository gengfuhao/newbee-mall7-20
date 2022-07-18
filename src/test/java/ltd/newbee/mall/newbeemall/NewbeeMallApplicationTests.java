package ltd.newbee.mall.newbeemall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.entity.RunRecommendApiHistory;
import ltd.newbee.mall.newbeemall.service.GoodsReviewService;
import ltd.newbee.mall.newbeemall.service.RunRecommendApiHistoryService;

@SpringBootTest
class NewbeeMallApplicationTests {

	@Resource
	RunRecommendApiHistoryService runRecommendApiHistoryService;
	
	@Resource
	GoodsReviewService goodsReviewService;
	
	  @Test void contextLoads() {
	  
	  List<RunRecommendApiHistory> list = new ArrayList<>();
	  RunRecommendApiHistory h1 = new RunRecommendApiHistory(); 
	  h1.setUserId(1); h1.setCategoryId(0);
	  h1.setRunDate(new Date()); list.add(h1);
	  
	  int cnt = runRecommendApiHistoryService.insertRunRecommendApiHistory(list);
	  assertEquals(1,cnt); 
	  }
	 
	 
	
	/*
	 * @Test void testSelectRescentCategoryId() { List<RunRecommendApiHistory> list
	 * = runRecommendApiHistoryService.selectRescentCategoryId();
	 * assertEquals(2,list.size()); assertTrue(list.contains(51l));
	 * assertTrue(list.contains(86l));
	 * 
	 * }
	 */
	
	
	/*
	 * @Test void contextLoads() {
	 * 
	 * List<GoodsReview> list = new ArrayList<>(); GoodsReview re1 = new
	 * GoodsReview(); re1.setReviewId(10l); re1.setOrderId(21l);
	 * re1.setGoodsId(10742l); re1.setNickName("user"); re1.setRating(5);
	 * re1.setTitle("good"); re1.setContent("reviewcontent"); re1.setPhoto1(null);
	 * re1.setPhoto2(null); re1.setPhoto3(null); re1.setPhoto4(null);
	 * re1.setPhoto5(null); re1.setReviewDate(new Date()); list.add(re1);
	 * 
	 * int cnt = goodsReviewService.insertGoodsReview(list); assertEquals(1,cnt); }
	 */
}

package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.entity.MallUser;
import ltd.newbee.mall.newbeemall.service.CheckUserExistsService;
import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.service.GoodsImageService;
import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.service.GoodsQuestionAndAnswerService;
import ltd.newbee.mall.newbeemall.service.GoodsReviewService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class GoodsDetailController {
	@Resource
	private GoodsDetailService goodsDetailService;

	@Resource
	private GoodsImageService goodsImageService;

	@Resource
	private GoodsInfoService goodsInfoService;

	@Resource
	private GoodsQuestionAndAnswerService goodsQuestionAndAnswerService;

	@Resource
	private GoodsReviewService goodsReviewService;

	@Resource
	private CheckUserExistsService checkUserExistsService;

	@GetMapping("/goodsDetail")
	@ResponseBody
	public Result getgoodsDetail(long goodsId) {
		return ResultGenerator.genSuccessResult(goodsDetailService.findGoodsDetailsByGoodsId(goodsId));
	}

	@GetMapping("/goodsImages")
	@ResponseBody
	public Result goodsImages(long goodsId) {
		return ResultGenerator.genSuccessResult(goodsImageService.GetGoodsImagesByGoodsId(goodsId));
	}

	@GetMapping("/goodsInfo")
	@ResponseBody
	public Result goodsInfo(long goodsId) {
		return ResultGenerator.genSuccessResult(goodsInfoService.getGoodsInfo(goodsId));
	}

	@GetMapping("/goodsQA")
	@ResponseBody
	public Result goodsQA(int pageNo, int number, long goodsId, String orderByCol) {
		return ResultGenerator
				.genSuccessResult(goodsQuestionAndAnswerService.getGoodsQA(pageNo, number, goodsId, orderByCol));
	}

	@PostMapping("/goodsQA/insert")
	@ResponseBody
	public Result insertQA(@RequestBody HashMap<String, Object> questionMap) {
		String userId1 = questionMap.get("userId").toString();
		long userId = Long.parseLong(userId1);
		MallUser user = checkUserExistsService.checkUserExists(userId);
		if (user == null) {
			return ResultGenerator.genFailResult("The user ID you entered does not exist!");

		} else {
			int count=goodsQuestionAndAnswerService.insertGoodsQuestion(questionMap);
			if(count > 0) {
			return ResultGenerator.genSuccessResult("sussced!");
			}else {
				return ResultGenerator.genFailResult("faild!");
			}
		}
	}

	@PostMapping("/goodsQA/insertqaLike")
	@ResponseBody
	public Result insertQaLike(@RequestBody HashMap<String, Object> qaLikeMap) {
		String userId1 = qaLikeMap.get("userId").toString();
		long userId = Long.parseLong(userId1);
		MallUser user = checkUserExistsService.checkUserExists(userId);

		String answerId1 = qaLikeMap.get("answerId").toString();
		long answerId = Long.parseLong(answerId1);
		int count = goodsQuestionAndAnswerService.checkQaLike(answerId, userId);

		if (user != null) {
			if (count != 0) {
				return ResultGenerator.genFailResult("您已经点击过");
			} else {
				// 判断是否成功插入数据
				int countInsert = goodsQuestionAndAnswerService.insertQaLike(qaLikeMap);
				if(countInsert>0) {
					return ResultGenerator.genSuccessResult("多谢!");
				}
				return ResultGenerator.genFailResult("点击失败");
			}
		}
		return ResultGenerator.genFailResult("请先登录！");
	}

	@GetMapping("/goodsReview")
	@ResponseBody
	public Result getGoodsReview(int rating, long start, long number, long goodsId) {
		return ResultGenerator.genSuccessResult(goodsReviewService.getGoodsReview(rating, start, number, goodsId));
	}

	@PostMapping("/goodsReview/insert")
	@ResponseBody
	public Result insertReview(@RequestBody HashMap<String, Object> reviewMap) {
		// Object先转成String，再转成long
		String goodsId1 = reviewMap.get("goodsId").toString();
		String userId1 = reviewMap.get("userId").toString();
		long goodsId = Long.parseLong(goodsId1);
		long userId = Long.parseLong(userId1);
		List<GoodsReview> entityList = goodsReviewService.checkGoodsReview(goodsId, userId);

		if (entityList != null && entityList.size() == 0) {
			return ResultGenerator.genFailResult("failed");
		} else {
			return ResultGenerator.genSuccessResult(goodsReviewService.insertGoodsReview2(reviewMap));
		}
	}

	@GetMapping("/goodsReview/countReviews")
	@ResponseBody
	public Result countReviews(long goodsId) {
		return ResultGenerator.genSuccessResult(goodsReviewService.getReviewsCountAndAverage(goodsId));
	}

	@PostMapping("/goodsReview/insertReviewLike")
	@ResponseBody
	public Result insertReviewLike(@RequestBody HashMap<String, Object> reviewLikeMap) {
		String userId1 = reviewLikeMap.get("userId").toString();
		long userId = Long.parseLong(userId1);
		MallUser user = checkUserExistsService.checkUserExists(userId);

		String reviewId1 = reviewLikeMap.get("reviewId").toString();
		long reviewId = Long.parseLong(reviewId1);
		int count = goodsReviewService.checkReviewLike(reviewId, userId);

		if (user != null) {
			if (count != 0) {
				return ResultGenerator.genFailResult("您已经点击过");
			} else {
				int countInsert= goodsReviewService.insertReviewLike(reviewLikeMap);
				if(countInsert>0) {
				return ResultGenerator.genSuccessResult("多谢!");
				}else{
					return ResultGenerator.genFailResult("点赞失败");
				}
			}
		}
		return ResultGenerator.genFailResult("请先登录！");
	}
}
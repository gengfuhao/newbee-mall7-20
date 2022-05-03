package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class TestController {
	
	//方法1    Postman: GET + Params
	@Resource
	private GoodsDetailService goodsDetailService;
	
	@GetMapping("/goods/detail")
    @ResponseBody
    public Result getgoodsDetail(long goodsId) {
        return ResultGenerator.genSuccessResult(goodsDetailService.findGoodsDetailsByGoodsId(goodsId));
    }
	
	//方法2  Postman:POST
	/**
	 * restful风格的参数请求
	 * http://localhost:8080/goods/detail/review/222222
	 * @param id
	 */
	
	@RequestMapping(value = "/goods/detail/review/{id}", method = RequestMethod.POST)
	@ResponseBody
	public Result queryProduct(@PathVariable("id") String id) {
	// ...业务处理
	return ResultGenerator.genSuccessResult(id);
	}
	
	//方法3  Postman:DELETE   Body-form-data
	@DeleteMapping("/goods/detail/review")
	@ResponseBody
	public Result review(@RequestParam(value = "reviewId", required = true) long reviewId) {
	System.out.println(reviewId);
	return ResultGenerator.genSuccessResult(reviewId);
	}

	

}

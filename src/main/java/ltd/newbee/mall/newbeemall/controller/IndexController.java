package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.NewBeeMallCategoryService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class IndexController {
	@Resource
	private NewBeeMallIndexConfigService newBeeMallIndexConfigService;
	
	@Resource
	private NewBeeMallCategoryService newBeeMallCategoryService;

	/*
	 * @GetMapping("/newGoods")
	 * 
	 * @ResponseBody public Result getNewGoods() {
	 * 
	 * return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.
	 * getConfigGoodsesForIndex(4, 5)); }
	 * 
	 * 
	 * @GetMapping("/recommendGoodses")
	 * 
	 * @ResponseBody public Result getCommendGoodses() {
	 * 
	 * return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.
	 * getConfigGoodsesForIndex(5, 5)); }
	 */
	
	@GetMapping("/Goodses")
    @ResponseBody
    public Result getGoodses(int configType) {

        return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(configType, 5));
    }
	
	@GetMapping("/categories")
    @ResponseBody
    public Result getCategories() {

        return ResultGenerator.genSuccessResult(newBeeMallCategoryService.getCategoriesForIndex());
    }
	
}


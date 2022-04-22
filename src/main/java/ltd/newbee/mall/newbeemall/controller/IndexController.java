package ltd.newbee.mall.newbeemall.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.MallUser;
import ltd.newbee.mall.newbeemall.service.CheckUserExistsService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCategoryService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCheckGoodsService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;

@Controller
public class IndexController {
	@Resource
	private NewBeeMallIndexConfigService newBeeMallIndexConfigService;
	
	@Resource
	private NewBeeMallCategoryService newBeeMallCategoryService;
	
	@Resource
	private CheckUserExistsService checkUserExistsService;
	
	@Resource
	private NewBeeMallCheckGoodsService newBeeMallCheckGoodsService;

	/*
	 * @GetMapping("/newGoods")
	 * @ResponseBody public Result getNewGoods() {
	 * return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.
	 * getConfigGoodsesForIndex(4, 5)); }
	 * 
	 * @GetMapping("/recommendGoodses")
	 * @ResponseBody public Result getCommendGoodses() {
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
	
	@GetMapping("/user")
    @ResponseBody
    public Result user(long userId) {
		MallUser user = checkUserExistsService.checkUserExists(userId);
		if(user == null) {
			return ResultGenerator.genFailResult("The user ID you entered does not exist!");
			
		}else {
			//return ResultGenerator.genSuccessResult("success");
			
			//List<NewBeeMallGoodsDetailVO> voList = newBeeMallCheckGoodsService.getCheckGoodsesForIndex(userId,6);
			return ResultGenerator.genSuccessResult(newBeeMallCheckGoodsService.getCheckGoodsesForIndex(userId,6));
		}

		//方法2
		/*
		* int count = checkUserExistsService.checkUserExistsReturnCount(userId);
		* if(count == 0 ) { return ResultGenerator.genFailResult("failed");
		*/
					
		
    }
	
	
}


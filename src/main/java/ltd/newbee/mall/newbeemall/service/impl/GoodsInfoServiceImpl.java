package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mall.newbeemall.dao.GoodsInfoMapper;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
	@Resource
	GoodsInfoMapper goodsInfoMapper;

	@Override
	public List<NewBeeMallGoodsDetailVO> getGoodsInfo(long goodsId) {
		List<NewBeeMallGoodsDetailVO> voList = new ArrayList<>();
		
		List<NewBeeMallGoods> entityList = goodsInfoMapper.findGoodsInfoByGoodsId(goodsId);
		
		for(NewBeeMallGoods e : entityList) {
			NewBeeMallGoodsDetailVO vo = new NewBeeMallGoodsDetailVO();
			//entity自动转vo
			BeanUtil.copyProperties(e, vo);
			/*
			 * vo.setGoodsId(null); vo.setGoodsName(null); vo.setGoodsIntro(null);
			 * vo.setGoodsCoverImg(null); vo.setSellingPrice(null);
			 * vo.setOriginalPrice(null); vo.setGoodsDetailContent(null);
			 * vo.setStockNum(null); vo.setTag(null); vo.setGoodsSellStatus(null);
			 */
			voList.add(vo);
		}
		
		return voList;
	}

}

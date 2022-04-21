package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.IndexConfigMapper;
import ltd.newbee.mall.newbeemall.entity.IndexConfig;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCategoryVO;

@Service
public class NewBeeMallIndexConfigServiceImpl implements NewBeeMallIndexConfigService {

	@Resource
	private IndexConfigMapper indexConfigMapper;

	@Override
	public List<NewBeeMallGoodsDetailVO> getConfigGoodsesForIndex(int configType, int number) {

		List<IndexConfig> indexConfig = indexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);
		List<Long> ids = new ArrayList<>();

		for (IndexConfig inxCon : indexConfig) {
			ids.add(inxCon.getGoodsId());
		}

		List<NewBeeMallGoods> entityList = indexConfigMapper.selectByPrimarKeys(ids);
		List<NewBeeMallGoodsDetailVO> voList = new ArrayList<NewBeeMallGoodsDetailVO>();

		for (NewBeeMallGoods entity : entityList) {
			NewBeeMallGoodsDetailVO goodsDetailVo = new NewBeeMallGoodsDetailVO();
			goodsDetailVo.setGoodsId(entity.getGoodsId());
			goodsDetailVo.setGoodsName(entity.getGoodsName());
			goodsDetailVo.setGoodsIntro(entity.getGoodsIntro());
			goodsDetailVo.setGoodsIntro(entity.getGoodsIntro());
			goodsDetailVo.setSellingPrice(entity.getSellingPrice());
			goodsDetailVo.setOriginalPrice(entity.getOriginalPrice());
			goodsDetailVo.setGoodsDetailContent(entity.getGoodsDetailContent());

			String name = goodsDetailVo.getGoodsName();
			if (name.length() > 30) {
				goodsDetailVo.setGoodsName(name.substring(0, 30) + "...");
			}
			voList.add(goodsDetailVo);
		}

		return voList;
	}

}

package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsImageMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsImage;
import ltd.newbee.mall.newbeemall.vo.GoodsImageVO;

@Service
public class GoodsImageServiceImpl implements ltd.newbee.mall.newbeemall.service.GoodsImageService {

	@Resource
	GoodsImageMapper goodsImageMapper;

	@Override
	public List<ArrayList<GoodsImage>> GetGoodsImagesByGoodsId(long goodsId) {

		List<ArrayList<GoodsImage>> rsList = new ArrayList<ArrayList<GoodsImage>>();

		List<GoodsImage> entityList = new ArrayList<>();
		entityList = goodsImageMapper.findGoodsImagesByGoodsId(goodsId);
		
		ArrayList<GoodsImage> tempList = new ArrayList<GoodsImage>();
		
		for(int i=0;i<entityList.size();i++) {
			//0~6，8~14... （7,15,23...以及最后一个以外）
			tempList.add(entityList.get(i));
			//7,15,23... 放满8个，需要新的list
			if((i+1)%8 ==0) {
				rsList.add(tempList);
				tempList = new ArrayList<GoodsImage>();
			}
			//判断最后一个元素，最后一个list有可能不满8
			if(i==(entityList.size()-1) && (i+1)%8 !=0) {
				rsList.add(tempList);
			}
		}
		//List<ArrayList<GoodsImageVO>> voList = new ArrayList<ArrayList<GoodsImageVO>>();
		return rsList;
	}

}

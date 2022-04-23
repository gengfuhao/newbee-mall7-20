package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.RunRecommendApiHistoryMapper;
import ltd.newbee.mall.newbeemall.entity.RunRecommendApiHistory;
import ltd.newbee.mall.newbeemall.service.RunRecommendApiHistoryService;

@Service
public class RunRecommendApiHistoryServiceImpl implements RunRecommendApiHistoryService {

	@Resource
	RunRecommendApiHistoryMapper runRecommendApiHistoryMapper;
	
	@Override
	public int insertRunRecommendApiHistory() {
		// TODO 自動生成されたメソッド・スタブ
		List<RunRecommendApiHistory> list = new ArrayList<>();
		RunRecommendApiHistory h1 = new RunRecommendApiHistory();
		h1.setUserId(1);
		h1.setCategoryId(0);
		h1.setRunDate(new Date());
		list.add(h1);
		
		return runRecommendApiHistoryMapper.insertRunRecommendApiHistory(list);
	}

}

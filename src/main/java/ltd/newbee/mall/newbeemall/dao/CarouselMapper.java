package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.Carousel;

public interface CarouselMapper {
	List<Carousel> findCarouselsByNum(@Param("number") int number);
}
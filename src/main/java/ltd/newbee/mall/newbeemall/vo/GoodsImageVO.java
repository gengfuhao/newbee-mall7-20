package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class GoodsImageVO implements Serializable {
	public List<String> getImage() {
		return imageList;
	}
	public void setImage(List<String> image) {
		this.imageList = imageList;
	}

	private List<String> imageList;

	
}

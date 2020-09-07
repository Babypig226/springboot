package testSpringBoot.controller.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("goods")
public class GoodsController {
	@RequestMapping("goodsList")
	public String goodsList() {
		return "goods/goods-list";
	}
	
	@RequestMapping("goodsForm")
	public String goodsForm() {
		return "thymeleaf/goods-form";
	}

}

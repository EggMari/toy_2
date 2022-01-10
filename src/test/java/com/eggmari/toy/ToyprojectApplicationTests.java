package com.eggmari.toy;

import com.eggmari.toy.service.OilPriceService;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ToyprojectApplicationTests {

	@Test
	void contextLoads() {
	}
	private OilPriceService oilPriceService;
	@Test
	void oilButton() throws ParseException {
		JSONObject json = oilPriceService.getOilPrice();
		System.out.println(json);
		oilPriceService.savePrices(json);
	}

}

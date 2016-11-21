/**
 * 
 */
package com.dgstack.spring.oauth2.webapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dgstack.spring.oauth2.model.SuperHero;

/**
 * @author dbhakuni
 *
 */
@RestController
public class SuperHeroController {

	private String[][] data = {
				{"SpiderMan", "SuperMan", "BatMan", "Flash"},
				{"peter@mail.com", "clark@mail.com", "barry@mail.com"}
			};
	
	@RequestMapping("/student/{id}")
	public SuperHero getStudent(@RequestParam("id")int id){
		return new SuperHero(id, data[0][id], data[1][id]);
	}
	
}

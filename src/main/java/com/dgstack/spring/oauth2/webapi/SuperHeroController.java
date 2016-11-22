/**
 * 
 */
package com.dgstack.spring.oauth2.webapi;

import org.springframework.web.bind.annotation.PathVariable;
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
				{"peter@mail.com", "clark@mail.com", "brue@mail.com","barry@mail.com"}
			};
	
	@RequestMapping("/superhero/{id}")
	public SuperHero getStudent(@PathVariable("id")int id){
		return new SuperHero(id, data[0][id], data[1][id]);
	}
	
}

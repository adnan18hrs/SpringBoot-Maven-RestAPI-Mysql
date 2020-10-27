package com.example.SmallWebApp1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DataApi {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/getUserAllDetails")
	public List<UserRegistration> getAllData(){
		System.out.println("Hello API");
		
		return repo.findAll();
	}
	
	@RequestMapping("/getUserByID/{uid}")
	public Optional<UserRegistration> getRecordsByID(@PathVariable("uid") Long Id){
		System.out.println("Hello API");
		
		return repo.findById(id);
	}
//	@RequestMapping("/showDetails")
//	public ModelAndView function() {
//		System.out.println("ShowDetails");
//		ModelMap map = new ModelMap();
//		map.put("name", reg.getUName());
//		map.put("email", reg.getEmailId());
//		map.put("gender", reg.getGender());
//		
//		ModelAndView mv = new ModelAndView("user-details");
//		mv.addObject("regObj",map);
//		return mv;
//	}
}

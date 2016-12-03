package hu.uni.miskolc.webtech.librarian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class IndexController {
	
	@RequestMapping(value={"/authorsTable"})
	public ModelAndView authorsTable(){
		ModelAndView result = new ModelAndView("authorsTable");
		return result;
	}
	
	@RequestMapping(value={"/index"})
	public ModelAndView indexPage(){
		ModelAndView result = new ModelAndView("index");
		return result;
	}
	
	@RequestMapping(value={"/booksTable"})
	public ModelAndView booksTable(){
		ModelAndView result = new ModelAndView("booksTable");
		return result;
	}

	@RequestMapping("/hello")
	public @ResponseBody String sayHello(){
		return "Hello World";
	}

}

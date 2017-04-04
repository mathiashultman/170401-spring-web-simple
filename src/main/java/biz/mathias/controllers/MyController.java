package biz.mathias.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value="/", method=GET)
	public String home(Model model){
		model.addAttribute("test", "hej");
		return "home";
	}
}

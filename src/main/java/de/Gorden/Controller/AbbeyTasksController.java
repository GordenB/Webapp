package de.Gorden.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AbbeyTasksController {

	@RequestMapping (value="/abbeyTasks", method=RequestMethod.GET)
	public String showForm() {
		// return http page name
		return "abbeyTasks";
	}
}

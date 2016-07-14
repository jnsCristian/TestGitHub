package co.uk.endava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest request) {
		// new ModelAndView("Test");
		// new ModelAndView("Test","modelName", "model value");
		// new ModelAndView("Test",new HashMap<String, Object>());
		return new ModelAndView("welcome", "message", "Good morning!");
	}

	@RequestMapping(value = "/users/add", method = RequestMethod.GET)
	public ModelAndView ShowAddUserForm(Model model) {
		// new ModelAndView("Test");
		// new ModelAndView("Test","modelName", "model value");
		// new ModelAndView("Test",new HashMap<String, Object>());
		User user = new User();
		return new ModelAndView("form", "command", user);
	}

	@RequestMapping(value = "/users/add", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("form") User user) {
		// new ModelAndView("Test");
		// new ModelAndView("Test","modelName", "model value");
		// new ModelAndView("Test",new HashMap<String, Object>());
		return new ModelAndView("NewFile");
	}

}

package jp.ken.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.ken.validation.groups.GroupOrder;
import jp.ken.validation.model.ValidationModel;

@Controller
public class ValidationController {

	@RequestMapping(value="/regist",method = RequestMethod.GET)
	public String toRegistration(Model model) {
		model.addAttribute("validationModel", new ValidationModel());
		return "validationRegistration";
		}

	@RequestMapping(value="/regist",method = RequestMethod.POST)
	public String registration(@Validated (GroupOrder.class)@ModelAttribute
			ValidationModel validationModel, BindingResult result, Model model) {
		if (result.hasErrors()) {
		return "validationRegistration";
		}

		return "validationRegistrationComplete";
}
}

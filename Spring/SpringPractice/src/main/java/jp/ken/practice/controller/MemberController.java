package jp.ken.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.ken.practice.model.MemberModel;

@Controller
@RequestMapping("form")
@SessionAttributes("memberModel")
public class MemberController {

	@ModelAttribute("memberModel")
	public MemberModel setupLoginForm() {
		return new MemberModel();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String toRegist() {
		return "registration";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String toConfirm(@Validated @ModelAttribute MemberModel memberModel,BindingResult result) {
		if (result.hasErrors()) {
			return "registration";
			}
	return "confirm";
	}

	@RequestMapping(method = RequestMethod.POST, params = "back")
	public String back(@ModelAttribute MemberModel memberModel) {
			return "registration";
			}

	@RequestMapping(method = RequestMethod.POST, params = "forward")
	public String forward(@ModelAttribute MemberModel memberModel) {
			return "finish";
			}
}


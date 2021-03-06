package jp.ken.session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.ken.session.model.LoginModel;

@Controller
@RequestMapping("login")
@SessionAttributes("loginModel")
public class LoginController {

	@ModelAttribute("loginModel")
		public LoginModel setupLoginForm(){
			return new LoginModel();
		}

	@RequestMapping(method = RequestMethod.GET)
		public String toLogin() {
			return "loginForm";
		}

	@RequestMapping(method = RequestMethod.POST)
		public String toRegist(@Validated @ModelAttribute LoginModel lModel, BindingResult result, Model model) {
			if (result.hasErrors()) {
				return "loginForm";
			} else if (lModel.getLoginId().equals("duke") && lModel.getPassword().equals("dolphin7")){
				return "redirect:/regist";
			} else {
				model.addAttribute("errorMessage", "ログインIDもしくはパスワードが間違っています。");
				return "loginForm";
				}
}
}

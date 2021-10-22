package jp.ken.session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

	@Controller
	@RequestMapping("confirm")
	@SessionAttributes({"loginModel","memberModel"})
	public class ConfirmController {

			//GET通信
			@RequestMapping(method = RequestMethod.GET)
			public String toConfrim(Model model) {
				model.addAttribute("message", "上記内容で登録します。");
				return "confirmForm";
			}

			@RequestMapping(method = RequestMethod.POST, params = "back")
			public String toRegist() {
					return "redirect:/regist";
					}

			@RequestMapping(method = RequestMethod.POST, params = "forward")
			public String toFinish() {
					return "forward:/finish";
					}
	}

package jp.ken.session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.ken.session.model.MemberModel;

@Controller
@RequestMapping("regist")
@SessionAttributes({"loginModel","memberModel"})
public class RegistController {

	@ModelAttribute("memberModel")
		public MemberModel setupMemberModel(){
			return new MemberModel();
		}

		//GET通信
		@RequestMapping(method = RequestMethod.GET)
		public String toRegist() {
			return "registForm";
		}

		@RequestMapping(method = RequestMethod.POST)
		public String toConfirm(@Validated @ModelAttribute MemberModel mModel, BindingResult result) {
			if (result.hasErrors()) {
				return "registForm";
			} else {
				return "redirect:/confirm";
				}
}
}

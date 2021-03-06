package jp.ken.employees.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.ken.employees.groups.GroupOrder;
import jp.ken.employees.model.EmployeeModel;
import jp.ken.employees.model.ListDataModel;

@Controller
public class EmployeeController {
		private List<ListDataModel> getNumberList(int start, int end){
			List<ListDataModel> numberList = new ArrayList<ListDataModel>();
		for (int i = start; i <= end; i++) {
			numberList.add(new ListDataModel(Integer.toString(i),Integer.toString(i)));
			}
		return numberList;
		}

//		部署
		private Map<String, String> getPostMap(){
			Map<String, String> postMap = new LinkedHashMap<String, String>();
				postMap.put("delevop", "開発部");
				postMap.put("jobs", "人事部");
				postMap.put("business", "営業部");
				postMap.put("general", "総務部");
				postMap.put("acounting", "経理部");
				return postMap;
		}

		//保有資格
		private Map<String, String> getCapacitiesMap(){
			Map<String, String> capacitiesMap = new LinkedHashMap<String, String>();
				capacitiesMap.put("itpass", "ITパスポート");
				capacitiesMap.put("basic", "基本情報技術者試験");
				capacitiesMap.put("advance", "応用情報技術者試験");
				capacitiesMap.put("others", "その他");
				return capacitiesMap;
		}

		//GET通信
		@RequestMapping(value="/regist", method = RequestMethod.GET)
		public String regist(Model model) {
			EmployeeModel empModel = new EmployeeModel();
			empModel.setEmpMonth("4");
			model.addAttribute("employeeModel", empModel);
			Calendar calendar = Calendar.getInstance();
			model.addAttribute("birthYear", getNumberList(1970, calendar.get(Calendar.YEAR)));
			model.addAttribute("birthMonth", getNumberList(1,12));
			model.addAttribute("birthDay", getNumberList(1, 31));
			model.addAttribute("empYear", getNumberList(2000, calendar.get(Calendar.YEAR)));
			model.addAttribute("empMonth", getNumberList(1,12));
			model.addAttribute("empDay", getNumberList(1, 31));
			model.addAttribute("postMap", getPostMap());
			model.addAttribute("capacitiesMap", getCapacitiesMap());

			return "employeeRegistration";
		}

		@RequestMapping(value="/regist", method = RequestMethod.POST)
		public String confirm(@Validated(GroupOrder.class)
		@ModelAttribute EmployeeModel empModel, BindingResult result, Model model) {

			if (result.hasErrors()) {
				Calendar calendar = Calendar.getInstance();
				model.addAttribute("birthYear", getNumberList(1970, calendar.get(Calendar.YEAR)));
				model.addAttribute("birthMonth", getNumberList(1,12));
				model.addAttribute("birthDay", getNumberList(1, 31));
				model.addAttribute("empYear", getNumberList(2000, calendar.get(Calendar.YEAR)));
				model.addAttribute("empMonth", getNumberList(1,12));
				model.addAttribute("empDay", getNumberList(1, 31));
				model.addAttribute("postMap", getPostMap());
				model.addAttribute("capacitiesMap", getCapacitiesMap());

				return "employeeRegistration";
			}

			if (empModel.getGender().equals("man"))
			{ 	model.addAttribute("gender", "男");
			} else {
				model.addAttribute("gender", "女");}

		//部署
		String post = empModel.getPost();
		Map<String, String> postMap = getPostMap();
		model.addAttribute("post", postMap.get(post));

		//保有資格
		String capacities = "";
			Map<String, String> capacitiesMap = getCapacitiesMap();
			if (empModel.getCapacities().length == 0){
			capacities = "なし";
			} else {
				for(String capacitiesData : empModel.getCapacities()) {
					if(capacities.length() > 0) {
						capacities += "<br />";
					}
					capacities += capacitiesMap.get(capacitiesData);
				}
			}
			model.addAttribute("capacities", capacities);

			return "employeeConfirm";
		}}
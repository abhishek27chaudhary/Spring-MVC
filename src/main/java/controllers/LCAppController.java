package controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DTO.Registration;
import DTO.UserInfoDTO;


@Controller
public class LCAppController {

	@RequestMapping("/")
	public String getPage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
	//2	UserInfoDTO userInfo = new UserInfoDTO();
	//2	model.addAttribute("userInfo", userInfo);
	
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	//1 This is using @RequestParam notation. 
	//1 We will be using data binding to simplify the process
	//1 public String getResult(@RequestParam("UserName") String User, @RequestParam("CrushName") String Crush, Model model) {
		
	public String getResult(@Valid @ModelAttribute("userInfo")UserInfoDTO userInfo, BindingResult res ) {
		
		System.out.println(userInfo.getUserName() +" "+userInfo.getCrushName());
		//model.addAttribute("username",User);
		//model.addAttribute("crushname",Crush);
		//2 model.addAttribute(userInfoDTO);
		
		
		if(res.hasErrors()) {
			System.out.println("My form has errors");
//			List<ObjectError> allError = result.getAllErrors();
//			
//			for(ObjectError t : allError) {
//				System.out.println(t);
//			}
			
			return "home-page";
		}
		
		return "process-homepage";
	}
	
	@RequestMapping("/registration")
	public String getRegister(@ModelAttribute("reg") Registration register) {
		return "registration";
	}
	
	@RequestMapping("process-registration")
	public String doneRegister(@ModelAttribute("reg") Registration register) {
	
	return "process-registration";
 }
}

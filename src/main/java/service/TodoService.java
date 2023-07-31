package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import dao.Mydao;
import dto.UserInfo;

@Component
public class TodoService {
  @Autowired
  Mydao mydao;
//  public String signup(UserInfo userInfo,ModelMap model) {
//	if(mydao.save(userInfo)) {
//		model.put("pass", "Account Created Successfully");
//		return "Login.jsp";
//		
//	}
//	else {
//		model.put("fail", "Email you entered already exist,should be unique");
//		return "Signup.jsp";
//	}
  if(mydao.findByEmail(userInfo.getEmail())==null{
	 mydao.save
	  
}
}

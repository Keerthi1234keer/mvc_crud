package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.Mydao;
import dto.UserInfo;

@Controller

public class TodoController {
	@RequestMapping("signup")
	@ResponseBody
public String signup(@RequestParam String name,@RequestParam String email,@RequestParam String password)
{     
   UserInfo userInfo=new UserInfo();
  userInfo.setName(name);
  userInfo.setEmail(email);
  userInfo.setPassword(password);
  
  Mydao mydao=new Mydao();
  mydao.save(userInfo);
  return"login.jsp";


}
}

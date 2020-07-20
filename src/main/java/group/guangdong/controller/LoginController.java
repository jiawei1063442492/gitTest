package group.guangdong.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import group.guangdong.common.ResultBase;
import group.guangdong.pojo.User;
import group.guangdong.service.LoginService;
import javassist.NotFoundException;

@RestController
@Controller
@RequestMapping("/v1")
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public ResultBase login(HttpSession session) {
		ResultBase resultBase = new ResultBase();
		try {

			User user = loginService.login(106, "123456");
			session.setAttribute("user", user);
			resultBase.setStatus(200);
			resultBase.setMsg("OK");
			resultBase.setData(user);
			return resultBase;
		} catch (NotFoundException e) {
			// TODO: handle exception
			if (e.getMessage().equals("-1")) {
				resultBase.setMsg("ERROR");
				return resultBase;
			} else {
				resultBase.setMsg("ERROR");
				return resultBase;
			}
		}

	}
}

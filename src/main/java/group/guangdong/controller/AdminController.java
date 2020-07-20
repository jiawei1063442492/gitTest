package group.guangdong.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import group.guangdong.pojo.User;
import group.guangdong.service.UserService;

@RestController
@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/selectall", method = RequestMethod.GET)
	public List<User> findAllUsers() {
		return userservice.findAll();
	}

	@RequestMapping(value = "/selectone/{id}", method = RequestMethod.GET)
	public List<Map> selectone(@PathVariable Integer id) {
		User user = userservice.findUserById(id);
		if (user != null) {
			Map<String, String> map1 = new HashMap<String, String>();
			map1.put("status", "OK");
			ArrayList<Map> list = new ArrayList<Map>();
			Map<String, User> map = new HashMap<String, User>();
			map.put("user", user);
			list.add(map1);
			list.add(map);

			return list;
		} else {

			Map<String, String> map = new HashMap<String, String>();
			map.put("status", "ERROR");
			ArrayList<Map> list = new ArrayList<Map>();
			list.add(map);
			return list;
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public Map<String, String> register() {
		User user = new User();
		user.setUserId(111);
		user.setPassword("1234");
		user.setUsername("啊啊啊啊啊");
		user.setAuthority(0);
		User existUser = userservice.findUserById(user.getUserId());
		if (existUser == null) {
			int flag = userservice.addUser(user);
			if (flag == 1) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("msg", "添加成功");
				return map;
			} else {
				Map<String, String> map = new HashMap<String, String>();
				map.put("msg", "添加失败");
				return map;
			}

		} else {
			Map<String, String> map = new HashMap<String, String>();
			map.put("msg", "用户已存在");
			return map;
		}

	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public Map<String, String> update(User user) {
		user.setUserId(106);
		user.setPassword("777");
		user.setUsername("l吕");
		user.setAuthority(0);

		int flag = userservice.updateUser(user);
		System.out.println(flag);
		if (flag == 1) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("msg", "更新成功");
			return map;
		} else {
			Map<String, String> map = new HashMap<String, String>();
			map.put("msg", "更新失败");
			return map;
		}
	}

	@RequestMapping(value = "/deleteany", method = RequestMethod.GET)
	public Map<String, Integer> deleteany() {
		String ids = "456,111";
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("msg", userservice.deleteUsers(ids));
		return map;
	}

}

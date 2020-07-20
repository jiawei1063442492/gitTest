package group.guangdong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.guangdong.dao.LoginMapper;
import group.guangdong.pojo.User;
import group.guangdong.service.LoginService;
import javassist.NotFoundException;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public User login(int username, String password) throws NotFoundException {

		User user = loginMapper.selectUserByUse_Id(username);
		if (user != null) {
			if (password.equals(user.getPassword())) {
				return user;
			} else {
				throw new NotFoundException("-1");
			}
		} else {
			throw new NotFoundException("0");
		}

	}

}

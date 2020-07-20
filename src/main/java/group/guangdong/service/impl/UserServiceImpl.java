package group.guangdong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.guangdong.dao.UserMapper;
import group.guangdong.pojo.User;
import group.guangdong.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userDao;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.findUserById(id);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUsers(String ids) {
		// TODO Auto-generated method stub
		System.out.println(ids);
		int x, rows = 0;
		if (ids == null || ids.isEmpty()) {
			return 0;
		}
		String[] e_ids = ids.split(",");
		System.out.println(e_ids);
		for (int i = 0; i < e_ids.length; i++) {
			x = Integer.parseInt(e_ids[i]);
			if (userDao.deleteOne(x) == 1) {
				rows++;
			} else {
				break;
			}

		}

		return rows;
	}
}

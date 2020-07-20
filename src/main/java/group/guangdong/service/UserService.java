package group.guangdong.service;

import java.util.List;

import group.guangdong.pojo.User;

public interface UserService {
	public List<User> findAll();

	public User findUserById(Integer id);

	public int addUser(User user);

	public int updateUser(User user);

	public int deleteUsers(String ids);
}

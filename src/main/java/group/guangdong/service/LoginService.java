package group.guangdong.service;

import group.guangdong.pojo.User;
import javassist.NotFoundException;

public interface LoginService {

	public User login(int username, String password) throws NotFoundException;

}

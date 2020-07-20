package group.guangdong.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import group.guangdong.pojo.User;

@Mapper
public interface LoginMapper {
	@Select("select * from user where user_id=#{username}")
	public User selectUserByUse_Id(int username);
}

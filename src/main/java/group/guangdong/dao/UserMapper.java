package group.guangdong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import group.guangdong.pojo.User;

@Mapper
public interface UserMapper {
	@Select("select * from user")
	List<User> findAll();

	@Select("select * from user where user_id=#{id} ")
	User findUserById(Integer id);

	@Insert("insert into user (user_id,password,UserName,authority) values (#{userId},#{password},#{username},#{authority})")
	int addUser(User user);

	@Update("update user set password=#{password},UserName=#{username},authority=#{authority} where user_id=#{userId}")
	int updateUser(User user);

	@Delete("delete from user where user_id=#{id}")
	int deleteOne(int id);
}

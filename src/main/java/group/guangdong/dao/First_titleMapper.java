package group.guangdong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import group.guangdong.pojo.First_title;

@Mapper
public interface First_titleMapper {

	@Select("select * from first_title")
	List<First_title> selectAll();

	@Select("select ftitle_id ftitle_name from first_title")
	List<First_title> findIdAndName();

}

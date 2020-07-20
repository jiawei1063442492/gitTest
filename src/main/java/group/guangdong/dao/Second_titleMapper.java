package group.guangdong.dao;

import group.guangdong.pojo.First_title;
import group.guangdong.pojo.Second_title;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface Second_titleMapper {
    @Select("select * from second_title where ftitle_id = #{ftitleid}")
    List<Second_title> selectByfirsttitle(Integer ftitleid);
    @Select("select stitle_id,stitle_name from second_title where ftitle_id = #{ftitleid}")
    List<Second_title> selectIdAndNameByfirsttitle(Integer ftitleid);
    @Select("select * from second_title where stitle_id = #{stitleid}")
    Second_title selectFtitleByStitle(Integer stitleid);
}
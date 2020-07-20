package group.guangdong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import group.guangdong.pojo.Home_picture;

@Mapper
public interface Home_pictureMapper {
	@Select("select * from home_picture where hp_type = #{type} and hp_show = 1")
	List<Home_picture> selectByType(Integer type);

	@Select("select * from home_picture where article_id = #{article_id} and hp_show = 1 LIMIT 3")
	List<Home_picture> selectByArticleId(Integer article_id);

	@Select("select * from home_picture order by hp_upload_time desc")
	List<Home_picture> selectAllHomePicture();
}

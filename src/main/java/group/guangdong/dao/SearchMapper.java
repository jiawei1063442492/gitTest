package group.guangdong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import group.guangdong.pojo.Article;
import group.guangdong.pojo.Article_link;
import group.guangdong.pojo.Article_picture;

@Mapper
public interface SearchMapper {
	@Select("select DISTINCT article_id,article_title from article where article_title like CONCAT ('%',#{condition},'%')")
	List<Article> selectByCondition(String condition);

	@Select("select ap_id from graphic_pairing where article_id=#{articleId}")
	List<Integer> selectByArcicleId(Integer articleId);

	@Select("select * from article_picture where ap_id=#{id}")
	Article_picture selectByArticlePicture(Integer id);

	@Select("select al_id from al_pairing where article_id=#{articleId}")
	List<Integer> selectByArcicleId2(Integer articleId);

	@Select("select * from article_link where al_id=#{id}")
	Article_link selectByArticleLink(Integer id);
}

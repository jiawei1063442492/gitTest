package group.guangdong.dao;

import group.guangdong.pojo.Article;
import group.guangdong.pojo.First_title;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleMapper {
    @Select("select * from article where stitle_id = #{stitle_id} order by article_publish_time desc LIMIT 7")
    List<Article> selectByStitleLimit(Integer stitle_id);
    @Select("select * from article where stitle_id = #{stitle_id} order by article_publish_time desc")
    List<Article> selectByStitle(Integer stitle_id);
}

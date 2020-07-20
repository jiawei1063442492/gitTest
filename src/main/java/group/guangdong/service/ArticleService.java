package group.guangdong.service;

import group.guangdong.pojo.Article;

import java.util.List;

public interface ArticleService {
    List<Article> selectByStitleLimit(Integer stitle_id);
    List<Article> selectByStitle(Integer stitle_id);
}

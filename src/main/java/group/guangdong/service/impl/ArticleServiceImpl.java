package group.guangdong.service.impl;

import group.guangdong.dao.ArticleMapper;
import group.guangdong.pojo.Article;
import group.guangdong.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> selectByStitleLimit(Integer stitle_id) {
        return articleMapper.selectByStitleLimit(stitle_id);
    }

    @Override
    public List<Article> selectByStitle(Integer stitle_id) {
        return articleMapper.selectByStitle(stitle_id);
    }
}

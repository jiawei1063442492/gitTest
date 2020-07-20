package group.guangdong.service.impl;

import group.guangdong.dao.Second_titleMapper;
import group.guangdong.pojo.Second_title;
import group.guangdong.service.Second_titleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Second_titleServiceImpl implements Second_titleService {

    @Autowired
    private Second_titleMapper second_titleMapper;

    @Override
    public List<Second_title> findIdAndNameByFtitleId(Integer first_title_id) {
        return second_titleMapper.selectIdAndNameByfirsttitle(first_title_id);
    }

    @Override
    public Second_title selectByStitleId(Integer stitleid) {
        return second_titleMapper.selectFtitleByStitle(stitleid);
    }

}

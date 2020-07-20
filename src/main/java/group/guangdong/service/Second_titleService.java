package group.guangdong.service;

import group.guangdong.pojo.Second_title;

import java.util.List;

public interface Second_titleService {
    List<Second_title> findIdAndNameByFtitleId(Integer first_title_id);
    Second_title selectByStitleId(Integer stitleid);
}

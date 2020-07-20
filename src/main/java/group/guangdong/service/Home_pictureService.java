package group.guangdong.service;

import java.util.List;

import group.guangdong.pojo.Home_picture;

public interface Home_pictureService {
	List<Home_picture> selectByType(Integer type);

	List<Home_picture> selectByArticleId(Integer article_id);

	List<Home_picture> selectAllHomePicture();

	Home_picture insertHomePicture();
}

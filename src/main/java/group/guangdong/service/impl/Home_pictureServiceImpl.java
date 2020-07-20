package group.guangdong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.guangdong.dao.Home_pictureMapper;
import group.guangdong.pojo.Home_picture;
import group.guangdong.service.Home_pictureService;

@Service
public class Home_pictureServiceImpl implements Home_pictureService {
	@Autowired
	private Home_pictureMapper home_pictureMapper;

	@Override
	public List<Home_picture> selectByType(Integer type) {
		return home_pictureMapper.selectByType(type);
	}

	@Override
	public List<Home_picture> selectByArticleId(Integer article_id) {
		return home_pictureMapper.selectByArticleId(article_id);
	}

	@Override
	public List<Home_picture> selectAllHomePicture() {
		// TODO Auto-generated method stub
		return home_pictureMapper.selectAllHomePicture();
	}

	@Override
	public Home_picture insertHomePicture() {
		// TODO Auto-generated method stub
		return null;
	}
}

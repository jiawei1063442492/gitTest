package group.guangdong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.guangdong.dao.First_titleMapper;
import group.guangdong.pojo.First_title;
import group.guangdong.service.First_titleService;

@Service
public class First_titleServiceImpl implements First_titleService {

	@Autowired
	private First_titleMapper first_titleMapper;

	/*
	 * @Override public List<First_title> findIdAndName() { return
	 * first_titleMapper.selectIdAndNameAll(); }
	 */

	@Override
	public List<First_title> findAll() {
		return first_titleMapper.selectAll();
	}

	@Override
	public List<First_title> findIdAndName() {
		// TODO Auto-generated method stub
		return first_titleMapper.findIdAndName();
	}
}

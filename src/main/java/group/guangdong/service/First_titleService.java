package group.guangdong.service;

import java.util.List;

import group.guangdong.pojo.First_title;

public interface First_titleService {
	List<First_title> findIdAndName();

	List<First_title> findAll();
}

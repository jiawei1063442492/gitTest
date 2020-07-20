package group.guangdong.service;

import java.util.List;

import group.guangdong.pojo.Flink;

/**
 * 友情链接增删改查
 * 
 * @author lvjiawei
 *
 */
public interface FlinkService {
	public int addFlink(Flink flink);

	public int deleteFlink(Integer id);

	public Flink findFlink(Integer id);

	public List<Flink> findAll();

	public void updateFlink(Flink flink);

	public int deleteFlinks(String ids);

}

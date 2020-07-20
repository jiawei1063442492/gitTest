package group.guangdong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.guangdong.dao.FlinkMapper;
import group.guangdong.pojo.Flink;
import group.guangdong.service.FlinkService;

@Service
public class FlinkServiceImpl implements FlinkService {
	@Autowired
	private FlinkMapper flinkDao;

	@Override
	public List<Flink> findAll() {
		// TODO Auto-generated method stub
		return flinkDao.findAll();
	}

	@Override
	public Flink findFlink(Integer id) {
		// TODO Auto-generated method stub
		return flinkDao.findOne(id);
	}

	@Override
	public int deleteFlink(Integer id) {
		// TODO Auto-generated method stub
		return flinkDao.deleteOne(id);
	}

	@Override
	public int addFlink(Flink flink) {
		// TODO Auto-generated method stub
		return flinkDao.addFlink(flink);
	}

	@Override
	public void updateFlink(Flink flink) {
		// TODO Auto-generated method stub
		flinkDao.updateFlink(flink);
	}

	@Override
	public int deleteFlinks(String ids) {
		System.out.println(ids);
		int x, rows = 0;
		if (ids == null || ids.isEmpty()) {
			return 0;
		}
		String[] e_ids = ids.split(",");
		System.out.println(e_ids);
		for (int i = 0; i < e_ids.length; i++) {
			x = Integer.parseInt(e_ids[i]);
			flinkDao.deleteOne(x);
			rows++;
		}

		return rows;

	}

}

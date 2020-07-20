package group.guangdong.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.guangdong.dao.SearchMapper;
import group.guangdong.pojo.Article;
import group.guangdong.pojo.Article_link;
import group.guangdong.pojo.Article_picture;
import group.guangdong.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	SearchMapper searchMapper;

	@Override
	public List<Map> searchByCondition(String condition) {
		// TODO Auto-generated method stub
		List<Map> result = new ArrayList<Map>();
		List<Article> as = searchMapper.selectByCondition(condition);

		for (Article a : as) {
			Map item = new LinkedHashMap();
			item.put("article_id", a.getArticleId());
			item.put("article_title", a.getArticleTitle());

			List<Integer> ids = searchMapper.selectByArcicleId(a.getArticleId());
			System.out.println(ids);
			List<Map> aMaps = new ArrayList<Map>();
			for (Integer id : ids) {

				Article_picture ap = searchMapper.selectByArticlePicture(id);
				Map apMap = new LinkedHashMap();
				apMap.put("ap_id", ap.getApId());
				apMap.put("ap_name", ap.getApName());
				apMap.put("ap_address", ap.getApAddress());
				aMaps.add(apMap);
			}
			item.put("article_picture", aMaps);

			List<Integer> ids2 = searchMapper.selectByArcicleId2(a.getArticleId());
			System.out.println(ids2);
			List<Map> alMaps = new ArrayList<Map>();
			for (Integer id : ids2) {

				Article_link al = searchMapper.selectByArticleLink(id);
				Map alMap = new LinkedHashMap();
				alMap.put("al_id", al.getAlId());
				alMap.put("al_name", al.getAlName());
				alMap.put("al_address", al.getAlAddress());
				alMaps.add(alMap);
			}
			item.put("article_link", alMaps);
			result.add(item);
		}

		return result;
	}

}

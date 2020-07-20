package group.guangdong.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import group.guangdong.pojo.Article;
import group.guangdong.pojo.First_title;
import group.guangdong.pojo.Home_picture;
import group.guangdong.pojo.Second_title;
import group.guangdong.service.ArticleService;
import group.guangdong.service.Home_pictureService;
import group.guangdong.service.impl.First_titleServiceImpl;
import group.guangdong.service.impl.Second_titleServiceImpl;

@RestController
@Controller
@RequestMapping("/v1")
public class HomeControler {
	@Autowired
	private Second_titleServiceImpl second_titleServiceImpl;
	@Autowired
	private First_titleServiceImpl first_titleServiceImpl;
	@Autowired
	private Home_pictureService home_pictureService;
	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/navigation", method = RequestMethod.GET)
	public List<Map> navigation() {
		List<First_title> fts = first_titleServiceImpl.findAll();
		List<Map> result = new ArrayList<Map>();
		for (First_title ft : fts) {
			Map item = new LinkedHashMap();
			item.put("ftitle_id", ft.getFtitleId());
			item.put("ftitle_name", ft.getFtitleName());
			List<Second_title> sts = second_titleServiceImpl.findIdAndNameByFtitleId(ft.getFtitleId());
			if (sts != null && !sts.isEmpty()) {
				List<Map> stList = new ArrayList<Map>();
				for (Second_title st : sts) {
					Map stMap = new LinkedHashMap();
					stMap.put("stitle_id", st.getStitleId());
					stMap.put("Stitle_name", st.getStitleName());
					stList.add(stMap);
				}
				item.put("second_title", stList);
			}
			result.add(item);
		}
		return result;
	}

	@RequestMapping(value = "/viewpager", method = RequestMethod.GET)
	public List<Map> viewpager() {
		List<Map> result = new ArrayList<Map>();
		for (int type = 0; type < 3; type++) {
			Map item = new LinkedHashMap();
			item.put("hp_type", type);
			List<Home_picture> hps = home_pictureService.selectByType(type);
			List<Map> hpItem = new ArrayList<>();
			for (Home_picture hp : hps) {
				Map hpMap = new LinkedHashMap();
				hpMap.put("hp_id", hp.getHpId());
				hpMap.put("hp_name", hp.getHpName());
				hpMap.put("hp_address", hp.getHpAddress());
				hpMap.put("article_id", hp.getArticleId());
				hpItem.add(hpMap);
			}
			item.put("hp", hpItem);
			result.add(item);
		}

		return result;
	}

	@RequestMapping(value = "/homearticle", method = RequestMethod.GET)
	public List<Map> homearticle() {
		List<Map> result = new ArrayList<Map>();
		for (int stitle = 3; stitle < 6; stitle++) {
			Map item = new LinkedHashMap();
			Second_title stitleItem = second_titleServiceImpl.selectByStitleId(stitle);
			item.put("ftitle_id", stitleItem.getFtitleId());
			item.put("stitle_id", stitle);
			item.put("stitle_name", stitleItem.getStitleName());
			List<Article> arts = articleService.selectByStitle(stitle);
			List<Map> articleItem = new ArrayList<>();
			for (Article art : arts) {
				Map articleMap = new LinkedHashMap();
				articleMap.put("article_id", art.getArticleId());
				articleMap.put("article_title", art.getArticleTitle());
				articleMap.put("article_publish_time", art.getArticlePublishTime());
				articleItem.add(articleMap);
			}
			item.put("articles", articleItem);
			result.add(item);
		}
		return result;
	}

	@RequestMapping(value = "/secondarticles/{stitleId}", method = RequestMethod.GET)
	public List<Map> secondarticles(@PathVariable Integer stitleId) {
		List<Map> result = new ArrayList<Map>();
		Second_title st = second_titleServiceImpl.selectByStitleId(stitleId);
		if (st == null) {
			return null;
		}

		Map item = new LinkedHashMap();
		item.put("stitle_name", st.getStitleName());
		List<Article> arts = articleService.selectByStitle(stitleId);
		List<Map> articleItem = new ArrayList<>();
		for (Article art : arts) {
			Map artMap = new LinkedHashMap();
			artMap.put("article_id", art.getArticleId());
			artMap.put("article_title", art.getArticleTitle());
			artMap.put("article_publish_time", art.getArticlePublishTime());
			List<Home_picture> hps = home_pictureService.selectByArticleId(art.getArticleId());
			List<Map> picList = new ArrayList<>();
			for (Home_picture hp : hps) {
				Map picMap = new LinkedHashMap();
				picMap.put("hp_name", hp.getHpName());
				picMap.put("hp_address", hp.getHpAddress());
				picList.add(picMap);
			}
			artMap.put("article_pic", picList);
			articleItem.add(artMap);
		}
		item.put("articles", articleItem);
		result.add(item);
		return result;
	}

	@RequestMapping(value = "/viewpager/selectall", method = RequestMethod.GET)
	public List<Home_picture> selectall() {
		return home_pictureService.selectAllHomePicture();
	}

	@RequestMapping(value = "/viewpager/insert", method = RequestMethod.GET)
	public Home_picture insert() {
		return home_pictureService.insertHomePicture();
	}
}

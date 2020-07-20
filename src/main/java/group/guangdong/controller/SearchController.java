package group.guangdong.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.guangdong.service.SearchService;

@RestController
@Controller
@RequestMapping("/v1")
public class SearchController {
	@Autowired
	private SearchService searchService;

	@RequestMapping("/navigation/search")
	public List<Map> search() {
		String condition = "平";
		return searchService.searchByCondition(condition);
	}
}

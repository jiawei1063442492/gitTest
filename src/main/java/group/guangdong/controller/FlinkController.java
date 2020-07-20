package group.guangdong.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import group.guangdong.common.ResultBase;
import group.guangdong.pojo.Flink;
import group.guangdong.service.FlinkService;

@RestController
@Controller
@RequestMapping("/flink")
public class FlinkController {
	@Autowired
	private FlinkService flinkservice;

	/**
	 * 查询所有友情链接
	 * 
	 * @return
	 */
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public ResultBase findAllFlink() {
		if (flinkservice.findAll() != null) {
			ResultBase resultBase = new ResultBase();
			resultBase.setStatus(200);
			resultBase.setMsg("查询成功");
			resultBase.setData(flinkservice.findAll());
			return resultBase;
		} else {
			ResultBase resultBase = new ResultBase();
			resultBase.setStatus(400);
			resultBase.setMsg("查询失败");
			return resultBase;
		}

	}

	/**
	 * 根据id查询一个友情链接
	 */

	@RequestMapping(value = "/findone/{id}", method = RequestMethod.GET)
	public Flink findOne(@PathVariable Integer id) {
		return flinkservice.findFlink(id);
	}

	/**
	 * 根据id删除一个友情链接
	 * 
	 * @param id
	 */

	@RequestMapping(value = "/deleteone/{id}", method = RequestMethod.GET)
	public int delete(@PathVariable Integer id) {
		return flinkservice.deleteFlink(id);
	}

	/**
	 * 批量删除友情链接
	 */
	@RequestMapping(value = "/deleteany", method = RequestMethod.GET)
	public int deleteany() {
		String ids = "2,3";
		return flinkservice.deleteFlinks(ids);
	}

	/**
	 * 添加友情链接
	 * 
	 * @param flink
	 */

	@RequestMapping(value = "/addone", method = RequestMethod.POST)
	public int add() {
		Flink flink = new Flink();
		flink.setFlinkName("大大");
		flink.setFlinkShow(1);
		flink.setFlinkUploader("222222");
		flink.setFlinkAddress("广东");
		Date date = new Date();
		flink.setFlinkUploadTime(date);

		return flinkservice.addFlink(flink);
	}

	/**
	 * 更新友情链接
	 * 
	 * @param flink
	 */
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void update(Flink flink) {
		flink.setFlinkId(1);
		flink.setFlinkName("计算机");
		flink.setFlinkShow(0);
		flink.setFlinkUploader("吕");
		flink.setFlinkAddress("江西");
		Date date = new Date();
		flink.setFlinkUploadTime(date);
		flinkservice.updateFlink(flink);
	}

}

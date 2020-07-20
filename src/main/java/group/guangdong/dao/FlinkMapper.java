package group.guangdong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import group.guangdong.pojo.Flink;

@Mapper
public interface FlinkMapper {
	@Select("select * from flink where flink_show=1")
	List<Flink> findAll();

	@Select("select * from flink where flink_id=#{id} ")
	public Flink findOne(Integer id);

	@Delete("delete from flink where flink_id=#{id}")
	int deleteOne(Integer id);

	@Insert("insert into flink (flink_name,flink_address,flink_uploader,flink_upload_time,flink_show) values (#{flinkName},#{flinkAddress},#{flinkUploader},#{flinkUploadTime},#{flinkShow})")
	int addFlink(Flink flink);

	@Update("update flink set flink_name=#{flinkName},flink_address=#{flinkAddress},flink_uploader=#{flinkUploader},flink_show=#{flinkShow},flink_upload_time=#{flinkUploadTime} where flink_id=#{flinkId}")
	void updateFlink(Flink flink);

}

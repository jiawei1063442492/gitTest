package group.guangdong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot引导类
 * 
 * @author lvjiawei
 *
 */
@SpringBootApplication(scanBasePackages = { "group.guangdong.*" })
@MapperScan("group.guangdong.dao")
public class Application {
	public static void main(String[] args) {
		System.out.println("启动");
		SpringApplication.run(Application.class, args);
	}
}

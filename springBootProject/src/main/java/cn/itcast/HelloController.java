package cn.itcast;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在这里我们使用RestController  （等待于 @Controller 和 @RequestBody）
 * @author Angel -- 守护天使
 * @version v.0.1
 * @date 2016年12月10日
 */
@RestController
public class HelloController {
	
	/**
	 * 在这里我们使用@RequestMapping 建立请求映射:
	 * http://127.0.0.1:8080/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(){
		return "hello-2016-12-11.v.0";
	}
	
	
	@RequestMapping("/hello2")
	public String hello2(){
		return "hello2-2016";
	}
	
	@RequestMapping("/hello3")
	public String hello3(){
		return "hello3";
	}
	
	/**
	 * Spring Boot默认使用的json解析框架是jackson
	 * @return
	 */
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("张三");
		demo.setCreateTime(new Date());
		demo.setRemarks("这是备注信息");
		return demo;
	}
	
}

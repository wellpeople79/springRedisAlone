package com.ojs.redisone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisRunner implements ApplicationRunner{

	@Autowired
	StringRedisTemplate redisTemplate;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		ValueOperations<String, String> values = redisTemplate.opsForValue();
//		values.set("name", "saelobi");
//		values.set("framework", "spring");
//		values.set("message", "hello world");
		
		System.out.println("name=[" + values.get("name") + "]");
		
	}

}

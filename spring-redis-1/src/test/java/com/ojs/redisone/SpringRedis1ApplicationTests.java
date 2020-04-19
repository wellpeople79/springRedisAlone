package com.ojs.redisone;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class SpringRedis1ApplicationTests {

	@Test
	void contextLoads() {
	}
	
    @Autowired
    RedisTemplate<String, Object> redisTemplate;
    
    @Test
    public void test() {
        //get/set을 위한 객체
        ValueOperations<String, Object> vop = redisTemplate.opsForValue();
        vop.set("jdkSerial", "jdk");
        String result = (String) vop.get("jdkSerial");
        System.out.println(result);//jdk
    }

}

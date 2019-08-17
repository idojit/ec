package com.zhiyun.commerce;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

import com.zhiyun.commerce.util.MsService;
import com.zhiyun.commerce.util.ThreadB;

public class SeckillTest {

	private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void test() {
		// fail("Not yet implemented");
		System.out.println("开始");

		MsService service = new MsService();

		for (int i = 0; i < 100; i++) {
			ThreadB threadA = new ThreadB(service, redisTemplate, "MSKEY");
			threadA.start();

		}
	}

}

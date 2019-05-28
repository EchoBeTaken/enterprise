package com.jack.enterprise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jack.enterprise.utils.SnowflakeIdGenerator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnterpriseApplicationTests {

	@Test
	public void contextLoads() {
		SnowflakeIdGenerator idWorker = new SnowflakeIdGenerator(0, 0);
        for (int i = 0; i < 1000; i++) {
            long id = idWorker.nextId();
            System.out.println(Long.toBinaryString(id));
            System.out.println(id);
        }
	}

}

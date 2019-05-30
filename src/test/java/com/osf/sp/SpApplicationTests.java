package com.osf.sp;

import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.osf.sp.mapper.BoardInfoMapper;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpApplicationTests {
	
	@Resource
	private BoardInfoMapper bim;
	
	@Test
	public void contextLoads() {
		log.info("result map test=>{}", bim.selectBoardInfo());
		assertTrue(true);
	}
	
//	@Autowired
//	private SalGradeMapper sgm;
//	
//	@Autowired
//	private SalGradeService sgs;
//	
//	@Test
//	public void contextLoads() {
//	List<Map<String,Object>> salGrades =
//			sgs.selectSalGradeList();
//	
//	assertNotNull(salGrades);
//	assertEquals(6, salGrades.size());
//	}

}

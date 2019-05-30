package com.osf.sp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.osf.sp.mapper.SalGradeMapper;
import com.osf.sp.service.SalGradeService;

@Service
public class SalGradeServiceImpl implements SalGradeService {

	@Resource
	private SalGradeMapper sgm;

	@Override
	public List<Map<String, Object>> selectSalGradeList() {
		return sgm.selectSalGradeList();
	}

	@Override
	public Map<String, Object> selectSalGrade(Map<String, Object> sg) {
		// TODO Auto-generated method stub
		return sgm.selectSalGrade(sg);
	}

	@Override
	public int insertSalGrade(Map<String, Object> sg) {
		// TODO Auto-generated method stub
		return sgm.insertSalGrade(sg);
	}

	@Override
	public int deleteSalGrade(Map<String, Object> sg) {
		// TODO Auto-generated method stub
		return sgm.deleteSalGrade(sg);
	}

	@Override
	public int updateSalGrade(Map<String, Object> sg) {
		// TODO Auto-generated method stub
		return sgm.updateSalGrade(sg);
	}

}

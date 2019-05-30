package com.osf.sp.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;


@MapperScan
public interface SalGradeMapper {
	List<Map<String,Object>> selectSalGradeList();
	Map<String,Object> selectSalGrade( Map<String,Object> sg);
	int insertSalGrade(Map<String,Object> sg);
	int deleteSalGrade(Map<String,Object> sg);
	int updateSalGrade(Map<String,Object> sg);
}

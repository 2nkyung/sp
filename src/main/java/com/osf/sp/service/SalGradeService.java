package com.osf.sp.service;

import java.util.List;
import java.util.Map;

public interface SalGradeService {
List<Map<String,Object>> selectSalGradeList();
Map<String,Object> selectSalGrade( Map<String,Object> sg);
int insertSalGrade(Map<String,Object> sg);
int deleteSalGrade(Map<String,Object> sg);
int updateSalGrade(Map<String,Object> sg);
}

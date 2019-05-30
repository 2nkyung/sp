package com.osf.sp.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.SalGradeService;

@Controller
public class SalGradeController {

	@Resource
	   private SalGradeService sgs;
	
	   @CrossOrigin(origins = "*")
	   @GetMapping("/salgrades")
	   public @ResponseBody List<Map<String,Object>> selectSalGrades(){
	      return sgs.selectSalGradeList();
	   }
	   
	   @GetMapping("/salgrade")
	   public @ResponseBody Map<String,Object> selectSalGrade(@RequestParam Map<String,Object> map) {
	      return sgs.selectSalGrade(map);
	   }
	   
	   @DeleteMapping("/salgrade")
	   public @ResponseBody Integer deleteSalGrade(@RequestBody Map<String,Object> map) {
	      return sgs.deleteSalGrade(map);
	   }
	   
	   @PostMapping("/salgrade")
	   public @ResponseBody Integer insertSalGrade(@RequestBody Map<String,Object> map) {
	      return sgs.insertSalGrade(map);
	   }
	   
	   @PutMapping("/salgrade")
	   public @ResponseBody Integer updateSalGrade(@RequestBody Map<String,Object> map) {
	      return sgs.updateSalGrade(map);
	   }
	
}


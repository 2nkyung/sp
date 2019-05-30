package com.osf.sp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.UserInfoService;
import com.osf.sp.vo.ParamVO;
import com.osf.sp.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class UserInfoController {

	@Resource
	private UserInfoService uis;

	@CrossOrigin(origins="*")
	@PostMapping("/signin")
	public @ResponseBody int insertUserInfo(@RequestBody UserInfoVO ui) {
		log.debug("ui params{}", ui);
		return uis.insertUserInfo(ui);
	}

	@CrossOrigin(origins="*")
	@GetMapping("/userinfos")
	public @ResponseBody List<UserInfoVO> selectUserInfo(){
		return uis.selectUserInfo();
	}

	@CrossOrigin(origins="*")
	@PostMapping("/login")
	public @ResponseBody UserInfoVO doLogin(@RequestBody UserInfoVO ui){
		log.info("param => {}", ui);
		return uis.login(ui);
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/userinfos")
	public @ResponseBody int deleteUserInfo(@RequestBody ParamVO param) {
		log.info("param:{}", param);
		return uis.save(param);
	}
	
		
}
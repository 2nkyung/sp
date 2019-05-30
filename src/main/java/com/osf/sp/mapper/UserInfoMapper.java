package com.osf.sp.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.osf.sp.vo.UserInfoVO;

@MapperScan
public interface UserInfoMapper {
	int insertUserInfo(UserInfoVO ui);
	List<UserInfoVO> selectUserInfo();
	int deleteUserInfo(int uiNo);
	UserInfoVO selectUserInfoById(UserInfoVO ui);
	
}

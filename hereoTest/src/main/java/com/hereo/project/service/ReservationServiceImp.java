package com.hereo.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hereo.project.dao.StadiumDAO;
import com.hereo.project.vo.StadiumTimetableVO;
import com.hereo.project.vo.StadiumVO;

@Service
public class ReservationServiceImp implements ReservationService{

	@Autowired
	StadiumDAO stadiumDao;
	

	@Override
	public ArrayList<StadiumVO> getStadiumTimetable(int stadium) {
		


		return stadiumDao.selectStadiumTimetable(stadium);
	}
	@Override
	public StadiumTimetableVO getStadiumTimetableForPay(int st_num) {
		
		return stadiumDao.getStadiumTimetableForPay(st_num);
	}
	@Override
	public ArrayList<StadiumVO> getStadiumList(Integer region) {
		

		return stadiumDao.selectStadiumList(region);
	}

	
	
	

}

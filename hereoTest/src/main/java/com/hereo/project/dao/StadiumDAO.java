package com.hereo.project.dao;

import java.util.ArrayList;
import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.hereo.project.pagination.Criteria;
import com.hereo.project.vo.MembersVO;
import com.hereo.project.vo.RegionDetailVO;
import com.hereo.project.vo.ReservationVO;
import com.hereo.project.vo.StadiumImageVO;
import com.hereo.project.vo.StadiumScheduleVO;
import com.hereo.project.vo.StadiumTimetableVO;
import com.hereo.project.vo.StadiumVO;

public interface StadiumDAO {

	void insertFile(@Param("sdImage")StadiumImageVO stadiumImageVo);

	void insertStadium(@Param("stadium")StadiumVO stadium);
	
	ArrayList<StadiumVO> selectBoardList(@Param("cri")Criteria cri);

	int selectStadiumTotalCount(@Param("cri")Criteria cri);

	StadiumVO selectStadium(@Param("sd_num")int sd_num);

	ArrayList<StadiumImageVO> selectFileList(@Param("sd_num")int sd_num);

	void insertStadiumImage(@Param("file")StadiumImageVO file);

	RegionDetailVO selectRegionDetail(@Param("rd_num")int rd_num);

	ArrayList<StadiumTimetableVO> selectStadiumTimetableList(@Param("user")MembersVO user);

	ArrayList<StadiumVO> selectStadiumTimetable(@Param("st") int stadium);

	StadiumTimetableVO getStadiumTimetableForPay(@Param("st_num") int st_num);

	ArrayList<StadiumVO> selectStadiumList(@Param("r") Integer region);

	ArrayList<StadiumScheduleVO> checkStadiumSchedule(@Param("st_num")int st_num, @Param("date") String date, @Param("state") String state);

	void insertReservation(@Param("re")ReservationVO reservation);

	void insertStadiumSchedule(@Param("rv_num") int rv_num, @Param("date")String date, @Param("st_num") int st_num);

	ReservationVO selectReservation(@Param("rv_num") int rv_num);

	void deleteReservation(@Param("rv_num") int rv_num);

	StadiumScheduleVO searchStadiumSchedule(@Param("rv_num") int rv_num);

	ArrayList<StadiumScheduleVO> checkCompletePayList(@Param("ss_game_date")String game_date, @Param("ss_st_num") int ss_st_num, @Param("ss_state") String state);

	void updateState(@Param("receipt_id") String receipt_id, @Param("state") String state, @Param("rv_num") int rv_num);






}

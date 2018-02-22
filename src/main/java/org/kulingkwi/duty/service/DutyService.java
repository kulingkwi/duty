package org.kulingkwi.duty.service;

import org.kulingkwi.duty.common.WorkStatus;
import org.kulingkwi.duty.dao.DutyDao;
import org.kulingkwi.duty.entity.Duty;
import org.kulingkwi.duty.util.DateUtil;
import org.kulingkwi.duty.vo.DutyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * File: DutyService.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-14  21:32
 */
@Service
public class DutyService {

    @Autowired
    private DutyDao dutyDao;

    public DutyVO saveDuty(DutyVO vo) {
        if (vo.getDay() != null) {
            Duty duty = new Duty();
            duty.setFullDate(DateUtil.format(DateUtil.getDate(vo.getYear(), vo.getMonth(), vo.getDay()), DateUtil.DF_YYYYMMDD));
            duty.setYear(vo.getYear());
            duty.setMonth(vo.getMonth());
            duty.setDay(vo.getDay());
            duty.setUserId(vo.getUserId());
            duty.setWorkStatus(WorkStatus.from(vo.getWorkStatus()).getId());
            duty.setCreateTime(DateUtil.now());
            saveOrUpdate(duty);
        } else if (vo.getDays() != null && vo.getDays().length > 0) {
            for (String day : vo.getDays()) {
                Duty duty = new Duty();
                duty.setFullDate(DateUtil.format(DateUtil.getDate(vo.getYear(), vo.getMonth(), Integer.valueOf(day)), DateUtil.DF_YYYYMMDD));
                duty.setYear(vo.getYear());
                duty.setMonth(vo.getMonth());
                duty.setDay(Integer.valueOf(day));
                duty.setUserId(vo.getUserId());
                duty.setWorkStatus(WorkStatus.from(vo.getWorkStatus()).getId());
                duty.setCreateTime(DateUtil.now());
                saveOrUpdate(duty);
            }
        }

        return vo;
    }

    private void saveOrUpdate(Duty duty) {
        Duty old = dutyDao.findOneByUserIdAndFullDate(duty.getUserId(), duty.getFullDate());
        if (old != null) {
            old.setWorkStatus(duty.getWorkStatus());
            old.setUpdateTime(DateUtil.now());
            dutyDao.save(old);
        } else {
            dutyDao.save(duty);
        }
    }

    public List<DutyVO> getUserMonthDuty(int userId, int year, int month) {
        List<DutyVO> voList = new ArrayList<>();
        List<Duty> dutyList = dutyDao.findByUserIdAndYearAndMonth(userId, year, month);
        if (dutyList != null && !dutyList.isEmpty()) {
            for (Duty duty : dutyList) {
                DutyVO vo = new DutyVO();
                vo.setId(duty.getId());
                vo.setDate(duty.getFullDate());
                vo.setYear(duty.getYear());
                vo.setMonth(duty.getMonth());
                vo.setDay(duty.getDay());
                vo.setWorkStatus(WorkStatus.from(duty.getWorkStatus()).getValue());
                vo.setUserId(duty.getUserId());
                voList.add(vo);
            }
        }
        return voList;
    }


}

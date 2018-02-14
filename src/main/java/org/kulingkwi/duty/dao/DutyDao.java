package org.kulingkwi.duty.dao;

import org.kulingkwi.duty.entity.Duty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * File: DutyDao.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-14  21:13
 */
public interface DutyDao extends JpaRepository<Duty, Integer> {

    List<Duty> findByYearAndMonth(int year, int month);

    List<Duty> findByUserIdAndYearAndMonth(int userId, int year, int month);

}

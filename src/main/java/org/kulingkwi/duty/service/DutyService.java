package org.kulingkwi.duty.service;

import org.kulingkwi.duty.dao.DutyDao;
import org.kulingkwi.duty.vo.DutyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void saveDuty(DutyVO dutyvo) {

    }
}

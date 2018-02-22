package org.kulingkwi.duty.api;

import org.kulingkwi.duty.common.WorkStatus;
import org.kulingkwi.duty.service.DutyService;
import org.kulingkwi.duty.vo.DutyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * File: DubyApi.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-14  21:55
 */
@RestController
@RequestMapping("/api/duty")
public class DutyApi {

    @Autowired
    private DutyService dutyService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void index(DutyVO dutyVO) {
    }

    @RequestMapping(value = "/user/{userId}/{year}/{month}", method = RequestMethod.GET)
    public List<DutyVO> getUserMonthDuty(@PathVariable("userId") int userId, @PathVariable("year") int year, @PathVariable("month") int month) {
        List<DutyVO> voList = dutyService.getUserMonthDuty(userId, year, month);
        return voList;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public DutyVO create(DutyVO dutyVO) {
        return dutyService.saveDuty(dutyVO);
    }

    @RequestMapping(value = "/statusEnum", method = RequestMethod.GET)
    public WorkStatus[] getStatusList() {
        return WorkStatus.values();
    }
}

package org.kulingkwi.duty.web;

import org.kulingkwi.duty.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * File: DutyController.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-14  21:35
 */
@Controller
@RequestMapping("/cms/duty")
public class DutyController {

    @Autowired
    private DutyService dutyService;
}

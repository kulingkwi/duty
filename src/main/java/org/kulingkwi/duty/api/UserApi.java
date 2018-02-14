package org.kulingkwi.duty.api;

import org.kulingkwi.duty.service.UserService;
import org.kulingkwi.duty.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * File: UserApi.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-14  21:55
 */
@RestController
@RequestMapping("/api/user")
public class UserApi {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void index(UserVO userVO) {
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserVO get(@PathVariable("id") String id){
        return userService.getUser(Integer.valueOf(id));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserVO> getAll() {
        return userService.getUsers(new UserVO());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public UserVO create(UserVO userVO) {
        return userService.saveUser(userVO);
    }
}

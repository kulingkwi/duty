package org.kulingkwi.duty.service;

import org.kulingkwi.duty.dao.UserDao;
import org.kulingkwi.duty.entity.User;
import org.kulingkwi.duty.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * File: UserService.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-14  21:31
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public UserVO saveUser(UserVO userVO) {
        User user = new User();
        user.setName(userVO.getName());
        user.setStatus("A");
        user.setCreateTime(new Date());
        userDao.save(user);
        return userVO;
    }


    @Transactional
    public UserVO getUser(int id) {
        User user = userDao.findOne(id);
        UserVO vo = new UserVO();
        if (user != null) {
            vo.setName(user.getName());
            vo.setId(user.getId());
        }

        return vo;
    }


    @Transactional
    public List<UserVO> getUsers(UserVO userVO) {
        List<UserVO> voList = new ArrayList<>();
        List<User> userList = userDao.findAll();
        if (userList != null) {
            for(User user : userList) {
                UserVO vo = new UserVO();
                vo.setId(user.getId());
                vo.setName(user.getName());
                voList.add(vo);
            }
        }
        return voList;
    }

}

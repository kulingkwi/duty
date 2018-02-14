package org.kulingkwi.duty.dao;

import org.kulingkwi.duty.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * File: UserDao.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-14  21:16
 */

public interface UserDao extends JpaRepository<User, Integer> {

    List<User> getByStatus(String status);

}

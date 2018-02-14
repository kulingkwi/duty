DROP  TABLE IF EXISTS `t_user`;
create table `t_user` (
  `id` int(8) not null AUTO_INCREMENT PRIMARY KEY ,
  `name` VARCHAR(50) not null,
  `dept_id` int(8) DEFAULT 0,
  `status` CHAR not null DEFAULT 'A',
  `create_time` DATETIME ,
  `update_time` DATETIME,
  key `idx_name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_duty`;
create table `t_duty` (
  `id` int(8) not null AUTO_INCREMENT PRIMARY KEY,
  `full_date` VARCHAR(8) not null,
  `year` INT,
  `month` int,
  `day` int,
  `user_id` INT(8) not null,
  `work_status` CHAR not null,
  `create_time` DATETIME ,
  `update_time` DATETIME,
  key `idx_user_date` (`user_id`, `full_date`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
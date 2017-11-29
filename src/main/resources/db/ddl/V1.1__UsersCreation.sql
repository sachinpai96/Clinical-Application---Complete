CREATE TABLE `clinicusers` (
  `user_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(200) NOT NULL,
  `security_question` varchar(200) DEFAULT NULL,
  `security_answer` varchar(200) DEFAULT NULL,
  `is_reset_password_on_login` tinyint(1) DEFAULT NULL,
  `enabled` tinyint(1) NOT NULL,
  `employee_id` bigint(20) unsigned DEFAULT NULL,
  `is_system_user` tinyint(1) NOT NULL,
  `created_dt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_dt` datetime DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id` (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;

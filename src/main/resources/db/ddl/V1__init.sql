
CREATE TABLE `patient` (
  `patient_Id` int(25) NOT NULL AUTO_INCREMENT,
  `first_Name` varchar(200) NOT NULL,
  `last_Name` varchar(200) NOT NULL,
  `age` int(25) NOT NULL,
  `dob` DATE NOT NULL,
  `gender`  varchar(500) NOT NULL,
  `address` varchar(500) NOT NULL,
  `city` varchar(200) NOT NULL,
  `tel_No` varchar(200) NOT NULL,
  `cell_No` varchar(200) NOT NULL,
  `email_Id` varchar(200) NOT NULL,
  `marital_Status` varchar(200) NOT NULL,
  `occupation` varchar(200) NOT NULL,
  `family_Physician` varchar(200) NOT NULL,
  `referring_Physician` varchar(200) NOT NULL,
  `emergency_Contact` varchar(200) NOT NULL,
  `relationship` varchar(200) NOT NULL,
  `photo` longblob,            
  PRIMARY KEY (`patient_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

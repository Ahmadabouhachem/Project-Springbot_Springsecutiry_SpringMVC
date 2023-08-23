CREATE DATABASE  IF NOT EXISTS `employee_directory_test`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `first_name` varchar(45) DEFAULT NULL,
                            `last_name` varchar(45) DEFAULT NULL,
                            `gender` varchar(45) DEFAULT NULL,
                            `age` INT (45) DEFAULT NULL,
                            `is_graduated` BOOLEAN DEFAULT NULL,
                            `rate` float(45) DEFAULT NULL,
                            `email` varchar(45) DEFAULT NULL,
                            PRIMARY KEY (`id`)
                        ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES
    (1,'Leslie','Andrews','male',20,false,55.6,'leslie@luv2code.com')

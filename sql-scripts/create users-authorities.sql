USE `employee_directory`;

DROP TABLE IF EXISTS `roles`;
DROP TABLE IF EXISTS `members`;

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
                           `user_id` varchar(50) NOT NULL,
                           `pw` char(68) NOT NULL,
                           `active` tinyint NOT NULL,
                           PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `members`
--
-- NOTE: The passwords are encrypted using BCrypt
--
-- A generation tool is avail at: https://www.luv2code.com/generate-bcrypt-password
--
-- Default passwords here are: fun123
--

INSERT INTO `members`
VALUES
    ('najm','{bcrypt}$2a$10$4KiL9n6MaaWyhEzY69RVsedD1d7fsthJ4SCpqEjv9Ndy78bPs7of.',1),
    ('basel','{bcrypt}$2a$10$wEQ/qdw84suDyzuvVObp1uygp7W/qROEJ129Hk.Clr9AMlmwJqVmu',1),
    ('ahmad','{bcrypt}$2a$10$iE0nvSgPxF3cOoWqwdUNEurURAfCsMT46QWHETfktaDpQNjLu2jAS',1);


--
-- Table structure for table `authorities`
--

CREATE TABLE `roles` (
                         `user_id` varchar(50) NOT NULL,
                         `role` varchar(50) NOT NULL,
                         UNIQUE KEY `authorities5_idx_1` (`user_id`,`role`),
                         CONSTRAINT `authorities5_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `members` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `roles`
--

INSERT INTO `roles`
VALUES
    ('najm','ROLE_USER'),
    ('basel','ROLE_USER'),
    ('basel','ROLE_MANAGER'),
    ('ahmad','ROLE_USER'),
    ('ahmad','ROLE_MANAGER'),
    ('ahmad','ROLE_ADMIN');

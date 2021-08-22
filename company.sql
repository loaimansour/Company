-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 22, 2021 at 03:32 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `company`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `DEPTNO` int(11) NOT NULL,
  `DEPTNAME` varchar(150) DEFAULT NULL,
  `LOCATION` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`DEPTNO`, `DEPTNAME`, `LOCATION`) VALUES
(2, 'Ahmad', 'amman'),
(4, 'Stats', 'Aqaba'),
(5, 'MIS', 'amman'),
(6, 'SmT', 'Cairo'),
(7, 'sis', 'Aqaba'),
(8, 'MATH', 'cIRO'),
(9, '', '');

-- --------------------------------------------------------

--
-- Stand-in structure for view `department_data`
-- (See below for the actual view)
--
CREATE TABLE `department_data` (
`DEPARTMENT_NO` int(11)
,`DEPARTMENT` varchar(150)
,`LOCATION` varchar(100)
);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EMPNO` int(11) NOT NULL,
  `EMPNAME` varchar(120) DEFAULT NULL,
  `ADDRESS` varchar(200) DEFAULT NULL,
  `SALARY` double DEFAULT NULL,
  `HIRINGDATE` date DEFAULT NULL,
  `BIRTHDATE` date DEFAULT NULL,
  `DEPTNO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EMPNO`, `EMPNAME`, `ADDRESS`, `SALARY`, `HIRINGDATE`, `BIRTHDATE`, `DEPTNO`) VALUES
(1, 'Ahmad', 'Irbid', 5000, '2009-08-01', '1986-04-01', 2),
(2, 'loai', 'Irdid', 350, '2021-08-11', '2010-08-11', 5),
(3, 'yaser', 'salt', 230, '2021-08-11', '2016-08-11', 4),
(4, 'yamen', 'zarqa', 400, '2021-08-06', '2021-08-11', 5),
(5, 'mohamad', 'jordan', 4353, '2021-08-12', '2021-08-18', 5);

-- --------------------------------------------------------

--
-- Stand-in structure for view `employee_data`
-- (See below for the actual view)
--
CREATE TABLE `employee_data` (
`NUMBER` int(11)
,`NAME` varchar(120)
,`ADDRESS` varchar(200)
,`HIRING_DATE` date
,`DATE_OF_BIRTH` date
,`DEPARTMENT_NO` int(11)
,`DEPARTMENT` varchar(150)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `employee_dataa`
-- (See below for the actual view)
--
CREATE TABLE `employee_dataa` (
`NUMBER` int(11)
,`NAME` varchar(120)
,`ADDRESS` varchar(200)
,`Salary` double
,`HIRING_DATE` date
,`DATE_OF_BIRTH` date
,`DEPARTMENT_NO` int(11)
,`DEPARTMENT` varchar(150)
);

-- --------------------------------------------------------

--
-- Table structure for table `employee_phone`
--

CREATE TABLE `employee_phone` (
  `EMPNO` int(11) NOT NULL,
  `PHONE` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee_phone`
--

INSERT INTO `employee_phone` (`EMPNO`, `PHONE`) VALUES
(1, '0000000'),
(2, '089800'),
(2, '09876'),
(4, '2222222'),
(4, '4564565'),
(4, '4564646'),
(5, '00000'),
(5, '43454545'),
(5, '44444'),
(5, '7777777777777777'),
(5, '888888');

-- --------------------------------------------------------

--
-- Stand-in structure for view `employee_phone_data`
-- (See below for the actual view)
--
CREATE TABLE `employee_phone_data` (
`EMPLOYEE_NO` int(11)
,`EMPLOYEE_NAME` varchar(120)
,`PHONE` varchar(55)
);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userName` varchar(40) NOT NULL,
  `passWord` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userName`, `passWord`) VALUES
('ADMIN', '123'),
('LOAI', 'A'),
('YASER', 'B');

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `PROJECTNO` int(11) NOT NULL,
  `PROJECTNAME` varchar(150) DEFAULT NULL,
  `LOCATION` varchar(100) DEFAULT NULL,
  `DEPTNO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`PROJECTNO`, `PROJECTNAME`, `LOCATION`, `DEPTNO`) VALUES
(1, 'GTA', 'JAPAN', 2),
(3, 'Kia', 'koria', 6);

-- --------------------------------------------------------

--
-- Stand-in structure for view `project_data`
-- (See below for the actual view)
--
CREATE TABLE `project_data` (
`PROJECT_NO` int(11)
,`PROJECT` varchar(150)
,`LOCATION` varchar(100)
,`DEPARTMENT_NO` int(11)
,`DEPARTMENT` varchar(150)
);

-- --------------------------------------------------------

--
-- Table structure for table `workon`
--

CREATE TABLE `workon` (
  `EMPNO` int(11) NOT NULL,
  `PROJECTNO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `workon`
--

INSERT INTO `workon` (`EMPNO`, `PROJECTNO`) VALUES
(4, 1),
(5, 3);

-- --------------------------------------------------------

--
-- Stand-in structure for view `workon_data`
-- (See below for the actual view)
--
CREATE TABLE `workon_data` (
`EMPLOYEE_NO` int(11)
,`EMPLOYEE_NAME` varchar(120)
,`PROJECT_NO` int(11)
,`PROJECT_NAME` varchar(150)
);

-- --------------------------------------------------------

--
-- Structure for view `department_data`
--
DROP TABLE IF EXISTS `department_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `department_data`  AS SELECT `department`.`DEPTNO` AS `DEPARTMENT_NO`, `department`.`DEPTNAME` AS `DEPARTMENT`, `department`.`LOCATION` AS `LOCATION` FROM `department` ;

-- --------------------------------------------------------

--
-- Structure for view `employee_data`
--
DROP TABLE IF EXISTS `employee_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `employee_data`  AS SELECT `employee`.`EMPNO` AS `NUMBER`, `employee`.`EMPNAME` AS `NAME`, `employee`.`ADDRESS` AS `ADDRESS`, `employee`.`HIRINGDATE` AS `HIRING_DATE`, `employee`.`BIRTHDATE` AS `DATE_OF_BIRTH`, `employee`.`DEPTNO` AS `DEPARTMENT_NO`, `department`.`DEPTNAME` AS `DEPARTMENT` FROM (`employee` join `department`) WHERE `employee`.`DEPTNO` = `department`.`DEPTNO` ;

-- --------------------------------------------------------

--
-- Structure for view `employee_dataa`
--
DROP TABLE IF EXISTS `employee_dataa`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `employee_dataa`  AS SELECT `employee`.`EMPNO` AS `NUMBER`, `employee`.`EMPNAME` AS `NAME`, `employee`.`ADDRESS` AS `ADDRESS`, `employee`.`SALARY` AS `Salary`, `employee`.`HIRINGDATE` AS `HIRING_DATE`, `employee`.`BIRTHDATE` AS `DATE_OF_BIRTH`, `employee`.`DEPTNO` AS `DEPARTMENT_NO`, `department`.`DEPTNAME` AS `DEPARTMENT` FROM (`employee` join `department`) WHERE `employee`.`DEPTNO` = `department`.`DEPTNO` ;

-- --------------------------------------------------------

--
-- Structure for view `employee_phone_data`
--
DROP TABLE IF EXISTS `employee_phone_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `employee_phone_data`  AS SELECT `employee`.`EMPNO` AS `EMPLOYEE_NO`, `employee`.`EMPNAME` AS `EMPLOYEE_NAME`, `employee_phone`.`PHONE` AS `PHONE` FROM (`employee` join `employee_phone`) WHERE `employee_phone`.`EMPNO` = `employee`.`EMPNO` ;

-- --------------------------------------------------------

--
-- Structure for view `project_data`
--
DROP TABLE IF EXISTS `project_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `project_data`  AS SELECT `project`.`PROJECTNO` AS `PROJECT_NO`, `project`.`PROJECTNAME` AS `PROJECT`, `project`.`LOCATION` AS `LOCATION`, `project`.`DEPTNO` AS `DEPARTMENT_NO`, `department`.`DEPTNAME` AS `DEPARTMENT` FROM (`project` join `department`) WHERE `project`.`DEPTNO` = `department`.`DEPTNO` ;

-- --------------------------------------------------------

--
-- Structure for view `workon_data`
--
DROP TABLE IF EXISTS `workon_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `workon_data`  AS SELECT `workon`.`EMPNO` AS `EMPLOYEE_NO`, `employee`.`EMPNAME` AS `EMPLOYEE_NAME`, `workon`.`PROJECTNO` AS `PROJECT_NO`, `project`.`PROJECTNAME` AS `PROJECT_NAME` FROM ((`workon` join `employee`) join `project`) WHERE `workon`.`EMPNO` = `employee`.`EMPNO` AND `workon`.`PROJECTNO` = `project`.`PROJECTNO` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`DEPTNO`),
  ADD UNIQUE KEY `DEPTNAME` (`DEPTNAME`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EMPNO`),
  ADD UNIQUE KEY `EMPNAME` (`EMPNAME`),
  ADD KEY `DEPTNO` (`DEPTNO`);

--
-- Indexes for table `employee_phone`
--
ALTER TABLE `employee_phone`
  ADD PRIMARY KEY (`EMPNO`,`PHONE`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userName`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`PROJECTNO`),
  ADD UNIQUE KEY `PROJECTNAME` (`PROJECTNAME`),
  ADD KEY `DEPTNO` (`DEPTNO`);

--
-- Indexes for table `workon`
--
ALTER TABLE `workon`
  ADD PRIMARY KEY (`EMPNO`,`PROJECTNO`),
  ADD KEY `PROJECTNO` (`PROJECTNO`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`DEPTNO`) REFERENCES `department` (`DEPTNO`);

--
-- Constraints for table `employee_phone`
--
ALTER TABLE `employee_phone`
  ADD CONSTRAINT `employee_phone_ibfk_1` FOREIGN KEY (`EMPNO`) REFERENCES `employee` (`EMPNO`);

--
-- Constraints for table `project`
--
ALTER TABLE `project`
  ADD CONSTRAINT `project_ibfk_1` FOREIGN KEY (`DEPTNO`) REFERENCES `department` (`DEPTNO`);

--
-- Constraints for table `workon`
--
ALTER TABLE `workon`
  ADD CONSTRAINT `workon_ibfk_1` FOREIGN KEY (`EMPNO`) REFERENCES `employee` (`EMPNO`),
  ADD CONSTRAINT `workon_ibfk_2` FOREIGN KEY (`PROJECTNO`) REFERENCES `project` (`PROJECTNO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

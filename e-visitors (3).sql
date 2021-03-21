-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 05, 2020 at 06:16 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.2.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `e-visitors`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(30) NOT NULL,
  `Names` varchar(30) NOT NULL,
  `Phone` varchar(30) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `Nid` varchar(20) NOT NULL,
  `Face` varchar(40) NOT NULL,
  `Departments` varchar(40) NOT NULL,
  `Priviledge` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `id` int(100) NOT NULL,
  `NID` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `Timin` datetime(6) NOT NULL DEFAULT current_timestamp(6),
  `Timeout` datetime(6) NOT NULL DEFAULT current_timestamp(6),
  `Entryequip` varchar(40) NOT NULL,
  `IN_STATUS` bit(1) NOT NULL DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`id`, `NID`, `Destination`, `Timin`, `Timeout`, `Entryequip`, `IN_STATUS`) VALUES
(67, '1 1968 8 0025166 2 01', 'null', '2020-09-26 12:53:34.733451', '2020-09-26 12:58:10.000000', 'null', b'1'),
(68, '1 1993 8 0129961 1 57', 'null', '2020-09-26 12:54:40.668235', '2020-10-04 12:17:38.000000', 'null', b'0'),
(69, '1 1968 8 0025166 2 01', 'null', '2020-09-26 12:56:38.471445', '2020-09-26 12:58:10.000000', 'null', b'1'),
(70, '1 1993 8 0129961 1 57', 'Destination', '2020-09-26 13:00:29.327569', '2020-10-04 12:17:38.000000', 'Equipment Name', b'0'),
(71, '1 1994 8 0031703 0 13', 'CTS', '2020-09-27 15:44:31.125869', '2020-09-27 15:44:31.125869', 'Amazi', b'1'),
(72, '1 1993 8 0129961 1 57', 'null', '2020-10-04 12:16:23.452779', '2020-10-04 12:17:38.000000', 'null', b'0'),
(73, '1 1993 8 0129961 1 57', 'Destination', '2020-10-04 13:24:23.592526', '2020-10-04 13:25:08.000000', 'Equipment Name', b'0');

-- --------------------------------------------------------

--
-- Table structure for table `departments`
--

CREATE TABLE `departments` (
  `id` int(40) NOT NULL,
  `deptid` varchar(30) NOT NULL,
  `Names` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employe`
--

CREATE TABLE `employe` (
  `ID` int(11) NOT NULL,
  `NAMES` varchar(100) NOT NULL,
  `USER_ID` varchar(20) NOT NULL,
  `USER_PSWD` varchar(20) NOT NULL,
  `ID_NUMBER` varchar(50) NOT NULL,
  `TEL` varchar(13) NOT NULL,
  `ACCESS` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employe`
--

INSERT INTO `employe` (`ID`, `NAMES`, `USER_ID`, `USER_PSWD`, `ID_NUMBER`, `TEL`, `ACCESS`) VALUES
(1, 'Ineza pac', '1', '2', '', '', ''),
(2, 'muneza', 'm123', '123', '11111111', '222222222', 'null'),
(3, '', '', '', '', '', 'null'),
(4, 'UWERA CLAIRE', '12', '12', '11111111', '11111111', 'null'),
(5, 'fbngnghv', 'cvbvfbgbn', 'vcbfdb', 'xvdfbvfgb', 'dfbdfbfdb', 'null'),
(6, 'fergfregev', 'vbfb gbv ', 'dbfbfg', 'dbfgbfg', 'dvfbfg', 'null'),
(7, 'vfggf ', ' gb gfvc', 'sferfer', 'dvrgtrgt', 'dfgregtrdf', 'null'),
(8, 'fbfb', 'bdfbtr6', '5y5y67u', 'yjuyj', 'jj7yu', 'Visitor_Entry_DataBranches_ManagementUsers_managementEquipementsReports'),
(9, 'fgbfg', 'cvbfgbg', 'gntn', 'ggn', 'fgbfgntgb', 'Visitor_Entry_Data Branches_Management Users_management Equipements Reports '),
(10, 'test user', '01', '01', '222222222222', '22222222222', 'Visitor_Entry_DataBranches_ManagementUsers_managementEquipementsReports'),
(11, 'user 1', '3', '3', '4444444', '444444444', 'Reports'),
(12, 'user2', '4', '4', '44444', '444444444', '');

-- --------------------------------------------------------

--
-- Table structure for table `equipments`
--

CREATE TABLE `equipments` (
  `id` int(30) NOT NULL,
  `visitorID` varchar(100) NOT NULL,
  `Equipname` varchar(100) NOT NULL,
  `equipment_id` varchar(100) NOT NULL,
  `price` double NOT NULL DEFAULT 0,
  `blong_to` varchar(50) DEFAULT 'VISITOR'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `equipments`
--

INSERT INTO `equipments` (`id`, `visitorID`, `Equipname`, `equipment_id`, `price`, `blong_to`) VALUES
(1, '1 1993 8 0129961 1 57', '1234', 'uquip1', 0, 'VISITOR'),
(2, '1 1993 8 0129961 1 57', 'dfredgrt', 'dfedgfgf', 0, 'VISITOR'),
(3, '1 1993 8 0129961 1 57', 'sdffd', '555151', 0, 'VISITOR'),
(4, '1 1993 8 0129961 1 57', 'fsgsgerr', '536985', 0, 'VISITOR'),
(5, '1 1994 8 0031703 0 13', 'equpment1', 'gtryrg5yh', 0, 'VISITOR'),
(6, '1 1994 8 0031703 0 13', 'equipment2', '56925455', 0, 'VISITOR'),
(7, '1 1994 8 0031703 0 13', 'equipment3', '4444444444', 0, 'VISITOR'),
(8, '1 1994 8 0031703 0 13', 'eeeeeee', '4526555', 0, 'VISITOR'),
(9, '1 1994 8 0031703 0 13', 'dfsdfsfsd', '5256625', 0, 'VISITOR'),
(10, '1 1994 8 0031703 0 13', 'sdffdscsvdesc', 'dfdsfsfsf', 0, 'VISITOR'),
(11, '1 1994 8 0031703 0 13', '789', '789', 0, 'VISITOR'),
(12, '1 1994 8 0031703 0 13', '4566', '455', 0, 'VISITOR'),
(13, '1 1994 8 0031703 0 13', '369', '369', 0, 'VISITOR'),
(14, '1 1994 8 0031703 0 13', 'hjvdhvghvfd', '45825', 0, 'VISITOR'),
(15, '1 1994 8 0031703 0 13', '123', '123321', 0, 'VISITOR'),
(16, '1 1994 8 0031703 0 13', '236', '563214', 0, 'VISITOR'),
(17, '1 1994 8 0031703 0 13', 'laptop', '7896544569', 0, 'VISITOR'),
(18, '1 1994 8 0031703 0 13', 'projector', '852258', 0, 'VISITOR'),
(19, '1 1994 8 0031703 0 13', 'laptop', '123456', 0, 'VISITOR'),
(20, '1 1994 8 0031703 0 13', 'hand bag', '22331122', 0, 'VISITOR'),
(21, '1 1994 8 0031703 0 13', 'book', '7174000104143', 0, 'VISITOR'),
(22, '1 1994 8 0031703 0 13', 'jksbfjkbkjbf', 'hsdhbshcbhbhev', 0, 'VISITOR'),
(23, '1 1994 8 0031703 0 13', 'ggdsgergd', 'dfeffscwsd', 0, 'VISITOR'),
(24, '1 1994 8 0031703 0 13', 'jddjjk jkv rd', 'jkdffjjdjc ', 0, 'VISITOR'),
(25, '1 1994 8 0031703 0 13', 'dsfsdgdfgdgdfgdffgrr', 'ldfllcldld', 0, 'VISITOR'),
(26, '1 1993 8 0129961 1 57', 'Equipment Name12', '25693875', 0, 'VISITOR'),
(27, '1 1993 8 0129961 1 57', 'Equipment Name321', 'jkkkkkkkkkkkkkkk', 0, 'VISITOR'),
(28, '1 1993 8 0129961 1 57', 'Equipment NameY', 'TTTTTTTTTTT', 0, 'VISITOR'),
(29, '1 1993 8 0129961 1 57', 'Equipment Name', 'eeeeeeee', 0, 'VISITOR'),
(30, '1 1993 8 0129961 1 57', 'Equipment Name1', '1111111', 0, 'VISITOR'),
(31, '1 1993 8 0129961 1 57', 'Equipment Name1', 'eeeee', 0, 'VISITOR'),
(32, '1 1994 8 0031703 0 13', 'Equipment Name1', 'jfjdjdndd', 0, 'VISITOR'),
(33, '11998480031703013', 'CHUCK IDS', '0555783', 0, 'VISITOR'),
(34, '1 1993 8 0129961 1 57', 'Equipment Name', '222222', 0, 'VISITOR'),
(35, 'null', 'test item', '1111111', 3000, 'Institution'),
(36, 'null', 'test item', '1111111', 3000, 'Institution'),
(37, '1 1994 8 0031703 0 13', 'Amazi', '6161101870634', 0, 'VISITOR'),
(38, '1 1993 8 0129961 1 57', 'Equipment Name', 'FFFFFF', 0, 'VISITOR');

-- --------------------------------------------------------

--
-- Table structure for table `login-in-out`
--

CREATE TABLE `login-in-out` (
  `id` int(255) NOT NULL,
  `username` varchar(200) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `logintime` datetime(6) NOT NULL,
  `logouttime` datetime(6) NOT NULL,
  `Role` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `secofficer`
--

CREATE TABLE `secofficer` (
  `id` int(30) NOT NULL,
  `Names` varchar(30) NOT NULL,
  `IDNo` varchar(30) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `face` varchar(100) NOT NULL,
  `companyname` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `id` int(100) NOT NULL,
  `Names` varchar(30) NOT NULL,
  `IDNo` varchar(30) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Image` varchar(200) NOT NULL,
  `Finger` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `visitors`
--

CREATE TABLE `visitors` (
  `ID` int(255) NOT NULL,
  `Photos` varchar(233) DEFAULT NULL,
  `finger` varchar(100) DEFAULT NULL,
  `Telphone` varchar(15) NOT NULL,
  `Names` varchar(30) NOT NULL,
  `Nid` varchar(30) DEFAULT 'NOT SET',
  `in_out` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `visitors`
--

INSERT INTO `visitors` (`ID`, `Photos`, `finger`, `Telphone`, `Names`, `Nid`, `in_out`) VALUES
(25, NULL, NULL, '11111', 'BASHYITSI Claver', '1 1968 8 0025166 2 01', 0),
(26, NULL, NULL, '22222', 'UWIMANA Pacifique', '1 1993 8 0129961 1 57', 0),
(27, NULL, NULL, '0783550033', 'SHEMA Pacifique', '1 1994 8 0031703 0 13', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `departments`
--
ALTER TABLE `departments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employe`
--
ALTER TABLE `employe`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `USER_ID` (`USER_ID`);

--
-- Indexes for table `equipments`
--
ALTER TABLE `equipments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login-in-out`
--
ALTER TABLE `login-in-out`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `secofficer`
--
ALTER TABLE `secofficer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `visitors`
--
ALTER TABLE `visitors`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=74;

--
-- AUTO_INCREMENT for table `departments`
--
ALTER TABLE `departments`
  MODIFY `id` int(40) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `employe`
--
ALTER TABLE `employe`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `equipments`
--
ALTER TABLE `equipments`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `login-in-out`
--
ALTER TABLE `login-in-out`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `secofficer`
--
ALTER TABLE `secofficer`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `visitors`
--
ALTER TABLE `visitors`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2020 at 05:04 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springboot`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(80) NOT NULL,
  `age` int(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `address` varchar(80) NOT NULL,
  `cp_fkku` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `age`, `email`, `address`, `cp_fkku`) VALUES
(33, 'yuda', 12, 'yyyy', 'jakarta', NULL),
(34, 'yuda', 12, 'yyyy', 'jakarta', NULL),
(35, 'yuda', 12, 'ddd', 'jakarta', NULL),
(36, 'yuda r', 12, 'ddd', 'jakarta r', NULL),
(37, 'yuda r', 12, 'ddd', 'jakarta r', NULL),
(38, 'yuda', 43, 'yyyy', 'jakarta', NULL),
(39, 'yuda rb', 55, 'yyyy', 'jakarta', NULL),
(40, 'Denny Prayudi', 33, 'Denny Prayudi', 'Denny Prayudi', NULL),
(41, 'Denny Prayudi', 33, 'Denny Prayudi', 'Denny Prayudi', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKeov9nqvlnhge2a0xk8970p2pq` (`cp_fkku`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `FKeov9nqvlnhge2a0xk8970p2pq` FOREIGN KEY (`cp_fkku`) REFERENCES `product` (`pid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

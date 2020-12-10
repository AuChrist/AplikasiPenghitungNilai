-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2020 at 08:20 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mahasiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `NIM` varchar(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `nilai_tugas` varchar(5) NOT NULL,
  `nilai_quiz` varchar(5) NOT NULL,
  `nilai_mid` varchar(5) NOT NULL,
  `nilai_final` varchar(5) NOT NULL,
  `nilai_akhir` varchar(5) NOT NULL,
  `huruf` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`NIM`, `Nama`, `nilai_tugas`, `nilai_quiz`, `nilai_mid`, `nilai_final`, `nilai_akhir`, `huruf`) VALUES
('52018022', 'Tony', '50', '65', '45', '55', '46.25', 'E'),
('52018007', 'Christuaji', '56', '78', '55', '89', '61.1', 'C');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

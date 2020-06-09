-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2020 at 11:09 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sewaterop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `password` text NOT NULL,
  `accesslevel` enum('admin','owner') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`, `accesslevel`) VALUES
('sovana', 'c292YW5hMTEx', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id` int(11) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga` int(15) NOT NULL,
  `status` enum('Tersedia','Habis') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id`, `nama_barang`, `harga`, `status`) VALUES
(1, 'Tenda', 30000, 'Habis'),
(2, 'Kursi', 20000, 'Tersedia'),
(3, 'Karangan bunga', 20000, 'Tersedia'),
(4, 'Panggung', 50000, 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id` int(11) NOT NULL,
  `tgl_sewa` date NOT NULL DEFAULT '1970-01-01',
  `tgl_kembali` date NOT NULL DEFAULT '1970-01-01',
  `nama_penyewa` varchar(50) NOT NULL,
  `barang_sewaan` varchar(50) NOT NULL,
  `jumlah` int(5) NOT NULL,
  `harga_satuan` int(15) NOT NULL,
  `alamat` text NOT NULL,
  `telp` varchar(15) NOT NULL,
  `total_biaya` int(15) NOT NULL,
  `jumlah_bayar` int(15) NOT NULL,
  `sisa` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id`, `tgl_sewa`, `tgl_kembali`, `nama_penyewa`, `barang_sewaan`, `jumlah`, `harga_satuan`, `alamat`, `telp`, `total_biaya`, `jumlah_bayar`, `sisa`) VALUES
(1, '1970-01-01', '1970-01-01', 'Dika', 'Meja', 5, 15000, 'Indonesia', '082352352', 75000, 10000, -65000),
(2, '1970-01-01', '1970-01-01', 'Dimas', 'Tenda', 3, 30000, 'Mojorejo', '08432525', 90000, 130000, 40000),
(3, '2020-06-02', '2020-06-08', 'Dilan', 'Karangan bunga', 1, 20000, 'Bandung', '0853463', 20000, 30000, 10000),
(4, '1970-01-01', '2020-06-08', 'Della', 'Kursi', 100, 20000, 'Jomblang', '0814441', 2000000, 3000000, 1000000),
(5, '1970-01-01', '2020-06-08', 'Achmad', 'Tenda', 2, 30000, 'Kawedanan', '08536363', 60000, 100000, 40000),
(6, '2020-04-14', '2020-06-09', 'Denny', 'Karangan bunga', 4, 20000, 'Selorejo', '08452525', 80000, 100000, 20000),
(7, '2020-06-07', '2020-06-09', 'Agus', 'Meja', 4, 24000, 'Selorejo', '0841525325', 96000, 100000, 4000),
(8, '2020-06-23', '2020-06-11', 'Sardi', 'Kursi', 20, 20000, 'Bendo', '0843155', 400000, 500000, 100000),
(9, '2020-06-17', '2020-06-09', 'Ayudi', 'Kursi', 10, 20000, 'Bogor', '082424432', 200000, 300000, 100000);

-- --------------------------------------------------------

--
-- Table structure for table `sewaan`
--

CREATE TABLE `sewaan` (
  `id` int(11) NOT NULL,
  `tanggal` date NOT NULL DEFAULT '1970-01-01',
  `nama` varchar(50) NOT NULL,
  `barang_sewaan` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `jumlah` int(4) NOT NULL,
  `alamat` text NOT NULL,
  `telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sewaan`
--

INSERT INTO `sewaan` (`id`, `tanggal`, `nama`, `barang_sewaan`, `jumlah`, `alamat`, `telp`) VALUES
(1, '2020-05-11', 'Joni Iskandar', 'Kursi', 10, 'Indonesia', '02143532'),
(2, '2020-04-22', 'Surya', 'Karangan bunga', 4, 'Bandung', '0863673');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sewaan`
--
ALTER TABLE `sewaan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `sewaan`
--
ALTER TABLE `sewaan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

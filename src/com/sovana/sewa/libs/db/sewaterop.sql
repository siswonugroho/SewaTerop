-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Jun 2020 pada 05.59
-- Versi server: 10.4.8-MariaDB
-- Versi PHP: 7.3.10

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
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `password` text NOT NULL,
  `accesslevel` enum('admin','owner') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`username`, `password`, `accesslevel`) VALUES
('sovana', 'c292YW5hMTEx', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id` int(11) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga` int(15) NOT NULL,
  `status` enum('Tersedia','Habis') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id`, `nama_barang`, `harga`, `status`) VALUES
(1, 'Tenda', 30000, 'Habis'),
(2, 'Kursi', 20000, 'Tersedia'),
(3, 'Karangan bunga', 20000, 'Tersedia'),
(4, 'Panggung', 50000, 'Tersedia'),
(5, 'Kebaya', 20000, 'Tersedia');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembayaran`
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
-- Dumping data untuk tabel `pembayaran`
--

INSERT INTO `pembayaran` (`id`, `tgl_sewa`, `tgl_kembali`, `nama_penyewa`, `barang_sewaan`, `jumlah`, `harga_satuan`, `alamat`, `telp`, `total_biaya`, `jumlah_bayar`, `sisa`) VALUES
(1, '1970-01-01', '2020-06-08', 'Achmad', 'Tenda', 2, 30000, 'Kawedanan', '08536363', 60000, 100000, 40000),
(2, '2020-06-07', '2020-06-09', 'Agus', 'Meja', 4, 24000, 'Selorejo', '0841525325', 96000, 100000, 4000),
(3, '2020-06-23', '2020-06-11', 'Sardi', 'Kursi', 20, 20000, 'Bendo', '0843155', 400000, 500000, 100000),
(4, '2020-06-17', '2020-06-09', 'Ayudi', 'Kursi', 10, 20000, 'Bogor', '082424432', 200000, 300000, 100000),
(5, '2020-05-11', '2020-06-08', 'Joni Iskandar', 'Kursi', 10, 20000, 'Indonesia', '02143532', 200000, 300000, 100000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `sewaan`
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
-- Dumping data untuk tabel `sewaan`
--

INSERT INTO `sewaan` (`id`, `tanggal`, `nama`, `barang_sewaan`, `jumlah`, `alamat`, `telp`) VALUES
(1, '2020-04-22', 'Surya', 'Karangan bunga', 4, 'Bandung', '0863673'),
(2, '2020-06-10', 'Jarmi', 'Tenda', 3, 'Bogem', '0886453'),
(3, '2020-06-11', 'Tora', 'Panggung', 1, 'Jakarta', '083121'),
(4, '2020-06-12', 'Dendy', 'Kursi', 10, 'Sidorejo', '082355');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `sewaan`
--
ALTER TABLE `sewaan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `barang`
--
ALTER TABLE `barang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `sewaan`
--
ALTER TABLE `sewaan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

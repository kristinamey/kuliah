-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Bulan Mei 2020 pada 14.49
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kry`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblkry`
--

CREATE TABLE `tblkry` (
  `nip` char(15) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `tanggalLahir` varchar(3600) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `jabatan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblkry`
--

INSERT INTO `tblkry` (`nip`, `nama`, `tanggalLahir`, `jenis_kelamin`, `jabatan`) VALUES
('11', 'handoko', '11-03-2000', 'Laki-Laki', 'Direktur'),
('1213', 'kristina', '26-05-2000', 'Perempuan', 'Direktur'),
('183307011', 'kristina', '27-05-2000', 'Perempuan', 'Manajer'),
('183307013', 'satimin', '04-06-2000', 'Laki-Laki', 'Direktur'),
('183307015', 'Linda amanda', '07-06-2000', 'Perempuan', 'Karyawan');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tblkry`
--
ALTER TABLE `tblkry`
  ADD PRIMARY KEY (`nip`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

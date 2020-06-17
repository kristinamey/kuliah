-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 20 Mar 2020 pada 12.31
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_gereja`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `idAdmin` int(3) NOT NULL,
  `nama_admin` varchar(255) DEFAULT NULL,
  `noHp` varchar(15) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `katasandi` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`idAdmin`, `nama_admin`, `noHp`, `username`, `katasandi`) VALUES
(1, 'kristina', '081335496703', 'admin', '202cb962ac59075b964b07152d234b70');

-- --------------------------------------------------------

--
-- Struktur dari tabel `berita_gereja`
--

CREATE TABLE `berita_gereja` (
  `idBerita_gereja` int(5) NOT NULL,
  `idAdmin` int(3) NOT NULL,
  `judul_berita` varchar(255) DEFAULT NULL,
  `deskripsi_berita` varchar(512) DEFAULT NULL,
  `gambar_berita` varchar(512) DEFAULT '.jpg'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `materi_gereja`
--

CREATE TABLE `materi_gereja` (
  `idMateri_gereja` int(5) NOT NULL,
  `idAdmin` int(3) NOT NULL,
  `tema_kotbah` varchar(255) DEFAULT NULL,
  `tanggal` date NOT NULL,
  `pemateri` varchar(50) DEFAULT NULL,
  `rangkuman_materi` varchar(521) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idAdmin`);

--
-- Indeks untuk tabel `berita_gereja`
--
ALTER TABLE `berita_gereja`
  ADD PRIMARY KEY (`idBerita_gereja`);

--
-- Indeks untuk tabel `materi_gereja`
--
ALTER TABLE `materi_gereja`
  ADD PRIMARY KEY (`idMateri_gereja`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `idAdmin` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `berita_gereja`
--
ALTER TABLE `berita_gereja`
  MODIFY `idBerita_gereja` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `materi_gereja`
--
ALTER TABLE `materi_gereja`
  MODIFY `idMateri_gereja` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `berita_gereja`
--
ALTER TABLE `berita_gereja`
  ADD CONSTRAINT `berita_gereja_ibfk_1` FOREIGN KEY (`idAdmin`) REFERENCES `admin` (`idAdmin`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `materi_gereja`
--
ALTER TABLE `materi_gereja`
  ADD CONSTRAINT `materi_gereja_ibfk_1` FOREIGN KEY (`idAdmin`) REFERENCES `admin` (`idAdmin`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-07-2022 a las 00:44:53
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vive digital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actadevolucion`
--

CREATE TABLE `actadevolucion` (
  `ID` int(100) NOT NULL,
  `Resive` varchar(50) NOT NULL,
  `Tipo Objeto` varchar(50) NOT NULL,
  `Fecha` int(50) NOT NULL,
  `Observacion` varchar(50) NOT NULL,
  `Entrega` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `actadevolucion`
--

INSERT INTO `actadevolucion` (`ID`, `Resive`, `Tipo Objeto`, `Fecha`, `Observacion`, `Entrega`) VALUES
(1, 'Darci amado', 'silla', 8, 'bien', 'gisela'),
(2, 'Darci amado', 'silla', 8, 'bien', 'gisela');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actaentrega`
--

CREATE TABLE `actaentrega` (
  `IdEntrega` int(11) NOT NULL,
  `Asignado` varchar(100) NOT NULL,
  `Cedula` int(50) NOT NULL,
  `Cargo` varchar(50) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Fecha` varchar(13) NOT NULL,
  `Telefono` varchar(30) NOT NULL,
  `Tipo` text NOT NULL,
  `Observacion` varchar(100) NOT NULL,
  `Entrega` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `actaentrega`
--

INSERT INTO `actaentrega` (`IdEntrega`, `Asignado`, `Cedula`, `Cargo`, `Correo`, `Fecha`, `Telefono`, `Tipo`, `Observacion`, `Entrega`) VALUES
(1, 'lola palw', 100931002, 'aprendiz', 'mujg', 'ggg', 'mgg', '848', 'ggg', 'ggg'),
(2, 'Yenifer Martinez', 103300923, 'enfermera profecional', 'njnvdv', 'cuatro sillas', '315552536', '29 de abril', 'buen estado', 'Gisela Ovalle');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actaprestamo`
--

CREATE TABLE `actaprestamo` (
  `ID` int(20) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Cargo` varchar(50) NOT NULL,
  `Cedula` int(15) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Actividad` varchar(50) NOT NULL,
  `Fecha` varchar(10) NOT NULL,
  `Hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `actaprestamo`
--

INSERT INTO `actaprestamo` (`ID`, `Nombre`, `Cargo`, `Cedula`, `Correo`, `Actividad`, `Fecha`, `Hora`) VALUES
(2, 'Darci', 'Amado', 61326256, 'yo@gmail.com', 'capacitacion de programacion', '02-02-2022', '9:00 AM'),
(3, 'gisela', 'Aprendiz', 1000931002, 'giselaovalle64@gmail.com', 'aprendizaje', '', ''),
(4, 'darci', 'amado', 61326256, 'yo@gmail.com', 'programar', '', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actadevolucion`
--
ALTER TABLE `actadevolucion`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `actaentrega`
--
ALTER TABLE `actaentrega`
  ADD PRIMARY KEY (`IdEntrega`);

--
-- Indices de la tabla `actaprestamo`
--
ALTER TABLE `actaprestamo`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actadevolucion`
--
ALTER TABLE `actadevolucion`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `actaentrega`
--
ALTER TABLE `actaentrega`
  MODIFY `IdEntrega` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `actaprestamo`
--
ALTER TABLE `actaprestamo`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

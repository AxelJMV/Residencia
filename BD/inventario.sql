-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-12-2023 a las 10:53:04
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area`
--

CREATE TABLE `area` (
  `idarea` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `area`
--

INSERT INTO `area` (`idarea`, `nombre`, `descripcion`) VALUES
(1, 'Sistemas', 'Es el Area de Sistemas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE `cargo` (
  `idcargo` int(11) NOT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cargo`
--

INSERT INTO `cargo` (`idcargo`, `tipo`, `descripcion`) VALUES
(1, 'Encargado', 'Jefe del Area'),
(2, 'Empleado', 'Empleado del Area');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `identificador` int(11) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `idproveedor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idproveedor` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salida`
--

CREATE TABLE `salida` (
  `idsalidas` int(11) NOT NULL,
  `identificador` varchar(255) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salidaproducto`
--

CREATE TABLE `salidaproducto` (
  `idsalidaproducto` int(11) NOT NULL,
  `idproducto` int(11) DEFAULT NULL,
  `idsalidas` int(11) DEFAULT NULL,
  `idusuarioa` int(11) DEFAULT NULL,
  `idusuarior` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `iduser` int(11) NOT NULL,
  `user` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `primerasesion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`iduser`, `user`, `password`, `primerasesion`) VALUES
(1, 'admin', 'admin', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarioinfo`
--

CREATE TABLE `usuarioinfo` (
  `idinfo` int(11) NOT NULL,
  `identificador` varchar(25) DEFAULT NULL,
  `nombre` varchar(25) DEFAULT NULL,
  `apellidop` varchar(25) DEFAULT NULL,
  `apellidom` varchar(25) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `idarea` int(11) DEFAULT NULL,
  `idcargo` int(11) DEFAULT NULL,
  `iduser` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarioinfo`
--

INSERT INTO `usuarioinfo` (`idinfo`, `identificador`, `nombre`, `apellidop`, `apellidom`, `edad`, `idarea`, `idcargo`, `iduser`) VALUES
(1, 'ADMIN', 'ADMIN', 'ADMIN', 'ADMIN', 0, 1, 2, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `area`
--
ALTER TABLE `area`
  ADD PRIMARY KEY (`idarea`);

--
-- Indices de la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`idcargo`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`),
  ADD KEY `idproveedor` (`idproveedor`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idproveedor`);

--
-- Indices de la tabla `salida`
--
ALTER TABLE `salida`
  ADD PRIMARY KEY (`idsalidas`);

--
-- Indices de la tabla `salidaproducto`
--
ALTER TABLE `salidaproducto`
  ADD PRIMARY KEY (`idsalidaproducto`),
  ADD KEY `idproducto` (`idproducto`),
  ADD KEY `idsalidas` (`idsalidas`),
  ADD KEY `idusuarioa` (`idusuarioa`),
  ADD KEY `idusuarior` (`idusuarior`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`iduser`);

--
-- Indices de la tabla `usuarioinfo`
--
ALTER TABLE `usuarioinfo`
  ADD PRIMARY KEY (`idinfo`),
  ADD KEY `idarea` (`idarea`),
  ADD KEY `idcargo` (`idcargo`),
  ADD KEY `iduser` (`iduser`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `area`
--
ALTER TABLE `area`
  MODIFY `idarea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `cargo`
--
ALTER TABLE `cargo`
  MODIFY `idcargo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idproducto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idproveedor` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `salida`
--
ALTER TABLE `salida`
  MODIFY `idsalidas` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `salidaproducto`
--
ALTER TABLE `salidaproducto`
  MODIFY `idsalidaproducto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `iduser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuarioinfo`
--
ALTER TABLE `usuarioinfo`
  MODIFY `idinfo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idproveedor`) REFERENCES `proveedor` (`idproveedor`);

--
-- Filtros para la tabla `salidaproducto`
--
ALTER TABLE `salidaproducto`
  ADD CONSTRAINT `salidaproducto_ibfk_1` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`),
  ADD CONSTRAINT `salidaproducto_ibfk_2` FOREIGN KEY (`idsalidas`) REFERENCES `salida` (`idsalidas`),
  ADD CONSTRAINT `salidaproducto_ibfk_3` FOREIGN KEY (`idusuarioa`) REFERENCES `usuario` (`iduser`),
  ADD CONSTRAINT `salidaproducto_ibfk_4` FOREIGN KEY (`idusuarior`) REFERENCES `usuario` (`iduser`);

--
-- Filtros para la tabla `usuarioinfo`
--
ALTER TABLE `usuarioinfo`
  ADD CONSTRAINT `usuarioinfo_ibfk_1` FOREIGN KEY (`idarea`) REFERENCES `area` (`idarea`),
  ADD CONSTRAINT `usuarioinfo_ibfk_2` FOREIGN KEY (`idcargo`) REFERENCES `cargo` (`idcargo`),
  ADD CONSTRAINT `usuarioinfo_ibfk_3` FOREIGN KEY (`iduser`) REFERENCES `usuario` (`iduser`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

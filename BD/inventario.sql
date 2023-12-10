CREATE TABLE `area` (
  `idarea` int PRIMARY KEY,
  `nombre` varchar(50),
  `descripcion` varchar(255)
);

CREATE TABLE `cargo` (
  `idcargo` int PRIMARY KEY,
  `tipo` varchar(50),
  `descripcion` varchar(255)
);

CREATE TABLE `usuario` (
  `iduser` int PRIMARY KEY,
  `user` varchar(50),
  `password` varchar(255),
  `primerasesion` int
);

CREATE TABLE `usuarioinfo` (
  `idinfo` int PRIMARY KEY,
  `identificador` varchar(25),
  `nombre` varchar(25),
  `apellidop` varchar(25),
  `apellidom` varchar(25),
  `edad` int,
  `idarea` int,
  `idcargo` int,
  `iduser` int
);

CREATE TABLE `proveedor` (
  `idproveedor` int PRIMARY KEY,
  `nombre` varchar(255),
  `descripcion` varchar(255)
);

CREATE TABLE `producto` (
  `idproducto` int PRIMARY KEY,
  `identificador` int,
  `nombre` varchar(50),
  `cantidad` int,
  `idproveedor` int
);

CREATE TABLE `salida` (
  `idsalidas` int PRIMARY KEY,
  `identificador` varchar(255),
  `fecha` date
);

CREATE TABLE `salidaproducto` (
  `idsalidaproducto` int PRIMARY KEY,
  `idproducto` int,
  `idsalidas` int,
  `idusuarioa` int,
  `idusuarior` int
);

ALTER TABLE `usuarioinfo` ADD FOREIGN KEY (`idarea`) REFERENCES `area` (`idarea`);

ALTER TABLE `usuarioinfo` ADD FOREIGN KEY (`idcargo`) REFERENCES `cargo` (`idcargo`);

ALTER TABLE `usuarioinfo` ADD FOREIGN KEY (`iduser`) REFERENCES `usuario` (`iduser`);

ALTER TABLE `producto` ADD FOREIGN KEY (`idproveedor`) REFERENCES `proveedor` (`idproveedor`);

ALTER TABLE `salidaproducto` ADD FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`);

ALTER TABLE `salidaproducto` ADD FOREIGN KEY (`idsalidas`) REFERENCES `salida` (`idsalidas`);

ALTER TABLE `salidaproducto` ADD FOREIGN KEY (`idusuarioa`) REFERENCES `usuario` (`iduser`);

ALTER TABLE `salidaproducto` ADD FOREIGN KEY (`idusuarior`) REFERENCES `usuario` (`iduser`);

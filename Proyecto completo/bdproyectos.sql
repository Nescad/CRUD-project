-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-11-2021 a las 17:51:15
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdproyectos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividad`
--

CREATE TABLE `actividad` (
  `cod` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `fechaini` date NOT NULL,
  `fechafin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `actividad`
--

INSERT INTO `actividad` (`cod`, `descripcion`, `fechaini`, `fechafin`) VALUES
(1, 'En esta actividad se realizara un trabajo en el que el area de productividad este en ella', '2021-08-01', '2025-10-12'),
(2, 'Se realizara todo tipo de mejoras en el aparto tecnologico de la empresa ', '2021-01-01', '2021-12-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `cod` int(11) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `fechaini` date NOT NULL,
  `fechafin` date NOT NULL,
  `costo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`cod`, `titulo`, `fechaini`, `fechafin`, `costo`) VALUES
(1, 'Proyecto de produccion', '2021-08-01', '2025-10-12', 450000000.2),
(2, 'Mejoras tecnologicas', '2021-01-01', '2021-12-01', 55059000.3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `responsable`
--

CREATE TABLE `responsable` (
  `cod` varchar(15) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `telfijo` varchar(15) NOT NULL,
  `telmovil` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `responsable`
--

INSERT INTO `responsable` (`cod`, `nom`, `telfijo`, `telmovil`) VALUES
('1', 'Leidy Mariana', '334', '233'),
('2', 'Camilo Lara', '3581', '7695');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resp_act_proy`
--

CREATE TABLE `resp_act_proy` (
  `codresp` varchar(15) NOT NULL,
  `codactiv` int(11) NOT NULL,
  `codproy` int(11) NOT NULL,
  `fecha_asig` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `resp_act_proy`
--

INSERT INTO `resp_act_proy` (`codresp`, `codactiv`, `codproy`, `fecha_asig`) VALUES
('1', 1, 1, '2021-11-06'),
('2', 1, 1, '2021-01-01');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividad`
--
ALTER TABLE `actividad`
  ADD PRIMARY KEY (`cod`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`cod`);

--
-- Indices de la tabla `responsable`
--
ALTER TABLE `responsable`
  ADD PRIMARY KEY (`cod`);

--
-- Indices de la tabla `resp_act_proy`
--
ALTER TABLE `resp_act_proy`
  ADD KEY `cons_activ` (`codactiv`),
  ADD KEY `cons_proy` (`codproy`),
  ADD KEY `cons_resp` (`codresp`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `resp_act_proy`
--
ALTER TABLE `resp_act_proy`
  ADD CONSTRAINT `cons_activ` FOREIGN KEY (`codactiv`) REFERENCES `actividad` (`cod`),
  ADD CONSTRAINT `cons_proy` FOREIGN KEY (`codproy`) REFERENCES `proyecto` (`cod`),
  ADD CONSTRAINT `cons_resp` FOREIGN KEY (`codresp`) REFERENCES `responsable` (`cod`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

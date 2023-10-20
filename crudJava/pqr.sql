-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-10-2023 a las 00:18:49
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pqr`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pqr`
--

CREATE TABLE `pqr` (
  `id` int(11) NOT NULL,
  `identificacion` bigint(20) DEFAULT NULL,
  `nombres` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `telefono` char(12) DEFAULT NULL,
  `genero` varchar(30) DEFAULT NULL,
  `eps` varchar(30) DEFAULT NULL,
  `comentario` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pqr`
--

INSERT INTO `pqr` (`id`, `identificacion`, `nombres`, `email`, `telefono`, `genero`, `eps`, `comentario`) VALUES
(1, 987654321, 'Joselin Francisco Suarez', 'joseF@email.com', '3214567890', 'Otro', 'Sanitas', 'aaaaaaaaaaaaaaaaaa'),
(2, 1234567890, 'Hector Martinez', 'hectro@email.com', '3334567890', 'Masculino', 'Nueva EPS', 'oiyrwertyuijg'),
(3, 3211234567, 'Karen la gata', 'karen@email.com', '3120987654', 'Femenino', 'Sanitas', 'jofpajdo<cnka'),
(4, 90612345678, 'Juan', 'juan@email.com', '3241567890', 'Masculino', 'Sanitas', 'buenasssss'),
(5, 997432654, 'Pepito', 'pepe@email.com', '342156789', 'Otro', 'Privado', 'me encantan la cerveza'),
(8, 6545545654, 'LKJHGFDSMNBVC', 'mnbvcxlkjhgfds', '098765430987', 'Femenino', 'Cool', 'shailvnwnacn'),
(9, 123476, 'jhgfds', 'vbnmghj', '765434', 'Femenino', 'Nueva eps', 'UUUU');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pqr`
--
ALTER TABLE `pqr`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pqr`
--
ALTER TABLE `pqr`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

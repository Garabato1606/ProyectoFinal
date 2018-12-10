-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: zombieworld
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `armas`
--

DROP TABLE IF EXISTS `armas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `armas` (
  `id_Armas` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Daño_Adic` int(11) DEFAULT NULL,
  `Consumo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_Armas`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `armas`
--

LOCK TABLES `armas` WRITE;
/*!40000 ALTER TABLE `armas` DISABLE KEYS */;
INSERT INTO `armas` VALUES (1,'Cañon de Tanque',50,40),(2,'Bazucas',30,20),(3,'Lanzagranadas',20,15),(4,'Escopetas',15,10),(5,'Francotirador',18,5),(6,'Rifles de Asalto por Rafaga',25,20),(7,'Rifles de Asalto por Tiro',5,8),(8,'Rifles',15,3),(9,'Ballestas',15,3),(10,'Arcos',10,2),(11,'Revolvers',15,3),(12,'Pistola',13,1),(13,'Granadas',20,15),(14,'Molotov',15,10),(15,'Explosivos',25,0),(16,'Bates',4,10),(17,'Bates con Clavos',8,15),(18,'Bates con Alambre de Puas',10,20),(19,'Cuchillos',8,10),(20,'Espadas',10,12),(21,'Lanzas',8,8),(22,'Bastones',4,12),(23,'Katanas',12,15),(24,'Machetes',10,12),(25,'Hachas',12,15),(26,'Navajas',5,8),(27,'Destornillador',4,6),(28,'Vidrios Rotos',2,5);
/*!40000 ALTER TABLE `armas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `base`
--

DROP TABLE IF EXISTS `base`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `base` (
  `id_base` int(11) NOT NULL,
  `Num_Personas` int(11) DEFAULT NULL,
  `Num_Dias` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_base`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `base`
--

LOCK TABLES `base` WRITE;
/*!40000 ALTER TABLE `base` DISABLE KEYS */;
/*!40000 ALTER TABLE `base` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `construcciones`
--

DROP TABLE IF EXISTS `construcciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `construcciones` (
  `Nombre_Vehiculo` varchar(30) DEFAULT NULL,
  `Descripcion` text,
  `Requisitos` varchar(80) DEFAULT 'Colonia'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `construcciones`
--

LOCK TABLES `construcciones` WRITE;
/*!40000 ALTER TABLE `construcciones` DISABLE KEYS */;
INSERT INTO `construcciones` VALUES ('Almacen','Poder dejar materiales y objetos','1 Cuarto'),('Bodega','Dejar aun mas cosas','Colonia'),('Cocina','Poder cocinar platillos, se necesita un cocinero o chef','1 Cuarto'),('Taller 1 y 2','Te permite Fabricar autos y repararlos, se necesita mecanico','1 Cuarto y 20 de Materiales'),('Enfermeria','Te permite dejar personas en descanso para su recuperacion','20 Medicinas y 30 de Materiales'),('Estacionamiento 1 y 2','Te permite dejar vehiculos','Colonia'),('Biblioteca','Te permite aprender mas rapido, +2 adicional en dado','1 Cuarto y 50 Libros'),('Cultivos','Te permite cultivar, se necesita agricultor','Colonia'),('Taller de armas','Fabricacion de Armas','1 Cuarto y 50 de Materiales'),('Establos','Te permite tener animale, pricipalmente caballos','Colonia'),('Taller de Inventos','Hacer todo tipo de cosas','1 Cuarto y 30 de Materiales'),('Area de Tiro','Adiciona +2 de Daño','Colonia'),('Laboratorio','Fabricacion de quimicos','1 Cuarto y 50 de Materiales'),('Casa','Donde vives','Tienes 4 Cuatros para construir'),('Mansion','Donde vives','Tienes 6 Cuatros para construir'),('Colonia','Donde vives','Tienes Infinidad de espacio para construir');
/*!40000 ALTER TABLE `construcciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habilidad`
--

DROP TABLE IF EXISTS `habilidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `habilidad` (
  `id_Personaje` int(11) DEFAULT NULL,
  `Nivel` enum('Nivel 1','Nivel 2','Nivel 3','Nivel 4','Nivel 5','Nivel 6') DEFAULT NULL,
  `Experiencia` int(11) DEFAULT NULL,
  `Habilidad` enum('Combate','Medica','Quimica','Saqueador','Tecnica (Ingeniosa)','Tirador') DEFAULT NULL,
  KEY `id_Personaje` (`id_Personaje`),
  CONSTRAINT `habilidad_ibfk_1` FOREIGN KEY (`id_Personaje`) REFERENCES `personaje` (`id_personaje`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habilidad`
--

LOCK TABLES `habilidad` WRITE;
/*!40000 ALTER TABLE `habilidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `habilidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insumos`
--

DROP TABLE IF EXISTS `insumos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `insumos` (
  `id_cont` int(11) NOT NULL AUTO_INCREMENT,
  `Agua` int(11) DEFAULT NULL,
  `Comida` int(11) DEFAULT NULL,
  `Combustible` int(11) DEFAULT NULL,
  `Medicina` int(11) DEFAULT NULL,
  `Municion` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_cont`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insumos`
--

LOCK TABLES `insumos` WRITE;
/*!40000 ALTER TABLE `insumos` DISABLE KEYS */;
/*!40000 ALTER TABLE `insumos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventarios`
--

DROP TABLE IF EXISTS `inventarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `inventarios` (
  `id_base` int(11) DEFAULT NULL,
  `Personaje1` varchar(50) DEFAULT NULL,
  `Personaje2` varchar(50) DEFAULT NULL,
  `Personaje3` varchar(50) DEFAULT NULL,
  `Personaje4` varchar(50) DEFAULT NULL,
  KEY `id_base` (`id_base`),
  CONSTRAINT `inventarios_ibfk_1` FOREIGN KEY (`id_base`) REFERENCES `base` (`id_base`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventarios`
--

LOCK TABLES `inventarios` WRITE;
/*!40000 ALTER TABLE `inventarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mistereggs`
--

DROP TABLE IF EXISTS `mistereggs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mistereggs` (
  `id_MisterEggs` int(11) DEFAULT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Descripcion` text,
  `Desbloqueado` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mistereggs`
--

LOCK TABLES `mistereggs` WRITE;
/*!40000 ALTER TABLE `mistereggs` DISABLE KEYS */;
INSERT INTO `mistereggs` VALUES (1,'Heroes','Haz desbloqueado Leyendas, Personajes y Villanos para tus historias','No'),(2,'La Leyenda','Has encontrado mas difilcutades para el modo combate en el juego','Si');
/*!40000 ALTER TABLE `mistereggs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `per_falso`
--

DROP TABLE IF EXISTS `per_falso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `per_falso` (
  `id_PerFalso` int(11) NOT NULL,
  `Salud` int(11) DEFAULT '0',
  `Cordura` int(11) DEFAULT '0',
  `Confianza` int(11) DEFAULT '0',
  PRIMARY KEY (`id_PerFalso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `per_falso`
--

LOCK TABLES `per_falso` WRITE;
/*!40000 ALTER TABLE `per_falso` DISABLE KEYS */;
INSERT INTO `per_falso` VALUES (1000,0,0,0),(1001,0,0,0),(1002,0,0,0);
/*!40000 ALTER TABLE `per_falso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personaje`
--

DROP TABLE IF EXISTS `personaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `personaje` (
  `nombre` varchar(50) DEFAULT NULL,
  `edad` varchar(2) DEFAULT NULL,
  `ciudad_de_origen` varchar(50) DEFAULT NULL,
  `fecha_nacimiento` varchar(30) DEFAULT NULL,
  `sexo` enum('Hombre','Mujer') DEFAULT NULL,
  `estatura` varchar(5) DEFAULT NULL,
  `estado_civil` enum('Soltero','Casado','Divorciado','Viudo','Comprometido','Union Libre','Noviazgo') DEFAULT NULL,
  `id_personaje` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_personaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personaje`
--

LOCK TABLES `personaje` WRITE;
/*!40000 ALTER TABLE `personaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `personaje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personaje_2`
--

DROP TABLE IF EXISTS `personaje_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `personaje_2` (
  `id_personaje` int(11) DEFAULT NULL,
  `Profesion` varchar(30) DEFAULT NULL,
  `Rasgo1` varchar(25) DEFAULT NULL,
  `Rasgo2` varchar(25) DEFAULT NULL,
  `Rasgo3` varchar(25) DEFAULT NULL,
  `Rasgo4` varchar(30) DEFAULT NULL,
  `Rasgo5` varchar(25) DEFAULT NULL,
  `idioma` varchar(100) DEFAULT NULL,
  KEY `id_personaje` (`id_personaje`),
  CONSTRAINT `personaje_2_ibfk_1` FOREIGN KEY (`id_personaje`) REFERENCES `personaje` (`id_personaje`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personaje_2`
--

LOCK TABLES `personaje_2` WRITE;
/*!40000 ALTER TABLE `personaje_2` DISABLE KEYS */;
INSERT INTO `personaje_2` VALUES (1,'Pintor','Inteligente','Suerte','Valiente','Instinto de Supervivencia','Bromista','InglésEspañol'),(2,'Ingeniero','Inteligente','Lider','Empatico','Corpulento','Paciente','Español'),(3,'Traductor e Interpretacion','Inteligente','Suerte','Confiado','Artes Marciales','Tirador Experto','InglésEspañolFrancésRusoAléman'),(4,'Bibliotecario','Agil/Veloz','Reflejos','Empatico','Instinto de Supervivencia','Tirador Experto','InglésEspañol'),(1,'Abogado','Inteligente','Reflejos','Valiente','Artes Marciales','Paciente','Español');
/*!40000 ALTER TABLE `personaje_2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recursos`
--

DROP TABLE IF EXISTS `recursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `recursos` (
  `Agua` int(11) DEFAULT NULL,
  `Comida` int(11) DEFAULT NULL,
  `Combustible` int(11) DEFAULT NULL,
  `Medicina` int(11) DEFAULT NULL,
  `Municion` int(11) DEFAULT NULL,
  `id_Base` int(11) DEFAULT NULL,
  KEY `id_Base` (`id_Base`),
  CONSTRAINT `recursos_ibfk_1` FOREIGN KEY (`id_Base`) REFERENCES `base` (`id_base`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recursos`
--

LOCK TABLES `recursos` WRITE;
/*!40000 ALTER TABLE `recursos` DISABLE KEYS */;
/*!40000 ALTER TABLE `recursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scc`
--

DROP TABLE IF EXISTS `scc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `scc` (
  `Salud` int(11) DEFAULT NULL,
  `Cordura` int(11) DEFAULT NULL,
  `Confianza` int(11) DEFAULT NULL,
  `id_Base` int(11) DEFAULT NULL,
  `id_Personaje` int(11) DEFAULT NULL,
  `id_perfalso` int(11) DEFAULT NULL,
  KEY `id_Base` (`id_Base`),
  KEY `id_Personaje` (`id_Personaje`),
  KEY `id_perfalso` (`id_perfalso`),
  CONSTRAINT `scc_ibfk_3` FOREIGN KEY (`id_Personaje`) REFERENCES `personaje` (`id_personaje`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `scc_ibfk_4` FOREIGN KEY (`id_perfalso`) REFERENCES `per_falso` (`id_perfalso`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scc`
--

LOCK TABLES `scc` WRITE;
/*!40000 ALTER TABLE `scc` DISABLE KEYS */;
/*!40000 ALTER TABLE `scc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vehiculos` (
  `id_Vehiculos` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre_Vehiculo` varchar(30) DEFAULT NULL,
  `Consumo_Dia` int(11) DEFAULT NULL,
  `Consumo_Hora` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_Vehiculos`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` VALUES (1,'Autos',24,1),(2,'Trailers',192,8),(3,'Camiones',168,7),(4,'Tanques',240,10),(5,'Lanchas',24,1),(6,'Botes',0,0),(7,'Helicopteros',72,3),(8,'Bicicletas',0,0),(9,'Motos',48,2),(10,'Submarinos',144,6),(11,'Aviones',120,5);
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'zombieworld'
--

--
-- Dumping routines for database 'zombieworld'
--
/*!50003 DROP FUNCTION IF EXISTS `Buscar_Recurso` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `Buscar_Recurso`() RETURNS int(11)
BEGIN
	declare recurso text;
declare resul text;
declare Final text;
        select ROUND(RAND() * 27 + 1) into recurso;
        select nombre from armas where id_armas = recurso into resul;
        RETURN resul;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `Contar_Armas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `Contar_Armas`() RETURNS int(11)
BEGIN
	declare cont int;
	select count(*) into cont from Armas;
RETURN cont;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `Contar_Base` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `Contar_Base`() RETURNS int(11)
BEGIN
	declare cont int;
	select count(*) into cont from Base;
RETURN cont;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `Contar_Personaje` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `Contar_Personaje`() RETURNS int(11)
BEGIN
	declare cont int;
	    select count(*) into cont from Personaje where edad != 0;

RETURN cont;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `Contar_Vehiculos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `Contar_Vehiculos`() RETURNS int(11)
BEGIN
	declare cont int;
	select count(*) into cont from Vehiculos;
RETURN cont;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Buscar_recursos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Buscar_recursos`()
BEGIN
	declare recurso int;
declare resul text;
        select ROUND(RAND() * 27 + 1) into recurso;
        select nombre from armas where id_armas = recurso into resul;
        select resul;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Eliminar_Personajes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Personajes`()
BEGIN

delete from Personaje;
SET FOREIGN_KEY_CHECKS=0;
TRUNCATE TABLE Personaje;
SET FOREIGN_KEY_CHECKS=1;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Generar_Recursos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Generar_Recursos`()
BEGIN
declare Comi int;
declare A int;
declare Combus int;
declare Muni int;
declare Medi int;
    SELECT ROUND(RAND() * 30) into Comi;
    SELECT ROUND(RAND() * 30) into A;
	SELECT ROUND(RAND() * 30) into Combus; 
    SELECT ROUND(RAND() * 30) into Muni;
    SELECT ROUND(RAND() * 30) into Medi;
     insert into insumos (Agua,Comida,Combustible,Medicina,Municion) values (Comi,A,Combus,Muni,Medi);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-09 23:03:16

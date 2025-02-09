CREATE DATABASE  IF NOT EXISTS `shopping_mall` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `shopping_mall`;
-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: shopping_mall
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `shop_member`
--

DROP TABLE IF EXISTS `shop_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop_member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_member`
--

LOCK TABLES `shop_member` WRITE;
/*!40000 ALTER TABLE `shop_member` DISABLE KEYS */;
INSERT INTO `shop_member` VALUES (1,'kk','kk','123','台北','2233','4466','2025-02-07 02:14:36','2025-02-07 02:14:36'),(2,'bb','bb','123','新北','1122','2222','2025-02-07 02:16:03','2025-02-09 03:27:30'),(3,'aa','aa','123','桃園','5566','7788','2025-02-07 02:16:03','2025-02-09 03:27:30'),(4,'jay','jay','123','台中','7711','1235','2025-02-07 02:16:03','2025-02-07 02:16:03'),(5,'tim','tim','3344','台南','5879','7893','2025-02-07 02:16:03','2025-02-07 02:16:03'),(6,'alice','alice','7788','花蓮','7891','7881','2025-02-07 02:29:29','2025-02-07 02:29:29'),(7,'amy','amy','7725','高雄','8753','8742','2025-02-07 02:29:29','2025-02-07 02:29:29'),(8,'jolin','jolin','123','台中','111','222','2025-02-07 11:54:42','2025-02-07 11:54:42'),(9,'brain','brain','123','花蓮','225','336','2025-02-07 12:04:31','2025-02-07 12:04:31'),(10,'ives','ives','124','新北','339','889','2025-02-07 12:07:08','2025-02-07 14:35:05'),(11,'steve','steve','123','新竹','333','444','2025-02-07 15:04:35','2025-02-07 15:04:35'),(12,'admin','admin','123','新北','999','999','2025-02-09 03:19:33','2025-02-09 03:19:33');
/*!40000 ALTER TABLE `shop_member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-09 11:52:15

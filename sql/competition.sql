-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: competition
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `lId` int NOT NULL AUTO_INCREMENT COMMENT '账号自增id',
  `lName` varchar(25) DEFAULT NULL COMMENT '登录名',
  `lPassword` varchar(25) DEFAULT NULL COMMENT '密码',
  `lPower` tinyint unsigned NOT NULL DEFAULT '2',
  PRIMARY KEY (`lId`),
  UNIQUE KEY `login_un` (`lName`),
  KEY `login_lid_idx` (`lId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'admin','admin',1),(2,'student','123.com',2),(3,'Mack','123.com',3),(4,'Jack','123.com',3),(5,'teacher','123.com',2);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `pId` int NOT NULL AUTO_INCREMENT COMMENT '项目id',
  `pName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目名称',
  `pSchResult` tinyint unsigned DEFAULT NULL COMMENT '校赛结果',
  `pEnProv` tinyint unsigned DEFAULT NULL COMMENT '是否进入省赛',
  `pProvResult` tinyint unsigned DEFAULT NULL COMMENT '省赛结果',
  `pEnNation` tinyint unsigned DEFAULT NULL COMMENT '是否进入国赛',
  `pNaResult` tinyint unsigned DEFAULT NULL COMMENT '国赛结果',
  PRIMARY KEY (`pId`),
  UNIQUE KEY `project_un` (`pName`),
  KEY `project_pid_idx` (`pId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='项目情况【主表】';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,'物流管理系统',3,0,NULL,NULL,NULL),(8,'后台管理系统',NULL,NULL,NULL,NULL,NULL),(9,'停车管理系统',3,NULL,NULL,NULL,NULL),(10,'税务管理系统',1,0,0,0,0),(12,'房屋管理系统',1,0,0,0,0),(13,'图书管理系统',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `sId` int NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `sName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '学生姓名',
  `sNumber` varchar(20) NOT NULL COMMENT '学生学号',
  `sMajor` varchar(100) DEFAULT NULL COMMENT '学生专业',
  `sCollege` varchar(100) DEFAULT NULL COMMENT '学生学院',
  `sPhone` varchar(33) DEFAULT NULL COMMENT '学生联系方式',
  `sManager` tinyint unsigned NOT NULL COMMENT '是否为队长',
  PRIMARY KEY (`sId`),
  KEY `student_sid_idx` (`sId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'张三','184312101','计算机','自动化学院','13534342366',1),(3,'王五','184312103','计算机','自动化学院','13413265542',0),(4,'周六','184312102','计算机','自动化学院','19824889432',2);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `tId` int NOT NULL AUTO_INCREMENT COMMENT '老师id',
  `tName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '老师姓名',
  `tPhone` varchar(33) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '老师联系方式',
  `tNumber` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '老师工号',
  PRIMARY KEY (`tId`),
  UNIQUE KEY `teacher_un` (`tNumber`),
  KEY `teacher_tid_idx` (`tId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `united`
--

DROP TABLE IF EXISTS `united`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `united` (
  `tId` int NOT NULL COMMENT '老师id',
  `sId` int NOT NULL COMMENT '学生id',
  `pId` int NOT NULL COMMENT '学生项目id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='将老师、学生、项目的id建立一张表，方便组合查询';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `united`
--

LOCK TABLES `united` WRITE;
/*!40000 ALTER TABLE `united` DISABLE KEYS */;
/*!40000 ALTER TABLE `united` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'competition'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-27 15:36:50

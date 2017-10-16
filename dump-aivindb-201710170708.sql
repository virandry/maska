-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: localhost    Database: aivindb
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `articles`
--

DROP TABLE IF EXISTS `articles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `articles` (
  `article_id` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `category` varchar(100) NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articles`
--

LOCK TABLES `articles` WRITE;
/*!40000 ALTER TABLE `articles` DISABLE KEYS */;
INSERT INTO `articles` VALUES (1,'Java Concurrency','Java'),(2,'Hibernate HQL ','Hibernate'),(3,'Spring MVC with Hibernate','Spring');
/*!40000 ALTER TABLE `articles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `category_id` varchar(10) NOT NULL,
  `category_name` varchar(100) NOT NULL,
  `modified_by` varchar(100) NOT NULL,
  `modified_time` datetime NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES ('BOT','Bottom','Andry','2017-10-16 15:52:37',1),('KAI','Kain','Andry','2017-10-16 15:52:37',1),('TOP','Top','Andry','2017-10-16 15:52:37',1);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `currency`
--

DROP TABLE IF EXISTS `currency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `currency` (
  `currency_id` varchar(10) NOT NULL,
  `currency_name` varchar(100) NOT NULL,
  `currency_symbol` varchar(100) NOT NULL,
  `country_id` varchar(10) NOT NULL,
  `modified_by` varchar(100) NOT NULL,
  `modified_time` datetime NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`currency_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currency`
--

LOCK TABLES `currency` WRITE;
/*!40000 ALTER TABLE `currency` DISABLE KEYS */;
INSERT INTO `currency` VALUES ('IDR','Indonesia Rupiah','Rp','ID','Andry','2017-10-16 15:52:37',1),('MYR','Ringgit Malaysia','RM','MY','Andry','2017-10-16 15:52:37',1);
/*!40000 ALTER TABLE `currency` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail`
--

DROP TABLE IF EXISTS `detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detail` (
  `detail_id` varchar(10) NOT NULL,
  `detail_name` varchar(100) NOT NULL,
  `modified_by` varchar(100) NOT NULL,
  `modified_time` datetime NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail`
--

LOCK TABLES `detail` WRITE;
/*!40000 ALTER TABLE `detail` DISABLE KEYS */;
INSERT INTO `detail` VALUES ('COL','Color','Andry','2017-10-16 15:52:37',1),('DIM','Dimension','Andry','2017-10-16 15:52:37',1),('LEN','Length','Andry','2017-10-16 15:52:37',1),('TYP','Type','Andry','2017-10-16 15:52:37',1),('WID','Width','Andry','2017-10-16 15:52:37',1);
/*!40000 ALTER TABLE `detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) NOT NULL,
  `product_desc` varchar(200) DEFAULT NULL,
  `sub_category_id` varchar(10) NOT NULL,
  `price` bigint(20) NOT NULL,
  `currency_id` varchar(10) NOT NULL,
  `modified_by` varchar(100) NOT NULL,
  `modified_time` datetime NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT '1',
  `sell_price` varchar(100) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `preorder_quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `product_currency_FK` (`currency_id`),
  KEY `product_subcategory_FK` (`sub_category_id`),
  CONSTRAINT `product_currency_FK` FOREIGN KEY (`currency_id`) REFERENCES `currency` (`currency_id`),
  CONSTRAINT `product_subcategory_FK` FOREIGN KEY (`sub_category_id`) REFERENCES `subcategory` (`sub_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Batik Corak Garis','desc','BAH',10,'MYR','Andry','2017-10-16 15:52:37',1,'20',15,0),(2,'Batik Corak Burung','desc','BAH',13,'MYR','Andry','2017-10-16 15:52:37',1,'30',18,0),(3,'Batik Tipis','desc','BAL',19,'MYR','Andry','2017-10-16 15:52:37',1,'22',15,0),(4,'Jaket Polos','desc','JAC',11,'MYR','Andry','2017-10-16 15:52:37',1,'20',19,0),(5,'T-Shirt Thor','desc','TSH',10,'MYR','Andry','2017-10-16 15:52:37',1,'15',0,0),(6,'Kaos Polos','desc','TSH',6,'MYR','Andry','2017-10-16 15:52:37',1,'4',15,0),(7,'Example 1','desc','BAH',10,'MYR','Andry','2017-10-16 15:52:37',1,'20',15,0),(8,'Example 2','desc','COT',10,'MYR','Andry','2017-10-16 15:52:37',1,'20',1,0),(9,'Example 3','desc','FAU',40,'MYR','Andry','2017-10-16 15:52:37',1,'50',15,0),(10,'Example 4','desc','COT',30,'MYR','Andry','2017-10-16 15:52:37',1,'65',3,0),(11,'Example 5','desc','COT',37,'MYR','Andry','2017-10-16 15:52:37',1,'57',15,0),(12,'Example 6','desc','SHB',67,'MYR','Andry','2017-10-16 15:52:37',1,'90',15,30),(13,'Example 7','desc','FAU',70,'MYR','Andry','2017-10-16 15:52:37',1,'98',20,20),(14,'Example 8','desc','SHO',21,'MYR','Andry','2017-10-16 15:52:37',1,'33',15,11),(15,'Example 9','desc','SHO',5,'MYR','Andry','2017-10-16 15:52:37',1,'15',15,0);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcategory`
--

DROP TABLE IF EXISTS `subcategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subcategory` (
  `sub_category_id` varchar(10) NOT NULL,
  `sub_category_name` varchar(100) NOT NULL,
  `category_id` varchar(10) NOT NULL,
  `modified_by` varchar(100) NOT NULL,
  `modified_time` datetime NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`sub_category_id`),
  KEY `subcategory_category_FK` (`category_id`),
  CONSTRAINT `subcategory_category_FK` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcategory`
--

LOCK TABLES `subcategory` WRITE;
/*!40000 ALTER TABLE `subcategory` DISABLE KEYS */;
INSERT INTO `subcategory` VALUES ('BAH','High Quality Batik','KAI','Andry','2017-10-16 15:52:37',1),('BAL','Low Quality Batik','KAI','Andry','2017-10-16 15:52:37',1),('BAM','Medium Quality Batik','KAI','Andry','2017-10-16 15:52:37',1),('COT','Cotton','KAI','Andry','2017-10-16 15:52:37',1),('DRE','Dress','TOP','Andry','2017-10-16 15:52:37',1),('FAU','Faux Leather','KAI','Andry','2017-10-16 15:52:37',1),('JAC','Jacket','TOP','Andry','2017-10-16 15:52:37',1),('JEA','Jeans','BOT','Andry','2017-10-16 15:52:37',1),('SHB','Shirts & Blouse','TOP','Andry','2017-10-16 15:52:37',1),('SHO','Shorts','BOT','Andry','2017-10-16 15:52:37',1),('SKI','Skirt','BOT','Andry','2017-10-16 15:52:37',1),('SWE','Sweats','TOP','Andry','2017-10-16 15:52:37',1),('TRO','Trousers','BOT','Andry','2017-10-16 15:52:37',1),('TSH','T-Shirt','TOP','Andry','2017-10-16 15:52:37',1);
/*!40000 ALTER TABLE `subcategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subdetail`
--

DROP TABLE IF EXISTS `subdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subdetail` (
  `sub_detail_id` varchar(10) NOT NULL,
  `sub_detail_name` varchar(100) NOT NULL,
  `detail_id` varchar(10) NOT NULL,
  `product_id` int(11) NOT NULL,
  `modified_by` varchar(100) NOT NULL,
  `modified_time` datetime NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`sub_detail_id`),
  KEY `subdetail_detail_FK` (`detail_id`),
  KEY `subdetail_product_FK` (`product_id`),
  CONSTRAINT `subdetail_detail_FK` FOREIGN KEY (`detail_id`) REFERENCES `detail` (`detail_id`),
  CONSTRAINT `subdetail_product_FK` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subdetail`
--

LOCK TABLES `subdetail` WRITE;
/*!40000 ALTER TABLE `subdetail` DISABLE KEYS */;
INSERT INTO `subdetail` VALUES ('blu','Blue','COL',1,'Andry','2017-10-16 15:52:37',1),('d10','10cm x 10cm with 2cm thickness','DIM',2,'Andry','2017-10-16 15:52:37',1),('d20','20cm x 20cm','DIM',14,'Andry','2017-10-16 15:52:37',1),('l11','1.15 m','WID',1,'Andry','2017-10-16 15:52:37',1),('l15','1.5 m','LEN',1,'Andry','2017-10-16 15:52:37',1),('los','Long Sleeves','TYP',12,'Andry','2017-10-16 15:52:37',1),('pur','Purple','COL',1,'Andry','2017-10-16 15:52:37',1),('red','Red','COL',1,'Andry','2017-10-16 15:52:37',1),('shs','Short Sleeves','TYP',12,'Andry','2017-10-16 15:52:37',1);
/*!40000 ALTER TABLE `subdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `role_id` int(11) NOT NULL,
  `role_name` varchar(100) NOT NULL,
  `role_scope` varchar(100) NOT NULL,
  `modified_by` varchar(100) NOT NULL,
  `modified_time` datetime NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userauth`
--

DROP TABLE IF EXISTS `userauth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userauth` (
  `username` int(11) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `role_id` int(11) NOT NULL,
  `user_password` varchar(500) NOT NULL,
  `modified_by` varchar(100) NOT NULL,
  `modified_time` datetime NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`username`),
  KEY `userauth_user_role_FK` (`role_id`),
  CONSTRAINT `userauth_user_role_FK` FOREIGN KEY (`role_id`) REFERENCES `user_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userauth`
--

LOCK TABLES `userauth` WRITE;
/*!40000 ALTER TABLE `userauth` DISABLE KEYS */;
/*!40000 ALTER TABLE `userauth` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'aivindb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-17  7:08:09

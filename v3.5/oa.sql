/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.62-community : Database - oa
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`oa` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `oa`;

/*Table structure for table `alonework` */

DROP TABLE IF EXISTS `alonework`;

CREATE TABLE `alonework` (
  `todoId` int(11) NOT NULL AUTO_INCREMENT,
  `staId` int(11) DEFAULT NULL,
  `todoTitle` varchar(300) DEFAULT NULL,
  `todoContent` varchar(300) DEFAULT NULL COMMENT '注意说明',
  `todoCreate` datetime DEFAULT NULL,
  `todoType` varchar(100) DEFAULT NULL,
  `todoimpor` varchar(300) DEFAULT NULL,
  `todoFile` varchar(300) DEFAULT NULL COMMENT '附件文件',
  `todoServerName` varchar(500) DEFAULT NULL COMMENT '服务器名称',
  `createAuthor` varchar(500) DEFAULT NULL COMMENT '添加人',
  PRIMARY KEY (`todoId`),
  KEY `FK_statoalone` (`staId`),
  CONSTRAINT `FK_statoalone` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `alonework` */

insert  into `alonework`(`todoId`,`staId`,`todoTitle`,`todoContent`,`todoCreate`,`todoType`,`todoimpor`,`todoFile`,`todoServerName`,`createAuthor`) values (1,1,'周末去上海分公司视察工作','为期一个月','2017-04-13 16:10:42','1','1',NULL,NULL,'罗康元'),(2,1,'这一周将某某公司的方案做出来','好好加油哟','2017-04-19 19:15:14','2','2',NULL,NULL,'罗康元'),(3,1,'整理今年公司的客户资料','注意将联系少的特别标记','2017-04-20 19:20:09','1','3',NULL,NULL,'罗康元'),(5,1,'周一上海出差','文件准备齐全','2017-04-04 20:51:39','1','1','无附件','无附件','罗康元'),(6,1,'明天准备开会材料','注意材料的正确性','2017-04-04 20:52:42','1','2',NULL,NULL,'罗康元'),(7,1,'明天准备开会材料','注意材料的正确性','2017-04-04 20:52:42','1','2','无附件','无附件','罗康元'),(8,1,'星期二下午开会发言','提前准备稿子','2017-04-04 21:00:12','1','2','开题报告.docx','8b995578-87be-46d8-a1ef-13c142581eda.docx','罗康元'),(9,2,'整理上月的财务报表','注意报账的时间','2017-04-20 21:04:22','1','1','无附件','无附件','陈师兄'),(10,2,'交换机和规划','韩国客户给','2017-04-05 15:06:11','1','2','无附件','无附件','罗康元'),(11,2,'交换机和规划','韩国客户给','2017-04-05 15:08:11','1','2','程序员的SQL金典(完整).pdf','e1802272-62e3-466d-9106-9aa161b2f94f.pdf','罗康元'),(12,2,'就恢复快','发货后鼓风机','2017-04-05 15:10:40','1','3','无附件','无附件','罗康元'),(13,2,'就恢复快','发货后鼓风机','2017-04-05 15:11:25','1','3','无附件','无附件','罗康元'),(14,2,'一库一库','和恐惧了，','2017-04-05 15:13:41','1','3','IntelliJ-IDEA13基础教程.pdf','3b4e5c7c-6ff6-4078-8a1b-6f7c1f9c1f69.pdf','罗康元'),(15,2,'发货人挺好','人太好听','2017-04-05 15:24:00','1','1','无附件','无附件','罗康元'),(16,2,'加好友加一块','回家提提意见','2017-04-05 15:29:44','1','2','无附件','无附件','罗康元'),(17,1,'电话','二货人体','2017-04-05 15:30:30','1','1','无附件','无附件','罗康元'),(18,2,'发货发货呢','女发给你','2017-04-05 15:33:17','1','3','无附件','无附件','罗康元'),(19,2,'部分的干部','部分功能','2017-04-05 15:33:43','1','2','无附件','无附件','罗康元'),(20,2,'的公司的打工','被对方改变对方','2017-04-05 15:35:33','1','1','无附件','无附件','罗康元'),(21,6,'梵蒂冈地方和','打不动人工','2017-04-05 16:02:05','1','3','无附件','无附件','罗康元'),(22,10,'国际化提建议汉库克，','半夜枯木','2017-04-06 08:52:00','1','2','IntelliJ-IDEA13基础教程.pdf','45641bb2-de2f-4af9-b5e1-4bb3f11501c4.pdf','罗康元');

/*Table structure for table `archivefile` */

DROP TABLE IF EXISTS `archivefile`;

CREATE TABLE `archivefile` (
  `archId` int(11) NOT NULL,
  `staId` int(11) DEFAULT NULL,
  `archNumber` varchar(256) DEFAULT NULL,
  `archType` varchar(125) DEFAULT NULL,
  `archGnumber` varchar(256) DEFAULT NULL,
  `archHnumber` varchar(100) DEFAULT NULL,
  `archAnumber` varchar(256) DEFAULT NULL,
  `archSecurity` varchar(200) DEFAULT NULL,
  `archName` varchar(256) DEFAULT NULL,
  `archCreate` datetime DEFAULT NULL,
  `archYear` varchar(256) DEFAULT NULL,
  `archRemark` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`archId`),
  KEY `FK_statoarc` (`staId`),
  CONSTRAINT `FK_statoarc` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `archivefile` */

/*Table structure for table `calendars` */

DROP TABLE IF EXISTS `calendars`;

CREATE TABLE `calendars` (
  `calendarId` int(11) NOT NULL AUTO_INCREMENT,
  `staId` int(11) DEFAULT NULL,
  `calendaName` varchar(300) NOT NULL,
  `calendaContent` varchar(300) DEFAULT NULL,
  `calendaRemark` varchar(400) DEFAULT NULL,
  `calendaStartTime` datetime DEFAULT NULL,
  `calendaEndTime` datetime DEFAULT NULL,
  `calendaType` varchar(100) DEFAULT NULL,
  `calendaOne` varchar(100) DEFAULT NULL,
  `calendaCreate` datetime DEFAULT NULL,
  `calendaFile` varchar(300) DEFAULT NULL,
  `calendServerName` varchar(300) DEFAULT NULL,
  `createAuthor` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`calendarId`),
  KEY `FK_statoday` (`staId`),
  CONSTRAINT `FK_statoday` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `calendars` */

insert  into `calendars`(`calendarId`,`staId`,`calendaName`,`calendaContent`,`calendaRemark`,`calendaStartTime`,`calendaEndTime`,`calendaType`,`calendaOne`,`calendaCreate`,`calendaFile`,`calendServerName`,`createAuthor`) values (1,1,'北京学习','周一坐飞机去北京总公司学习，为期一个月','注意将学习内容整理。','2017-04-19 16:17:21','2017-04-11 16:17:23','1','1','2017-04-05 16:17:36','无附件','无附件','罗康元'),(2,1,'跟对方公司的股份吧','都发给别人发货人','百度白癜风吧发布的风的广泛地很费劲不符合','2017-04-11 14:58:04','2017-04-20 14:58:10','1','1','2017-04-11 14:35:18','无附件','无附件','罗康元'),(3,1,'那个发你放好后','改变观念和提高','百度白癜风吧发布的风的广泛地很费劲不符合','2017-04-11 14:58:04','2017-04-20 14:58:10','1','1','2017-04-11 14:42:27','无附件','无附件','罗康元'),(4,1,'划分涣发大号','大部分的后代','百度白癜风吧发布的风的广泛地很费劲不符合','2017-04-11 14:58:04','2017-04-20 14:58:10','1','2','2017-04-11 14:58:36','无附件','无附件','罗康元'),(5,1,'上海学习','周一去上海分公司做调研','打个比方成交价接口固定筹备会突然部分价格','2017-04-11 15:20:13','2017-04-19 15:20:15','1','3','2017-04-11 15:20:36','最新尚硅谷视频打包地址（不对外）.docx','cd5fd192-c0ba-417e-ad23-8cecb8899be1.docx','罗康元'),(6,1,'日本工作','周三去日本东京分公司人事部上班','很简单就快点发空间客户很久后打开和计算机房','2017-04-12 15:25:13','2018-03-28 15:25:16','1','2','2017-04-11 15:26:07','项目开发流程和分工职责.docx','caabdcfb-e36f-4629-b225-7d2869f1bcdc.docx','罗康元'),(7,1,'看了学习','䴚的续保的发布','个地方官个地方官电饭锅电饭锅电饭锅电饭锅和飞哥哥打不打副本','2017-04-12 16:07:37','2017-04-12 16:07:40','1','1','2017-04-11 16:08:26','平台使用注意事项.docx','f0a8f1fa-afb0-4c10-b414-51243652c30a.docx','罗康元'),(8,1,'报辅导班','不放过刚刚的发挥','地方干部的隔阂个地方官的发挥','2017-04-11 16:09:00','2017-04-26 16:09:02','1','3','2017-04-11 16:09:27','项目开发流程和分工职责.docx','a7eee573-78bc-4e2b-b349-0aa7fdc0eced.docx','罗康元'),(9,6,'落叶','落叶','接口能够尽快你们好吗','2017-04-10 14:55:11','2017-04-19 14:55:14','1','1','2017-04-13 14:55:32','Android学习笔记.docx','61796d6e-a69f-4bfb-9a4c-d78155ae56f1.docx','罗爷');

/*Table structure for table `calfile` */

DROP TABLE IF EXISTS `calfile`;

CREATE TABLE `calfile` (
  `calFileId` int(11) NOT NULL,
  `calendarId` int(11) DEFAULT NULL,
  `calFileName` varchar(300) DEFAULT NULL,
  `calFileType` varchar(300) DEFAULT NULL,
  `calFileSize` varchar(300) DEFAULT NULL,
  `calFileServerName` varchar(300) DEFAULT NULL,
  `calFileTime` datetime DEFAULT NULL,
  `calFileuserId` int(11) DEFAULT NULL,
  PRIMARY KEY (`calFileId`),
  KEY `FK_daytoedu` (`calendarId`),
  CONSTRAINT `FK_daytoedu` FOREIGN KEY (`calendarId`) REFERENCES `calendars` (`calendarId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `calfile` */

/*Table structure for table `companynews` */

DROP TABLE IF EXISTS `companynews`;

CREATE TABLE `companynews` (
  `newsId` int(11) NOT NULL,
  `staId` int(11) DEFAULT NULL,
  `newsTitlle` varchar(200) DEFAULT NULL,
  `NewsContent` varchar(400) DEFAULT NULL,
  `NewsCreate` datetime DEFAULT NULL,
  `NewsSmaill` varchar(200) DEFAULT NULL,
  `NewsMain` varchar(200) DEFAULT NULL,
  `NewsUser` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`newsId`),
  KEY `FK_statonews` (`staId`),
  CONSTRAINT `FK_statonews` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `companynews` */

/*Table structure for table `complaexam` */

DROP TABLE IF EXISTS `complaexam`;

CREATE TABLE `complaexam` (
  `examId` int(11) NOT NULL,
  `staId` int(11) DEFAULT NULL,
  `examTitle` varchar(230) DEFAULT NULL,
  `examContent` varchar(230) DEFAULT NULL,
  `examTime` datetime DEFAULT NULL,
  `examtwo` varchar(230) DEFAULT NULL,
  `examWord` varchar(230) DEFAULT NULL,
  `examAuthoe` varchar(230) DEFAULT NULL,
  PRIMARY KEY (`examId`),
  KEY `FK_statoexam` (`staId`),
  CONSTRAINT `FK_statoexam` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `complaexam` */

/*Table structure for table `dept` */

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `deptId` int(11) NOT NULL AUTO_INCREMENT,
  `deptNumber` varchar(150) DEFAULT NULL,
  `deptName` varchar(200) DEFAULT NULL,
  `deptRemark` varchar(400) DEFAULT NULL,
  `deptCreate` date DEFAULT NULL,
  PRIMARY KEY (`deptId`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `dept` */

insert  into `dept`(`deptId`,`deptNumber`,`deptName`,`deptRemark`,`deptCreate`) values (1,'000101','数据分析部','a)项目范围、项目质量、项目时间、项目成本的确认。','2017-03-18'),(2,'000102','软件开发部','a)项目范围、项目质量、项目时间、项目成本的确认。苟富贵','2017-03-15'),(3,'000201','人事管理部','a)项目范围、项目质量、项目时间、项目成本的确认。','2017-03-21'),(4,'000301','市场分析部','a)项目范围、项目质量、项目时间、项目成本的确认。','2017-03-07'),(5,'000302','产品销售部','a)项目范围、项目质量、项目时间、项目成本的确认。','2017-03-22'),(6,'0001','技术部','a)项目范围、项目质量、项目时间、项目成本的确认。','2017-03-21'),(7,'0002','行政部','a)项目范围、项目质量、项目时间、项目成本的确认。','2017-03-15'),(8,'0003','市场部','a)项目范围、项目质量、项目时间、项目成本的确认。','2017-03-23'),(9,'00','总裁办公室','a)项目范围、项目质量、项目时间、项目成本的确认。','2017-03-23'),(10,'000103','软件测试部','a)项目范围、项目质量、项目时间、项目成本的确认。','2017-04-19'),(18,'000104','软件一部','成功的风格的非官方的更符合法规与','2017-03-28');

/*Table structure for table `document` */

DROP TABLE IF EXISTS `document`;

CREATE TABLE `document` (
  `fileId` int(11) NOT NULL,
  `staId` int(11) DEFAULT NULL,
  `fileTitle` varchar(100) DEFAULT NULL,
  `fileName` varchar(200) DEFAULT NULL,
  `fileRemark` varchar(300) DEFAULT NULL,
  `fileServerName` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`fileId`),
  KEY `FK_statofile` (`staId`),
  CONSTRAINT `FK_statofile` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `document` */

/*Table structure for table `email` */

DROP TABLE IF EXISTS `email`;

CREATE TABLE `email` (
  `emailId` int(11) NOT NULL,
  `staId` int(11) DEFAULT NULL,
  `emailName` varchar(200) DEFAULT NULL,
  `emailContent` varchar(200) DEFAULT NULL,
  `emailAuthor` varchar(200) DEFAULT NULL,
  `emailCreate` datetime DEFAULT NULL,
  `emailNumber` varchar(30) DEFAULT NULL,
  `emailType` varchar(200) DEFAULT NULL,
  `emailDept` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`emailId`),
  KEY `FK_statoemail` (`staId`),
  CONSTRAINT `FK_statoemail` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `email` */

/*Table structure for table `emailfile` */

DROP TABLE IF EXISTS `emailfile`;

CREATE TABLE `emailfile` (
  `emailFileId` int(11) NOT NULL,
  `emailId` int(11) DEFAULT NULL,
  `emailFileName` varchar(300) DEFAULT NULL,
  `emailFileType` varchar(300) DEFAULT NULL,
  `emailFileSize` varchar(300) DEFAULT NULL,
  `emailFileServcer` varchar(300) DEFAULT NULL,
  `emailFileCreate` datetime DEFAULT NULL,
  `emailFileAuthor` varchar(300) DEFAULT NULL,
  `emailFileDowNumer` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`emailFileId`),
  KEY `FK_emailtoedu` (`emailId`),
  CONSTRAINT `FK_emailtoedu` FOREIGN KEY (`emailId`) REFERENCES `email` (`emailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `emailfile` */

/*Table structure for table `examimage` */

DROP TABLE IF EXISTS `examimage`;

CREATE TABLE `examimage` (
  `examImageId` int(11) NOT NULL,
  `examId` int(11) DEFAULT NULL,
  `examImageName` varchar(245) DEFAULT NULL,
  `examImageServer` varchar(245) DEFAULT NULL,
  `examImageSize` varchar(245) DEFAULT NULL,
  `examImageCreate` datetime DEFAULT NULL,
  `examImageAuthor` varchar(245) DEFAULT NULL,
  PRIMARY KEY (`examImageId`),
  KEY `FK_examtoedu` (`examId`),
  CONSTRAINT `FK_examtoedu` FOREIGN KEY (`examId`) REFERENCES `complaexam` (`examId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `examimage` */

/*Table structure for table `job` */

DROP TABLE IF EXISTS `job`;

CREATE TABLE `job` (
  `jobId` int(11) NOT NULL AUTO_INCREMENT,
  `jobName` varchar(200) DEFAULT NULL,
  `jobRemark` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`jobId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `job` */

insert  into `job`(`jobId`,`jobName`,`jobRemark`) values (1,'数据分析师','分析数据');

/*Table structure for table `leaveass` */

DROP TABLE IF EXISTS `leaveass`;

CREATE TABLE `leaveass` (
  `leaveassId` int(11) NOT NULL,
  `leaveId` int(11) DEFAULT NULL,
  `staId` int(11) DEFAULT NULL,
  `leaveassSeason` varchar(400) DEFAULT NULL,
  `leaveassTime` datetime DEFAULT NULL,
  `leaveassRemark` varchar(400) DEFAULT NULL,
  `leaveassDiss` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`leaveassId`),
  KEY `FK_lavetoexa2` (`leaveId`),
  KEY `FK_statoass` (`staId`),
  CONSTRAINT `FK_lavetoexa2` FOREIGN KEY (`leaveId`) REFERENCES `staleave` (`leaveId`),
  CONSTRAINT `FK_statoass` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `leaveass` */

/*Table structure for table `newimage` */

DROP TABLE IF EXISTS `newimage`;

CREATE TABLE `newimage` (
  `imageId` int(11) NOT NULL,
  `newsId` int(11) DEFAULT NULL,
  `imageName` varchar(180) DEFAULT NULL,
  `imageServiceName` varchar(180) DEFAULT NULL,
  `imageSize` varchar(180) DEFAULT NULL,
  `imageCreate` datetime DEFAULT NULL,
  `imageAuthor` varchar(180) DEFAULT NULL,
  PRIMARY KEY (`imageId`),
  KEY `FK_newstoimage` (`newsId`),
  CONSTRAINT `FK_newstoimage` FOREIGN KEY (`newsId`) REFERENCES `companynews` (`newsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `newimage` */

/*Table structure for table `newsfile` */

DROP TABLE IF EXISTS `newsfile`;

CREATE TABLE `newsfile` (
  `newFileId` int(11) NOT NULL,
  `newsId` int(11) DEFAULT NULL,
  `newFileName` varchar(200) DEFAULT NULL,
  `newFileSize` varchar(150) DEFAULT NULL,
  `newFileType` varchar(200) DEFAULT NULL,
  `newFileService` varchar(300) DEFAULT NULL,
  `newFileCreate` datetime DEFAULT NULL,
  `newFileAuthor` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`newFileId`),
  KEY `FK_newtoedu` (`newsId`),
  CONSTRAINT `FK_newtoedu` FOREIGN KEY (`newsId`) REFERENCES `companynews` (`newsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `newsfile` */

/*Table structure for table `notice` */

DROP TABLE IF EXISTS `notice`;

CREATE TABLE `notice` (
  `noticeId` int(11) NOT NULL AUTO_INCREMENT,
  `staId` int(11) DEFAULT NULL,
  `noticeTitle` varchar(200) DEFAULT NULL,
  `noticeContent` varchar(400) DEFAULT NULL,
  `noticeTime` date DEFAULT NULL,
  `noticeType` varchar(200) DEFAULT NULL,
  `noticeAttachs` int(11) DEFAULT NULL,
  `noticeArea` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`noticeId`),
  KEY `FK_statonotice` (`staId`),
  CONSTRAINT `FK_statonotice` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

/*Data for the table `notice` */

insert  into `notice`(`noticeId`,`staId`,`noticeTitle`,`noticeContent`,`noticeTime`,`noticeType`,`noticeAttachs`,`noticeArea`) values (1,1,'公司关于2017年发展计划详情','公司关于2017年发展计划详情','2017-03-16','公司目标',1,'全体员工'),(2,1,'全体员工明天上午9:00开会','全体员工明天上午9:00开会','2017-03-22','公司会议',0,'全体员工'),(36,1,'明天不发奖金',NULL,'2017-03-21','公司计划',0,'数据分析部'),(37,1,'明天放假',NULL,'2017-03-21','奖惩规定',0,'全体员工'),(38,1,'明天发奖金，早到者奖励二十万',NULL,'2017-03-22','部门会议',0,'软件开发部'),(39,1,'明天发奖金，早到者奖励二十万',NULL,'2017-03-22','部门会议',0,'数据分析部'),(40,1,'各部门引导员工学习公司相关制度',NULL,'2017-03-22','规章制度',NULL,'人事管理部'),(41,1,'各部门严格执行',NULL,'2017-03-22','规章制度',NULL,'市场分析部'),(42,1,'2017清明节放假安排，大家节日快乐',NULL,'2017-03-22','放假安排',0,'市场分析部'),(43,1,'2017清明节放假安排，大家节日快乐',NULL,'2017-03-22','放假安排',0,'技术部'),(47,1,'公司员工通讯录，方便相互联系',NULL,'2017-03-22','规章制度',NULL,'全体员工'),(48,1,'公司客户通讯录，保持好形象',NULL,'2017-03-22','放假安排',NULL,'行政部'),(49,1,'功夫功夫好刚恢复人体后给对方和规范个人',NULL,'2017-03-30','公司会议',NULL,'全体员工'),(50,1,'非工程法规 发鬼地方个 发给撒大哥的大哥',NULL,'2017-03-30','部门会议',0,'软件开发部');

/*Table structure for table `noticebulletins` */

DROP TABLE IF EXISTS `noticebulletins`;

CREATE TABLE `noticebulletins` (
  `bullId` int(11) NOT NULL AUTO_INCREMENT,
  `noticeId` int(11) DEFAULT NULL,
  `bullCreate` datetime DEFAULT NULL,
  `bullName` varchar(200) DEFAULT NULL,
  `BullType` varchar(200) DEFAULT NULL,
  `BullServerName` varchar(200) DEFAULT NULL,
  `bullSize` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`bullId`),
  KEY `FK_noticetoenc` (`noticeId`),
  CONSTRAINT `FK_noticetoenc` FOREIGN KEY (`noticeId`) REFERENCES `notice` (`noticeId`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

/*Data for the table `noticebulletins` */

insert  into `noticebulletins`(`bullId`,`noticeId`,`bullCreate`,`bullName`,`BullType`,`BullServerName`,`bullSize`) values (1,1,'2017-03-14 16:20:15','公司2017奋斗目标','application/msword','18572-2482-5285.jpg','520kb'),(2,2,'2017-03-14 16:22:53','程序员的SQL金典(完整).pdf','application/pdf','f3ef0af3-d7d9-49d4-b5de-aaa6f1156416.pdf','1777169KB'),(30,36,'2017-03-21 17:25:41','无附件','无附件','无附件','无附件'),(31,37,'2017-03-21 17:27:04','无附件','无附件','无附件','无附件'),(32,38,'2017-03-22 11:54:34','无附件','无附件','无附件','无附件'),(33,39,'2017-03-22 11:54:34','无附件','无附件','无附件','无附件'),(34,40,'2017-03-22 13:51:57','程序员的SQL金典(完整).pdf','application/pdf','0f01aa81-9fdb-45dd-bbd9-63eb726c62b6.pdf','1777169KB'),(35,41,'2017-03-22 13:55:16','需求说明书.doc','application/msword','39006f20-0940-49bb-a75b-002be4644fce.doc','1071616KB'),(36,42,'2017-03-22 13:56:47','无附件','无附件','无附件','无附件'),(37,43,'2017-03-22 13:56:47','无附件','无附件','无附件','无附件'),(41,47,'2017-03-22 15:52:41','公司通讯录.rar','application/octet-stream','a9f6c392-5497-412c-8b37-971b9b76f9ab.rar','6207KB'),(42,48,'2017-03-22 15:53:37','公司通讯录.xlsx','application/vnd.openxmlformats-officedocument.spreadsheetml.sheet','b806b648-fa08-48e6-b9c8-a2a70cfce743.xlsx','9879KB'),(43,49,'2017-03-30 16:06:34','IntelliJ-IDEA13基础教程.pdf','application/pdf','a06080f6-4856-4a02-95d8-fa112e061de0.pdf','3940026KB'),(44,50,'2017-03-30 16:06:52','无附件','无附件','无附件','无附件');

/*Table structure for table `noticedetial` */

DROP TABLE IF EXISTS `noticedetial`;

CREATE TABLE `noticedetial` (
  `noticeDetailId` int(11) NOT NULL,
  `noticeId` int(11) DEFAULT NULL,
  `noticeDetaiUser` varchar(200) DEFAULT NULL,
  `noticeDetaiTime` datetime DEFAULT NULL,
  `noticeDetaiNumber` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`noticeDetailId`),
  KEY `FK_noticetodetial` (`noticeId`),
  CONSTRAINT `FK_noticetodetial` FOREIGN KEY (`noticeId`) REFERENCES `notice` (`noticeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `noticedetial` */

/*Table structure for table `noticetype` */

DROP TABLE IF EXISTS `noticetype`;

CREATE TABLE `noticetype` (
  `ntid` int(11) NOT NULL AUTO_INCREMENT,
  `ntname` varchar(200) DEFAULT NULL,
  `ntcreate` date DEFAULT NULL,
  `ntauthor` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ntid`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `noticetype` */

insert  into `noticetype`(`ntid`,`ntname`,`ntcreate`,`ntauthor`) values (1,'公司会议','2017-03-15','罗康元'),(2,'部门会议','2017-03-14','罗康元'),(3,'规章制度','2017-03-07','罗康元'),(4,'放假安排','2017-03-08','罗康元'),(5,'公司计划','2017-03-07','罗康元'),(7,'公司安排1','2017-03-29','罗康元'),(8,'公司安排2','2017-03-29','罗康元'),(10,'公司安排3','2017-03-29','罗康元'),(11,'公司安排4','2017-03-29','罗康元'),(12,'公司安排5','2017-04-13','罗康元'),(13,'公司安排6','2017-03-29','罗康元'),(14,'公司安排7','2017-03-29','罗康元'),(15,'公司安排8','2017-03-29','罗康元'),(17,'公司安排10','2017-05-11','罗康元'),(18,'公司安排11','2017-03-29','罗康元'),(19,'公司安排12','2017-03-29','罗康元'),(20,'公司安排13','2016-12-13','罗康元'),(21,'公司安排14','2017-03-29','罗康元'),(22,'公司安排15','2017-03-29','罗康元');

/*Table structure for table `reimbur` */

DROP TABLE IF EXISTS `reimbur`;

CREATE TABLE `reimbur` (
  `reimId` int(11) NOT NULL,
  `staId` int(11) DEFAULT NULL,
  `reimascId` int(11) DEFAULT NULL,
  `reimTime` datetime DEFAULT NULL,
  `reimBegin` datetime DEFAULT NULL,
  `reimEnd` datetime DEFAULT NULL,
  `reimtricc` varchar(400) DEFAULT NULL,
  `reimAccom` varchar(400) DEFAULT NULL,
  `reimAccCost` varchar(400) DEFAULT NULL,
  `reimDays` varchar(400) DEFAULT NULL,
  `reimObjec` varchar(400) DEFAULT NULL,
  `reimRemark` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`reimId`),
  KEY `FK_reimtoreim` (`reimascId`),
  KEY `FK_statosole` (`staId`),
  CONSTRAINT `FK_reimtoreim` FOREIGN KEY (`reimascId`) REFERENCES `reimburascc` (`reimascId`),
  CONSTRAINT `FK_statosole` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `reimbur` */

/*Table structure for table `reimburascc` */

DROP TABLE IF EXISTS `reimburascc`;

CREATE TABLE `reimburascc` (
  `reimascId` int(11) NOT NULL,
  `staId` int(11) DEFAULT NULL,
  `reimId` int(11) DEFAULT NULL,
  `reimascTine` datetime DEFAULT NULL,
  `reimascRemark` varchar(400) DEFAULT NULL,
  `reimascType` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`reimascId`),
  KEY `FK_reimtoreim2` (`reimId`),
  KEY `FK_statobxsh` (`staId`),
  CONSTRAINT `FK_reimtoreim2` FOREIGN KEY (`reimId`) REFERENCES `reimbur` (`reimId`),
  CONSTRAINT `FK_statobxsh` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `reimburascc` */

/*Table structure for table `reimimage` */

DROP TABLE IF EXISTS `reimimage`;

CREATE TABLE `reimimage` (
  `reimImageId` int(11) NOT NULL,
  `reimId` int(11) DEFAULT NULL,
  `reimImageName` varchar(200) DEFAULT NULL,
  `reimImageSize` varchar(100) DEFAULT NULL,
  `reimImageService` varchar(200) DEFAULT NULL,
  `reimImageTime` datetime DEFAULT NULL,
  PRIMARY KEY (`reimImageId`),
  KEY `FK_reimtiimage` (`reimId`),
  CONSTRAINT `FK_reimtiimage` FOREIGN KEY (`reimId`) REFERENCES `reimbur` (`reimId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `reimimage` */

/*Table structure for table `roletoper` */

DROP TABLE IF EXISTS `roletoper`;

CREATE TABLE `roletoper` (
  `roleId` int(11) NOT NULL,
  `perId` int(11) NOT NULL,
  `rolePerId` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`roleId`,`perId`,`rolePerId`),
  KEY `FK_roletoper2` (`perId`),
  KEY `rolePerId` (`rolePerId`),
  CONSTRAINT `FK_roletoper` FOREIGN KEY (`roleId`) REFERENCES `sysrole` (`roleId`),
  CONSTRAINT `FK_roletoper2` FOREIGN KEY (`perId`) REFERENCES `syspermission` (`perId`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8;

/*Data for the table `roletoper` */

insert  into `roletoper`(`roleId`,`perId`,`rolePerId`) values (1,1,1),(2,1,67),(1,2,2),(1,3,3),(2,3,65),(1,4,4),(2,4,69),(1,5,5),(1,6,6),(1,7,7),(1,8,8),(1,9,9),(1,10,10),(1,11,11),(1,12,12),(1,13,13),(3,13,72),(1,14,14),(3,14,73),(1,15,15),(3,15,74),(1,16,16),(1,17,17),(1,18,18),(1,19,19),(1,20,20),(2,20,68),(1,21,21),(1,22,22),(1,23,23),(1,24,24),(1,25,25),(1,26,26),(1,27,27),(2,27,66),(1,28,28),(1,29,29),(1,30,30),(2,30,70),(1,31,31),(1,32,32),(1,33,33),(1,34,34),(1,35,35),(1,36,36),(1,37,37),(1,38,38),(1,39,39),(1,40,40),(1,41,41),(1,42,42),(1,43,44),(1,44,45),(1,45,46),(1,46,47),(1,47,48),(1,48,49),(1,49,50),(1,50,51),(3,50,75),(1,51,52),(3,51,76),(1,52,53),(3,52,77),(1,53,54),(3,53,78),(1,54,55),(3,54,79),(1,55,56),(3,55,80),(1,56,57),(3,56,81),(1,57,58),(1,58,59),(1,59,60),(1,60,61),(1,61,62),(1,62,63),(1,63,64);

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staid` int(11) NOT NULL AUTO_INCREMENT,
  `deptId` int(11) DEFAULT NULL,
  `jobId` int(11) DEFAULT NULL,
  `stanumber` varchar(200) DEFAULT NULL,
  `staUserCode` varchar(200) DEFAULT NULL,
  `staPassword` varchar(200) DEFAULT NULL,
  `staName` varchar(200) DEFAULT NULL,
  `staTel` varchar(200) DEFAULT NULL,
  `staEmail` varchar(200) DEFAULT NULL,
  `staPol` varchar(200) DEFAULT NULL,
  `staEntryTime` date DEFAULT NULL,
  `staSex` varchar(200) DEFAULT NULL,
  `staHeadImage` varchar(200) DEFAULT NULL,
  `staType` varchar(200) DEFAULT NULL,
  `staAddress` varchar(200) DEFAULT NULL,
  `staRemark` varchar(400) DEFAULT NULL,
  `staBirthday` date DEFAULT NULL,
  `staIdcard` varchar(200) DEFAULT NULL,
  `staEnduce` varchar(200) DEFAULT NULL,
  `staHabit` varchar(300) DEFAULT NULL,
  `staMajor` varchar(50) DEFAULT NULL,
  `staMarry` varchar(20) DEFAULT NULL,
  `staAge` varchar(20) DEFAULT NULL,
  `staEducation` varchar(50) DEFAULT NULL,
  `staComputer` varchar(50) DEFAULT NULL,
  `staEnglish` varchar(50) DEFAULT NULL,
  `staWorker` varchar(300) DEFAULT NULL,
  `staBankNumber` varchar(50) DEFAULT NULL,
  `staQqNumber` varchar(50) DEFAULT NULL,
  `staPostNumber` varchar(200) DEFAULT NULL,
  `staCharge` varchar(50) DEFAULT NULL,
  `salt` varchar(200) DEFAULT NULL,
  `locked` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`staid`),
  KEY `FK_depttosta` (`deptId`),
  KEY `FK_workertosta` (`jobId`),
  CONSTRAINT `FK_depttosta` FOREIGN KEY (`deptId`) REFERENCES `dept` (`deptId`),
  CONSTRAINT `FK_workertosta` FOREIGN KEY (`jobId`) REFERENCES `job` (`jobId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

insert  into `staff`(`staid`,`deptId`,`jobId`,`stanumber`,`staUserCode`,`staPassword`,`staName`,`staTel`,`staEmail`,`staPol`,`staEntryTime`,`staSex`,`staHeadImage`,`staType`,`staAddress`,`staRemark`,`staBirthday`,`staIdcard`,`staEnduce`,`staHabit`,`staMajor`,`staMarry`,`staAge`,`staEducation`,`staComputer`,`staEnglish`,`staWorker`,`staBankNumber`,`staQqNumber`,`staPostNumber`,`staCharge`,`salt`,`locked`) values (1,2,1,'0001','luokangyuan','f3694f162729b7d0254c6e40260bf15c','罗康元','18280823255','243518985@qq.com','中共党员','2017-03-15','男','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','未婚','23','西华师范大学','一般','一般','菜鸟','62284820787877969472','243518985','000000000001','否','qwerty','0'),(2,1,1,'00010101','chengshixiong','f3694f162729b7d0254c6e40260bf15c','陈师兄','18280823255','243518985@qq.com','中共党员','2017-03-15','男','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','已婚','23','西华师范大学','一般','一般','大神','62284820787877969472','243518985','000000000002','是','qwerty','0'),(3,3,1,'00020101','liujing','f3694f162729b7d0254c6e40260bf15c','刘静','18280823255','243518985@qq.com','中共党员','2017-03-15','女','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','未婚','55','西华师范大学','一般','一般','一般','62284820787877969472','243518985','000000000003','是','qwerty','0'),(4,4,1,'00030101','dengdan','f3694f162729b7d0254c6e40260bf15c','邓丹','18280823255','243518985@qq.com','中共党员','2017-03-15','女','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','未婚','58','西华师范大学','一般','一般','一般','62284820787877969472','243518985','000000000003','是','qwerty','0'),(5,5,1,'00030202','zhangsan','f3694f162729b7d0254c6e40260bf15c','张三','18280823255','243518985@qq.com','中共党员','2017-03-15','女','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','未婚','58','西华师范大学','一般','一般','一般','62284820787877969472','243518985','000000000004','是','qwerty','0'),(6,6,1,'000101','luoye','f3694f162729b7d0254c6e40260bf15c','罗爷','18280823255','243518985@qq.com','中共党员','2017-03-15','女','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','未婚','56','西华师范大学','一般','一般','一般','62284820787877969472','243518985','000000000004','是','qwerty','0'),(7,7,1,'000201','liye','f3694f162729b7d0254c6e40260bf15c','李爷','18280823255','243518985@qq.com','中共党员','2017-03-15','女','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','未婚','85','西华师范大学','一般','一般','一般','62284820787877969472','243518985','000000000004','是','qwerty','0'),(8,8,1,'000301','heye','f3694f162729b7d0254c6e40260bf15c','何爷','18280823255','243518985@qq.com','中共党员','2017-03-15','女','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','未婚','85','西华师范大学','一般','一般','一般','62284820787877969472','243518985','000000000004','是','qwerty','0'),(9,9,1,'00010201','chendong','f3694f162729b7d0254c6e40260bf15c','陈董','18280823255','243518985@qq.com','中共党员','2017-03-15','女','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','未婚','85','西华师范大学','一般','一般','一般','62284820787877969472','243518985','000000000004','是','qwerty','0'),(10,2,1,'00010202','hebin','f3694f162729b7d0254c6e40260bf15c','何彬','18280823255','243518985@qq.com','中共党员','2017-03-15','女','luo.png','就职中','四川成都','不错的小伙子','2017-03-07','513722199503165211','大学本科','玩手机、打球','软件工程','未婚','85','西华师范大学','一般','一般','一般','62284820787877969472','243518985','000000000004','是','qwerty','0');

/*Table structure for table `staleave` */

DROP TABLE IF EXISTS `staleave`;

CREATE TABLE `staleave` (
  `leaveId` int(11) NOT NULL,
  `staId` int(11) DEFAULT NULL,
  `leaveassId` int(11) DEFAULT NULL,
  `leaveThing` varchar(400) DEFAULT NULL,
  `leaveTime` datetime DEFAULT NULL,
  `leaveCreate` datetime DEFAULT NULL,
  `leaveType` varchar(200) DEFAULT NULL,
  `leaveRemark` varchar(400) DEFAULT NULL,
  `leaveEndTime` datetime DEFAULT NULL,
  PRIMARY KEY (`leaveId`),
  KEY `FK_lavetoexa` (`leaveassId`),
  KEY `FK_statoleave` (`staId`),
  CONSTRAINT `FK_lavetoexa` FOREIGN KEY (`leaveassId`) REFERENCES `leaveass` (`leaveassId`),
  CONSTRAINT `FK_statoleave` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staleave` */

/*Table structure for table `strtorole` */

DROP TABLE IF EXISTS `strtorole`;

CREATE TABLE `strtorole` (
  `roleId` int(11) NOT NULL,
  `staId` int(11) NOT NULL,
  `staRoleId` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`roleId`,`staId`,`staRoleId`),
  KEY `FK_strtorole2` (`staId`),
  KEY `staRoleId` (`staRoleId`),
  CONSTRAINT `FK_strtorole` FOREIGN KEY (`roleId`) REFERENCES `sysrole` (`roleId`),
  CONSTRAINT `FK_strtorole2` FOREIGN KEY (`staId`) REFERENCES `staff` (`staId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `strtorole` */

insert  into `strtorole`(`roleId`,`staId`,`staRoleId`) values (1,1,1),(2,6,2),(3,7,3);

/*Table structure for table `syspermission` */

DROP TABLE IF EXISTS `syspermission`;

CREATE TABLE `syspermission` (
  `perId` int(11) NOT NULL AUTO_INCREMENT,
  `perName` varchar(200) DEFAULT NULL,
  `perType` varchar(200) DEFAULT NULL,
  `perUrl` varchar(200) DEFAULT NULL,
  `perPercode` varchar(200) DEFAULT NULL,
  `perParentid` varchar(200) DEFAULT NULL,
  `perParentids` varchar(200) DEFAULT NULL,
  `perSoft` varchar(200) DEFAULT NULL,
  `perAviliable` varchar(10) DEFAULT NULL,
  `icon` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`perId`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

/*Data for the table `syspermission` */

insert  into `syspermission`(`perId`,`perName`,`perType`,`perUrl`,`perPercode`,`perParentid`,`perParentids`,`perSoft`,`perAviliable`,`icon`) values (1,'系统公告','menus',NULL,NULL,'9999','0','0','1','icon-application-cascade'),(2,'待办事项','menus',NULL,NULL,'9999','0','0','1','icon-application-form-edit'),(3,'工作日报','menus',NULL,NULL,'9999','0','0','1','icon-creditcards'),(4,'日程安排','menus',NULL,NULL,'9999','0','0','1','icon-cross'),(5,'电子邮件','menus',NULL,NULL,'9999','0','0','1','icon-cross-octagon'),(6,'部门管理','menus',NULL,NULL,'9999','0','0','1','icon-cup-edit'),(7,'员工管理','menus',NULL,NULL,'9999','0','0','1','icon-database-add'),(8,'读者管理','menus',NULL,NULL,'9999','0','0','1','icon-database-edit'),(9,'书籍管理','menus',NULL,NULL,'9999','0','0','1','icon-database-table'),(10,'书籍借还','menus',NULL,NULL,'9999','0','0','1','icon-database-yellow-stop'),(11,'书籍查询','menus',NULL,NULL,'9999','0','0','1','icon-disk-black-magnify '),(12,'文件管理','menus',NULL,NULL,'9999','0','0','1','icon-disk-edit'),(13,'新闻动态','menus',NULL,NULL,'9999','0','0','1','icon-disk-error'),(14,'案例管理','menus',NULL,NULL,'9999','0','0','1','icon-disk-magnify'),(15,'教育管理','menus',NULL,NULL,'9999','0','0','1','icon-disk-multiple'),(16,'角色管理','menus',NULL,NULL,'9999','0','0','1','icon-disk-upload'),(17,'权限管理','menus',NULL,NULL,'9999','0','0','1','icon-door'),(18,'请假申请','menus',NULL,NULL,'9999','0','0','1','icon-door-error'),(19,'报销申请','menus',NULL,NULL,'9999','0','0','1','icon-drink'),(20,'公告查看','menu','toShowNotice.action',NULL,'1',NULL,NULL,'1','icon-drink-empty'),(21,'类别管理','menu','toNoticeType.action',NULL,'1',NULL,NULL,NULL,'icon-drink-red'),(22,'公告管理','menu','noticeManager.action',NULL,'1',NULL,NULL,NULL,'icon-drive'),(23,'查看管理','menu',NULL,NULL,'1',NULL,NULL,NULL,'icon-drive-add'),(24,'事项查看','menu','toShowTodoList.action',NULL,'2',NULL,NULL,NULL,'icon-drive-burn'),(25,'事项发布','menu','toTodoManagerList.action',NULL,'2',NULL,NULL,NULL,'icon-drive-cdr'),(26,'查看管理','menu',NULL,NULL,'2',NULL,NULL,NULL,'icon-drive-cd-empty'),(27,'工作汇报','menu','toWorkReport.action',NULL,'3',NULL,NULL,NULL,'icon-drive-delete'),(28,'我的日报','menu',NULL,NULL,'3',NULL,NULL,NULL,'icon-drive-disk'),(29,'日报考勤','menu',NULL,NULL,'3',NULL,NULL,NULL,'icon-drive-edit'),(30,'我的日程','menu','toCalendarsPage.action',NULL,'4',NULL,NULL,NULL,'icon-drive-error'),(31,'日程安排','menu',NULL,NULL,'4',NULL,NULL,NULL,'icon-drive-go'),(32,'我的邮件','menu',NULL,NULL,'5',NULL,NULL,NULL,'icon-drive-key'),(33,'发送邮件','menu',NULL,NULL,'5',NULL,NULL,NULL,'icon-drive-link'),(34,'接收信息','menu',NULL,NULL,'5',NULL,NULL,NULL,'icon-edit-remove'),(35,'部门查看','menu','deptManager.action',NULL,'6',NULL,NULL,NULL,'icon-eject-blue'),(36,'我的部门','menu',NULL,NULL,'6',NULL,NULL,NULL,'icon-eject-green'),(37,'我的信息','menu','toMyInfoPage.action',NULL,'7',NULL,NULL,NULL,'icon-email-add'),(38,'员工查看','menu',NULL,NULL,'7',NULL,NULL,NULL,'icon-emoticon-smile'),(39,'员工权限','menu',NULL,NULL,'7',NULL,NULL,NULL,'icon-emoticon-surprised'),(40,'我的读书','menu',NULL,NULL,'8',NULL,NULL,NULL,'icon-emoticon-unhappy'),(41,'查看读者','menu',NULL,NULL,'8',NULL,NULL,NULL,'icon-film-edit'),(42,'书籍查看','menu',NULL,NULL,'9',NULL,NULL,NULL,'icon-film-eject'),(43,'我要借书','menu',NULL,NULL,'10',NULL,NULL,NULL,'icon-film-error'),(44,'我要还书','menu',NULL,NULL,'10',NULL,NULL,NULL,'icon-finger-point'),(45,'书籍检索','menu',NULL,NULL,'11',NULL,NULL,NULL,'icon-flag-black'),(46,'我要上传','menu',NULL,NULL,'12',NULL,NULL,NULL,'icon-flag-blue'),(47,'我要下载','menu',NULL,NULL,'12',NULL,NULL,NULL,'icon-flag-orange'),(48,'我的上传','menu',NULL,NULL,'12',NULL,NULL,NULL,'icon-flag-pink'),(49,'我的下载','menu',NULL,NULL,'12',NULL,NULL,NULL,'icon-finger-point'),(50,'新闻查看','menu',NULL,NULL,'13',NULL,NULL,NULL,'icon-application-get'),(51,'发布新闻','menu',NULL,NULL,'13',NULL,NULL,NULL,'icon-application-form-edit'),(52,'案例查看','menu','exampleManager.action',NULL,'14',NULL,NULL,NULL,'icon-application-lightning'),(53,'发布案例','menu',NULL,NULL,'14',NULL,NULL,NULL,'icon-application-link'),(54,'资料类别','menu',NULL,NULL,'15',NULL,NULL,NULL,'icon-application-osx'),(55,'资料上传','menu',NULL,NULL,'15',NULL,NULL,NULL,'icon-application-osx-add'),(56,'资料信息','menu',NULL,NULL,'15',NULL,NULL,NULL,'icon-application-osx-cascade'),(57,'系统角色','menu','toSysRole.action',NULL,'16',NULL,NULL,NULL,'icon-application-osx-delete'),(58,'角色权限','menu','toperAndRolPage.action',NULL,'16',NULL,NULL,NULL,'icon-application-osx-double'),(59,'权限查看','menu',NULL,NULL,'17',NULL,NULL,NULL,'icon-application-osx-home'),(60,'我要请假','menu',NULL,NULL,'18',NULL,NULL,NULL,'icon-application-osx-key'),(61,'我的请假','menu',NULL,NULL,'18',NULL,NULL,NULL,'icon-application-osx-lightning'),(62,'我要报销','menu',NULL,NULL,'19',NULL,NULL,NULL,'icon-application-osx-start'),(63,'我的报销','menu',NULL,NULL,'19',NULL,NULL,NULL,'icon-application-side-boxes ');

/*Table structure for table `sysrole` */

DROP TABLE IF EXISTS `sysrole`;

CREATE TABLE `sysrole` (
  `roleid` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(200) DEFAULT NULL,
  `rolevaliable` varchar(10) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `sysrole` */

insert  into `sysrole`(`roleid`,`rolename`,`rolevaliable`,`createtime`) values (1,'超级管理员','1','2017-04-11 15:40:35'),(2,'实习生','1','2017-04-19 15:40:38'),(3,'门户管理员','1','2017-04-19 15:52:34');

/*Table structure for table `todoenc` */

DROP TABLE IF EXISTS `todoenc`;

CREATE TABLE `todoenc` (
  `todoencId` int(11) NOT NULL,
  `todoId` int(11) DEFAULT NULL,
  `todoencCreate` datetime DEFAULT NULL,
  `todoencName` varchar(300) DEFAULT NULL,
  `todoencType` varchar(300) DEFAULT NULL,
  `todoencServer` varchar(300) DEFAULT NULL,
  `todoencSize` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`todoencId`),
  KEY `FK_todotoenc` (`todoId`),
  CONSTRAINT `FK_todotoenc` FOREIGN KEY (`todoId`) REFERENCES `alonework` (`todoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `todoenc` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

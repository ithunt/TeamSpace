# ************************************************************
# Database: teamspace
# Generation Time: 2011-11-07 12:44:29 -0500
# ************************************************************
LOCK TABLES `Actionable` WRITE;
INSERT INTO `Actionable` (`ID`,`SpaceID`,`TypeID`,`Creator`,`Name`,`Created`,`Description`,`AssignedTo`,`TargetDate`,`Priority`)
VALUES
	(1,1,2,2,'Infosys Presentation','2011-11-07 01:17:56','Teamspace Release 2',NULL,'2011-11-07 10:00:00',NULL),
	(2,1,1,2,'Create User\'s Guide','2011-11-07 01:18:25','Teamspace Release 2',NULL,'2011-11-07 00:00:00','High'),
	(3,1,1,3,'UML Class Diagrams','2011-11-07 00:00:00','For Subsystems',NULL,'2011-11-07 00:00:00','Normal'),
	(4,1,2,3,'Infosys Final','2011-11-07 00:00:00','Fingers Crossed',NULL,'2011-11-17 00:00:00',NULL),
	(6,1,2,5,'Phish Concert','2011-11-07 09:33:31','The Egg, Albany NY',NULL,'2011-12-13 20:20:00',NULL),
	(7,1,2,3,'End of Classes','2011-11-07 09:40:48','woohooo',NULL,'2011-11-10 16:00:00',NULL),
	(8,1,2,8,'My New Event','2011-11-07 10:52:46','Notes',NULL,'2011-11-17 10:52:00',NULL),
	(9,1,2,3,'asdfasdf','2011-11-07 12:38:50','',NULL,'2011-11-17 12:39:00',NULL);
UNLOCK TABLES;

LOCK TABLES `Contact` WRITE;
INSERT INTO `Contact` (`ContactID`,`UserID`,`Name`,`Email`,`Phone`,`Role`,`PictureURL`,`Bio`,`SpaceID`)
VALUES
	(1,1,'admin','admin','admin','God','','admin',1),
	(2,2,'Tim Garvin','tcg7834@rit.edu','330-612-9207','Tech Crew Senior Technician','','Graduating in a few weeks if Professor doesn\'t fail me!',1),
	(3,3,'Ian Hunt','ith8424@rit.edu','802-233-2953','Architect',NULL,'I\'m a cool guy',1),
	(4,4,'David Bowie','ziggystardust@gmail.com','555-555-5555','Major Tom','http://fashionblog.am/wp-content/uploads/2009/07/david-bowie-202.jpg','Ground Control To Major Tom',1),
	(5,5,'Trey Anastasio','farmhouse@gmail.com','754-674-8482','Hippie','http://www.superiorpics.com/wenn_album/Trey_Anastasio_-_Not_Guilty/trey_anastasio_001_010507.jpg','Run like an Antelope, out of control',1),
	(6,6,'Jimmy Page','yardbirds@gmail.com','823-727-2734','Rockstar','http://www.licklibrary.com/Images/Resources/jimmy-page-766042.jpg','We come from the land of the ice and snow, from the midnight sun where the hotsprings flow',1),
	(7,7,'Ben Gibbard','theband@uspostalservice.gov','759-874-8734','Talent',NULL,'They will see us waving from such great heights',1),
	(8,6,'Test Person','testemail@google.com','1231231231','Lead Developer','','This is me.',1);
UNLOCK TABLES;

LOCK TABLES `Invitation` WRITE;
INSERT INTO `Invitation` (`InvitationID`,`EventID`,`ContactID`)
VALUES
	(1,5,3),
	(2,5,5),
	(3,6,3),
	(4,6,5),
	(5,7,2),
	(6,7,3),
	(10,8,3),
	(9,8,2);
UNLOCK TABLES;

LOCK TABLES `Space` WRITE;
INSERT INTO `Space` (`SpaceID`,`Name`,`Creator`,`Created`,`Description`)
VALUES
	(1,'Cool Kids',1,'2011-11-07 00:38:20','This is our first space.'),
	(2,'Nirvana',4,'2011-11-07 00:00:00','Rock Stars');
UNLOCK TABLES;

LOCK TABLES `User` WRITE;
INSERT INTO `User` (`UserID`,`LoginName`,`Password`,`PrimaryContactID`,`Enabled`,`LastViewedSpace`,`Created`,`Role`)
VALUES
	(1,'admin','admin',1,1,1,'2011-11-07 00:37:58','ROLE_USER'),
	(2,'timg','dontcare',2,1,1,'2011-11-07 01:15:44','ROLE_USER'),
	(3,'ian','ian',3,1,1,'2011-11-07 00:00:00','ROLE_USER'),
	(4,'bowie','bowie',4,1,1,'2011-11-07 00:00:00','ROLE_USER'),
	(5,'trey','trey',5,1,1,'2011-11-07 00:00:00','ROLE_USER'),
	(6,'testaccount','test',8,1,1,'2011-11-07 10:49:19','ROLE_USER');
UNLOCK TABLES;

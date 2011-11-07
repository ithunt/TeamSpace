DROP TABLE IF EXISTS `teamspace`.`Space`;
CREATE TABLE `teamspace`.`Space` (
  `SpaceID` INT  NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(40)  NOT NULL,
  `Creator` INT  NOT NULL,
  `Created` DATETIME  NOT NULL,
  `Description` VARCHAR(120)  NOT NULL,
  PRIMARY KEY (`SpaceID`)
)
ENGINE = MyISAM;

DROP TABLE IF EXISTS `teamspace`.`Contact`;
CREATE TABLE `teamspace`.`Contact` (
  `ContactID` INT  NOT NULL AUTO_INCREMENT,
  `UserID` INT  NOT NULL,
  `Name` VARCHAR(40)  NOT NULL,
  `Email` VARCHAR(40)  NOT NULL,
  `Phone` VARCHAR(20)  NOT NULL,
  `Role` VARCHAR(80),
  `PictureURL` VARCHAR(250) ,
  `Bio` VARCHAR(500)  ,
  `SpaceID` INT,
  PRIMARY KEY (`ContactID`)
)
ENGINE = MyISAM;

DROP TABLE IF EXISTS `teamspace`.`Actionable`;
CREATE TABLE `teamspace`.`Actionable` (
  `ID` INT  NOT NULL AUTO_INCREMENT,
  `SpaceID` INT  NOT NULL,
  `TypeID` INT NOT NULL,
  `Creator` INT  NOT NULL,
  `Name` VARCHAR(80)  NOT NULL,
  `Created` DATETIME  NOT NULL,
  `Description` VARCHAR(500)  ,
  `AssignedTo` INT  ,
  `TargetDate` DATETIME ,
  `Priority` VARCHAR(20)  ,
  PRIMARY KEY (`ID`)
)
ENGINE = MyISAM;

DROP TABLE IF EXISTS `teamspace`.`Comment`;
CREATE TABLE `teamspace`.`Comment` (
  `CommentID` INT  NOT NULL AUTO_INCREMENT,
  `Creator` INT  NOT NULL,
  `ItemID` INT  NOT NULL,
  `Created` DATETIME  NOT NULL,
  `Text` VARCHAR(200)  NOT NULL,
  PRIMARY KEY (`CommentID`)
)
ENGINE = MyISAM;

DROP TABLE IF EXISTS `teamspace`.`Dependency`;
CREATE TABLE `teamspace`.`Dependency` (
  `DepID` INT  NOT NULL AUTO_INCREMENT,
  `BaseItemID` INT  NOT NULL,
  `DependsOnID` INT  NOT NULL,
  PRIMARY KEY (`DepID`)
)
ENGINE = MyISAM;

DROP TABLE IF EXISTS `teamspace`.`Attended`;
CREATE TABLE `teamspace`.`Attended` (
  `AttendID` INT  NOT NULL AUTO_INCREMENT,
  `EventID` INT  NOT NULL,
  `AtendeeID` INT  NOT NULL,
  PRIMARY KEY (`AttendID`)
)
ENGINE = MyISAM;

DROP TABLE IF EXISTS `teamspace`.`User`;
CREATE TABLE `teamspace`.`User` (
  `UserID` INT  NOT NULL AUTO_INCREMENT,
  `LoginName` VARCHAR(40)  NOT NULL,
  `Password` CHAR(40)  NOT NULL,
  `PrimaryContactID` INT,
  `Enabled` tinyint(4) NOT NULL DEFAULT '1',
  `LastViewedSpace` INT,
  `Created` DATETIME  NOT NULL,
  `Role` VARCHAR(40) NOT NULL DEFAULT 'ROLE_USER',
  PRIMARY KEY (`UserID`)
)
ENGINE = MyISAM;

DROP TABLE IF EXISTS `teamspace`.`Invitation`;
CREATE TABLE `Invitation` (
  `InvitationID` INT NOT NULL AUTO_INCREMENT,
  `EventID` INT NOT NULL,
  `ContactID` INT NOT NULL,
 PRIMARY KEY (`InvitationID`)
) ENGINE=MyISAM;

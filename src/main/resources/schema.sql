CREATE TABLE IF NOT EXISTS SHOPPING_LIST_ITEM (
    `ID` INT NOT NULL AUTO_INCREMENT,
    `NAME` VARCHAR (255) NOT NULL,
    `DESCRIPTION` VARCHAR (255),
    `AMOUNT` INT NOT NULL,
    PRIMARY KEY (ID)
);
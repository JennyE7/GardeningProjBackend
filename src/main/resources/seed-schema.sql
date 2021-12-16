DROP TABLE IF EXISTS `seed`;

CREATE TABLE `seed` (
	`id` INTEGER PRIMARY KEY AUTO_INCREMENT,
	`seed_name` VARCHAR(50),
	`sow_by_month` INTEGER,
	`harvest_by_month` INTEGER,
	`expiration_date` DATE,
	`is_planted` BOOLEAN
    );
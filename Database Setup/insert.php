<?php

	include("dbsetup.php");
	
	$success = false;
	
	/* Attempt to connect with SQL service */
	$connection = @mysql_connect($hostname, $username, $password);
	if ($connection) {
		$success = true;
	}
	else {
		echo "Unable to connect with SQL server.</br>";
	}
	
	/* Connect to database and insert records */
	if ($success) {
		$dbname = "ECafe";
		$dbconnection = @mysql_select_db($dbname, $connection);
		if ($dbconnection) {
		
		
			/* * * * * * * * * * * * * */
			/* * *  Insert records * * */
			/* * * * * * * * * * * * * */
			
			/* 
			 * There are no initial records in either the
			 * incidentscores or injectscores tables.
			 */
		
			/* Insert values into ipconfig table */
			$tablename = "MenuItems";	
			$insertarray = array('INSERT INTO `MenuItems` (Name, Descrip, Price, Time) VALUES ("Hamburger","Meat, Bun, LTPOKMM", 8.99, 10.0);',
								 'INSERT INTO `MenuItems` (Name, Descrip, Price, Time) VALUES ("Hot Dog","Hot Dog, Bun", 6.99, 7.0);',
								 'INSERT INTO `MenuItems` (Name, Descrip, Price, Time) VALUES ("Pizza","Pepperoni", 12.99, 20.0);',
								 'INSERT INTO `MenuItems` (Name, Descrip, Price, Time) VALUES ("Greek Salad","Spinach, Dressing", 6.99, 8.0);',
								 'INSERT INTO `MenuItems` (Name, Descrip, Price, Time) VALUES ("Caesar Salad" ,"Lettuce, Dressing", 6.99, 8.0);');
	 	 
			for ($i = 0; $i < 5; $i++) {
				$insert_SQL = $insertarray[$i];
				if (mysql_query($insert_SQL)) {
					echo "Record successfully inserted.</br>";
				}
				else {
					echo "Failed to execute command '".$insert_SQL."' into table '".$tablename."'.</br>";
				}
			}
		} else {
		echo "Failed to connect to the database '".$dbname."'.</br>";
	}
}
?>
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
	
	/* Create database(s) and table(s) if they do not already exist */
	if ($success) {
		$dbname = "eCafe";
		$createDB_SQL = "CREATE DATABASE ".$dbname;
		
		if (mysql_query($createDB_SQL)) {
			echo "The command '".$createDB_SQL."' was successful.</br>";
		}
		else {
			$dbexists = @mysql_select_db($dbname, $connection);
			if ($dbexists) {
				echo "The command '".$createDB_SQL."' FAILED - that database already exists.</br>";
			}
			else {
				echo "The command '".$createDB_SQL."' FAILED.</br>";
			}
		}
		/* Connect to new database */
		$db = @mysql_select_db($dbname, $connection);
		if ($db) {
			/* Create the "eCafe.MenuItems" table */
			$tablename = "eCafe.MenuItems";
			$createTable_SQL = "CREATE TABLE MenuItems (";
			$createTable_SQL.= "Name VARCHAR(64) NOT NULL, ";
			$createTable_SQL.= "Descrip VARCHAR(64) NOT NULL, ";
			$createTable_SQL.= "Price FLOAT(32) NOT NULL, ";
			$createTable_SQL.= "TIME FLOAT(32) NOT NULL, ";
			$createTable_SQL.= "PRIMARY KEY(Name) ";
			$createTable_SQL.= ");";
						
			if (mysql_query($createTable_SQL)) {
				echo "CREATE TABLE ".$tablename." was successful.</br>";
			}
			else {
				echo "CREATE TABLE ".$tablename." FAILED.</br>";
			}
		}
		else {
			echo "Failed to connect to the database '".$dbname."'.</br>";
		}
	}
	else {
		echo "Failed to connect to the SQL server.</br>";
	}

?>
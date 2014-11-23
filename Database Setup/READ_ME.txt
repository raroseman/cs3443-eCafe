To get your database up and running, as well as
to provide an interface for easier interaction,
I recommend xampp.

Step 1: Download xampp from
https://www.apachefriends.org/index.html

Step 2: Install xampp using the wizard

Step 3: In your xampp installation folder
(mine is C:\xampp) find the folder named
"htdocs" (C:\xampp\htdocs)

Step 4: Create a new folder inside the htdocs
folder called "eCafe"

Step 5: Move the PHP scripts that I've provided
into your eCafe folder (C:\xampp\htdocs\eCafe)

Step 6: Open xampp

Step 7: Click the "Start" button for "Apache"
and "MySQL"

Step 8: Open your browser and type
"localhost/phpmyadmin/" in the URL bar,
press enter. You should now see a web
interface for all of your databases. You
probably don't have any yet, but you might see
some in the left-most panel.

Step 9: Open a new tab, type 
"localhost/eCafe/create.php" in the URL
bar, press enter

Step 10: In the same tab, type
"localhost/eCafe/insert.php" int the URL
bar, press enter

You should now have the database up and running.
I've modified the Java project code so that it reads
from this database. You should see all of the MenuItem
names appear in the console.
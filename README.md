# Introduction (Important)
A general POS system for a shop with items with MySQL connectivity. 

**Consider before downloading**

This entire project is devided into 2 projects (one is this project and other is "Point-of-sale-system-part2").Point-of-sale-system-part2 repository includes the table info backing up operate window. If you don't install that repo, you will unable to use the back up feature of this application.

After dounloading the repo (Point-of-sale-system-part2  and Point-of-sale-system-part1), it is required to insert the serviceAccountkey file to the Point-of-sale-system-part2 project to work with the firebase. because I can't shere my cloud storage space with public. So, create a firebase account and log into the console. then create a new project and a firestore database in that project according to the table fields given below.
![Screenshot 2024-09-16 181508](https://github.com/user-attachments/assets/3e5157b3-dd59-4b87-a9be-e26fe20d0f1e)


now download the private key of the database. after downloading that, place that file in the root location of the Point-of-sale-system-part2 project. (note - you have to change the name of the key as "serviceAccountKey.json".


Otherwise, you have to modify the code according to your name) Then you good to go.

To work the MySQL tables, place the script file (The scrpipt file is attatched to the Point-of-sale-system-part1 repo).

Please DO NOT modify or remove any text file in both Point-of-sale-system-part2 and Point-of-sale-system-part1 projects (otherwise the entire operations like auto generate id's etc.. of the projects will be affected). Keep those files in the same place.

**Main features**

Ability to add, update and delete items,
Customer billing,
View sales according to the date and the month,
Back up all the table data to firebase,
Ability to place,delete and update shipment orders,
inclues an admin menu to add cashiers, create another admin account and edit the account/organization details.

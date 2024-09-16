# Introduction (Important)
A general POS system for a shop with items with MySQL connectivity. 

**Consider before downloading**

This entire project is devided into 2 projects (one is this project and other is "Point-of-sale-system-part2").Point-of-sale-system-part2 repository includes the table info backing up operate window. If you don't install that repo, you will unable to use the back up feature of this application.

After dounloading the repo (Point-of-sale-system-part2  and Point-of-sale-system-part1), it is required to insert the serviceAccountkey file to the Point-of-sale-system-part2 project to work with the firebase. because I can't shere my cloud storage space with public. So, create a firebase account and log into the console. then create a new project and a firestore database in that project according to the table fields given below.

![Screenshot 2024-09-16 181508](https://github.com/user-attachments/assets/3e5157b3-dd59-4b87-a9be-e26fe20d0f1e)
![Screenshot 2024-09-16 181449](https://github.com/user-attachments/assets/911e47f8-d1d8-410c-bd4f-a74944c8bad5)
![Screenshot 2024-09-16 181417](https://github.com/user-attachments/assets/98959dba-d48b-40ff-ad88-67fea12a1f90)
![Screenshot 2024-09-16 181357](https://github.com/user-attachments/assets/84ebccab-1acf-4569-b6da-14ef87314e33)
![Screenshot 2024-09-16 181337](https://github.com/user-attachments/assets/1ba2e190-48c4-422c-bc0b-acc7ec7df972)
![Screenshot 2024-09-16 181315](https://github.com/user-attachments/assets/7d612a26-bb90-44e3-af4e-6700a208ffb2)

now download the private key of the database (from project settings). after downloading that, place that file in the root location of the Point-of-sale-system-part2 project. (note - you have to change the name of the key as "serviceAccountKey.json".Otherwise, you have to modify the code according to your name) Then you good to go.

To work the MySQL tables, place the script file (The scrpipt file is attatched to the Point-of-sale-system-part1 repo).

Please DO NOT modify or remove any text file in both Point-of-sale-system-part2 and Point-of-sale-system-part1 projects (otherwise the entire operations like auto generate id's etc.. of the projects will be affected). Keep those files in the same place. but it necessary to update the text file paths of the both projects according to the project location.

**Main features**

Ability to add, update and delete items,
Customer billing,
View sales according to the date and the month,
Back up all the table data to firebase,
Ability to place,delete and update shipment orders,
inclues an admin menu to add cashiers, create another admin account and edit the account/organization details.

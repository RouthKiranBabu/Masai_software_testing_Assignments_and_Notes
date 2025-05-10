# For creating the Database
```bash
create database firstdb;
```
- Execute and go to Schemas and then refresh to see the new database

- create database firstdb;
# To use the database, (use the below code) or (Right click on the db and make 'Set as Default Schema')
```bash
use firstdb;
```
- It becomes bold in color

- create database firstdb;
- use firstdb;
# To Remove the Database
```bash
drop database firstdb;
```

- create database firstdb;
- use firstdb;
# After creating and using database Setting a data base to read only where can't do any operation to it
- Still access the data from it
```bash
alter database firstdb read only = 1; 
```

- create database firstdb;
- use firstdb;
- alter database firstdb read only = 1; 
- Like try removing the database using drop after readonly mode is enabled, Message says it is in read only mode
```bash
drop database firstdb;
```

- create database firstdb;
- use firstdb;
- alter database firstdb read only = 1; 
# To disable the readonly mode
```bash
alter database firstdb read only = 0;
```
- Once it is not readonly mode then you can perform operation in it
```bash
drop database firstdb;
```

- create database firstdb;
- use firstdb;
```bash
alter database firstdb encryption = 'y';
```
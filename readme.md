# todo 
- after saving wod, redirect to dashboard
- when saving wod, date should provide default value
- template engine,,  thymeleaf or mustache

# issues
When you set ddl-auto: update in the application.yml file for Hibernate or other ORM tools, 
it automatically manages the database table schema in the following ways:

* **Adding new columns**: When a new field is added to an entity class, a corresponding new column for that field is automatically added to the database table.

* **Not deleting existing columns**: However, if a column already exists in the database table and is removed from the entity class, that column will not be automatically deleted from the database table.
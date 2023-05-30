# e-commerce-spring

### Configuration de la base de données Mongo
Pour configurer correctement la base de données il faut que vous créer un fichier **application.properties**.
Dans ce fichier il faut ajouter la balise : **spring.data.mongodb.uri=** et mettre à l'intérieur l'URL de la base de données Mongo
. Puis il faut ajouter une autre balise **spring.data.mongodb.database=** avec le nom de votre base de données.
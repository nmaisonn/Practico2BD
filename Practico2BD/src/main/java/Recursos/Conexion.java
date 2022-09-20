package Recursos;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class Conexion {

    private static Conexion instance;
    public MongoDatabase db;

    private Conexion() {
    }

    public static Conexion GetInstance() {
        if (instance == null) {
            instance = new Conexion();
            MongoClient cliente = createConnection();
            instance.db = cliente.getDatabase("db_2022");
        }
        return instance;
    }

    private static MongoClient createConnection() {
        MongoClient mongoClient = new MongoClient(
                new MongoClientURI(
                        "mongodb://bd-2022:ZoDpyakc1et4L5QDSqot9NlohQcC3UImQbmjHo6GOhhRZLnYSoWiF6ySE4spt8Su1bql8M2b7PgvdgU9o6KFNA%3D%3D@bd-2022.mongo.cosmos.azure.com:10255/?ssl=true&replicaSet=globaldb&retrywrites=false&maxIdleTimeMS=120000&appName=@bd-2022@"
                )
        );
        return mongoClient;
    }
}


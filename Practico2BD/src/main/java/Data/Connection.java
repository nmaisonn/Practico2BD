import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
import org.bson.Document;

public class Connection {
  private static Connection instance;
  private static MongoDatabase db;

  private Connection() {}

  public static Connection GetInstance() {
    if (instance == null) {
      instance = new Connection();
      createConnection();
    }
    return instance;
  }

  private static void createConnection() {
    MongoClient mongoClient = new MongoClient(
      new MongoClientURI(
        "mongodb://bd-2022:ZoDpyakc1et4L5QDSqot9NlohQcC3UImQbmjHo6GOhhRZLnYSoWiF6ySE4spt8Su1bql8M2b7PgvdgU9o6KFNA%3D%3D@bd-2022.mongo.cosmos.azure.com:10255/?ssl=true&replicaSet=globaldb&retrywrites=false&maxIdleTimeMS=120000&appName=@bd-2022@"
      )
    );
    db = mongoClient.getDatabase("bd_2022");
  }
}

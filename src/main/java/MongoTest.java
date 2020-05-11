import com.mongodb.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Srinivas_Chintakindhi
 */

public class MongoTest {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("warehouse");
        DBCollection collection = db.getCollection("users");

        ///Delete All documents before running example again
        WriteResult result = collection.remove(new BasicDBObject());
        System.out.println(result.toString());

        basicDBObject_Example(collection);
    }

        private static void basicDBObject_Example(DBCollection collection){
            BasicDBObject document = new BasicDBObject();
            document.put("name", "lokesh");
            document.put("website", "howtodoinjava.com");

            BasicDBObject documentDetail = new BasicDBObject();
            documentDetail.put("addressLine1", "Sweet Home");
            documentDetail.put("addressLine2", "Karol Bagh");
            documentDetail.put("addressLine3", "New Delhi, India");

            document.put("number",Integer.valueOf(100));
            document.put("number2",Double.valueOf(10000));            document.put("address", documentDetail);


            collection.insert(document);


            DBObject doc = collection.findOne();
            System.out.println(doc);

            DBCursor cursor = collection.find();
            while(cursor.hasNext()){
                System.out.println(cursor.next());
            }

            DBObject query = new BasicDBObject();
            DBObject projection = new BasicDBObject();
            projection.put("name",1);
            projection.put("_id",0);

            cursor = collection.find(query,projection);
            while(cursor.hasNext())
                System.out.println(cursor.next());


            BasicDBObject inQuery = new BasicDBObject();

            inQuery.put("website", new BasicDBObject("$in", Arrays.asList("lokesh")));
             cursor = collection.find(inQuery);
            while(cursor.hasNext()) {
                System.out.println(cursor.next());
            }


        }


}

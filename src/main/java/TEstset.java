import com.mongodb.util.JSON;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Srinivas_Chintakindhi
 */

public class TEstset {
    public static void main(String[] args) throws ParseException {
        JSONObject one = new JSONObject();
        one.put("name","srinivas");
        one.put("address","shamshabad");

        JSONObject two = new JSONObject();
        two.put("name","srinivas");
        two.put("address","shamshabad");


        JSONArray values = new JSONArray();

        values.add(one);
        values.add(two);

        JSONArray values1 = new JSONArray();

        values1.add(one);
        values1.add(two);

        values.addAll(values1);

        Set<JSONObject> uniques = new HashSet<JSONObject>(values);


        for (JSONObject unique : uniques) {
            System.out.println(uniques);
        }

//        uniques.toString();
//
//        JSONParser parser = new JSONParser();
//        JSONArray parse = (JSONArray) parser.parse(uniques.toString());
//        System.out.println(parse);

        //jsonarrary - set - string - jsonarray

//
//        Set<>
//        Set<JSONObject> un = new HashSet<JSONObject>();
//        un.add(two);
//        un.add(one);
//
//        for (JSONObject jsonObject : un) {
//            System.out.println(jsonObject);
//        }


    }
}

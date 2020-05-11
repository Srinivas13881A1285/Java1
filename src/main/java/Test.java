import com.jayway.jsonpath.JsonPath;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test {
    public static void main(String[] args) throws ParseException {

            JSONObject mainObj = new JSONObject();

            JSONObject mappingObj = new JSONObject();
            mappingObj.put("some other","data");


            mainObj.put("mapping",mappingObj);

        String key = "some other";

        String path = "['"  +key+  "']";
        System.out.println("path = " + path);

        String mapping = JsonPath.parse(mappingObj).read(path).toString();
        System.out.println(mapping);

        path = "['mapping']['@'some other']";
        path = "$['store']['book'][0]['author']";

        path = "$['store']['book'][?]";

        path = "['internalCategoryId']";

        path = "['internalSubCategoryId']";



        int i = path.lastIndexOf("['");
        int  j =  path.lastIndexOf("']");
        System.out.println(path.substring(i+2,j));
    }
}

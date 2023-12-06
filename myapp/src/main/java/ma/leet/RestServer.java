package ma.leet.myapp;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;

public class RestServer {

    public static void main(String[] args) {
        Gson gson = new Gson();
        get("/hello", (req, res)->{
            Map<String,Object> data = new HashMap();
            data.put("name", "Mohamed");
            data.put("salary", "6500");
            res.type("application/json"); 
            return data;
        }, gson::toJson);
    }
}

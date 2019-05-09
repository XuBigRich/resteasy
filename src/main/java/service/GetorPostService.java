package service;


import javax.ws.rs.*;
import java.util.HashMap;
import java.util.Map;

@Path("/")
//返回类型注解json类型 编码是utf-8
@Produces("application/json;charset=UTF-8")
public class GetorPostService {
    @Path("/post")
    @POST
    public Map post(@FormParam("age") int age, @FormParam("name") String name,@FormParam("tel") String tel) {
        Map map = new HashMap();
        try {
            map.put("status", "y");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return map;
    }
    @Path("/get")
    @GET
    public void text(@QueryParam("age") int age){
        System.out.println(age);
    }
}

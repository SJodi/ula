package Test.API;

import java.util.HashMap;
import java.util.Map;

public class ApiBody {

    //Creat New User
    public static String name = "morpheus";
    public static String job = "leader";
    public static String createuser = "{\"name\":\""+name+"\",\"job\":\""+job+"\"}";

    //Register success body
    public static String email = "eve.holt@reqres.in";
    public static String password = "pistol";
    public static String registersucess = "{\"email\":\""+email+"\",\"password\":\""+password+"\"}";

    //Register failed body
    public static String emailregisterfailed = "sydney@fife";
    public static String registerfailed = "{\"email\":\""+emailregisterfailed+"\"}";

    //Login Body
    public static String emaillogin = "eve.holt@reqres.in";
    public static String passwordlogin = "cityslicka";
    public static String login = "{\"email\":\""+emaillogin+"\",\"password\":\""+passwordlogin+"\"}";

    //Login Body Failed
    public static String emailoginfailed = "peter@klaven";
    public static String loginfailed = "{\"email\":\""+emailoginfailed+"\"}";

    //PUT update data
    public static String nameupdatdata = "morpheus";
    public static String jobupdatedata = "zion resident";
    public static String putupdatedata = "{\"name\":\""+nameupdatdata+"\",\"job\":\""+jobupdatedata+"\"}";

    //PATCH data
    public static String namepatchdata = "morpheus";
    public static String jobpatchdata = "zion resident";
    public static String patchupdatedata = "{\"name\":\""+namepatchdata+"\",\"job\":\""+jobpatchdata+"\"}";

}


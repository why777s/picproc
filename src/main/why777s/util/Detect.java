package util;

import com.baidu.aip.imagecensor.AipImageCensor;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by why777s on 2017/6/23.
 */
public class Detect {
    //设置APPID/AK/SK
    public static final String APP_ID = "###你的app_id###";
    public static final String API_KEY = "###你的api_key###";
    public static final String SECRET_KEY = "###你的secret_key###";

    public String pronLevel(String path){
        AipImageCensor client = new AipImageCensor(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 调用色情识别接口
        JSONObject res = client.antiPorn(path);
        System.out.println(res);
        return res.get("conclusion").toString();

    }

    public String terrorLevel(String path){
        AipImageCensor client = new AipImageCensor(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 调用色情识别接口
        JSONObject res = client.antiTerror(path);
        System.out.println(res);
        if(Double.valueOf(res.get("result").toString())>0.5)
            return "暴恐";
        else
            return "正常";
    }

}

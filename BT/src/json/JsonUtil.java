package json;

import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonUtil {
	public ArrayList<String> StringFromJson (String jsondata)
	{     
		Type listType = new TypeToken<ArrayList<String>>(){}.getType();
		Gson gson=new Gson();
		ArrayList<String> list=gson.fromJson(jsondata, listType);
		return list;

	}

}

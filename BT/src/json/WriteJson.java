package json;

import java.util.ArrayList;


import com.google.gson.Gson;

public class WriteJson {
	public String getJsonData(ArrayList<?> list)
	{
		Gson gson=new Gson();
		String jsonstring=gson.toJson(list);
		return jsonstring;
	}
}

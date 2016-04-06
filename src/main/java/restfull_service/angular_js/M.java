package restfull_service.angular_js;

import com.google.gson.Gson;

public class M
{
	public static void main(String[] args){
		TestServiceRequest request = new TestServiceRequest();
		request.firstName = "Jeebs";
		request.lastName = "Nandy";
		
		Gson g = new Gson();
		System.out.println(g.toJson(request));
	}
}

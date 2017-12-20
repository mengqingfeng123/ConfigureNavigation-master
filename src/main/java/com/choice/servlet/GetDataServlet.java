package com.choice.servlet;
import com.choice.http.HttpRequest;
import com.choice.http.HttpResponse;
import util.ModityConfig;

public class GetDataServlet implements Servlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) {
        System.out.println("进入到取数据...");
        String json =MyJson.mapToJSON(ModityConfig.getValue(request.getParameterMap()));
        response.printResponseData(json);
    }
}

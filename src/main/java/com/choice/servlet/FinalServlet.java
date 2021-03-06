package com.choice.servlet;

import java.util.Map;

import com.choice.http.HttpRequest;
import com.choice.http.HttpResponse;
import util.ModityConfig;

public class FinalServlet implements Servlet{
	
    @Override
    public void service(HttpRequest request, HttpResponse response) {

        //获取处理后的参数
        Map<String, String> map=request.getParameterMap();

        MyJson myJson = ModityConfig.isPing(map);
        if (myJson.getTypeParm().equals("0")) {
            response.printResponseData(myJson.typeAndMassageJSON());
            return;
        }

        //处理数据
        map = ModityConfig.processData(map);
        //存
        String type = ModityConfig.update(map) ? "1" : "2";
        //成功
        myJson = new MyJson(type, "");
        response.printResponseData(myJson.typeAndMassageJSON());

    }

}

package com.wangsu.spring.boot.json1.json;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Base64;


public class JsonTest1 {
    //将json转为数组，并从中取出数据
    @Test
    public void testJsonPaser(){
        String s="[{'a':'a1','b':'b1'},{'a':'a2','b':'b2'}]";
        JSONArray objects = JSON.parseArray(s);
        for (int i=0;i<objects.size();i++){
            JSONObject jsonObject = objects.getJSONObject(i);
            String str=jsonObject.getString("a");
            System.out.println(str);
        }
    }
    @Test
    public void testBase64Encode(){
        String s="[{'a':'a1','b':'b1'},{'a':'a2','b':'b2'}]";
        byte[] sBytes = s.getBytes();
        String sbyte=new String(sBytes);
        System.out.println(sbyte);
        System.out.println(sBytes[0]);
        byte[] bytes={1,2,3,4,5};
        System.out.println(bytes[0]);
        byte[] encodeBytes = Base64.getEncoder().encode(bytes);
        System.out.println(encodeBytes[2]);
        byte[] decodeBytes = Base64.getDecoder().decode(encodeBytes);
        System.out.println(decodeBytes[2]);
    }
}

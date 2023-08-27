package com.rahul.restassured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Exp_PUT {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("empid", 101);
		obj.put("efn", "selenium4");
		
		Response resp = RestAssured.given().
				contentType(ContentType.JSON).
				body(obj.toJSONString()).
				put("https://reqres.in/api/users/2");
		
		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
		System.out.println(resp.getTime());
		System.out.println(resp.asString());
		

	}

}

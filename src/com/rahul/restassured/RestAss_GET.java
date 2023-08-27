package com.rahul.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAss_GET {

	public static void main(String[] args) {
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
		System.out.println(resp.getTime());
		
		System.out.println("===================");
		Response resp1 = RestAssured.get("https://reqres.in/api/users/2");
		String data = resp1.asString();
		System.out.println(data);
		System.out.println(resp1.getTime());
		   

	}

}

package com.bulletproof;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonArray;

@SpringBootApplication
public class CsvJsonApplication {

    public static HashMap<String, Customer> hmCustomer;
    public static long ID;
    public static JsonArray jsonCustomer;

    public static void main(String[] args) throws FileNotFoundException, IOException, JSONException {

	Parser parser = new Parser();
	parser.parseData();
	jsonCustomer = parser.getJsondata();
	postJsonData();

	SpringApplication.run(CsvJsonApplication.class, args);
    }

    /**
     * Sends the json string data to application 2.
     */
    private static void postJsonData() {
	// rest api of application2 . Application 2 must be be running .
	String url = "http://localhost:8090/rest/addallcustomer";
	HttpHeaders httpHeaders = new HttpHeaders();
	httpHeaders.set("Content-Type", "application/json");
	HttpEntity<String> httpEntity = new HttpEntity<String>(jsonCustomer.toString(), httpHeaders);

	RestTemplate restTemplate = new RestTemplate();
	// post the data to rest end point of application 2.
	String response = restTemplate.postForObject(url, httpEntity, String.class);
    }

}

package com.bulletproof;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.JsonArray;

@SpringBootApplication
public class CsvJsonApplication {

    public static HashMap<String, Customer> hmCustomer;
    public static long ID;
    public static JsonArray jsonCustomer;

    public static void main(String[] args) throws FileNotFoundException, IOException {

	Parser parser = new Parser();
	parser.parseData();
	jsonCustomer = parser.getJsondata();

	SpringApplication.run(CsvJsonApplication.class, args);
    }

}

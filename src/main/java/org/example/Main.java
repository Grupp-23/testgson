package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(jsonString);

            JSONObject jsonObject = (JSONObject) obj;

            String name = (String) jsonObject.get("name");
            long age = (long) jsonObject.get("age");
            String city = (String) jsonObject.get("city");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
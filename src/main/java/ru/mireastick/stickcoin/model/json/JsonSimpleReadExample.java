package ru.mireastick.stickcoin.model.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.annotation.Resource;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class JsonSimpleReadExample {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();


        try (Reader reader = new FileReader("src/main/resources/blockchain.json")) {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONArray msg = (JSONArray) jsonObject.get("blockChain");
            JSONObject blockChain = (JSONObject) msg.get(0);
            System.out.println(blockChain.get("previousHash"));
            System.out.println(msg.get(0));
//            JSO
//            JSONObject jsonObject = (JSONObject) parser.parse(reader);
//            System.out.println(jsonObject);
//
//            String name = (String) jsonObject.get("name");
//            System.out.println(name);
//
//            long age = (Long) jsonObject.get("age");
//            System.out.println(age);
//
//            // loop array
//            JSONArray msg = (JSONArray) jsonObject.get("messages");
//
//            System.out.println( msg.get(msg.size()-1));
//            Iterator<String> iterator = msg.iterator();
////            while (iterator.hasNext()) {
////                System.out.println(iterator.next());
////            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}
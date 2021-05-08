package com;

import java.io.*;
import java.net.*;

//import org.json.JSONObject;

import com.google.gson.*;

class ReadJson {
    public static void main(String[] args) {
       try {
        StringBuilder result = new StringBuilder();
       // URL url = new URL("http://challenges.hackajob.co/swapi/api/films/?format=json");
        URL url= new URL("https://raw.githubusercontent.com/openfootball/football.json/198f60ce50ac427dadc16a35ef4ad65edcea3125/2014-15/en.1.json");
        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
          result.append(line);
          
        }
        rd.close();
        System.out.println("hi"+result);
        
        JsonObject jsonObject = new JsonParser().parse(result.toString()).getAsJsonObject();
        int i=1;
        int score,totScore=0,fi;
        JsonElement matches= jsonObject.getAsJsonArray("rounds").get(1).getAsJsonObject().get("matches");
        System.out.println(matches);
        while(jsonObject.getAsJsonArray("rounds").size()>i && jsonObject.getAsJsonArray("rounds").get(i).getAsJsonObject().get("matches")!=null){
        	 matches=(jsonObject.getAsJsonArray("rounds").get(i).getAsJsonObject().get("matches"));
        	 System.out.println("i"+i);
        	int j=0;
        	while(matches.getAsJsonArray().size()>j && matches.getAsJsonArray().get(j).getAsJsonObject().get("team1").getAsJsonObject().get("key")!=null){
        		//System.out.println(".."+matches.getAsJsonArray().get(j).getAsJsonObject().get("team1").getAsJsonObject().get("key"));
        	if(matches.getAsJsonArray().get(j).getAsJsonObject().get("team1").getAsJsonObject().get("key").toString().contains("manutd") ){
        		  score = Integer.parseInt(matches.getAsJsonArray().get(j).getAsJsonObject().get("score1").toString());
        		  
        		  totScore += score;
        		  System.out.println("....."+totScore);
        	}
        	else if(matches.getAsJsonArray().get(j).getAsJsonObject().get("team2").getAsJsonObject().get("key").toString().contains("manutd")){
      		  score = Integer.parseInt(matches.getAsJsonArray().get(j).getAsJsonObject().get("score2").toString());
      		  totScore += score;
      	}
        	else
        		 fi=0;
        	j++;
        	
        	}
        	
        	i++;
        	System.out.println("i++");
        }
        System.out.println("total score "+totScore);
       // System.out.println(matches.getAsJsonArray().get(10).getAsJsonObject().get("team1").getAsJsonObject().get("key") );
        //System.out.println(matches.getAsJsonArray().get(1).getAsJsonObject().get("score1"));
       // System.out.println(((JsonElement) jsonObject.getAsJsonArray("rounds").get(1)).getAsJsonObject().get("matches"));
      } catch (Exception e) {
    	  System.out.println(e);
      }
    }
}

package com.plasticcat.ddspellbook;

import org.json.JSONException;
import org.json.JSONObject;

public class Spell {
	private String mName;
	private String mDesc;
	
	public Spell(JSONObject data){
		try {
			mName = data.getString("name");
			mDesc = data.getString("desc");
			
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public void printDetails(){
		System.out.println("Spell Name: " + mName);
		System.out.println("Spell Description: " + mDesc);
	}
	
	public String getName(){
		return mName;
	}
	public String getDesc(){
		return mDesc;
	}

}

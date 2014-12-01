package com.plasticcat.ddspellbook;

import org.json.JSONException;
import org.json.JSONObject;

public class Spell {
	private String mName;
	private String mType;
	private String mDesc;
	private String mCastTime;
	private String mRange;
	private String mComponents;
	private String mDuration;
	private String mHigherLevelMod;
	
	public Spell(JSONObject data){
		try {
			mName = data.getString("name");
			mType = data.getString("type");
			mDesc = data.getString("desc");
			mCastTime = data.getString("castTime");
			mRange = data.getString("range");
			mComponents = data.getString("components");
			mDuration = data.getString("duration");
			mHigherLevelMod = data.getString("higherLevelMod");
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public String getName(){
		return mName;
	}
	public String getDesc(){
		return mDesc;
	}
	public String getType(){
		return mType;
	}
	public String getCastTime(){
		return mCastTime;
	}
	public String getRange(){
		return mRange;
	}
	public String getComponents(){
		return mComponents;
	}
	public String getDuration(){
		return mDuration;
	}
	public String getHigherLevelMod(){
		return mHigherLevelMod;
	}

}

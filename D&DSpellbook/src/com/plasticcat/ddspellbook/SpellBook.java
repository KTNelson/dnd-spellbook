package com.plasticcat.ddspellbook;

import java.util.Vector;
import org.json.*;
import com.plasticcat.ddspellbook.Spell;

public class SpellBook {
	
	private Vector<Spell> mSpells;
	
	public SpellBook(){
		mSpells = new Vector<Spell>();
	}
	
	public void createFromJson(JSONObject data){
		try {
			JSONArray spells = data.getJSONArray("Spells");
			for(int i = 0; i < spells.length(); i++){
				JSONObject spellObj = spells.getJSONObject(i);
				
				mSpells.add(new Spell(spellObj));				
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Spell spell : mSpells){
			spell.printDetails();
		}
		
	}
	
	public Spell getSpell(int index){
		return mSpells.get(index);
	}

}

package com.plasticcat.ddspellbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SpellView {
	
	private RelativeLayout layout;
	
	public SpellView(Context context, Spell spell, ViewGroup parent){
		
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	
		layout = (RelativeLayout)inflater.inflate(R.layout.spell, parent);
		
		TextView nameView = (TextView)layout.findViewById(R.id.spellName);
		nameView.setText(spell.getName());
		
		TextView descView = (TextView)layout.findViewById(R.id.spellDesc);
		descView.setText(spell.getDesc());
		
		
		
	}
	
	public RelativeLayout getLayout(){
		return layout;
	}

}

package com.plasticcat.ddspellbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SpellView {
	
	private RelativeLayout view;
	
	public SpellView(Context context, Spell spell, ViewGroup parent){
		
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	
		view = (RelativeLayout)inflater.inflate(R.layout.spell, null);
		
		TextView nameView = (TextView)view.findViewById(R.id.spellName);
		nameView.setText(spell.getName());
		
		TextView descView = (TextView)view.findViewById(R.id.spellDesc);
		descView.setText(spell.getDesc());
		
		TextView typeView = (TextView)view.findViewById(R.id.spellType);
		typeView.setText(spell.getType());
		
		TextView castTimeView = (TextView)view.findViewById(R.id.SpellCastTime);
		castTimeView.setText(spell.getCastTime());
		
		TextView rangeView = (TextView)view.findViewById(R.id.spellRange);
		rangeView.setText(spell.getRange());
		
		TextView componentsView = (TextView)view.findViewById(R.id.spellComponents);
		componentsView.setText(spell.getComponents());
		
		TextView durationView = (TextView)view.findViewById(R.id.spellDuration);
		durationView.setText(spell.getDuration());
		
		TextView higherLevelModView = (TextView)view.findViewById(R.id.spellHigherLevelMod);
		higherLevelModView.setText(spell.getHigherLevelMod());
	}

	public RelativeLayout getView(){
		return view;
	}
}

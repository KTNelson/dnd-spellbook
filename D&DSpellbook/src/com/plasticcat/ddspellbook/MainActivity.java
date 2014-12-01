package com.plasticcat.ddspellbook;

import java.io.IOException;
import java.io.InputStream;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	private SpellBook testBook;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		testBook = new SpellBook();
		
		try {
			JSONObject data = new JSONObject(loadJSONFromAsset());
			testBook.createFromJson(data);			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ViewGroup parentView = (ViewGroup)findViewById(R.id.scrollLayout);
		
		for(int i = 0; i < testBook.getSize(); i++){
			SpellView newView = new SpellView(getApplicationContext(), testBook.getSpell(i), parentView);
			parentView.addView(newView.getView());
		}
	}



	public String loadJSONFromAsset() {
        String json = null;
        try {

            InputStream is = getAssets().open("bard_spells.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

}

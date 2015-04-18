
package com.bbm.dhian;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.view.Window;
import android.widget.ImageView;
import android.net.Uri;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;

public class CoverPictureChanger extends Activity {

	String imageUri, imageUri2, imageUri3, imageUri4;
    ImageView cover1, cover2, cover3,cover4;
    Uri uri;
	SharedPreferences pf1, pf2,pf3,pf4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getID("cover_changer","layout"));
		cover1 = (ImageView)findViewById(getID("cover1","id"));
		cover2 = (ImageView)findViewById(getID("cover2","id"));
		cover3 = (ImageView)findViewById(getID("cover3","id"));
		cover4 = (ImageView)findViewById(getID("cover4","id"));
        pilihCover();
    }

    
    private void pilihCover() {

        final String [] items   = new String [] {"Cover Picture 1", "Cover Picture 2","Cover Picture 3","Cover Picture 4", "Reset To Default Cover"};    
		ArrayAdapter<String> adapter  = new ArrayAdapter<String> (this, android.R.layout.select_dialog_item,items);
		AlertDialog.Builder builder   = new AlertDialog.Builder(this);

		builder.setTitle("Select Image For Cover");
		builder.setAdapter( adapter, new DialogInterface.OnClickListener() {
				public void onClick( DialogInterface dialog, int item ) { //pick from camera
					if (item == 0) {
						Intent intent = new Intent();
						intent.setType("image/*");
						intent.setAction("android.intent.action.GET_CONTENT");
						CoverPictureChanger.this.startActivityForResult(Intent.createChooser((Intent)intent, (CharSequence)"Select Picture"), 1);
						
					} else if (item == 1){ 
						Intent intent = new Intent();
						intent.setType("image/*");
						intent.setAction("android.intent.action.GET_CONTENT");
						CoverPictureChanger.this.startActivityForResult(Intent.createChooser((Intent)intent, (CharSequence)"Select Picture"), 2);
					} else if (item == 2){ 
						Intent intent = new Intent();
						intent.setType("image/*");
						intent.setAction("android.intent.action.GET_CONTENT");
						CoverPictureChanger.this.startActivityForResult(Intent.createChooser((Intent)intent, (CharSequence)"Select Picture"), 3);
					} else if (item == 3){ 
						Intent intent = new Intent();
						intent.setType("image/*");
						intent.setAction("android.intent.action.GET_CONTENT");
						CoverPictureChanger.this.startActivityForResult(Intent.createChooser((Intent)intent, (CharSequence)"Select Picture"), 4);
					} else if (item == 4){
						try {
							pf1 = getSharedPreferences("Navisha", MODE_PRIVATE);
							pf2 = getSharedPreferences("Saffa", MODE_PRIVATE);
							pf3 = getSharedPreferences("Hardiansyah", MODE_PRIVATE);
							pf4 = getSharedPreferences("Avicha", MODE_PRIVATE);
							SharedPreferences.Editor editor = pf1.edit();
							SharedPreferences.Editor editor2 = pf2.edit();
							SharedPreferences.Editor editor3 = pf3.edit();
							SharedPreferences.Editor editor4 = pf4.edit();
							editor.clear();
							editor2.clear();
							editor3.clear();
							editor4.clear();
							editor.commit();
							editor2.commit();
							editor3.commit();
							editor4.commit();
						}
						catch (Exception e) {
						}
						do {
							android.os.Process.killProcess(android.os.Process.myPid());
						} while (true);
					}
				}
			});

		final AlertDialog dialog = builder.create();



		dialog.show();
		

	}
	
	protected void onActivityResult(int n, int n2, Intent intent) {
        super.onActivityResult(n, n2, intent);
        
	    if (n == 1 && intent != null) {   
			this.uri = Uri.parse((String)intent.getDataString());
			this.cover1.setImageURI(this.uri);
			SharedPreferences.Editor editor = this.getSharedPreferences("Navisha", 0).edit();
			editor.putString("cover1", this.uri.toString());
			editor.commit();
			Intent intent2 = new Intent();
			intent2.setAction("COVER1");
			intent2.putExtra("SATU", this.uri.toString());
			this.sendBroadcast(intent2);
			this.finish();
			return;
		}
		if (n == 2 && intent != null) {   
			this.uri = Uri.parse((String)intent.getDataString());
			this.cover2.setImageURI(this.uri);
			SharedPreferences.Editor editor = this.getSharedPreferences("Navisha", 0).edit();
			editor.putString("cover2", this.uri.toString());
			editor.commit();
			Intent intent4 = new Intent();
			intent4.setAction("COVER2");
			intent4.putExtra("DUA", this.uri.toString());
			this.sendBroadcast(intent4);
			this.finish();
			return;
		}
		if (n == 3 && intent != null) {   
			this.uri = Uri.parse((String)intent.getDataString());
			this.cover3.setImageURI(this.uri);
			SharedPreferences.Editor editor = this.getSharedPreferences("Navisha", 0).edit();
			editor.putString("cover3", this.uri.toString());
			editor.commit();
			Intent intent4 = new Intent();
			intent4.setAction("COVER3");
			intent4.putExtra("TIGA", this.uri.toString());
			this.sendBroadcast(intent4);
			this.finish();
			return;
		
		
    }
		if (n == 4 && intent != null) {   
			this.uri = Uri.parse((String)intent.getDataString());
			this.cover4.setImageURI(this.uri);
			SharedPreferences.Editor editor = this.getSharedPreferences("Navisha", 0).edit();
			editor.putString("cover4", this.uri.toString());
			editor.commit();
			Intent intent4 = new Intent();
			intent4.setAction("COVER4");
			intent4.putExtra("EMPAT", this.uri.toString());
			this.sendBroadcast(intent4);
			this.finish();
			return;
			}
	}
	public int getID(String name, String Type) {
		return getBaseContext().getResources().getIdentifier(name, Type, getBaseContext().getPackageName());
	}
	

}

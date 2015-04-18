package com.bbm.dhian;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class CoverPicture
extends ImageView {
    String coverUri;
    ImageView coverPic;
    String uri;

    public CoverPicture(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
		if(getId() == getID("cover0","id")){
        this.coverPic = (ImageView)this.findViewById(getID("cover0","id"));
        this.coverUri = context.getSharedPreferences("Navisha", 0).getString("coverPic", "null");
        if (this.coverUri == "null") {
            this.coverPic.setImageResource(getID("default_cover0","drawable"));
        } else {
            this.coverPic.setImageURI(Uri.parse((String)this.coverUri));
        }
        BroadcastReceiver mReceiver = new BroadcastReceiver(){

            public void onReceive(Context context2, Intent intent) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("Navisha", 0);
                CoverPicture.this.coverUri = sharedPreferences.getString("coverPic", "null");
                if (CoverPicture.this.coverUri == "null") {
                    CoverPicture.this.coverPic.setImageResource(getID("default_cover0","drawable"));
                    return;
                }
                CoverPicture.this.coverPic.setImageURI(Uri.parse((String)CoverPicture.this.coverUri));
            }
        };
        context.registerReceiver((BroadcastReceiver)new BroadcastReceiver(){

									 public void onReceive(Context context2, Intent intent) {
										 CoverPicture.this.uri = intent.getStringExtra("SATU");
										 CoverPicture.this.coverPic.setImageURI(Uri.parse((String)CoverPicture.this.uri));
										 SharedPreferences.Editor editor = context.getSharedPreferences("Navisha", 0).edit();
										 editor.putString("coverPic", CoverPicture.this.uri);
										 editor.commit();
									 }
								 }, new IntentFilter("COVER1"));
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addDataScheme("file");
        context.registerReceiver((BroadcastReceiver)mReceiver, intentFilter);
		}
		if(getId() == getID("cover1","id")){
			this.coverPic = (ImageView)this.findViewById(getID("cover1","id"));
			this.coverUri = context.getSharedPreferences("Saffa", 0).getString("coverPic1", "null");
			if (this.coverUri == "null") {
				this.coverPic.setImageResource(getID("default_cover1","drawable"));
			} else {
				this.coverPic.setImageURI(Uri.parse((String)this.coverUri));
			}
			BroadcastReceiver mReceiver = new BroadcastReceiver(){

				public void onReceive(Context context2, Intent intent) {
					SharedPreferences sharedPreferences = context.getSharedPreferences("Saffa", 0);
					CoverPicture.this.coverUri = sharedPreferences.getString("coverPic1", "null");
					if (CoverPicture.this.coverUri == "null") {
						CoverPicture.this.coverPic.setImageResource(getID("default_cover1","drawable"));
						return;
					}
					CoverPicture.this.coverPic.setImageURI(Uri.parse((String)CoverPicture.this.coverUri));
				}
			};
			context.registerReceiver((BroadcastReceiver)new BroadcastReceiver(){

										 public void onReceive(Context context2, Intent intent) {
											 CoverPicture.this.uri = intent.getStringExtra("DUA");
											 CoverPicture.this.coverPic.setImageURI(Uri.parse((String)CoverPicture.this.uri));
											 SharedPreferences.Editor editor = context.getSharedPreferences("Saffa", 0).edit();
											 editor.putString("coverPic1", CoverPicture.this.uri);
											 editor.commit();
										 }
									 }, new IntentFilter("COVER2"));
			IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_SCANNER_FINISHED");
			intentFilter.addDataScheme("file");
			context.registerReceiver((BroadcastReceiver)mReceiver, intentFilter);
		}
		if(getId() == getID("cover2","id")){
			this.coverPic = (ImageView)this.findViewById(getID("cover2","id"));
			this.coverUri = context.getSharedPreferences("Hardiansyah", 0).getString("coverPic2", "null");
			if (this.coverUri == "null") {
				this.coverPic.setImageResource(getID("default_cover2","drawable"));
			} else {
				this.coverPic.setImageURI(Uri.parse((String)this.coverUri));
			}
			BroadcastReceiver mReceiver = new BroadcastReceiver(){

				public void onReceive(Context context2, Intent intent) {
					SharedPreferences sharedPreferences = context.getSharedPreferences("Hardiansyah", 0);
					CoverPicture.this.coverUri = sharedPreferences.getString("coverPic2", "null");
					if (CoverPicture.this.coverUri == "null") {
						CoverPicture.this.coverPic.setImageResource(getID("default_cover2","drawable"));
						return;
					}
					CoverPicture.this.coverPic.setImageURI(Uri.parse((String)CoverPicture.this.coverUri));
				}
			};
			context.registerReceiver((BroadcastReceiver)new BroadcastReceiver(){

										 public void onReceive(Context context2, Intent intent) {
											 CoverPicture.this.uri = intent.getStringExtra("TIGA");
											 CoverPicture.this.coverPic.setImageURI(Uri.parse((String)CoverPicture.this.uri));
											 SharedPreferences.Editor editor = context.getSharedPreferences("Hardiansyah", 0).edit();
											 editor.putString("coverPic2", CoverPicture.this.uri);
											 editor.commit();
										 }
									 }, new IntentFilter("COVER3"));
			IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_SCANNER_FINISHED");
			intentFilter.addDataScheme("file");
			context.registerReceiver((BroadcastReceiver)mReceiver, intentFilter);
		}
		if(getId() == getID("cover3","id")){
			this.coverPic = (ImageView)this.findViewById(getID("cover3","id"));
			this.coverUri = context.getSharedPreferences("Avicha", 0).getString("coverPic3", "null");
			if (this.coverUri == "null") {
				this.coverPic.setImageResource(getID("default_cover3","drawable"));
			} else {
				this.coverPic.setImageURI(Uri.parse((String)this.coverUri));
			}
			BroadcastReceiver mReceiver = new BroadcastReceiver(){

				public void onReceive(Context context2, Intent intent) {
					SharedPreferences sharedPreferences = context.getSharedPreferences("Avicha", 0);
					CoverPicture.this.coverUri = sharedPreferences.getString("coverPic3", "null");
					if (CoverPicture.this.coverUri == "null") {
						CoverPicture.this.coverPic.setImageResource(getID("default_cover3","drawable"));
						return;
					}
					CoverPicture.this.coverPic.setImageURI(Uri.parse((String)CoverPicture.this.coverUri));
				}
			};
			context.registerReceiver((BroadcastReceiver)new BroadcastReceiver(){

										 public void onReceive(Context context2, Intent intent) {
											 CoverPicture.this.uri = intent.getStringExtra("EMPAT");
											 CoverPicture.this.coverPic.setImageURI(Uri.parse((String)CoverPicture.this.uri));
											 SharedPreferences.Editor editor = context.getSharedPreferences("Avicha", 0).edit();
											 editor.putString("coverPic3", CoverPicture.this.uri);
											 editor.commit();
										 }
									 }, new IntentFilter("COVER4"));
			IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_SCANNER_FINISHED");
			intentFilter.addDataScheme("file");
			context.registerReceiver((BroadcastReceiver)mReceiver, intentFilter);
		}
    }
	public int getID(String name, String Type) {
		return getContext().getResources().getIdentifier(name, Type, getContext().getPackageName());
	}

}


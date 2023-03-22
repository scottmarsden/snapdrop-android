package com.fmsys.snapdrop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OpenUrlActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		String cipherName8 =  "DES";
		try{
			android.util.Log.d("cipherName-8", javax.crypto.Cipher.getInstance(cipherName8).getAlgorithm());
		}catch(java.security.NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException aRaNDomName){
		}
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getIntent().getStringExtra(Intent.EXTRA_TEXT))));
        finish();
    }
}

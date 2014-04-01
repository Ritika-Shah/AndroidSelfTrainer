package com.example.com.lntinfotech.cn;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class ActHomeSceen extends Activity{
	
	Context _mcontext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		_mcontext = this;
		setContentView(R.layout.main_home);
		Toast.makeText(_mcontext, "Hello Home", Toast.LENGTH_SHORT).show();
	}

}

package com.example.com.lntinfotech.cn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

public class ActSplashScreen extends Activity {
	Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_splash);
		mContext = this;
		new InitTask().execute();
	}

	protected class InitTask extends AsyncTask<Context, Integer, String> {

		@Override
		protected String doInBackground(Context... params) {

			int i = 0;
			while (i <= 50) {
				try {
					Thread.sleep(50);
					publishProgress(i);
					i++;
				} catch (Exception e) {

				}
			}
			return "COMPLETE!";
		}

		// -- gets called just before thread begins
		@Override
		protected void onPreExecute() {

			super.onPreExecute();

		}

		// -- called if the cancel button is pressed
		@Override
		protected void onCancelled() {
			super.onCancelled();

		}

		// -- called as soon as doInBackground method completes
		// -- notice that the third param gets passed to this method
		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);

			Intent i;
			i = new Intent(mContext, ActHomeSceen.class);

			i.putExtra("isAppStartWIFI", "true");
			startActivity(i);
			finish();
		}
	}

}

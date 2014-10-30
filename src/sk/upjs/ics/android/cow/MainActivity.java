package sk.upjs.ics.android.cow;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;

public class MainActivity extends Activity {

	private MediaPlayer mediaPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		
		mediaPlayer = MediaPlayer.create(this, R.raw.cow);
	}


	public void obrazokOnClick(View v) {
		mediaPlayer.start();
	}
	
	@Override
	protected void onPause() {
		super.onPause();

		mediaPlayer.release();
	}

}

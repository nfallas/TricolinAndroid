package tricolinenandroid2.games;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Juego extends Activity{
	
	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState ){
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.juego);		
		
		Intent intent = getIntent();
	    String message = intent.getStringExtra(UnJugador.EXTRA_MESSAGE);
		
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    textView.setText(message);
	    
	    setContentView(textView);
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
	
	public void puntuacion(View view) {
		Intent p = new Intent(this, Puntuacion.class);
		startActivity(p);
	}
}

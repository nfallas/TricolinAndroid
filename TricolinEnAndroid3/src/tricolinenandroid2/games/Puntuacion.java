package tricolinenandroid2.games;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Puntuacion extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState ){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puntuacion);		
	}
	public void menu(View view) {
		Intent m = new Intent(this, Inicio.class);
		startActivity(m);
	}
}

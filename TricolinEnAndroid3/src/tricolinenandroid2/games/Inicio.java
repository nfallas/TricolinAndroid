package tricolinenandroid2.games;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Inicio extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio, menu);
		return true;
	}
	
	public void lanzarAcercaDe(View view) {
		Intent i = new Intent(this, AcercaDe.class);
		startActivity(i);
	}
	
	public void unJugador(View view) {
		Intent u = new Intent(this, UnJugador.class);
		startActivity(u);
	}
	
	public void salir(View view) {
		finish();
	}
	
	public void Juego(View view) {
		Intent u = new Intent(this, Juego.class);
		startActivity(u);
	}

}


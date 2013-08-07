package tricolinenandroid2.games;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
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
	    
	    //setContentView(textView);
	    setContentView(new EjemploView(this));
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
	public class EjemploView extends View{
		private Drawable fondo; //miImagen
		private Drawable cubo;
		
		
		
		
		
		public EjemploView(Context context) {
			super(context);
			
			Resources res = context.getResources();
			fondo = res.getDrawable(R.drawable.fondo);
			fondo.setBounds(-18, -4, 825,395);//(xInicial, yInicial, xFinal, yFinal)
			
			cubo = res.getDrawable(R.drawable.cuboprueba);
			cubo.setBounds(620, 220, 770, 340); //150*120
		}

		@Override
		protected void onDraw(Canvas canvas){
			Paint pincel = new Paint();
			pincel.setColor(Color.BLUE);
			pincel.setStrokeWidth(8);
			pincel.setStyle(Style.STROKE);
				
			
			fondo.draw(canvas);
			cubo.draw(canvas);
			
		}
		
	}
	
}

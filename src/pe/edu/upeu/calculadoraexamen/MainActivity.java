package pe.edu.upeu.calculadoraexamen;

import pe.edu.upeu.calculadoraexamen.CalculadoraEstandar;
import pe.edu.upeu.calculadoraexamen.R;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
        
    public void onIngresar(View v){
		Intent inte=new Intent();
		
		inte.setClass(this, CalculadoraEstandar.class);
				
    	startActivity(inte);		
    }
    
    public void onIngresar1(View v){
		Intent inte=new Intent();
		
		inte.setClass(this, CalculadoraCientifica.class);
		
    	startActivity(inte);		
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    }
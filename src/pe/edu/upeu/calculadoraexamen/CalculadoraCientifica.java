package pe.edu.upeu.calculadoraexamen;

import pe.edu.upeu.calculadoraexamen.R;
import pe.edu.upeu.servicios.Servicios;
import android.support.v7.app.ActionBarActivity;
import android.R.integer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class CalculadoraCientifica extends ActionBarActivity implements OnClickListener {
	

	boolean decimal = false;
	boolean suma = false;
	boolean resta = false;
	boolean mul = false;
	boolean div = false;
	boolean sen = false;
	boolean cos = false;
	boolean tan = false;
	boolean raiz = false;
	boolean logaritmo = false;
	boolean facto = false;
	boolean potenci = false;
	boolean cuadrad = false;
	boolean cubo = false;
	boolean cub = false;
	boolean exp = false;
	boolean diesexp = false;
	boolean unoexp = false;
	Double[] numero = new Double[20];
	Double resultado;
	Double m;
	Double n;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculadora_cientifica);
	
		Button n0 = (Button)findViewById(R.id.btn0);
		n0.setOnClickListener(this);
		Button n1 = (Button)findViewById(R.id.btn1);
		n1.setOnClickListener(this);
		Button n2 = (Button)findViewById(R.id.btn2);
		n2.setOnClickListener(this);
		Button n3 = (Button)findViewById(R.id.btn3);
		n3.setOnClickListener(this);
		Button n4 = (Button)findViewById(R.id.btn4);
		n4.setOnClickListener(this);
		Button n5 = (Button)findViewById(R.id.btn5);
		n5.setOnClickListener(this);
		Button n6 = (Button)findViewById(R.id.btn6);
		n6.setOnClickListener(this);
		Button n7 = (Button)findViewById(R.id.btn7);
		n7.setOnClickListener(this);
		Button n8 = (Button)findViewById(R.id.btn8);
		n8.setOnClickListener(this);
		Button n9 = (Button)findViewById(R.id.btn9);
		n9.setOnClickListener(this);
		
		Button punto = (Button)findViewById(R.id.btnPunto);
		punto.setOnClickListener(this);
		
		Button suma = (Button)findViewById(R.id.btnSuma);
		suma.setOnClickListener(this);
		Button resta = (Button)findViewById(R.id.btnResta);
		resta.setOnClickListener(this);
		Button mul = (Button)findViewById(R.id.btnMul);
		mul.setOnClickListener(this);
		Button div = (Button)findViewById(R.id.btnDiv);
		div.setOnClickListener(this);
		Button igual = (Button)findViewById(R.id.btnIgual);
		igual.setOnClickListener(this);		
		Button  borrar = (Button)findViewById(R.id.btnBorrar);
		borrar.setOnClickListener(this);             
                  
		Button limpiar = (Button)findViewById(R.id.btnLimpiar);
		limpiar.setOnClickListener(this);
		
		Button seno = (Button)findViewById(R.id.btnSen);
		seno.setOnClickListener(this);
		Button cos = (Button)findViewById(R.id.btnCos);
		cos.setOnClickListener(this);
		Button tan = (Button)findViewById(R.id.btnTan);
		tan.setOnClickListener(this);
		Button rai = (Button)findViewById(R.id.btnRaiz);
		rai.setOnClickListener(this);
		Button loga = (Button)findViewById(R.id.btnLog);
		loga.setOnClickListener(this);
		Button fact = (Button)findViewById(R.id.btnFactorial);
		fact.setOnClickListener(this);
		Button raiy = (Button)findViewById(R.id.btnRaizY);
		raiy.setOnClickListener(this);
		Button cuadrad = (Button)findViewById(R.id.btnCuadrado);
		cuadrad.setOnClickListener(this);
		Button cubo = (Button)findViewById(R.id.btnRaizCubo);
		cubo.setOnClickListener(this);
		Button cub = (Button)findViewById(R.id.btnCubo);
		cub.setOnClickListener(this);
		Button exp = (Button)findViewById(R.id.btnExp);
		exp.setOnClickListener(this);
		Button diesexp = (Button)findViewById(R.id.btnDiesExp);
		diesexp.setOnClickListener(this);
		Button unoexp = (Button)findViewById(R.id.UnoEntreX);
		unoexp.setOnClickListener(this);
					
	}

	@Override
	public void onClick(View v) {
		
		TextView pantalla = (TextView)findViewById(R.id.texto1);
		int seleccion =v.getId();
		String a = pantalla.getText().toString();
				
		try{		
		switch(seleccion)		
		{		
		case R.id.btn0:
			pantalla.setText(a+"0");
			break;
		case R.id.btn1:
			pantalla.setText(a+"1");
			break;
		case R.id.btn2:
			pantalla.setText(a+"2");
			break;
		case R.id.btn3:
			pantalla.setText(a+"3");
			break;
		case R.id.btn4:
			pantalla.setText(a+"4");
			break;
		case R.id.btn5:
			pantalla.setText(a+"5");
			break;
		case R.id.btn6:
			pantalla.setText(a+"6");
			break;
		case R.id.btn7:
			pantalla.setText(a+"7");
			break;
		case R.id.btn8:
			pantalla.setText(a+"8");
			break;
		case R.id.btn9:
			pantalla.setText(a+"9");
			break;
		case R.id.btnPunto:
			if(decimal == false){
			pantalla.setText(a+".");	
			decimal = true;
			}else {return;
			}
			break;
		case R.id.btnRaiz:
			raiz = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (raiz=true){
				Servicios serv = new Servicios();
				resultado = serv.raiz(numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			raiz = false;
			break;
		
			

		case R.id.btnSuma:
			suma = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			break;
		case R.id.btnResta:
			resta = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			break;
		case R.id.btnMul:
			mul = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			break;
		case R.id.btnDiv:
			div = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			break;
		case R.id.UnoEntreX:
			unoexp = true;
			numero[0] = (double) 1;
			pantalla.setText("");
			decimal = false;
			break;
		case R.id.btnIgual:
			numero[1] = Double.parseDouble(a);
			
			if(suma == true){
				resultado = numero [0] + numero[1];
				pantalla.setText(String.valueOf(resultado));
			    }else if(resta == true){
				resultado = numero [0] - numero[1];
				pantalla.setText(String.valueOf(resultado));
				}else if(mul == true){	
				resultado = numero [0] * numero[1];
				pantalla.setText(String.valueOf(resultado));
				}else if(div == true){
				resultado = numero [0] / numero[1];
				pantalla.setText(String.valueOf(resultado));
				}else if(unoexp == true){
				resultado = numero [0] / numero[1];
				pantalla.setText(String.valueOf(resultado));
				}
			
				decimal = false;
				suma = false;
				resta = false;
				mul = false;
				div = false;
				unoexp = false;
	
			break;
		case R.id.btnBorrar:
			

			
			
			break;
		case R.id.btnLimpiar:
			pantalla.setText("");
			decimal = false;
			break;
		case R.id.btnSen:
			sen = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (sen=true){
				Servicios serv = new Servicios();
				resultado = serv.seno(numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			sen = false;
			break;
		case R.id.btnCos:
			cos = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (cos=true){
				Servicios serv = new Servicios();
				resultado = serv.coseno(numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			cos = false;
			break;
		case R.id.btnTan:
			tan = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (tan=true){
				Servicios serv = new Servicios();
				resultado = serv.tan(numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			tan = false;
			break;
			
		case R.id.btnLog:
			logaritmo = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (logaritmo=true){
				Servicios serv = new Servicios();
				resultado = serv.logaritmo(numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			logaritmo = false;
			break;
			
		case R.id.btnRaizCubo:
			cubo = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (cubo=true){
				Servicios serv = new Servicios();
				resultado = serv.cubo(numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			cubo = false;
			break;
			
		case R.id.btnCuadrado:
			cuadrad = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (cuadrad=true){
				Servicios serv = new Servicios();
				resultado = serv.elevadocuadrado(numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			cuadrad = false;
			break;
		case R.id.btnCubo:
			cub = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (cub=true){
				Servicios serv = new Servicios();
				resultado = serv.elevadocubo(numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			cub = false;
			break;
		case R.id.btnExp:
			exp = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (exp=true){
				Servicios serv = new Servicios();
				resultado = serv.elevadoexponente(numero[0], numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			exp = false;
			break;
		case R.id.btnDiesExp:
			diesexp = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
			if (diesexp=true){
				Servicios serv = new Servicios();
				resultado = serv.elevadoDiesexp(numero[0]);
				pantalla.setText(String.valueOf(resultado));
			}
			diesexp = false;
			break;
		case R.id.btnFactorial:
			facto = true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal = false;
			
//			if (facto=true){
//				Servicios serv = new Servicios();
//				resultado = (double) serv.factorial(Integer.parseInt(String.(numero[0]));
//				pantalla.setText(String.valueOf(resultado));
//			}
//			facto = false;
//			break;
//			
//		case R.id.btnRaizY:
//			potenci = true;
//			numero[0] = Double.parseDouble(a);
//			pantalla.setText("");
//			decimal = false;
//			
//			if (potenci=true){
//				Servicios serv = new Servicios();
//				resultado = serv.potencian(m , n);
//				pantalla.setText(String.valueOf(resultado));
//			}
//			potenci = false;
//			break;


		}
		}catch(Exception e){
			
			pantalla.setText("error");
		}
	}
}

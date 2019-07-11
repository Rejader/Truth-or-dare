
public class Game {
	public static void main(String[] s) {
		String truth [][] = {};
		String dare [][] = {};
		
		Buttonchlick.truth
			random s;
			random l;
			while (chechtruth[s][l] == true){
				random s;
				random l;
			}
		checktruth[s][l] = true;
		sytem.out.println("" + [truth[s][l]);
		
	}

}

package com.theq.einmalrichtig;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main4Activity extends Activity {

    Button button9;
    Button button10;
    TextView Tv4;

    Random W;

    String[] Warheit = new String[]{"Hast du (heute) schon daran gedacht mit einem aus der Gruppe zu schlafen?",};

    Random P;

    String[] Pflicht = new  String[]{"Trinke eine Body shot von wem du willst. Weigert sich einer Trinkt ihr beide 4 Schlücke.",};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        Tv4 = findViewById(R.id.TV4);


        W = new Random();
        P = new Random();

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv4.setText(Warheit[W.nextInt(Warheit.length)]);


                button10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Tv4.setText(Pflicht[P.nextInt(Pflicht.length)]);
                    }

                });




            }
        });

    }


}




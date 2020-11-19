package com.example.calclulatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText numb1,numb2,resultText;
    Button addBut,subBut,mulBut,divBut,eqbut,butc,butdot,num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
    float valone,valtwo;
    boolean additionb,subtractionb,multiplicationb,divisionb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBut=findViewById(R.id.addBut);
        mulBut=findViewById(R.id.mulBut);
        subBut=findViewById(R.id.subBut);
        divBut=findViewById(R.id.divBut);
        num1=findViewById(R.id.but1);
        num2=findViewById(R.id.but2);
        num3=findViewById(R.id.but3);
        num4=findViewById(R.id.but4);
        num5=findViewById(R.id.but5);
        num6=findViewById(R.id.but6);
        num7=findViewById(R.id.but7);
        num8=findViewById(R.id.but8);
        num9=findViewById(R.id.but9);
        num0=findViewById(R.id.but0);
        eqbut=findViewById(R.id.eqbut);
        resultText=findViewById(R.id.resultText);
        butc=findViewById(R.id.butc);
        butdot=findViewById(R.id.butdot);


        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"9");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+"0");
            }
        });
        butdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(resultText.getText()+".");
            }
        });




        addBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valone=Float.parseFloat(resultText.getText()+"");
                additionb=true;
                resultText.setText(null);

            }
        });
        subBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valone=Float.parseFloat(resultText.getText()+"");
                subtractionb=true;
                resultText.setText(null);

            }
        });
        mulBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valone=Float.parseFloat(resultText.getText()+"");
                multiplicationb=true;
                resultText.setText(null);
            }
        });
        divBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valone=Float.parseFloat(resultText.getText()+"");
                divisionb=true;
                resultText.setText(null);
            }
        });

        butc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText("");
            }
        });



        eqbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valtwo=Float.parseFloat(resultText.getText()+"");
                if(additionb==true){
                    resultText.setText(valone+valtwo+"");
                    additionb=false;
                }
                if(subtractionb==true){
                    resultText.setText(valone-valtwo+"");
                    subtractionb=false;
                }
                if(multiplicationb==true){
                    resultText.setText(valone*valtwo+"");
                    multiplicationb=true;
                }
                if(divisionb==true){
                    resultText.setText(valone/valtwo+"");
                    divisionb=true;
                }
            }
        });

    }
}



//addBut.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//
//        String fNumber=numb1.getText().toString();
//        int firstNumber=Integer.parseInt(fNumber);
//
//        String sNumber=numb2.getText().toString();
//        int secondNumber=Integer.parseInt(sNumber);
//
//        int sum=firstNumber+secondNumber;
//        resultText.setText(""+sum);
//
//
//
//        }
//        });

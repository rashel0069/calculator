package com.example.calculatorapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,add,sub,mul,div,result,reset;
    private EditText display,display2;
    public int flag;
    public int a,b,finalresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 =(Button) findViewById(R.id.number0);
        button1 =(Button) findViewById(R.id.number1);
        button2 =(Button) findViewById(R.id.number2);
        button3 =(Button) findViewById(R.id.number3);
        button4 =(Button) findViewById(R.id.number4);
        button5 =(Button) findViewById(R.id.number5);
        button6 =(Button) findViewById(R.id.number6);
        button7 =(Button) findViewById(R.id.number7);
        button8 =(Button) findViewById(R.id.number8);
        button9 =(Button) findViewById(R.id.number9);
        display2 = findViewById(R.id.displayId2);
        add =(Button) findViewById(R.id.numberadd);
        sub =(Button) findViewById(R.id.numbersub);
        mul =(Button) findViewById(R.id.numbermul);
        div =(Button) findViewById(R.id.numberdiv);
        result =(Button) findViewById(R.id.numberequl);
        reset =(Button) findViewById(R.id.clearId);

        display = (EditText) findViewById(R.id.displayId);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(display.getText().toString().trim());
                display2.setText(a+"+");
                display.setText("");
                flag = 1;

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(display.getText().toString().trim());
                display2.setText(a+"-");
                display.setText("");
                flag = 2;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(display.getText().toString().trim());
                display2.setText(a+"*");
                display.setText("");
                flag = 3;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(display.getText().toString().trim());
                display2.setText(a+"/");
                display.setText("");
                flag = 4;
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Integer.parseInt(display.getText().toString());
                display2.setText(display2.getText().toString()+ b);
                if(flag == 1){
                    finalresult = a+b;
                    display.setText(String.valueOf(finalresult));
                }
                if(flag == 2){
                    finalresult = a-b;
                    display.setText(String.valueOf(finalresult));
                }
                if(flag == 3){
                    finalresult = a*b;
                    display.setText(String.valueOf(finalresult));
                }
                if(flag == 4 ){

                    if (b!=0){
                        finalresult = a/b;
                        display.setText(String.valueOf(finalresult));
                    }else {
                        Toast.makeText(MainActivity.this, "Number does not divided by 0", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                display2.setText("");
            }
        });
    }
}
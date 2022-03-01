package com.example.task06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    EditText editTextNumber1;
    EditText editTextNumber2;
    EditText getEditTextNumber3;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    public static Random rnd=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
    }
    public void main(String args[]){
        int num1= rnd.nextInt(90)+10;
        int num2= rnd.nextInt(90)+10;
        textView1.setText(num1);
        textView4.setText(num2);
        String ans = editTextNumber1.getText().toString();
        int answer = Integer.parseInt(ans);
        textView2.setText(num1+num2);


    }
    public void clickBtn1(View view)
    public void click(View view){
        int num1= rnd.nextInt(90)+10;
        int num2= rnd.nextInt(90)+10;
        textView1.setText(num1);
        textView4.setText(num2);

                textView1.setText(num1);
        textView4.setText(num2);
        String ans = editTextNumber1.getText().toString();
        int answer = Integer.parseInt(ans);
        if (answer == num1+num2)
            imageView1.setImageResource(R.drawable.ve);
        else
            imageView1.setImageResource(R.drawable.ex);
    }




}
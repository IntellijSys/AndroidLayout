package my.intellij.androidlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btn1){
            startActivity(new Intent(this,LinearLayoutVerticalActivity.class));
        }

        if(v == btn2){
            startActivity(new Intent(this,LinearLayoutHorizontalActivity.class));
        }

        if(v == btn3){
            startActivity(new Intent(this,RelativeLayoutActivity.class));
        }

        if(v == btn4){
            startActivity(new Intent(this,TableLayoutActivity.class));
        }

        if(v == btn5){
            startActivity(new Intent(this,AbsoluteLayoutActivity.class));
        }

        if(v == btn6){
            startActivity(new Intent(this,FrameLayoutActivity.class));
        }

        if(v == btn7){
            startActivity(new Intent(this,ListViewActivity.class));
        }

        if(v == btn8){
            startActivity(new Intent(this,GridViewActivity.class));
        }
    }
}

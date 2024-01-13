package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HmeActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hme);

        t1=(TextView) findViewById(R.id.one);
        t2=(TextView) findViewById(R.id.two);
        t3=(TextView) findViewById(R.id.three);
        t4=(TextView) findViewById(R.id.four);
        t5=(TextView) findViewById(R.id.five);
        t6=(TextView) findViewById(R.id.six);
        t7=(TextView) findViewById(R.id.seven);
        t8=(TextView) findViewById(R.id.eight);
        t9=(TextView) findViewById(R.id.nine);
        t10=(TextView) findViewById(R.id.ten);
        t11=(TextView) findViewById(R.id.eleven);
        t12=(TextView) findViewById(R.id.twelve);
        t13=(TextView) findViewById(R.id.thirteen);
        t14=(TextView) findViewById(R.id.fourteen);
        t15=(TextView) findViewById(R.id.fifteen);
        t16=(TextView) findViewById(R.id.sixteen);
        t17=(TextView) findViewById(R.id.seventeen);
        t18=(TextView) findViewById(R.id.eighteen);
        t19=(TextView) findViewById(R.id.nineteen);
        t20=(TextView) findViewById(R.id.twenty);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,oneActivity.class));
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,twoActivity.class));
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,threeActivity.class));
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,fourActivity.class));
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,fiveActivity.class));
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,sixActivity.class));
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,sevenActivity.class));
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,eightActivity.class));
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,nineActivity.class));
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,tenActivity.class));
            }
        });

        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,elevenActivity.class));
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,twelveActivity.class));
            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,thirteenActivity.class));
            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,fourteenActivity.class));
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,fifteenActivity.class));
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,sixteenActivity.class));
            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,seventeenActivity.class));
            }
        });
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,eighteenActivity.class));
            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,nineteenActivity.class));
            }
        });
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HmeActivity.this,twentyActivity.class));
            }
        });




    }

}
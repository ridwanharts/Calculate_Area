package com.wanstudio.calculatearea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etWidth, etHeight;
    private Button btnCalculate;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWidth = findViewById(R.id.et_width);
        etHeight = findViewById(R.id.et_height);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

    }

    private void calculate(){
        if (etWidth.getText() == null || etWidth.getText().toString().equals("")){
            Toast.makeText(this, "Width cannot null", Toast.LENGTH_SHORT).show();
            return;
        }

        if (etHeight.getText() == null || etHeight.getText().toString().equals("")){
            Toast.makeText(this, "Height cannot null", Toast.LENGTH_SHORT).show();
            return;
        }

        String w = etWidth.getText().toString();
        String h = etHeight.getText().toString();
        Double result = Double.parseDouble(w) * Double.parseDouble(h);

        tvResult.setText(result.toString());
    }
}
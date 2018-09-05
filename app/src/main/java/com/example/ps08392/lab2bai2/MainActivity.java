package com.example.ps08392.lab2bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2;
    Button btnSum;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
        edtSo1 = findViewById(R.id.editTextSo1);
        edtSo2 = findViewById(R.id.editTextSo2);
        btnSum = findViewById(R.id.buttonTinhTong);
        tvKetQua = findViewById(R.id.textViewKetQua);

        //Bắt sự kiện
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sữa lỗi khi để trống dữ liệu
                if (edtSo1.getText().toString().trim().length() == 0 || edtSo2.getText().toString().trim().length() == 0) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập số vào!", Toast.LENGTH_SHORT).show();
                } else {
                    //Ép kiểu dữ liệu về kiểu số thập phân
                    double so1 = Double.parseDouble(edtSo1.getText().toString());
                    double so2 = Double.parseDouble(edtSo2.getText().toString());
                    double sum = so1 + so2;
                    //Hiển thị kết quả ra màn hình
                    tvKetQua.setText(String.valueOf(sum));
                }
            }
        });

    }
}
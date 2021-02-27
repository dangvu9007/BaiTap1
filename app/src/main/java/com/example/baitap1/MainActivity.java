package com.example.baitap1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final int CONG1 =1;
    final int CONG2 =2;
    final  int CONG3=3;
    private TextView txtPoitTeamA,txtPoitTeamB;
    private Button btnCong1A,btnCong2A,btnCong3A;
    private  Button btnCong1B,btnCong2B,btnCong3B;
    private Button btnReset;
    private  int currentCountA=0;
    private  int currentCountB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setIdToView();
        setAction();
    }
    private void setIdToView(){
        txtPoitTeamA=findViewById(R.id.txtPointA);
        txtPoitTeamB =findViewById(R.id.txtPointB);

        btnCong1A=findViewById(R.id.btnCong1A);
        btnCong2A=findViewById(R.id.btnCong2PointA);
        btnCong3A=findViewById(R.id.btnCong3PointA);

        btnCong1B = findViewById(R.id.btnCong1PointB);
        btnCong2B = findViewById(R.id.btnCong2PointB);
        btnCong3B=findViewById(R.id.btnCong3PointB);

        btnReset=findViewById(R.id.btnReset);

    }
    private void reset(){
        txtPoitTeamB.setText("0");
        txtPoitTeamA.setText("0");
    }

    @Override
    public void onClick(View v) {
        int chon = v.getId();
        if (chon==btnReset.getId()){
            reset();
        }else{
            congPoint(v);
        }
    }
    private  void setAction(){
        btnCong1A.setOnClickListener(this);
        btnCong2A.setOnClickListener(this);
        btnCong3A.setOnClickListener(this);

        btnCong1B.setOnClickListener(this);
        btnCong2B.setOnClickListener(this);
        btnCong3B.setOnClickListener(this);

        btnReset.setOnClickListener(this);
    }
    private void congPoint(View v){
        currentCountA = Integer.parseInt(txtPoitTeamA.getText().toString());
        currentCountB = Integer.parseInt(txtPoitTeamB.getText().toString());
        int chon= v.getId();
        if (chon==btnCong1A.getId()){
            currentCountA++;
            txtPoitTeamA.setText(String.valueOf(currentCountA));
        }else  if (chon==btnCong2A.getId()){
            currentCountA+=2;
            txtPoitTeamA.setText(String.valueOf(currentCountA));
        }else  if (chon==btnCong3A.getId()){
            currentCountA+=3;
            txtPoitTeamA.setText(String.valueOf(currentCountA));
        }else  if (chon==btnCong1B.getId()){
            currentCountB++;
            txtPoitTeamB.setText(String.valueOf(currentCountB));
        }else if (chon==btnCong2B.getId()){
            currentCountB+=2;
            txtPoitTeamB.setText(String.valueOf(currentCountB));
        }else if(chon==btnCong3B.getId()){
            currentCountB+=3;
            txtPoitTeamB.setText(String.valueOf(currentCountB));
        }
    }

}
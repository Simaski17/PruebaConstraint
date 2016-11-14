package com.rinno.simaski.pruebaconstraint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btEntrar)
    Button btEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btEntrar)
    public void onClick() {
        Intent miIntent = new Intent(MainActivity.this, SonyActivity.class);
        MainActivity.this.startActivity(miIntent);
        MainActivity.this.finish();
    }
}

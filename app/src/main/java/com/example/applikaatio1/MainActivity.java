package com.example.applikaatio1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String syote;
    TextView text;
    EditText tekstiSyote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        tekstiSyote = (EditText) findViewById(R.id.tekstiSyote);
        text.setText("Tekstijuttu");
    }

    public void testFunction (View v) {
        System.out.println("Hello World!");
        syote = tekstiSyote.getText().toString();
        text.setText(syote);
    }
}
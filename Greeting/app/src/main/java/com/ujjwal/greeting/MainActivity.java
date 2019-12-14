package com.ujjwal.greeting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Snapshot;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        final EditText text = findViewById(R.id.editext);
        final TextView greet = findViewById(R.id.text);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String msg = text.getText().toString();
                        greet.setText("Hello " + msg);

                        Log.d("Ujjwal", "Hello "   + msg);
                        Toast.makeText(MainActivity.this, "Hello " + msg, Toast.LENGTH_SHORT).show();
                        Snackbar.make(text, "Hello " + msg, Snackbar.LENGTH_INDEFINITE).show();
                    }
                }
        );

    }


}

package com.example.heals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class IndActivity extends AppCompatActivity {
    private static final String TAG="MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ind);

    }

    public void OnClickSaveBtn3(View view) {
        EditText editTextWeight = findViewById(R.id.editTextWeight);
        EditText editTextStep = findViewById(R.id.editTextStep);
        ArrayList<Index> saveIndex = new ArrayList<>();
        try {
            saveIndex.add(new Index(Float.parseFloat(editTextWeight.getText().toString()),
                    Integer.parseInt(editTextStep.getText().toString())));
        }
        catch (Exception ex) {
            Toast toast= Toast.makeText(this,R.string.error,Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        Toast toast= Toast.makeText(this,R.string.save,Toast.LENGTH_LONG);
        toast.show();
        Log.i(TAG, "Пользователь нажал кнопку СОХРАНИТЬ");
        }
    }


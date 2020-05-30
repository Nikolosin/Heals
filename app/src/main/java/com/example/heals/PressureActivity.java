package com.example.heals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PressureActivity extends AppCompatActivity {
    private static final String TAG="MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
    }

    public void OnClickSaveBtn2(View view) {
        EditText editTextUp = findViewById(R.id.editTextUp);
        EditText editTextDown = findViewById(R.id.editTextDown);
        EditText editTextPulse = findViewById(R.id.editTextPulse);
        EditText editTextData = findViewById(R.id.editTextData);
        CheckBox checkBoxTah = findViewById(R.id.checkBoxTah);
        ArrayList<Pressure> savePressure = new ArrayList<>();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy k:m");
        String dateInString = editTextData.getText().toString();
        Date date;
        try {
            date = formatter.parse(dateInString);
        } catch (Exception ex) {
            Toast toast = Toast.makeText(this, R.string.errorData, Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        try {
            savePressure.add(new Pressure(Integer.parseInt(editTextUp.getText().toString()),
                    Integer.parseInt(editTextDown.getText().toString()),
                    Integer.parseInt(editTextPulse.getText().toString()),
                    checkBoxTah.isChecked(),
                    date));
        }
        catch(Exception ex) {
            Toast toast = Toast.makeText(this, R.string.error, Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        Toast toast= Toast.makeText(this,R.string.save,Toast.LENGTH_LONG);
        toast.show();
        Log.i(TAG, "Пользователь нажал кнопку СОХРАНИТЬ");

    }
}

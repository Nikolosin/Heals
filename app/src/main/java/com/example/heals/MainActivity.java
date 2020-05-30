package com.example.heals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void OnClickSaveBtn(View view) {
        EditText inputName = findViewById(R.id.inputName);
        EditText inputAge = findViewById(R.id.inputAge);
        try {
                    UserData user = new UserData(inputName.getText().toString(),
                Integer.parseInt(inputAge.getText().toString()));
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

    public void OnClickPressure(View view) {
        Intent intent = new Intent(MainActivity.this, PressureActivity.class);
        startActivity(intent);
        Log.i(TAG, "Пользователь нажал кнопку ПОКАЗАТЕЛИ ДАВЛЕНИЯ");
    }

    public void OnClickIndex(View view) {
        Intent intent = new Intent(MainActivity.this, IndActivity.class);
        startActivity(intent);
        Log.i(TAG, "Пользователь нажал кнопку ЖИЗНЕННЫЕ ПОКАЗАТЕЛИ");

    }
}

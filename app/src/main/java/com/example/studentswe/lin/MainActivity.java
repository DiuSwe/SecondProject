package com.example.studentswe.lin;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox checkBox = findViewById(R.id.checkbox);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked())
                    Toast.makeText(MainActivity.this,"checked",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"not checked",Toast.LENGTH_LONG).show();
            }
        });
    }


    public void selectGender(View view)
    {
        boolean check = ((RadioButton)view).isChecked();

        switch (view.getId())
        {
            case R.id.rMale:
                if(check)gender = "male";
                showAlertDialog(gender);
                break;
            case R.id.rFemale:
                if(check)gender = "female";
                showAlertDialog(gender);
                break;
        }
    }


    private void showAlertDialog(String gender)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Message");
        builder.setMessage("You chose "+gender);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.show();
    }
}

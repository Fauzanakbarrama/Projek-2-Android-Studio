package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numberEditText;
    private RadioGroup choiceRadioGroup;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberEditText = findViewById(R.id.numberEditText);
        choiceRadioGroup = findViewById(R.id.choiceRadioGroup);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered number
                String number = numberEditText.getText().toString();

                // Get the selected radio button's ID
                int selectedRadioButtonId = choiceRadioGroup.getCheckedRadioButtonId();

                // Find the selected radio button
                RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);

                // Get the text of the selected radio button
                String choice = selectedRadioButton.getText().toString();

                // Display a toast with the entered number and selected choice
                String toastMessage = "Number: " + number + "\nChoice: " + choice;
                Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
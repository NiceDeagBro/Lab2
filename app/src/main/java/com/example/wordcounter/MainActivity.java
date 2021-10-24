package com.example.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wordcounter.utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    Spinner spCountingOption;
    EditText edPhraseInput;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spCountingOption = findViewById(R.id.spCountingOption);
        this.edPhraseInput = findViewById(R.id.edPhraseInput);
        this.tvResult = findViewById(R.id.tvResult);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counter_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCountingOption.setAdapter(adapter);
    }


    public void onBtnClick(View view) {
        Long countType = spCountingOption.getSelectedItemId();
        if (countType == 0){
            String phrase = this.edPhraseInput.getText().toString();
            int charsCount = TextCounter.getCharsCount(phrase);
            String formattedResult = String.valueOf(charsCount);
            this.tvResult.setText(formattedResult);

            if (charsCount == 0){
                Toast.makeText(this, "You haven't entered any text",Toast.LENGTH_SHORT).show();
            }
            else {
                ;
            }
        }
        else {
            String s = this.edPhraseInput.getText().toString();
            int wordsCount = TextCounter.countWords(s);
            String formattedResult = String.valueOf(wordsCount);
            this.tvResult.setText(formattedResult);

            if (wordsCount == 0){
                Toast.makeText(this, "You haven't entered any text",Toast.LENGTH_SHORT).show();
            }
            else {
                ;
            }
        }
    }
}
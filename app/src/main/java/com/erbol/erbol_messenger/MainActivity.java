package com.erbol.erbol_messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editMessage=findViewById(R.id.editMessage);
    }

    public void onClickMsg(View view){
        String msg = editMessage.getText().toString();
        Intent intent = new Intent(this,ReceivedMessageActivity.class);
        intent.putExtra("msg",msg);
        startActivity(intent);
    }
}
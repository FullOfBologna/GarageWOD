package com.example.jeffatkinson.garagewod;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Login extends ActionBarActivity {

    public Button LoginButton;
    public EditText userName, userPass;
    private boolean LoginSuccessful;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button)findViewById(R.id.uiLoginButton);
        userName = (EditText)findViewById(R.id.uNameText);
        userPass = (EditText)findViewById(R.id.uPassTest);

        LoginSuccessful = false;

        LoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(userName.getText().toString().equals("admin") && userPass.getText().toString().equals("password")){
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();

                    LoginSuccessful = true;
                    Intent intent = new Intent(Login.this,GarageWODHomeActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Login Unsuccessful", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

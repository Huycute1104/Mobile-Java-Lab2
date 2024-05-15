package com.example.form;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText eUsername;
    private EditText ePassword;
    private EditText eConfirmPassword;
    private TextView tvAlreadyAccount;
    private Button btnSignUp;
    private final String REQUIRE = "Require";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Refer
        eUsername = findViewById(R.id.txtUsername);
        ePassword = findViewById(R.id.txtPassword);
        eConfirmPassword = findViewById(R.id.txtConfirmPassword);
        tvAlreadyAccount = findViewById(R.id.tvAlreadyAccount);
        btnSignUp = findViewById(R.id.btnSignUp);

        // Register event
        tvAlreadyAccount.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    private boolean checkInput(){
        if (TextUtils.isEmpty(eUsername.getText().toString())){
            eUsername.setError(REQUIRE);
            return false;
        }

        if(TextUtils.isEmpty(ePassword.getText().toString())) {
            ePassword.setError(REQUIRE);
            return false;
        }

        if (TextUtils.isEmpty(eConfirmPassword.getText().toString())){
            eConfirmPassword.setError(REQUIRE);
            return false;
        }

        if(!TextUtils.equals(ePassword.getText().toString(),
                eConfirmPassword.getText().toString())) {
            Toast.makeText(this, "Password are not match", Toast.LENGTH_LONG).show();
            return false;
        }
        // valid
        return true;
    }

    private void signUp(){
        if (!checkInput()) {
            return;
        }
    }

    private void signInForm() {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnSignUp) {
            signUp();
        }
        else if(v.getId() == R.id.tvAlreadyAccount){
            signInForm();
        }
    }
}

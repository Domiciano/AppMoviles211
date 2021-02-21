package edu.co.icesi.movilesejercicios2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button loginbtn;
    private ImageButton passVisBtn;
    private ConstraintLayout loadingBox;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn = findViewById(R.id.loginbtn);
        loadingBox = findViewById(R.id.loadingBox);
        password = findViewById(R.id.password);
        passVisBtn = findViewById(R.id.passVisBtn);

        loginbtn.setOnClickListener(this::doLogin);
        passVisBtn.setOnClickListener(this::toggleVis);
    }

    private void toggleVis(View view) {
        if (password.getTransformationMethod() != null) {
            password.setTransformationMethod(null);
        } else {
            password.setTransformationMethod(new PasswordTransformationMethod());
        }
    }

    private void doLogin(View view) {
        loginbtn.setBackgroundResource(R.drawable.loginbtnbackoff);
        loginbtn.setEnabled(false);
        loadingBox.setVisibility(View.VISIBLE);
    }
}
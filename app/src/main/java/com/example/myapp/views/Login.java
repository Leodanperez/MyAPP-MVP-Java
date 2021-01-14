package com.example.myapp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapp.R;
import com.example.myapp.interfaces.LoginView;

public class Login extends AppCompatActivity implements LoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setErrorUser() {

    }

    @Override
    public void setErrorPassword() {

    }

    @Override
    public void setSuccessUser() {

    }

    @Override
    public void navigateToHome() {

    }
}
package com.example.myapp.interfaces;

public interface LoginView {
    //metodos que controlen las acciones en la vista
    void showProgress();
    void hideProgress();

    void setErrorUser();
    void setErrorPassword();
    void setSuccessUser();

    void navigateToHome();
}

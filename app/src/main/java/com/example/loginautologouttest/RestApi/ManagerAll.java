package com.example.loginautologouttest.RestApi;

import com.example.loginautologouttest.Models.LoginModel;

import retrofit2.Call;

public class ManagerAll extends BaseManager{

    private  static ManagerAll ourInstance = new ManagerAll();

    public  static synchronized ManagerAll getInstance()
    {
        return  ourInstance;
    }


    public Call<LoginModel> girisYap(String mail , String parola)
    {
        Call<LoginModel> x = getRestApiUser().loginUser(mail,parola);
        return  x ;
    }

}

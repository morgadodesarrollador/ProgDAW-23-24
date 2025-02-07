package com.morgado;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Utils {
    public static OkHttpClient client = new OkHttpClient(); 
    public static Type userListType = new TypeToken<List<User>>() {}.getType();

    public static void CargarUser(){
        //Crea la REQUEST Http de tipo Get para listar todos los Posts
        Request request = new Request.Builder()
                                .url(App.urlRoot + "users")
                                .build();
        System.out.println("Enviando ..."+ App.urlRoot + "users");
        try (Response response = client.newCall(request).execute() ) {
            if (!response.isSuccessful()){
                System.out.println("Response Users Fallido");
                throw new IOException("Unexpected code "+ response);
            }
            System.out.println("Conexión Establedida y Response ok");
            String responseBody = response.body().string();
            Gson gson = new Gson();
            App.userListType = new TypeToken<List<User>>() {}.getType();
            App.LUser = gson.fromJson(responseBody, userListType);
            // for (User user : App.LUser) {
            //     System.out.println(user.getName());
            // }  
        }catch (IOException e){ //IOException captura errores HTTP
            e.printStackTrace(); //mensaje generico tipo "Ayuda SysAdmin"
        }
    }
}

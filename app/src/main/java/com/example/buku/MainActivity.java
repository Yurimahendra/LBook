 package com.example.buku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    EditText txtUser, txtPassword ;
    String User, Pass ;
    int request_code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = (EditText) findViewById(R.id.txtusername);
        txtPassword = (EditText) findViewById(R.id.txtpass);


    }
    public void onClickLoginEvent(View view){
        User = txtUser.getText().toString();
        Pass = txtPassword.getText().toString();

       // startActivityForResult(i, request_code);
        //Bundle b = new Bundle();
        //b.putString("u", User);
        //b.putString("p", Pass);

        if (User.isEmpty() || Pass.isEmpty()){
            Toast.makeText(this, "masukan username dan password", Toast.LENGTH_SHORT).show();
        }else if (User == "admin" && Pass == "admin"){

            Intent i = new Intent(".MenuActivity");
            i.setData(Uri.parse(User));
            i.setData(Uri.parse(Pass));
            setResult(RESULT_OK, i);
            startActivity(i);

        }else {
            Toast.makeText(this, "username dan sandi salah", Toast.LENGTH_SHORT).show();
        }


    }

    public void onActivityResult(int requestCode, int resultCode,  Intent data){
        super.onActivityResult(requestCode, resultCode,  data);
        if (requestCode == request_code ){
            if (resultCode == RESULT_OK){
                Toast.makeText(this, data.getData().toString(), Toast.LENGTH_SHORT).show();
            }
        }


     //

//        if (User.isEmpty() || Pass.isEmpty()){
  //      }else if (User == "admin" && Pass == "admin"){

    //    }else {
      //      Toast.makeText(this, "username dan sandi salah", Toast.LENGTH_SHORT).show();
        //}
    }
}
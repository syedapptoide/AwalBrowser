package com.syed.awalbrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnGo,btnFb,btnGoogle,btnTwitter,btnBlog,btnYoutube,btnEspn;
    EditText etxtUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnGo=findViewById(R.id.btn_go);
        btnFb=findViewById(R.id.btn_fb);
        btnGoogle=findViewById(R.id.btn_google);
        btnTwitter=findViewById(R.id.btn_twitter);
        btnBlog=findViewById(R.id.btn_blog);
        btnYoutube=findViewById(R.id.btn_youtube);
        btnEspn=findViewById(R.id.btn_espn);
        etxtUrl=findViewById(R.id.etxt_url);


        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=etxtUrl.getText().toString();
                if(url.isEmpty())
                {
                    Toast.makeText(HomeActivity.this, "Please Enter URL ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                    intent.putExtra("url",url);
                    startActivity(intent);

                }
            }
        });

        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","www.facebook.com");
                startActivity(intent);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","www.google.com");
                startActivity(intent);
            }
        });


        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","www.youtube.com");
                startActivity(intent);
            }
        });


        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","www.twitter.com");
                startActivity(intent);
            }
        });

        btnBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","www.syedabdulawal.wordpress.com");
                startActivity(intent);
            }
        });

        btnEspn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url","www.espn.com");
                startActivity(intent);
            }
        });
    }
}

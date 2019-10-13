package com.example.dogbreedclassifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class loby extends AppCompatActivity {

    private Button classify;
    private Button forum;
    private Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loby);
        classify = (Button)findViewById(R.id.classify_btn);
        forum = (Button)findViewById(R.id.forum_btn);
        logout = (Button)findViewById(R.id.logout_btn);

        classify.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO: Start Classify Activity
            }
        });


        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Forums.class));
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                firebaseAuth.signOut();
                Intent intent = new Intent(view.getContext(), Login.class);
                startActivity(intent);
                finishActivity(1);
            }
        });

    }
}

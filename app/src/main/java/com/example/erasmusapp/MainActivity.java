package com.example.erasmusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        VideoView videoView=(VideoView)findViewById(R.id.videoView1);
        MediaController media=new MediaController(this);

        media.setAnchorView(videoView);

        Uri uri =Uri.parse("android.resource://com.example.erasmusapp/" + R.raw.logonosound1);

        videoView.setMediaController(media);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();


    }

    public void Siguiente(View view){

        Intent siguiente = new Intent(this,Menulateral.class);
        startActivity(siguiente);


    }




}

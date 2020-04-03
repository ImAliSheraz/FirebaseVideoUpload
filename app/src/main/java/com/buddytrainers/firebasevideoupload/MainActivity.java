package com.buddytrainers.firebasevideoupload;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToUploadVideo(View view)
    {
        try
        {
            startActivity(new Intent(this,UploadVideoActivity.class));
        }
        catch (Exception e)
        {
            Toast.makeText(this, "moveToUploadVideo:"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void moveToDownloadVideo(View view)
    {
        try
        {
            startActivity(new Intent(this,DownloadVideoActivity.class));
        }
        catch (Exception e)
        {
            Toast.makeText(this, "moveToDownloadVideo:"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}

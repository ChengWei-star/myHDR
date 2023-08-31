package com.example.hdr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().setTitle("About Us");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logIn:
                Toast.makeText(this,"Login was selected",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AboutUs.this,LoginActivity.class);
                startActivity(intent);
                return true;
            case R.id.aboutUs:
                Toast.makeText(this,"You are alrady on About Us",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.contactUs:
                Toast.makeText(this,"Contact Ua was selected",Toast.LENGTH_SHORT).show();
                intent = new Intent(AboutUs.this, ContactUs.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
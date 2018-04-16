package me.wesferr.trpgmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}

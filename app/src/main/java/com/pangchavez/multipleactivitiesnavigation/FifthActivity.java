package com.pangchavez.multipleactivitiesnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    public void BtnNumberClick(View view)
    {
        Button btn = (Button)view;
        int btnNumber = Integer.parseInt(btn.getText().toString());
        Class nextClass = this.getClass();
        switch(btnNumber)
        {
            case 1:
                nextClass = MainActivity.class;
                break;
            case 2:
                nextClass = SecondActivity.class;
                break;
            case 3:
                nextClass = ThirdActivity.class;
                break;
            case 4:
                nextClass = FourthActivity.class;
                break;
            case 5:
                nextClass = FifthActivity.class;
                break;
            case 6:
                nextClass = SixthActivity.class;
                break;
            case 7:
                nextClass = SeventhActivity.class;
                break;
            case 8:
                nextClass = EightActivity.class;
                break;
            case 9:
                nextClass = NinthActivity.class;
                break;
            case 10:
                nextClass = TenthActivity.class;
                break;
        }
        Intent intentNextActivity = new Intent(this, nextClass);
        startActivity(intentNextActivity);
    }
}

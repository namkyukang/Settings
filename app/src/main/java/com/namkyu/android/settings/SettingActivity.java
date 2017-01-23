package com.namkyu.android.settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    //Button btn2;ddddd1110222
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting); //화면에 세팅해주는 부분
        //2.findViewById로 뷰 세팅
        btn = (Button) findViewById(R.id.button); //finViewByID?

        tv = (TextView) findViewById(R.id.textView);
        //3,버튼에 onClickListener 달기

        btn.setOnClickListener(this);   //이 클래스에 onclickListener를 달아준다.
        // 클릭이 있으면 인터페이스인 View.OnclickListener에서 저기 있는 onClick함수로 보내주겠다

    }

    //실시간으로 돌고 있어야한다. 프로그램 성능에 대기하고 있으면서 계속돌면서 대기하고 있는 것이 있어야한다.
    //Listener
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                tv.setText("강남규");//BuildConfig.MYURL);
        }
    }
}
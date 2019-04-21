package kr.insungjung.a0414final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mBmiInfo;
    TextView mBmiLevel;
    TextView mTitleBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBmiInfo = findViewById(R.id.userBmiInfo);
        mBmiLevel = findViewById(R.id.userBmiLevel);
        mTitleBmi = findViewById(R.id.titleBmi);

        String valBmiInfo = getIntent().getStringExtra("Bmi지수");
        String valBmiLevel = getIntent().getStringExtra("Bmi레벨");
        String titleBmi = getIntent().getStringExtra("사용자이름");
        String titleContent = String.format("%s 님의 BMI 정보입니다.", titleBmi);

        mBmiInfo.setText(valBmiInfo);
        mBmiLevel.setText(valBmiLevel);
        mTitleBmi.setText(titleContent);
    }
}














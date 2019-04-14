package kr.insungjung.a0414final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mBmiInfo;
    TextView mBmiLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBmiInfo = findViewById(R.id.userBmiInfo);
        mBmiLevel = findViewById(R.id.userBmiLevel);

        String valBmiInfo;
        String valBmiLevel;

        valBmiInfo = getIntent().getStringExtra("Bmi지수");
        mBmiInfo.setText(valBmiInfo);

        valBmiLevel = getIntent().getStringExtra("Bmi레벨");
        mBmiLevel.setText(valBmiLevel);

    }
}

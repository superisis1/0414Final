package kr.insungjung.a0414final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    EditText mHeight;
    EditText mWeight;
    EditText mUserName;
    Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        mHeight = findViewById(R.id.inputHeight);
        mWeight = findViewById(R.id.inputWeight);
        mUserName = findViewById(R.id.name_text);
        mBtn = findViewById(R.id.inputBtn);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double valHeight;
                double valWeight;
                double valBmi;
                String levelBmi;

                String userName = mUserName.getText().toString();
                String sHeight = mHeight.getText().toString();
                String sWeight = mWeight.getText().toString();

                valHeight = Double.parseDouble(sHeight);
                valWeight = Double.parseDouble(sWeight);

                valBmi = valWeight / ((valHeight / 100) * (valHeight / 100));

                String valBmiInfo = String.format("%.2f", valBmi);

                if (valBmi > 0 && valBmi <= 18.5) {
                    levelBmi = "저체중";
                } else if (valBmi < 25) {
                    levelBmi = "정상";
                } else if (valBmi < 30) {
                    levelBmi = "과체중";
                } else {
                    levelBmi = "비만";
                }

                Intent intent = new Intent(UserInfoActivity.this, MainActivity.class);
                intent.putExtra("사용자이름", userName);
                intent.putExtra("Bmi지수", valBmiInfo);
                intent.putExtra("Bmi레벨", levelBmi);
                startActivity(intent);
                finish();

            }
        });

    }
}


















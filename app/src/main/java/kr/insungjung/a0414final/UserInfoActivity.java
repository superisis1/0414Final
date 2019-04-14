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
    Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        mHeight = findViewById(R.id.inputHeight);
        mWeight = findViewById(R.id.inputWeight);
        mBtn = findViewById(R.id.inputBtn);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double valHeight;
                double valWeight;
                double valBmi;
                String levelBmi;

                String sHeight = mHeight.getText().toString();
                String sWeight = mWeight.getText().toString();

                valHeight = Double.parseDouble(sHeight);
                valWeight = Double.parseDouble(sWeight);

                valBmi = valWeight / ((valHeight/100) * (valHeight/100));
                String valBmiInfo = String.format("%.2f",valBmi);

                Intent intent = new Intent(UserInfoActivity.this, MainActivity.class);
                intent.putExtra("Bmi지수",valBmiInfo);
                startActivity(intent);
                finish();

            }
        });

    }
}

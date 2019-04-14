package kr.insungjung.a0414final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    EditText userHeight;
    EditText userWeight;
    Button inputBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        userHeight = findViewById(R.id.userHeight);
        userWeight = findViewById(R.id.userWeight);
        userBmi = userWeight / ();

        inputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UserInfoActivity.this, MainActivity.class);
                /*메인 액티비티로 갈 때 "사용자아이디"라는 꼬리표로 userId에 들어있는 값을 들고 가라*/
                intent.putExtra("사용자 지수",userBmi);
                startActivity(intent);

            }
        });

    }
}

package qianfeng.intentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTv = ((TextView) findViewById(R.id.tv));

        Intent intent = getIntent();
        String flag = intent.getStringExtra("flag");
        if("user".equals(flag)) {
            User user = ((User) intent.getSerializableExtra("user"));
            mTv.setText(user.toString());
        }else if("food".equals(flag))
        {
            Food food = (Food) intent.getParcelableExtra("food");
            mTv.setText(food.toString());
        }
    }


}

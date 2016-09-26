package qianfeng.intentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SerilzableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serilzable);


    }


    public void onClick(View view) {

        Intent intent = new Intent(this,SecondActivity.class);
        User value = new User("12345","Lisi");
        intent.putExtra("user", value);
        intent.putExtra("flag","user");
        startActivity(intent); // 连接到FrameWork的对象，就是连接到框架层的

    }

    public void onClick2(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        Food value = new Food("米饭","白色");
        intent.putExtra("food", value);
        intent.putExtra("flag","food");
        startActivity(intent); // 连接到FrameWork的对象，就是连接到框架层的
    }
}

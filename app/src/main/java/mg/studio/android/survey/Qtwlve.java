package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qtwlve extends AppCompatActivity {
    //对象变量
    Button btn_q12;
    //此方法用于传值
    public void pass12(){
        Intent intent_q12=new Intent(this,finish.class);

        startActivity(intent_q12);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_twelve);
        //绑定
        btn_q12=findViewById(R.id.button1);
        //跳转到下一题
        btn_q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass12();
            }
        });
    }
}

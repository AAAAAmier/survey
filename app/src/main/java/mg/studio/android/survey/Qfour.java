package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qfour extends AppCompatActivity {
    //对象变量
    Button btn_q4;
    //此方法用于传值
    public void pass4(){
        Intent intent_q4=new Intent(this,Qfive.class);

        startActivity(intent_q4);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);
        //绑定
        btn_q4=findViewById(R.id.button1);
        //跳转到下一题
        btn_q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass4();
            }
        });
    }
}

package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qeight extends AppCompatActivity {
    //对象变量
    Button btn_q8;
    //此方法用于传值
    public void pass8(){
        Intent intent_q8=new Intent(this,Qnine.class);

        startActivity(intent_q8);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);
        //绑定
        btn_q8=findViewById(R.id.button1);
        //跳转到下一题
        btn_q8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass8();
            }
        });
    }
}

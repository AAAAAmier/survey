package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qfive extends AppCompatActivity {
    //对象变量
    Button btn_q5;
    //此方法用于传值
    public void pass5(){
        Intent intent_q5=new Intent(this,Qsix.class);

        startActivity(intent_q5);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);
        //绑定
        btn_q5=findViewById(R.id.button1);
        //跳转到下一题
        btn_q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass5();
            }
        });
    }
}

package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qsever extends AppCompatActivity {
    //对象变量
    Button btn_q7;
    //此方法用于传值
    public void pass7(){
        Intent intent_q7=new Intent(this,Qeight.class);

        startActivity(intent_q7);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_seven);
        //绑定
        btn_q7=findViewById(R.id.button1);
        //跳转到下一题
        btn_q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass7();
            }
        });
    }
}

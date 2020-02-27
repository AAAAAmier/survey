package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Qthree extends AppCompatActivity {
    //对象变量
    Button btn_q3;
    //此方法用于传值
    public void pass3(){
        Intent intent_q3=new Intent(this,Qfour.class);

        startActivity(intent_q3);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_three);
        //绑定
        btn_q3=findViewById(R.id.btn_q3);
        //跳转到下一题
        btn_q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass3();
            }
        });
    }
}

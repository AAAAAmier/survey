package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class Qone extends AppCompatActivity {
    RadioGroup rp_q1;
    Button btn_q1;
    RadioButton rbtn_q1;
    //此方法用于传值
    public void pass1(){
        Intent intent_q1=new Intent(this,Qtwo.class);

        startActivity(intent_q1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);
        //绑定对象
        rp_q1=(RadioGroup) findViewById(R.id.rp_q1);
        btn_q1=(Button)findViewById(R.id.btn_q1);
        //单选按钮绑定
        rbtn_q1=(RadioButton) findViewById(rp_q1.getCheckedRadioButtonId());
        //跳转
        btn_q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass1();
            }
        });
    }
}
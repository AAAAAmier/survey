package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qsix extends AppCompatActivity {
    //对象变量
    Button btn_q6;
    //此方法用于传值
    public void pass6(){
        Intent intent_q6=new Intent(this,Qsever.class);

        startActivity(intent_q6);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);
        //绑定
        btn_q6=findViewById(R.id.button1);
        //跳转到下一题
        btn_q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass6();
            }
        });
    }
}

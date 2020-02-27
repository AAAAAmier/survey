package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qtwo extends AppCompatActivity {
    //对象变量
    Button btn_q2;
    public void pass2(){
        Intent intent_q2=new Intent(this,Qthree.class);

        startActivity(intent_q2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);
        //绑定
        btn_q2=findViewById(R.id.btn_q2);
        //跳转到下一题
        btn_q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass2();
            }
        });
    }
}

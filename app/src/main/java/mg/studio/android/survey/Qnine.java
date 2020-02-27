package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qnine extends AppCompatActivity {
    //对象变量
    Button btn_q9;
    //此方法用于传值
    public void pass9(){
        Intent intent_q9=new Intent(this,Qten.class);

        startActivity(intent_q9);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);
        //绑定
        btn_q9=findViewById(R.id.button1);
        //跳转到下一题
        btn_q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass9();
            }
        });
    }
}

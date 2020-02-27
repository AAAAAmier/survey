package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qten extends AppCompatActivity {
    //对象变量
    Button btn_q10;
    //此方法用于传值
    public void pass10(){
        Intent intent_q10=new Intent(this,Qelever.class);

        startActivity(intent_q10);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_ten);
        //绑定
        btn_q10=findViewById(R.id.button1);
        //跳转到下一题
        btn_q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass10();
            }
        });
    }
}

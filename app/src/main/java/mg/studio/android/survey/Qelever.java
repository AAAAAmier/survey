package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qelever extends AppCompatActivity {
    //对象变量
    Button btn_q11;
    //此方法用于传值
    public void pass11(){
        Intent intent_q11=new Intent(this,Qtwlve.class);

        startActivity(intent_q11);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);
        //绑定
        btn_q11=findViewById(R.id.button1);
        //跳转到下一题
        btn_q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass11();
            }
        });
    }
}

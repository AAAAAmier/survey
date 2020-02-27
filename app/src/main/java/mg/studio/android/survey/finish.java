package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finish extends AppCompatActivity {
    //对象变量
    Button btn_q13;
    //此方法用于传值
    public void pass13(){
        Intent intent_q13=new Intent(this,Report.class);

        startActivity(intent_q13);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_survey);
        //绑定
        btn_q13=findViewById(R.id.button1);
        //跳转到下一题
        btn_q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass13();
            }
        });
    }
}

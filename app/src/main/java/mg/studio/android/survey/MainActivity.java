package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button btn_w;
    public void pass(){
        Intent intent_w=new Intent(this,Qone.class);
        startActivity(intent_w);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        btn_w=(Button)findViewById(R.id.button1);
        btn_w.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                pass();
            }
        });
    }
}

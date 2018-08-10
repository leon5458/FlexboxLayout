package hly.com.flexboxlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;

public class MainActivity extends AppCompatActivity {
    private FlexboxLayout flex;

    String arr[] = {"java", "c#", "php", "c++", "android", "phython", "kotlin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flex = findViewById(R.id.flexbox);

        for (int i = 0; i < arr.length; i++) {
            TextView textView = new TextView(this);
            textView.setBackgroundResource(R.drawable.text_circle_gray);
            textView.setText(arr[i]);
            textView.setTextColor(0xffa8c4d7);
            textView.setGravity(Gravity.CENTER);
            textView.setPadding(10, 5, 10, 5);
            textView.setTextSize(13);
            FlexboxLayout.LayoutParams params = new FlexboxLayout.LayoutParams(FlexboxLayout.LayoutParams.WRAP_CONTENT, FlexboxLayout.LayoutParams.WRAP_CONTENT);
//            params.setFlexBasisPercent(0.2f);//相对父类所占的比例
            params.setMargins(20, 10, 0, 0);
            textView.setLayoutParams(params);
            flex.addView(textView);

        }

    }


}


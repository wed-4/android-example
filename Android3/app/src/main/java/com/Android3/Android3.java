
package com.Android3;

import android.app.Activity;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;
import android.accounts.*;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import android.widget.LinearLayout;
import android.app.*;
import android.widget.Button;
import android.widget.*;
import android.os.Bundle;
import android.system.*;
import androidx.appcompat.app.AppCompatActivity;

public class Android3 extends Activity
{
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;
    // GPS用
    static private android.location.LocationManager locationManager=null;
    static private _LocationListener locationListener=null;
    /** アクティビティが最初に作成されるときに呼び出されます。 */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

       
        final TextView tv = new TextView(this);
        linearLayout.addView(tv, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        final Button button = new Button(this);
        button.setText("w");
        
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // クリック時の処理
                
                
            }
        });
        linearLayout.addView(button, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

    }
}

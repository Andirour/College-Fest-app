package com.sunnyapps.navigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;


public class Details extends AppCompatActivity {

    TextView texts,schedul;
    public int list;
    static  ArrayList<String> selection=new ArrayList<String>();
Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        texts=(TextView)findViewById(R.id.detail);
        schedul=(TextView)findViewById(R.id.schedule);

        String title=getIntent().getExtras().getString("title");
        setTitle(title);
        String detl=getIntent().getExtras().getString("detail");
        String schdl=getIntent().getExtras().getString("schedule");


        texts.setText(detl);

        schedul.setText(schdl);



    }
    public void openLink(View v){
        butt=(Button)findViewById(R.id.button2);

        String link=getIntent().getExtras().getString("link");
        if(link!="") {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
            startActivity(browserIntent);
        }
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void finish() {


        super.finish();
    }
}

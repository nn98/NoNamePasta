package com.example.user.namelesspasta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final static String[] list={"a","b","c","d"};
    TextView To;
    int total=0;
    LinearLayout v1;
    CheckBox menu;
    TextView pri;
    CheckBox set;
    CheckBox sCo;
    CheckBox sCi;
    CheckBox sRa;
    CheckBox sWi;
    CheckBox sRi;
    CheckBox pick;
    CheckBox plus;
    CheckBox co;
    CheckBox ci;
    CheckBox ra;
    CheckBox wi;
    CheckBox ri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        ListView list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                menu.setText((TextView)view.getText());
            }
        });
         */
        To=(TextView)findViewById(R.id.To);
        v1=(LinearLayout)findViewById(R.id.v1);
        menu=(CheckBox) findViewById(R.id.menu);
        pri=(EditText)findViewById(R.id.prise);
        set=(CheckBox)findViewById(R.id.set);
        sCi=(CheckBox)findViewById(R.id.sCider);
        sCo=(CheckBox)findViewById(R.id.sCoke);
        sRa=(CheckBox)findViewById(R.id.sRamu);
        sWi=(CheckBox)findViewById(R.id.sWine);
        sRi=(CheckBox)findViewById(R.id.sRime);
        pick=(CheckBox)findViewById(R.id.pick);
        plus=(CheckBox)findViewById(R.id.plus);
        co=(CheckBox)findViewById(R.id.coke);
        ci=(CheckBox)findViewById(R.id.cider);
        ra=(CheckBox)findViewById(R.id.ramu);
        wi=(CheckBox)findViewById(R.id.wine);
        ri=(CheckBox)findViewById(R.id.rime);
        /*
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set.setVisibility(View.VISIBLE);
                pick.setVisibility(View.VISIBLE);
                plus.setVisibility(View.VISIBLE);
                co.setVisibility(View.VISIBLE);
                ci.setVisibility(View.VISIBLE);
                ra.setVisibility(View.VISIBLE);
                wi.setVisibility(View.VISIBLE);
                ri.setVisibility(View.VISIBLE);
                total+=Integer.parseInt(pri.getText().toString());
                To.setText(Integer.toString(total));
            }
        });
         */
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(menu.isChecked()) {
                    set.setVisibility(View.VISIBLE);
                    pick.setVisibility(View.VISIBLE);
                    plus.setVisibility(View.VISIBLE);
                    co.setVisibility(View.VISIBLE);
                    ci.setVisibility(View.VISIBLE);
                    ra.setVisibility(View.VISIBLE);
                    wi.setVisibility(View.VISIBLE);
                    ri.setVisibility(View.VISIBLE);
                    total+=Integer.parseInt(pri.getText().toString());
                    To.setText(Integer.toString(total));
                }
                else {
                    set.setVisibility(View.INVISIBLE);
                    pick.setVisibility(View.INVISIBLE);
                    plus.setVisibility(View.INVISIBLE);
                    co.setVisibility(View.INVISIBLE);
                    ci.setVisibility(View.INVISIBLE);
                    ra.setVisibility(View.INVISIBLE);
                    wi.setVisibility(View.INVISIBLE);
                    ri.setVisibility(View.INVISIBLE);
                    total-=Integer.parseInt(pri.getText().toString());
                    To.setText(Integer.toString(total));
                }
            }
        });
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.isChecked()) {
                    total+=3000;
                    To.setText(Integer.toString(total));
                    sCi.setVisibility(View.VISIBLE);
                    sCo.setVisibility(View.VISIBLE);
                    sRi.setVisibility(View.VISIBLE);
                    sWi.setVisibility(View.VISIBLE);
                    sRa.setVisibility(View.VISIBLE);
                    co.setVisibility(View.INVISIBLE);
                    ci.setVisibility(View.INVISIBLE);
                    ra.setVisibility(View.INVISIBLE);
                    wi.setVisibility(View.INVISIBLE);
                    ri.setVisibility(View.INVISIBLE);
                }
                else {
                    total-=3000;
                    To.setText(Integer.toString(total));
                    sCi.setVisibility(View.INVISIBLE);
                    sCo.setVisibility(View.INVISIBLE);
                    sRi.setChecked(false);
                    sRi.setVisibility(View.INVISIBLE);
                    sWi.setVisibility(View.INVISIBLE);
                    sRa.setVisibility(View.INVISIBLE);
                    co.setVisibility(View.VISIBLE);
                    ci.setVisibility(View.VISIBLE);
                    ra.setVisibility(View.VISIBLE);
                    wi.setVisibility(View.VISIBLE);
                    ri.setVisibility(View.VISIBLE);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(plus.isChecked()) {
                    total+=1500;
                    To.setText(Integer.toString(total));
                }
                else {
                    total-=1500;
                    To.setText(Integer.toString(total));
                }
            }
        });
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(co.isChecked()) {
                    total+=2000;
                    To.setText(Integer.toString(total));
                }
                else {
                    total-=2000;
                    To.setText(Integer.toString(total));
                }
            }
        });
        ci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ci.isChecked()) {
                    total+=2000;
                    To.setText(Integer.toString(total));
                }
                else {
                    total-=2000;
                    To.setText(Integer.toString(total));
                }
            }
        });
        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ra.isChecked()) {
                    total+=3000;
                    To.setText(Integer.toString(total));
                }
                else {
                    total-=3000;
                    To.setText(Integer.toString(total));
                }
            }
        });
        wi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wi.isChecked()) {
                    total+=3000;
                    To.setText(Integer.toString(total));
                }
                else {
                    total-=3000;
                    To.setText(Integer.toString(total));
                }
            }
        });
        ri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ri.isChecked()) {
                    total+=3000;
                    To.setText(Integer.toString(total));
                }
                else {
                    total-=3000;
                    To.setText(Integer.toString(total));
                }
            }
        });
        sRa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sRa.isChecked()) {
                    total+=1000;
                    To.setText(Integer.toString(total));
                }
                else {
                    total-=1000;
                    To.setText(Integer.toString(total));
                }
            }
        });
        sWi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sWi.isChecked()) {
                    total+=1000;
                    To.setText(Integer.toString(total));
                }
                else {
                    total-=1000;
                    To.setText(Integer.toString(total));
                }
            }
        });
        sRi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sRi.isChecked()) {
                    total+=1000;
                    To.setText(Integer.toString(total));
                }
                else {
                    total-=1000;
                    To.setText(Integer.toString(total));
                }
            }
        });
    }
    /*
    private LinearLayout.LayoutParams minimum = new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT
            , 100 // 미리보기(?)에 표시될 높이. dp to pixel 활용하세요
    );

    private LinearLayout.LayoutParams maximum = new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT
            , ViewGroup.LayoutParams.WRAP_CONTENT
    );
     */
}

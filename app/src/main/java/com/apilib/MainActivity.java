package com.apilib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.apilib.AsyncTasks.AsyncResponse;
import com.apilib.AsyncTasks.WebserviceCall;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<PojoModel> item = new ArrayList<>();
    ListView listview;
    CustomAdapter adapter;
    String URL = "http://192.168.1.5:8000/post/?format=json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.main_button);
        button.setOnClickListener(this);
        listview = (ListView)findViewById(R.id.listview);
        adapter = new CustomAdapter(MainActivity.this, item);
    }

    @Override
    public void onClick(View v) {
        new WebserviceCall(this, URL, null, "Loading...", true, new AsyncResponse() {
            @Override
            public void onCallback(String response) {
//                Log.d("myapp",response);
                PojoModel[] model = new Gson().fromJson(response,PojoModel[].class);
                Log.d("myapp", "Size + "+model.length);

                for (int i = 0; i <model.length ; i++) {
                    PojoModel abc = new PojoModel
                            (model[i].getId(),model[i].getTitle(),model[i].getDescription(),
                                    model[i].getPost_pic(), model[i].getNo_like(),model[i].getNo_comments(),
                                    model[i].getCat_id(), model[i].getUser_id(),model[i].getUser_name());
                    item.add(abc);
                }
//                List<PojoModel> list = model.getDescription();
            }
        }).execute();
        listview.setAdapter(adapter);
        listview.setItemsCanFocus(false);
    }
}

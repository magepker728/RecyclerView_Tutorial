package assignment3.abdoulkarim.cosc431.towson.edu.recyclerviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView MyrecyclerView;
My_adapter adapter;
ArrayList<ItemClass> list_of_items;
ItemClass item;
JsonParser j= new JsonParser();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyrecyclerView=findViewById(R.id.MyrecyclerView);
        MyrecyclerView.setHasFixedSize(true);
        MyrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //populate();
        j.execute();

        adapter = new My_adapter(list_of_items);
        MyrecyclerView.setAdapter(adapter);
    }

    public void populate(){
        list_of_items= new ArrayList<>();
        for(int i=0; i<100;i++){
            item= new ItemClass(j.data+ i,"jjjjjjjjjjjjjj");
            list_of_items.add(item);
        }


    }
}

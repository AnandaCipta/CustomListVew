package com.example.customlistvew;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Hero> heroList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heroList = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listView);
        heroList.add(new Hero(R.drawable.paska, "Spiderman", "Avengers"));
        heroList.add(new Hero(R.drawable.paskibra, "Joker", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.paska, "Iron Man", "Avengers"));
        heroList.add(new Hero(R.drawable.paskibra, "Doctor Strange", "Avengers"));
        heroList.add(new Hero(R.drawable.paskibra, "Captain America", "Avengers"));
        heroList.add(new Hero(R.drawable.paska, "Batman", "Justice League"));
        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);
        listView.setAdapter(adapter);
    }
}

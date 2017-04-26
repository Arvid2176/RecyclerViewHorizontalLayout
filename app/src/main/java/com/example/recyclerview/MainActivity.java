package com.example.recyclerview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.recyclerview.entity.Fruit;
import com.example.recyclerview.util.FruitAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit>  fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruitList();
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycle_view_list);
        //网格布局
//        GridLayoutManager gridLayoutManager= new GridLayoutManager(this,3);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter fruitAdapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(fruitAdapter);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
            actionBar.hide();
    }

    private void initFruitList(){
        for(int i=0;i<2;i++){
            Fruit apple=new Fruit();
            apple.setImgID(R.drawable.apple);
            apple.setName(getRandomlengthName("apple"));
            fruitList.add(apple);
            Fruit banana=new Fruit();
            banana.setName(getRandomlengthName("banana"));
            banana.setImgID(R.drawable.banana);
            fruitList.add(banana);
            Fruit orange =new Fruit();
            orange.setImgID(R.drawable.orange);
            orange.setName(getRandomlengthName("orange"));
            fruitList.add(orange);
            Fruit watermelon=new Fruit();
            watermelon.setName(getRandomlengthName("watermelon"));
            watermelon.setImgID(R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit pear=new Fruit();
            pear.setImgID(R.drawable.pear);
            pear.setName(getRandomlengthName("pear"));
            fruitList.add(pear);
            Fruit grape= new Fruit();
            grape.setName(getRandomlengthName("grape"));
            grape.setImgID(R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple =new Fruit();
            pineapple.setImgID(R.drawable.pineapple);
            pineapple.setName(getRandomlengthName("pineapple"));
            fruitList.add(pineapple);
            Fruit strawberry=new Fruit();
            strawberry.setName(getRandomlengthName("strawberry"));
            strawberry.setImgID(R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit kiwifruit=new Fruit();
            kiwifruit.setImgID(R.drawable.kiwifruit);
            kiwifruit.setName(getRandomlengthName("kiwifruit"));
            fruitList.add(kiwifruit);
        }
    }
    private String getRandomlengthName(String name){
        Random random=new Random();
        int length=random.nextInt(20)+1;
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<=length;i++){
            stringBuilder.append(name);
        }
        return  stringBuilder.toString();
    }
}

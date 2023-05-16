package com.elizabeu.meowwallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;





import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    ArrayList<String> imgArrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(getColor(R.color.status));




            imgArrayList.add("https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1212487/pexels-photo-1212487.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1366919/pexels-photo-1366919.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1535162/pexels-photo-1535162.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1624496/pexels-photo-1624496.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/2486168/pexels-photo-2486168.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1156684/pexels-photo-1156684.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1226302/pexels-photo-1226302.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1433052/pexels-photo-1433052.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1366630/pexels-photo-1366630.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1723637/pexels-photo-1723637.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1707215/pexels-photo-1707215.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1097491/pexels-photo-1097491.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.unsplash.com/photo-1491147334573-44cbb4602074?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
            imgArrayList.add("https://images.unsplash.com/photo-1545154708-f865c2bebb0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
            imgArrayList.add("https://images.unsplash.com/photo-1545177693-466cc24acb1d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
            imgArrayList.add("https://images.pexels.com/photos/1366921/pexels-photo-1366921.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1146127/pexels-photo-1146127.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1188037/pexels-photo-1188037.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/358457/pexels-photo-358457.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1578105/pexels-photo-1578105.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/274021/pexels-photo-274021.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1670187/pexels-photo-1670187.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1302436/pexels-photo-1302436.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1969979/pexels-photo-1969979.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/320014/pexels-photo-320014.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/2260800/pexels-photo-2260800.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1612461/pexels-photo-1612461.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1425353/pexels-photo-1425353.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/3894157/pexels-photo-3894157.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/417014/pexels-photo-417014.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1366652/pexels-photo-1366652.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1496373/pexels-photo-1496373.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1670187/pexels-photo-1670187.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1591382/pexels-photo-1591382.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1366907/pexels-photo-1366907.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1382070/pexels-photo-1382070.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1598073/pexels-photo-1598073.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1020016/pexels-photo-1020016.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1192330/pexels-photo-1192330.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1337753/pexels-photo-1337753.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1366909/pexels-photo-1366909.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1271620/pexels-photo-1271620.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1078983/pexels-photo-1078983.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1334116/pexels-photo-1334116.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1585325/pexels-photo-1585325.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/2098427/pexels-photo-2098427.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1105189/pexels-photo-1105189.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/719396/pexels-photo-719396.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1684151/pexels-photo-1684151.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1699020/pexels-photo-1699020.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1784578/pexels-photo-1784578.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1591447/pexels-photo-1591447.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.pexels.com/photos/1172849/pexels-photo-1172849.jpeg?auto=compress&cs=tinysrgb&w=600");
            imgArrayList.add("https://images.unsplash.com/photo-1545376998-9454a3066bb8?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8OXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
            imgArrayList.add("https://images.unsplash.com/photo-1545420399-04f3af22cd67?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Nnx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
            imgArrayList.add("https://images.unsplash.com/photo-1545385621-d7ea40521de9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8NHx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
            imgArrayList.add("https://images.unsplash.com/photo-1545427692-6b57963f61a8?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8NXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");






        rcv = findViewById(R.id.rcv);
        rcv.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
       AdapterClass adapterClass = new AdapterClass(MainActivity.this,imgArrayList);
       rcv.setAdapter(adapterClass);






    }

}
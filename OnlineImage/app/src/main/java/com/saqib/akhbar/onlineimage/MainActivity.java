package com.saqib.akhbar.onlineimage;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    ImageView onlineImage,onlineImage2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        onlineImage=findViewById(R.id.imageView);
        onlineImage2=findViewById(R.id.imageView2);



        Picasso.get().load("https://th.bing.com/th/id/R.6c34c3049dcc4600b4773bccd1810224?rik=dFEEncJO8zjMfg&riu=http%3a%2f%2fthumb1.shutterstock.com%2fdisplay_pic_with_logo%2f97100%2f117779824%2fstock-photo-stuffed-paprika-with-meat-rice-and-vegetables-117779824.jpg&ehk=nN%2bvG%2fEpS1P6KlEW39LGydo84J%2boYVok%2bLolZ5Lr8TY%3d&risl=&pid=ImgRaw&r=0")
                .placeholder(R.drawable.avatar).into(onlineImage);

        String uri="https://media.istockphoto.com/photos/table-top-view-of-indian-food-picture-id1250567402?s=612x612";
        Picasso.get().load(uri).into(onlineImage2);
    }
}
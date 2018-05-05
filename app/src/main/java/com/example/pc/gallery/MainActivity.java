package com.example.pc.gallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridview);

        // устанавливаем адаптер через экземпляр класса ImageAdapter
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // посылаем идентификатор картинки в FullScreenActivity
                Intent i = new Intent(getApplicationContext(),
                        FullImageActivity.class);
                // передаем индекс массива
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}
//public class MainActivity extends AppCompatActivity {

    /*private ImageView imageView;
    private Context context = MainActivity.this;
    //TextView textView = findViewById(R.id.textView);
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.gridview);

        GridView gridView = (GridView) findViewById(R.id.gridview);

        // устанавливаем адаптер через экземпляр класса ImageAdapter
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // посылаем идентификатор картинки в FullScreenActivity
                Intent i = new Intent(getApplicationContext(),
                        FullImageActivity.class);
                // передаем индекс массива
                i.putExtra("id", position);
                startActivity(i);
            }
        });*/











        // устанавливаем адаптер через экземпляр класса ImageAdapter
        //gridView.setAdapter(new ImageAdapter(this));

     /*   imageView = (ImageView)findViewById(R.id.imageview);
        button = (Button)findViewById(R.id.button);

        setImage();
    }

    public void setImage(){
        Button myButton = (Button)findViewById(R.id.button);
        final EditText editText = (EditText)findViewById(R.id.editText);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String internetUrl = editText.getText().toString();
                Glide
                        .with(context)
                        .load(internetUrl)
                        .into(imageView);
            }
        });*/
//    }

//}

package com.example.jqh.signatureanimation;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.graphics.drawable.Animatable;



public class MainActivity extends AppCompatActivity {

    private Animatable signature;
    private ImageView iv;
    private AnimatedVectorDrawable animatedVectorDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onMyClick(View v){
        startanim();
    }

    public void startanim(){
        iv = (ImageView)this.findViewById(R.id.imageView);
        animatedVectorDrawable = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.avd_vector_anim);
        iv.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
    }

}

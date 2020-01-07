package com.example.alldesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.service.autofill.Transformation;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

public class RegistrationScreen extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);


        Button button = findViewById(R.id.buttonRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
//        ImageView imageView = findViewById(R.id.imageView16);
//        Glide.with(this)
//                .load(R.drawable.person3)
//                .placeholder(R.drawable.person3)
//                .apply(RequestOptions.centerCropTransform())
//                 .into(imageView);
        ImageView imageView = findViewById(R.id.imageView16);
        Glide.with(getApplicationContext()).asBitmap().placeholder(R.drawable.person3)
                .load(R.drawable.person3)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .transform(new GlideCircleWithBorder(getApplicationContext(), 2, Color.parseColor("#ffffff")))
                .into(imageView);
    }
}





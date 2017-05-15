package com.example.hhuser.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;

    Integer[] imageArray = {1, 2, 3, 4, 5 , 6, 7, 8, 9, 10, 11, 12};

    int img1, img2, img3, img4, img5, img6, img10, img20, img30, img40, img50, img60;

    int firstCard, seocndCard;
    int firstClicked, secondClicked;
    int cardNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = (ImageView) this.findViewById(R.id.i1);
        i2 = (ImageView) this.findViewById(R.id.i2);
        i3 = (ImageView) this.findViewById(R.id.i3);
        i4 = (ImageView) this.findViewById(R.id.i4);
        i5 = (ImageView) this.findViewById(R.id.i5);
        i6 = (ImageView) this.findViewById(R.id.i6);
        i7 = (ImageView) this.findViewById(R.id.i7);
        i8 = (ImageView) this.findViewById(R.id.i8);
        i9 = (ImageView) this.findViewById(R.id.i9);
        i10 = (ImageView) this.findViewById(R.id.i10);
        i11 = (ImageView) this.findViewById(R.id.i11);
        i12 = (ImageView) this.findViewById(R.id.i12);

        i1.setTag("0");
        i2.setTag("1");
        i3.setTag("2");
        i4.setTag("3");
        i5.setTag("4");
        i6.setTag("5");
        i7.setTag("6");
        i8.setTag("7");
        i9.setTag("8");
        i10.setTag("9");
        i11.setTag("10");
        i12.setTag("11");

        loadCardImages();

        Collections.shuffle(Arrays.asList(imageArray));
    }

    private void loadCardImages() {
        img1 = R.drawable.animal1;
        img2 = R.drawable.animal2;
        img3 = R.drawable.animal3;
        img4 = R.drawable.animal4;
        img5 = R.drawable.animal5;
        img6 = R.drawable.animal6;
        img10 = R.drawable.animal10;
        img20 = R.drawable.animal20;
        img30 = R.drawable.animal30;
        img40 = R.drawable.animal40;
        img50 = R.drawable.animal50;
        img60 = R.drawable.animal60;
    }
}

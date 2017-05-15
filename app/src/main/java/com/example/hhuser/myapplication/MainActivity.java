package com.example.hhuser.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;

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
    }
}

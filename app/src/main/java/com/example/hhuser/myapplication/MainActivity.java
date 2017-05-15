package com.example.hhuser.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;

    Integer[] imageArray = {1, 2, 3, 4, 5 , 6, 11, 12, 13, 14, 15, 16};

    int img1, img2, img3, img4, img5, img6, img10, img20, img30, img40, img50, img60;

    int firstCard, secondCard;
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

        i1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i1, card);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i2, card);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i3, card);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i4, card);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i5, card);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i6, card);
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i7, card);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i8, card);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i9, card);
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i10, card);
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i11, card);
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int card = Integer.parseInt((String)v.getTag());
                makeTurn(i12, card);
            }
        });

    }

    public void makeTurn(ImageView v, int card) {
        if (imageArray[card] == 1) {
            v.setImageResource(img1);
        } else if (imageArray[card] == 2) {
            v.setImageResource(img2);
        } else if (imageArray[card] == 3) {
            v.setImageResource(img3);
        } else if (imageArray[card] == 4) {
            v.setImageResource(img4);
        } else if (imageArray[card] == 5) {
            v.setImageResource(img5);
        } else if (imageArray[card] == 6) {
            v.setImageResource(img6);
        } else if (imageArray[card] == 11) {
            v.setImageResource(img10);
        } else if (imageArray[card] == 12) {
            v.setImageResource(img20);
        } else if (imageArray[card] == 13) {
            v.setImageResource(img30);
        } else if (imageArray[card] == 14) {
            v.setImageResource(img40);
        } else if (imageArray[card] == 15) {
            v.setImageResource(img50);
        } else if (imageArray[card] == 16) {
            v.setImageResource(img60);
        }

        if (cardNum == 1) {
            firstCard = imageArray[card];
            if (firstCard > 10) {
                firstCard = firstCard - 10;
            }
            firstClicked = card;
            cardNum = 2;
            v.setEnabled(false);
        } else if (cardNum == 2) {
            secondCard = imageArray[card];
            if (secondCard > 10) {
                secondCard = secondCard - 10;
            }
            secondClicked = card;
            cardNum = 1;
            v.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    handleTurn();
                }
            }, 500);
        }
    }

    private void handleTurn() {
        if (firstCard == secondCard) {
            if (firstClicked == 0) {
                i1.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 1) {
                i2.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 2) {
                i3.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 3) {
                i4.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 4) {
                i5.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 5) {
                i6.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 6) {
                i7.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 7) {
                i8.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 8) {
                i9.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 9) {
                i10.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 10) {
                i11.setVisibility(View.INVISIBLE);
            } else if (firstClicked == 11) {
                i12.setVisibility(View.INVISIBLE);
            }
            if (secondClicked == 0) {
                i1.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 1) {
                i2.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 2) {
                i3.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 3) {
                i4.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 4) {
                i5.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 5) {
                i6.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 6) {
                i7.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 7) {
                i8.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 8) {
                i9.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 9) {
                i10.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 10) {
                i11.setVisibility(View.INVISIBLE);
            } else if (secondClicked == 11) {
                i12.setVisibility(View.INVISIBLE);
            }
        } else {
            i1.setImageResource(R.drawable.empty);
            i2.setImageResource(R.drawable.empty);
            i3.setImageResource(R.drawable.empty);
            i4.setImageResource(R.drawable.empty);
            i5.setImageResource(R.drawable.empty);
            i6.setImageResource(R.drawable.empty);
            i7.setImageResource(R.drawable.empty);
            i8.setImageResource(R.drawable.empty);
            i9.setImageResource(R.drawable.empty);
            i10.setImageResource(R.drawable.empty);
            i11.setImageResource(R.drawable.empty);
            i12.setImageResource(R.drawable.empty);
        }
        i1.setEnabled(true);
        i2.setEnabled(true);
        i3.setEnabled(true);
        i4.setEnabled(true);
        i5.setEnabled(true);
        i6.setEnabled(true);
        i7.setEnabled(true);
        i8.setEnabled(true);
        i9.setEnabled(true);
        i10.setEnabled(true);
        i11.setEnabled(true);
        i12.setEnabled(true);

        checkEnd();
    }

    private void checkEnd() {
        if (i1.getVisibility() == View.INVISIBLE &&
                i1.getVisibility() == View.INVISIBLE &&
                i2.getVisibility() == View.INVISIBLE &&
                i3.getVisibility() == View.INVISIBLE &&
                i4.getVisibility() == View.INVISIBLE &&
                i5.getVisibility() == View.INVISIBLE &&
                i6.getVisibility() == View.INVISIBLE &&
                i7.getVisibility() == View.INVISIBLE &&
                i8.getVisibility() == View.INVISIBLE &&
                i9.getVisibility() == View.INVISIBLE &&
                i10.getVisibility() == View.INVISIBLE &&
                i11.getVisibility() == View.INVISIBLE &&
                i12.getVisibility() == View.INVISIBLE) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setMessage("Game over!")
                    .setCancelable(false)
                    .setPositiveButton("New game", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
            });

            AlertDialog alert = dialog.create();
            alert.show();
        }
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

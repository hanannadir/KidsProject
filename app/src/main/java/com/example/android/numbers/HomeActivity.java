package com.example.android.numbers;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mediaPlayer;
    int count=1;
    ImageView numbers;
    ImageView play;
    ImageView next;
    ImageView prev;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        numbers = findViewById(R.id.number);
        play = findViewById(R.id.play);
        next = findViewById(R.id.next);
        prev = findViewById(R.id.prev);
        text = findViewById(R.id.text);
        next.setOnClickListener(this);
        prev.setOnClickListener(this);
        play.setOnClickListener(this);
        mediaPlayer = MediaPlayer.create(this, R.raw.one);


    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.next:
                count++;
                show();
                break;
            case R.id.prev:
                count--;
                show();
                break;
            case R.id.play:
                mediaPlayer.start();
                break;

        }
    }

    private void show() {
        switch (count) {
            case 1:
                text.setText("One");
                numbers.setImageResource(R.drawable.one);
                mediaPlayer = MediaPlayer.create(this, R.raw.one);

                break;
            case 2:
                text.setText("Two");
                mediaPlayer = MediaPlayer.create(this, R.raw.two);

                numbers.setImageResource(R.drawable.two);
                break;
            case 3:
                text.setText("Three");
                mediaPlayer = MediaPlayer.create(this, R.raw.three);

                numbers.setImageResource(R.drawable.three);
                break;
            case 4:
                text.setText("Four");
                mediaPlayer = MediaPlayer.create(this, R.raw.four);

                numbers.setImageResource(R.drawable.four);
                break;
            case 5:
                text.setText("Five");
                numbers.setImageResource(R.drawable.five);
                mediaPlayer = MediaPlayer.create(this, R.raw.five);

                break;
            case 6:
                text.setText("Six");
                mediaPlayer = MediaPlayer.create(this, R.raw.six);

                numbers.setImageResource(R.drawable.six);
                break;
            case 7:
                text.setText("Seven");
                mediaPlayer = MediaPlayer.create(this, R.raw.seven);

                numbers.setImageResource(R.drawable.seven);
                break;
            case 8:
                text.setText("Eight");
                mediaPlayer = MediaPlayer.create(this, R.raw.eight);

                numbers.setImageResource(R.drawable.eight);
                break;
            case 9:
                text.setText("Nine");
                mediaPlayer = MediaPlayer.create(this, R.raw.nine);

                numbers.setImageResource(R.drawable.nine);
                break;
            case 10:
                text.setText("Ten");
                mediaPlayer = MediaPlayer.create(this, R.raw.ten);
                numbers.setImageResource(R.drawable.ten);
                break;
            case 11:
                Intent intent = new Intent(HomeActivity.this, EndActivity.class);
                startActivity(intent);
                break;
            default:
                text.setText("One");
                mediaPlayer = MediaPlayer.create(this, R.raw.one);

                numbers.setImageResource(R.drawable.one);
                break;
        }

    }
}

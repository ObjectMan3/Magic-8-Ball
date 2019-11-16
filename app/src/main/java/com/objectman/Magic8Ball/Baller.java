package com.objectman.Magic8Ball;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import java.util.Random;


public class Baller extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(300);
            Toast.makeText(getApplicationContext(), "I know your question. Here is the answer: ", Toast.LENGTH_SHORT).show();
        } catch (InterruptedException e) {
            finish();
        }
        try {
            Thread.sleep(300);
            Random r = new Random();
            int random = r.nextInt(203 - 1) + 1;
            if (random < 11) {
                Toast.makeText(getApplicationContext(), "It is certain", Toast.LENGTH_LONG).show();
                finish();
            }

            if ((random > 10) && (random < 21)) {
                Toast.makeText(getApplicationContext(), "It is decidedly so", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 20) && (random < 31)) {
                Toast.makeText(getApplicationContext(), "Without a doubt", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 30) && (random < 41)) {
                Toast.makeText(getApplicationContext(), "Yes definitely", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 40) && (random < 51)) {
                Toast.makeText(getApplicationContext(), "You may rely on it", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 50) && (random < 61)) {
                Toast.makeText(getApplicationContext(), "As I see it, yes", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 60) && (random < 71)) {
                Toast.makeText(getApplicationContext(), "Most likely", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 70) && (random < 81)) {
                Toast.makeText(getApplicationContext(), "Outlook good", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 80) && (random < 91)) {
                Toast.makeText(getApplicationContext(), "Yes", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 91) && (random < 101)) {
                Toast.makeText(getApplicationContext(), "Signs point to yes", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 100) && (random < 111)) {
                Toast.makeText(getApplicationContext(), "Reply hazy try again", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 110) && (random < 121)) {
                Toast.makeText(getApplicationContext(), "Ask again later", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 120) && (random < 131)) {
                Toast.makeText(getApplicationContext(), "Better not tell you now", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 130) && (random < 141)) {
                Toast.makeText(getApplicationContext(), "Cannot predict now", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 140) && (random < 151)) {
                Toast.makeText(getApplicationContext(), "Concentrate and ask again", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 150) && (random < 161)) {
                Toast.makeText(getApplicationContext(), "Don't count on it", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 160) && (random < 171)) {
                Toast.makeText(getApplicationContext(), "My reply is no", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 170) && (random < 181)) {
                Toast.makeText(getApplicationContext(), "My sources say no", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 180) && (random < 191)) {
                Toast.makeText(getApplicationContext(), "Outlook not so good", Toast.LENGTH_LONG).show();
                finish();
            }
            if ((random > 190) && (random < 201)) {
                Toast.makeText(getApplicationContext(), "Very doubtful", Toast.LENGTH_LONG).show();
                finish();
            }
            if (random > 200) {
                Toast.makeText(getApplicationContext(), "You will kick butt!!", Toast.LENGTH_LONG).show();
                finish();
            }
        }
        catch (InterruptedException e) {
            Toast.makeText(getApplicationContext(), "> Snap! <", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}

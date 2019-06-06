package com.example.jokebot;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Joke myJoke = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bot myBot = new Bot();

         Joke j = new Joke("I wondered why the baseball was getting bigger?" ,"then it hit me");
         Joke anotherJoke = new Joke("I learned sign language" , "it’s very handy");

         ArrayList<Joke> someJokes = JokeWriter.getJokeListOne();
         JokeBot jokeBot = new JokeBot(someJokes);
         jokeBot.tellJoke();

         jokeBot.jokesIKnow = JokeWriter.getJokeListTwo();
         JokeBot.jokesIKnow = JokeWriter.getJokeListOne();

         ComedianBot drHilarious = new ComedianBot("DrHilarious");
         drHilarious.performShow();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

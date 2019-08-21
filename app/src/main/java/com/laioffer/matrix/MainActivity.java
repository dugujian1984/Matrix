package com.laioffer.matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements EventFragment.OnItemSelectListener, CommentFragment.OnItemSelectListener  {

    private EventFragment listFragment;
    private CommentFragment gridFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listFragment = getSupportFragmentManager().findFragmentById(R.id.event_container) == null ? new EventFragment() :
                (EventFragment) getSupportFragmentManager().findFragmentById(R.id.event_container);
        getSupportFragmentManager().beginTransaction().replace(R.id.event_container, listFragment).commit();

        if (isTablet()) {
            gridFragment = getSupportFragmentManager().findFragmentById(R.id.comment_container) == null ? new CommentFragment() :
                    (CommentFragment) getSupportFragmentManager().findFragmentById(R.id.comment_container);

            getSupportFragmentManager().beginTransaction().replace(R.id.comment_container, gridFragment).commit();
        }

    }


    private boolean isTablet() {
        return (getApplicationContext().getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK) >=
                Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Life cycle test", "We are at onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Life cycle test", "We are at onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Life cycle test", "We are at onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Life cycle test", "We are at onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Life cycle test", "We are at onDestroy()");
    }

    @Override
    public void onItemSelected(int position) {
        if (!isTablet()) {
            Intent intent = new Intent(this, EventGridActivity.class);
            intent.putExtra("position", position);
            startActivity(intent);
        } else {
            gridFragment.onItemSelected(position);
        }
    }

    @Override
    public void onCommentSelected(int position) {
        listFragment.onItemSelected(position);
    }
}

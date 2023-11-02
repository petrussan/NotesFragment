package id.ac.petra.notesfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentlayout);

        TitleFragment fr = new TitleFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame,fr)
                .commit();

    }
}
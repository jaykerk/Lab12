package edu.illinois.cs.cs125.spring2019.lab12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/** Second. */
public class SecondActivity extends AppCompatActivity {
    /** On created.
     *
     * @param savedInstanceState is a state.
     */
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        configureBackButton();
    }
    /** Configure that baaack. */
    private void configureBackButton() {
        Button back = (Button) findViewById(R.id.button_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                finish();
            }
        });
    }
}

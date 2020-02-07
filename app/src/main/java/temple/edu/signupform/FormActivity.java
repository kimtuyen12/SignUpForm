package temple.edu.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View name = findViewById(R.id.editTextName);
        final View email = findViewById(R.id.editTextEmail);
        final View password = findViewById(R.id.editTextPassword);
        final View passwordConf = findViewById(R.id.editTextPasswordConf);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

    }
}

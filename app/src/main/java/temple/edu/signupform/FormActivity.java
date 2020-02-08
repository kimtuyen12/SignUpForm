package temple.edu.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
            public void onClick(View v) {
                String name_val = ((EditText)name).getText().toString().trim();
                String email_val = ((EditText)email).getText().toString().trim();
                String pass_val = ((EditText)password).getText().toString().trim();
                String passConf_val = ((EditText)passwordConf).getText().toString().trim();

                if( name_val.isEmpty() || email_val.isEmpty() || pass_val.isEmpty() || passConf_val.isEmpty() ) {
                    Toast.makeText(v.getContext(), "Please enter all information.", Toast.LENGTH_SHORT).show();
                    return;
                }

                if( ! pass_val.equals(passConf_val) ) {
                    Toast.makeText(v.getContext(), "Password and Confirm Password do not match. Please check again", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(v.getContext(), "Welcome, " + name_val + ", to the SignUpForm App", Toast.LENGTH_LONG).show();
            }
        });

    }
}

package skachkov.space.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void toSignIn(View view) {
        try {
            Intent intent = new Intent(this, Registration.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }
}
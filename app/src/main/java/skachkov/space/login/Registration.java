package skachkov.space.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
    }

    public void toSignIn(View view) {
        try {
            Intent intent = new Intent(this, LogIn.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }
}
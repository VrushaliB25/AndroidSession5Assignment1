package example.com.blinkingeffect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);             //Pass the relative layout

    }
        public void startBlinkingAnimation(View view)
        {
            TextView mytextblink = (TextView) findViewById(R.id.effect);
            Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blinkingeffect);     //Loading animation
            mytextblink.startAnimation(startAnimation);             //Start the animation
        }

}

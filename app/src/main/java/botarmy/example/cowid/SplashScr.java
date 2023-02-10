package botarmy.example.cowid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScr extends AppCompatActivity {
    ImageView lgm;
    TextView appOwner,appOwnerHeading;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scr);

        lgm = findViewById(R.id.lgmImage);
        appOwner = findViewById(R.id.appOwner);
        appOwnerHeading = findViewById(R.id.appOwnerHeading);
        lottieAnimationView = findViewById(R.id.splashScreen);

        lgm.animate().translationY(2000).setDuration(1000).setStartDelay(3000);
        appOwner.animate().translationY(2000).setDuration(1000).setStartDelay(3000);
        appOwnerHeading.animate().translationY(2000).setDuration(1000).setStartDelay(3000);
        lottieAnimationView.animate().translationY(2000).setDuration(1000).setStartDelay(3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScr.this, MainActivity.class));
                finish();
            }
        },4000);
    }
}
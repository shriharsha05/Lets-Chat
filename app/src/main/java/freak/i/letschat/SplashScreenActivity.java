package freak.i.letschat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher = new LogoLauncher();

      //  MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.click);
      //  mediaPlayer.start();
        logoLauncher.start();
    }

    private class LogoLauncher extends Thread
    {
        public void run()
        {
            try
            {
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            Intent intent = new Intent(SplashScreenActivity.this,PhoneAuthActivity.class);
            startActivity(intent);
            SplashScreenActivity.this.finish();   //to end this activity
        }
    }

}


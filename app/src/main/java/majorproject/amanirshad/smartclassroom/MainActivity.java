package majorproject.amanirshad.smartclassroom;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    private SliderLayout sliderLayout;
    private final int IMAGE_SCROLL_TIME = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Working of Image Slider
        sliderLayout = findViewById(R.id.imageslider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.WORM);
        sliderLayout.setScrollTimeInSec(IMAGE_SCROLL_TIME);
        setSliderView();

    }

    /***
     * This function defines the images in the Image Slider
     */
    private void setSliderView() {
        for (int i =0; i<3; i++){
            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i){
                case 0:
                    sliderView.setImageDrawable(R.drawable.picture_01);
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.picture_02);
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.picture_03);
                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);

            //at last add this view to your layout
            sliderLayout.addSliderView(sliderView);
        }
    }

}
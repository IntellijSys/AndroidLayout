package my.intellij.androidlayout;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class FrameLayoutActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
    }
}

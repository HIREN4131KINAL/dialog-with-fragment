package example.com.dialogviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void showDialog() {
        // Create and show the fragment_dialog.
        android.app.FragmentManager fm = getFragmentManager();
        FragmentDialog customDialouge = new FragmentDialog();
        customDialouge.show(fm, "custom fragment");
    }

    public void OpenDialog(View view) {

        showDialog();
    }
}

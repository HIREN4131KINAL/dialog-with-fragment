package example.com.dialogviewpager;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Android Developer on 07-Jun-16.
 */
public class FragmentDialog extends DialogFragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //read the int from args
        view = inflater.inflate(R.layout.fragment_dialog, container , false);



        return view;
    }

}

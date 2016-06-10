package example.com.dialogviewpager;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Android Developer on 09-Jun-16.
 */
public class FragmentTwo extends Fragment {

    View view;
    Button Yes , No;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_two, container, false);

Yes = (Button)view.findViewById(R.id.btn_dialog_Yes);

        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "You click yes", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

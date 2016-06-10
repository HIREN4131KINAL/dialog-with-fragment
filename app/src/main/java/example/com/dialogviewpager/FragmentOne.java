package example.com.dialogviewpager;

import android.annotation.TargetApi;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Android Developer on 09-Jun-16.
 */
public class FragmentOne extends Fragment {

    View view;
    Button Yes, No;
    FragmentDialog fragmentDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_one, container, false);

        Yes = (Button) view.findViewById(R.id.btn_dialog_Yes);

        Yes.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {

                // Create new fragment and transaction
                Fragment newFragment = new FragmentTwo();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack if needed
                transaction.replace(R.id.fragment, newFragment);
                transaction.addToBackStack(null);

// Commit the transaction
                transaction.commit();

                Toast.makeText(getActivity(), "You click yes", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}

package vn.edu.vtn.model;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.security.Key;

import vn.edu.vtn.hocveviewpager.R;

public class PlaceholderFragment extends Fragment {
    private static final String KEY_ = "KEY_IMG";

    public PlaceholderFragment() {

    }

    public static PlaceholderFragment newInstance(int i) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_, i);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ImageView imgImage = view.findViewById(R.id.imgImage);
        switch (getArguments().getInt(KEY_)) {
            case 0:
                imgImage.setImageResource(R.drawable.house);
                break;
            case 1:
                imgImage.setImageResource(R.drawable.school);
                break;
            case 2:
                imgImage.setImageResource(R.drawable.hosipital);
                break;
        }
        return view;
    }

}

package com.example.myaudioplayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LibrarySongsFragment extends Fragment {

    private static final String ARG_PATH = "argPath", ARG_POSITION = "argPosition";

    private String path;
    private int position;


    static LibrarySongsFragment newInstance(String path, int currentPosition){
        LibrarySongsFragment fragment = new LibrarySongsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PATH, path);
        args.putInt(ARG_POSITION, currentPosition + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_library_songs, container, false);
        TextView textView = v.findViewById(R.id.text_view_fragment);
        Button button = v.findViewById(R.id.fragment_button);

        

        if (getArguments() != null){
            path = getArguments().getString(ARG_PATH);
            position = getArguments().getInt(ARG_POSITION);
        }
        textView.setText(path);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getActivity() != null) {
                    String newPath = path + position;
                    LibrarySongsFragment fragment = LibrarySongsFragment.newInstance(newPath, position);
                    ((LibraryActivity) getActivity()).addTab(fragment,newPath, position);
                }
            }
        });

        return v;
    }
}

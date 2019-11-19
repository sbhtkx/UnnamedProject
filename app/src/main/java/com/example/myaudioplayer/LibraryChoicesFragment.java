package com.example.myaudioplayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LibraryChoicesFragment extends Fragment {

    private static final String ARG_POSITION = "argPosition";

    private int position;

    static LibraryChoicesFragment newInstance(){
        LibraryChoicesFragment fragment = new LibraryChoicesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, 0);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_library_choices, container, false);
        ImageButton songsButton = v.findViewById(R.id.image_button_songs);
        ImageButton artistButton = v.findViewById(R.id.image_button_artist);
        ImageButton albumButton = v.findViewById(R.id.image_button_album);
        ImageButton tagButton = v.findViewById(R.id.image_button_tag);
        ImageButton folderButton = v.findViewById(R.id.image_button_folder);

        if (getArguments() != null){
            position = getArguments().getInt(ARG_POSITION);
        }

        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getActivity() != null) {
                    Toast.makeText(getActivity(), "songs", Toast.LENGTH_SHORT).show();
                    LibrarySongsFragment fragment = LibrarySongsFragment.newInstance("" + position, position);
                    ((LibraryActivity) getActivity()).addTab(fragment,"" + position, position);
                }
            }
        });

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getActivity() != null) {
                    Toast.makeText(getActivity(), "artists", Toast.LENGTH_SHORT).show();
                    LibrarySongsFragment fragment = LibrarySongsFragment.newInstance("" + position, position);
                    ((LibraryActivity) getActivity()).addTab(fragment,"" + position, position);
                }
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getActivity() != null) {
                    Toast.makeText(getActivity(), "album", Toast.LENGTH_SHORT).show();
                    LibrarySongsFragment fragment = LibrarySongsFragment.newInstance("" + position, position);
                    ((LibraryActivity) getActivity()).addTab(fragment,"" + position, position);
                }
            }
        });

        tagButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getActivity() != null) {
                    Toast.makeText(getActivity(), "tag", Toast.LENGTH_SHORT).show();
                    LibrarySongsFragment fragment = LibrarySongsFragment.newInstance("" + position, position);
                    ((LibraryActivity) getActivity()).addTab(fragment,"" + position, position);
                }
            }
        });

        folderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getActivity() != null) {
                    Toast.makeText(getActivity(), "folders", Toast.LENGTH_SHORT).show();
                    LibrarySongsFragment fragment = LibrarySongsFragment.newInstance("" + position, position);
                    ((LibraryActivity) getActivity()).addTab(fragment,"" + position, position);
                }
            }
        });



        return v;
    }
}

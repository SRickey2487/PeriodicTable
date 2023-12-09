package com.zybooks.periodictable;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ElementFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_element, container, false);
        // Retrieve the selected element's symbol from the fragment arguments
        Bundle args = getArguments();
        if (args != null) {
            String elementSymbol = args.getString("ELEMENT_SYMBOL").trim();
            showElement(view, elementSymbol);
        }
        return view;
    }
    private void showElement(View view, String elementSymbol) {
        TextView titleTextView = view.findViewById(R.id.element_title);
        TextView atomicTextView = view.findViewById(R.id.title_atomic);
        TextView neutronTextView = view.findViewById(R.id.title_neutron);
        TextView protonTextView = view.findViewById(R.id.title_proton);
        TextView electronTextView = view.findViewById(R.id.title_electron);
        TextView boilingTextView = view.findViewById(R.id.title_boiling);
        TextView meltingTextView = view.findViewById(R.id.title_melting);
        TextView familyTextView = view.findViewById(R.id.title_family);
        ImageView elementImage = view.findViewById(R.id.element_image);

        int elementname = getResources().getIdentifier(elementSymbol.toLowerCase() + "_title", "string", getActivity().getPackageName());
        int atomic = getResources().getIdentifier(elementSymbol.toLowerCase() + "_atomic", "string", getActivity().getPackageName());
        int neutron = getResources().getIdentifier(elementSymbol.toLowerCase() + "_neutron", "string", getActivity().getPackageName());
        int proton = getResources().getIdentifier(elementSymbol.toLowerCase() + "_proton", "string", getActivity().getPackageName());
        int electron = getResources().getIdentifier(elementSymbol.toLowerCase() + "_electron", "string", getActivity().getPackageName());
        int boiling = getResources().getIdentifier(elementSymbol.toLowerCase() + "_boiling", "string", getActivity().getPackageName());
        int melting = getResources().getIdentifier(elementSymbol.toLowerCase() + "_melting", "string", getActivity().getPackageName());
        int family = getResources().getIdentifier(elementSymbol.toLowerCase() + "_family", "string", getActivity().getPackageName());
        int elementimageUpdate = getResources().getIdentifier(elementSymbol.toLowerCase(),"drawable",getActivity().getPackageName());
        //sets the text views according to the information
        titleTextView.setText(getString(elementname));
        atomicTextView.setText(getString(atomic));
        neutronTextView.setText(getString(neutron));
        protonTextView.setText(getString(proton));
        electronTextView.setText(getString(electron));
        boilingTextView.setText(getString(boiling));
        meltingTextView.setText(getString(melting));
        familyTextView.setText(getString(family));
        elementImage.setImageResource(elementimageUpdate);
    }
}
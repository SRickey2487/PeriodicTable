package com.zybooks.periodictable;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Pair;
import android.view.Gravity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    boolean highlighted = false;
    private Set<Integer> activeSwitches;
    private static final String[][] periodicTableSymbols = {
            {" H  ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "He"},
            {" Li "," Be ","", "", "", "", "", "", "", "", "", "", " B  ", " C  ", " N  ", " O  ", " F  ", " Ne "},
            {" Na "," Mg ", "", "", "", "", "", "", "", "", "", "", " Al ", " Si ", " P   ", " S  ", "Cl", " Ar "},
            {" K  "," Ca "," Sc ", " Ti ", " V  ", " Cr ", " Mn ", " Fe ", " Co ", " Ni ", " Cu ", " Zn ", " Ga ", " Ge ", " As ", " Se ", " Br ", " Kr "},
            {" Rb "," Sr "," Y  ", " Zr ", " Nb ", " Mo ", " Tc ", " Ru ", " Rh ", " Pd ", " Ag ", "  Cd ", " In ", " Sn ", " Sb ", " Te ", " I   ", " Xe "},
            {" Cs "," Ba "," La "," Hf "," Ta " ," W  "," Re "," Os "," Ir  "," Pt "," Au "," Hg "," Ti "," Pb "," Bi "," Po "," At "," Rn "},
            {" Fr "," Ra "," Ac "," Rf "," Db "," Sg "," Bh "," Hs "," Mt "," Ds "," Rg "," Cn "," Nh "," Fl "," Mc "," Lv "," Ts "," Og "},
            {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", "", "", " Ce ", " Pr ", " Nd ", " Pm ", " Sm ", " Eu ", " Gd ", " Tb ", " Dy ", " Ho ", " Er ", " Tm ", " Yb ", " Lu ", ""},
            {"", "", "", " Th ", " Pa ", " U ", " Np ", " Pu ", " Am ", " Cm ", " Bk ", " Cf ", " Es ", " Fm ", " Md ", " No ", " Lr ", ""},

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activeSwitches = new HashSet<>();
        GridLayout gridLayout = findViewById(R.id.periodic_table_grid);

        Switch nonmetalSwitch = findViewById(R.id.nonMetalSwitch);
        Switch alkSwitch = findViewById(R.id.alkSwitch);
        Switch alkearthSwitch = findViewById(R.id.alkearthSwitch);
        Switch  tranmetalSwitch= findViewById(R.id.transmetalSwitch);
        Switch posttranSwitch = findViewById(R.id.posttransSwitch);
        Switch metalloidsSwitch = findViewById(R.id.metalloidsSwitch);
        Switch nobelgasSwitch = findViewById(R.id.noblegasesSwitch);
        Switch lanthSwitch = findViewById(R.id.lanthanSwitch);
        Switch actinSwitch = findViewById(R.id.actinsSwitch);
        if (nonmetalSwitch != null) {
            nonmetalSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The switch is turned on, highlight
                        onSwitchTurnedOn(buttonView);
                    } else {
                        // The switch is turned off, stop highlight
                        onSwitchTurnedOff(buttonView);
                    }
                }
            });
        }

        if (alkSwitch != null) {
            alkSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The switch is turned on, trigger the highlighting logic
                        onSwitchTurnedOn(buttonView);
                    } else {
                        // The switch is turned off, trigger the highlighting logic
                        onSwitchTurnedOff(buttonView);
                    }
                }
            });
        }
        if (alkearthSwitch != null) {
            alkearthSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The switch is turned on, trigger the highlighting logic
                        onSwitchTurnedOn(buttonView);
                    } else {
                        // The switch is turned off, trigger the highlighting logic
                        onSwitchTurnedOff(buttonView);
                    }
                }
            });
        }
        if (tranmetalSwitch != null) {
            tranmetalSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The switch is turned on, highlight
                        onSwitchTurnedOn(buttonView);
                    } else {
                        // The switch is turned off, stop highlight
                        onSwitchTurnedOff(buttonView);
                    }
                }
            });
        }
        if (posttranSwitch != null) {
            posttranSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The switch is turned on, highlight
                        onSwitchTurnedOn(buttonView);
                    } else {
                        // The switch is turned off, stop highlight
                        onSwitchTurnedOff(buttonView);
                    }
                }
            });
        }
        if (metalloidsSwitch != null) {
            metalloidsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The switch is turned on, highlight
                        onSwitchTurnedOn(buttonView);
                    } else {
                        // The switch is turned off, stop highlight
                        onSwitchTurnedOff(buttonView);
                    }
                }
            });
        }
        if (nobelgasSwitch != null) {
            nobelgasSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The switch is turned on, highlight
                        onSwitchTurnedOn(buttonView);
                    } else {
                        // The switch is turned off, stop highlight
                        onSwitchTurnedOff(buttonView);
                    }
                }
            });
        }
        if (lanthSwitch != null) {
            lanthSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The switch is turned on, highlight
                        onSwitchTurnedOn(buttonView);
                    } else {
                        // The switch is turned off, stop highlight
                        onSwitchTurnedOff(buttonView);
                    }
                }
            });
        }
        if (actinSwitch != null) {
            actinSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The switch is turned on, highlight
                        onSwitchTurnedOn(buttonView);
                    } else {
                        // The switch is turned off, stop highlight
                        onSwitchTurnedOff(buttonView);
                    }
                }
            });
        }
        for (int row = 0; row < periodicTableSymbols.length; row++) {
            for (int col = 0; col < periodicTableSymbols[row].length; col++) {
                final String symbol = periodicTableSymbols[row][col];

                TextView elementTextView = new TextView(this);
                elementTextView.setText(symbol);
                elementTextView.setGravity(Gravity.CENTER);
                elementTextView.setBackgroundResource(R.drawable.element_background);
                elementTextView.setClickable(true);
                GridLayout layoutToToggle = findViewById(R.id.periodic_table_grid);

                elementTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        displayElementDetails(symbol);
                        nonmetalSwitch.setVisibility(View.GONE);
                        alkSwitch.setVisibility(View.GONE);
                        alkearthSwitch.setVisibility(View.GONE);
                        tranmetalSwitch.setVisibility(View.GONE);
                        posttranSwitch.setVisibility(View.GONE);
                        metalloidsSwitch.setVisibility(View.GONE);
                        nobelgasSwitch.setVisibility(View.GONE);
                        lanthSwitch.setVisibility(View.GONE);
                        actinSwitch.setVisibility(View.GONE);
                    }
                });

                gridLayout.addView(elementTextView);
            }
        }
    }

    private void displayElementDetails(String symbol) {
        ElementFragment detailFragment = new ElementFragment();
        Bundle bundle = new Bundle();

       System.out.println(symbol);
        bundle.putString("ELEMENT_SYMBOL", symbol);
        detailFragment.setArguments(bundle);

        GridLayout periodicTableGrid = findViewById(R.id.periodic_table_grid);
        periodicTableGrid.setVisibility(View.GONE);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, detailFragment).addToBackStack(null).commit();
    }

    public void backButtonPress(View view) {
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if (currentFragment != null && currentFragment.isVisible()) {
            if (currentFragment.getChildFragmentManager().getBackStackEntryCount() > 0) {
                currentFragment.getChildFragmentManager().popBackStack();
            } else {
                GridLayout periodicTableGrid = findViewById(R.id.periodic_table_grid);
                periodicTableGrid.setVisibility(View.VISIBLE);
                Switch nonmetalSwitch = findViewById(R.id.nonMetalSwitch);
                Switch alkSwitch = findViewById(R.id.alkSwitch);
                Switch alkearthSwitch = findViewById(R.id.alkearthSwitch);
                Switch  tranmetalSwitch= findViewById(R.id.transmetalSwitch);
                Switch posttranSwitch = findViewById(R.id.posttransSwitch);
                Switch metalloidsSwitch = findViewById(R.id.metalloidsSwitch);
                Switch nobelgasSwitch = findViewById(R.id.noblegasesSwitch);
                Switch lanthSwitch = findViewById(R.id.lanthanSwitch);
                Switch actinSwitch = findViewById(R.id.actinsSwitch);
                nonmetalSwitch.setVisibility(View.VISIBLE);
                alkSwitch.setVisibility(View.VISIBLE);
                alkearthSwitch.setVisibility(View.VISIBLE);
                tranmetalSwitch.setVisibility(View.VISIBLE);
                posttranSwitch.setVisibility(View.VISIBLE);
                metalloidsSwitch.setVisibility(View.VISIBLE);
                nobelgasSwitch.setVisibility(View.VISIBLE);
                lanthSwitch.setVisibility(View.VISIBLE);
                actinSwitch.setVisibility(View.VISIBLE);
                if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                    getSupportFragmentManager().popBackStack();
                } else {
                    super.onBackPressed();
                }
            }
        } else {
            super.onBackPressed();
        }
    }

    public void onSwitchClicked(View view) {
        Switch familySwitch = (Switch) view;
        if (familySwitch.isChecked()) {
            onSwitchTurnedOn(view);
        } else {
            onSwitchTurnedOff(view);
        }
    }
    public void onSwitchTurnedOn(View view) {
        int switchId = view.getId();
        activeSwitches.add(switchId);
        highlight();
    }

    public void onSwitchTurnedOff(View view) {
        int switchId = view.getId();
        activeSwitches.remove(switchId);
        highlight();
    }

    public void highlight() {
        GridLayout periodicTableGrid = findViewById(R.id.periodic_table_grid);

        if (periodicTableGrid != null) {
            int rows = periodicTableGrid.getRowCount();
            int columns = periodicTableGrid.getColumnCount();

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < columns; col++) {
                    int index = row * columns + col;
                    //creates a childView of the table to use as a highlight overlay
                    View childView = periodicTableGrid.getChildAt(index);

                    if (childView instanceof TextView) {
                        TextView textView = (TextView) childView;

                        Pair<Integer, Integer> position = new Pair<>(row, col);
                        boolean shouldHighlight = shouldHighlight(position);
                        Integer highlightColor = highlightPosition(position);
                        if (shouldHighlight) {
                            textView.setBackgroundColor(highlightColor);
                        } else {
                            textView.setBackgroundResource(R.drawable.element_background);
                        }
                    }
                }
            }
        }
    }

    private Integer highlightPosition(Pair<Integer, Integer> position) {
        for (int switchId : activeSwitches) {
            List<Pair<Integer, Integer>> switchPositions = elementPosition(switchId);
            if (switchPositions != null && switchPositions.contains(position)) {
                return highlightColor(switchId);
            }
        }
        return null;
    }
    private Integer highlightColor(int switchId) {
        // Return the highlight color based on the switch ID
        if (switchId == R.id.nonMetalSwitch) {
            return Color.YELLOW;
        } else if (switchId == R.id.alkSwitch) {
            return Color.GREEN;
        }else if (switchId == R.id.alkearthSwitch){
            return Color.RED;
                    }
        else if (switchId == R.id.transmetalSwitch){
            return Color.MAGENTA;
        } else if (switchId == R.id.posttransSwitch){
            int Orange = getColor(R.color.orange);
            return Orange;
        }
        else if (switchId == R.id.metalloidsSwitch){
            int lightblue = getColor(R.color.light_blue);
            return lightblue;
        }
        else if (switchId == R.id.noblegasesSwitch){
            int pink = getColor(R.color.pink);
            return pink;
        }
        else if (switchId == R.id.lanthanSwitch){
            int darkgreen = getColor(R.color.light_green);
            return darkgreen;
        }
        else if (switchId == R.id.actinsSwitch){
            int darkpink = getColor(R.color.dark_pink);
            return darkpink;
        }
        return null;
    }
    private boolean shouldHighlight(Pair<Integer, Integer> position) {
        for (int switchId : activeSwitches) {
            List<Pair<Integer, Integer>> switchPositions = elementPosition(switchId);
            if (switchPositions != null && switchPositions.contains(position)) {
                return true;
            }
        }
        return false;
    }

    private List<Pair<Integer, Integer>> elementPosition(int switchId) {
        List<Pair<Integer, Integer>> positions = new ArrayList<>();

        if (switchId == R.id.nonMetalSwitch) {
            positions.add(new Pair<>(0, 0));
            positions.add(new Pair<>(1, 13));
            positions.add(new Pair<>(1, 14));
            positions.add(new Pair<>(1, 15));
            positions.add(new Pair<>(1, 16));
            positions.add(new Pair<>(2, 14));
            positions.add(new Pair<>(2, 15));
            positions.add(new Pair<>(2, 16));
            positions.add(new Pair<>(3, 15));
            positions.add(new Pair<>(3, 16));
            positions.add(new Pair<>(4, 16));
        } else if (switchId == R.id.alkSwitch) {
            positions.add(new Pair<>(1, 0));
            positions.add(new Pair<>(2, 0));
            positions.add(new Pair<>(3, 0));
            positions.add(new Pair<>(4, 0));
            positions.add(new Pair<>(5, 0));
            positions.add(new Pair<>(6, 0));

        }else if (switchId == R.id.alkearthSwitch) {
            positions.add(new Pair<>(1, 1));
            positions.add(new Pair<>(2, 1));
            positions.add(new Pair<>(3, 1));
            positions.add(new Pair<>(4, 1));
            positions.add(new Pair<>(5, 1));
            positions.add(new Pair<>(6, 1));

        }else if (switchId == R.id.alkearthSwitch) {
            positions.add(new Pair<>(1, 1));
            positions.add(new Pair<>(2, 1));
            positions.add(new Pair<>(3, 1));
            positions.add(new Pair<>(4, 1));
            positions.add(new Pair<>(5, 1));
            positions.add(new Pair<>(6, 1));

        }
        else if (switchId == R.id.transmetalSwitch) {
            positions.add(new Pair<>(3, 2));
            positions.add(new Pair<>(4, 2));
            positions.add(new Pair<>(5, 3));
            positions.add(new Pair<>(6, 3));
            positions.add(new Pair<>(3, 3));
            positions.add(new Pair<>(4, 3));
            positions.add(new Pair<>(5, 4));
            positions.add(new Pair<>(6, 4));
            positions.add(new Pair<>(3, 4));
            positions.add(new Pair<>(4, 4));
            positions.add(new Pair<>(5, 5));
            positions.add(new Pair<>(6, 5));
            positions.add(new Pair<>(3, 5));
            positions.add(new Pair<>(4, 5));
            positions.add(new Pair<>(5, 6));
            positions.add(new Pair<>(6, 6));
            positions.add(new Pair<>(3, 6));
            positions.add(new Pair<>(4, 6));
            positions.add(new Pair<>(5, 7));
            positions.add(new Pair<>(6, 7));
            positions.add(new Pair<>(3, 7));
            positions.add(new Pair<>(4, 7));
            positions.add(new Pair<>(3, 8));
            positions.add(new Pair<>(4, 8));
            positions.add(new Pair<>(5, 8));
            positions.add(new Pair<>(3, 9));
            positions.add(new Pair<>(4, 9));
            positions.add(new Pair<>(5, 9));
            positions.add(new Pair<>(3, 10));
            positions.add(new Pair<>(4, 10));
            positions.add(new Pair<>(5, 10));
            positions.add(new Pair<>(3, 11));
            positions.add(new Pair<>(4, 11));
            positions.add(new Pair<>(5, 11));
        }
        else if (switchId == R.id.posttransSwitch) {
            positions.add(new Pair<>(2, 12));
            positions.add(new Pair<>(3, 12));
            positions.add(new Pair<>(4, 12));
            positions.add(new Pair<>(5, 12));
            positions.add(new Pair<>(4, 13));
            positions.add(new Pair<>(5, 13));
            positions.add(new Pair<>(5, 14));
            positions.add(new Pair<>(5, 15));
            positions.add(new Pair<>(5, 16));
        }
        else if (switchId == R.id.metalloidsSwitch) {
            positions.add(new Pair<>(1, 12));
            positions.add(new Pair<>(2, 13));
            positions.add(new Pair<>(3, 13));
            positions.add(new Pair<>(3, 14));
            positions.add(new Pair<>(4, 14));
            positions.add(new Pair<>(4, 15));


        }
        else if (switchId == R.id.noblegasesSwitch) {
            positions.add(new Pair<>(0, 17));
            positions.add(new Pair<>(1, 17));
            positions.add(new Pair<>(2, 17));
            positions.add(new Pair<>(3, 17));
            positions.add(new Pair<>(4, 17));
            positions.add(new Pair<>(5, 17));


        }
        else if (switchId == R.id.lanthanSwitch) {
            positions.add(new Pair<>(5, 2));
            positions.add(new Pair<>(8, 3));
            positions.add(new Pair<>(8, 4));
            positions.add(new Pair<>(8, 5));
            positions.add(new Pair<>(8, 6));
            positions.add(new Pair<>(8, 7));
            positions.add(new Pair<>(8, 8));
            positions.add(new Pair<>(8, 9));
            positions.add(new Pair<>(8, 10));
            positions.add(new Pair<>(8, 11));
            positions.add(new Pair<>(8, 12));
            positions.add(new Pair<>(8, 13));
            positions.add(new Pair<>(8, 14));
            positions.add(new Pair<>(8, 15));
            positions.add(new Pair<>(8, 16));

        }
        else if (switchId == R.id.actinsSwitch) {
            positions.add(new Pair<>(6, 2));
            positions.add(new Pair<>(9, 3));
            positions.add(new Pair<>(9, 4));
            positions.add(new Pair<>(9, 5));
            positions.add(new Pair<>(9, 6));
            positions.add(new Pair<>(9, 7));
            positions.add(new Pair<>(9, 8));
            positions.add(new Pair<>(9, 9));
            positions.add(new Pair<>(9, 10));
            positions.add(new Pair<>(9, 11));
            positions.add(new Pair<>(9, 12));
            positions.add(new Pair<>(9, 13));
            positions.add(new Pair<>(9, 14));
            positions.add(new Pair<>(9, 15));
            positions.add(new Pair<>(9, 16));

        }
        return positions;
    }
}


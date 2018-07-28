package com.bekkostudio.meditasidanretret;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

public class TimerFragment extends Fragment {
    NumberPicker hoursDuration;
    NumberPicker minutesDuration;
    NumberPicker secondsDuration;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_timer_fragment, container, false);

        hoursDuration = view.findViewById(R.id.hoursDuration);
        hoursDuration.setMinValue(0);
        hoursDuration.setMaxValue(23);

        minutesDuration = view.findViewById(R.id.minutesDuration);
        minutesDuration.setMinValue(0);
        minutesDuration.setMaxValue(59);
        minutesDuration.setValue(30);

        secondsDuration = view.findViewById(R.id.secondsDuration);
        secondsDuration.setMinValue(0);
        secondsDuration.setMaxValue(59);

        return view;
    }
}

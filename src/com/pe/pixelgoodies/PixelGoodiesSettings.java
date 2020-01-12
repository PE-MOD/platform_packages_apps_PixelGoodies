package com.pe.pixelgoodies;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.Utils;

public class PixelGoodiesSettings extends SettingsPreferenceFragment implements
        Preference.OnPreferenceChangeListener {
    private static final String TAG = "OwlsNestSettings";

    @Override
    public int getMetricsCategory() {
        return MetricsEvent.PIXELGOODIES;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.pixelgoodies);
    }

    public boolean onPreferenceChange(Preference preference, Object objValue) {

        return true;
    }
}

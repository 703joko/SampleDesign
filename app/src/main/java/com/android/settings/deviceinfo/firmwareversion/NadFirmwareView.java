package com.android.settings.deviceinfo.firmwareversion;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import com.example.preferencesettings.R;

import java.util.Random;
//import com.android.settingslib.DeviceInfoUtils;

public class NadFirmwareView extends Preference {

    public NadFirmwareView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayoutResource(context.getResources().
                getIdentifier("layout/nad_firmware_view", null, context.getPackageName()));

    }

    // system prop
    public static String getSystemProperty(String key) {
        String value = null;

        try {
            value = (String) Class.forName("android.os.SystemProperties")
                    .getMethod("get", String.class).invoke(null, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }


    // nad system prop
    private static void setInfoNad(String prop, String prop2, String prop3, TextView textview) {
        if (TextUtils.isEmpty(getSystemProperty(prop))) {
            textview.setText("Unknown");
        } else {
            textview.setText(String.format("v%s | %s | %s", getSystemProperty(prop), getSystemProperty(prop2), getSystemProperty(prop3)));
        }
    }

    // device name
    private static void setInfo(String prop, TextView textview) {
        if (TextUtils.isEmpty(getSystemProperty(prop))) {
            textview.setText("Unknown");
        } else {
            textview.setText(getSystemProperty(prop));
        }

    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);

        final boolean selectable = false;
        final Context context = getContext();
        TextView androidVersion = holder.itemView.findViewById(context.getResources().
                getIdentifier("id/android_version", null, context.getPackageName()));
        TextView nadVersion = holder.itemView.findViewById(context.getResources().
                getIdentifier("id/nad_version", null, context.getPackageName()));
        nadVersion.setSelected(true);
        TextView buildNumber = holder.itemView.findViewById(context.getResources().
                getIdentifier("id/build_number", null, context.getPackageName()));
        buildNumber.setSelected(true);
        TextView maintainerName = holder.itemView.findViewById(context.getResources().
                getIdentifier("id/maintainer_name", null, context.getPackageName()));
        maintainerName.setSelected(true);

        holder.itemView.setFocusable(selectable);
        holder.itemView.setClickable(selectable);
        holder.setDividerAllowedAbove(false);
        holder.setDividerAllowedBelow(false);

        LinearLayout versiAN = holder.itemView.findViewById(context.getResources().
                getIdentifier("id/l_versi_android", null, context.getPackageName()));
        versiAN.setClickable(true);
        versiAN.setOnClickListener(view -> {
            String[] randomStrings = new String[]{"Android Snow Cone", "Nusantara Android Development", "Android 12", "Material You Design", "Silky Style", "Nusantara Project OS"};
            Toast.makeText(context.getApplicationContext(), randomStrings[new Random().nextInt(randomStrings.length)], Toast.LENGTH_SHORT).show();

        });

        LinearLayout lnadVersion = holder.itemView.findViewById(context.getResources().
                getIdentifier("id/l_nad_version", null, context.getPackageName()));
        lnadVersion.setClickable(true);
        lnadVersion.setOnClickListener(v -> {

            Dialog customDialog = new Dialog(getContext(), R.style.CustomDialog);
            customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            Window window = customDialog.getWindow();
            window.setGravity(Gravity.BOTTOM);
            window.setLayout(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
            customDialog.setContentView(context.getResources().
                    getIdentifier("layout/nad_version_dialog", null, context.getPackageName()));
            TextView dialogBuildDate = customDialog.findViewById(context.getResources().
                    getIdentifier("id/dialog_build_date", null, context.getPackageName()));
            setInfo("ro.nad.build.date", dialogBuildDate);
            TextView dialogNadCode = customDialog.findViewById(context.getResources().
                    getIdentifier("id/dialog_nad_codename", null, context.getPackageName()));
            setInfo("ro.nad.build_codename", dialogNadCode);
            TextView dialogNadVer = customDialog.findViewById(context.getResources().
                    getIdentifier("id/dialog_nad_version", null, context.getPackageName()));
            dialogNadVer.setText(String.format("v%s", getSystemProperty("ro.nad.build.version")));
            TextView dialogBuildType = customDialog.findViewById(context.getResources().
                    getIdentifier("id/dialog_build_type", null, context.getPackageName()));
            setInfo("ro.nad.build.type", dialogBuildType);
            customDialog.setCancelable(true);
            customDialog.show();
        });


        LinearLayout lNameMaintener = holder.itemView.findViewById(context.getResources().
                getIdentifier("id/l_nama_maintener", null, context.getPackageName()));
        lNameMaintener.setClickable(true);
        lNameMaintener.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.example.preferencesettings", "com.nusantara.wings.fragments.team.TeamActivity"));
            context.startActivity(intent);
        });


        LinearLayout lbuildNumber = holder.itemView.findViewById(context.getResources().
                getIdentifier("id/l_build_number", null, context.getPackageName()));
        lbuildNumber.setClickable(true);
        lbuildNumber.setOnClickListener(v -> {
            AlertDialog.Builder customDialog = new AlertDialog.Builder(getContext());
            customDialog.setTitle("Build Number");
            customDialog.setMessage(String.format(getSystemProperty("ro.system.build.id")));
            customDialog.setIcon(context.getResources().
                    getIdentifier("drawable/ic_a_build_number", null, context.getPackageName()));
            AlertDialog alertDialog = customDialog.create();
            alertDialog.show();
            buildNumber.setSelected(true);
        });

        setInfo("ro.build.version.release", androidVersion);
        setInfoNad("ro.nad.build.version", "ro.nad.build_codename", "ro.nad.build.type", nadVersion);
        setInfo("ro.system.build.id", buildNumber);
    }

}


package com.android.settings.deviceinfo.firmwareversion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import com.example.preferencesettings.R;

import java.util.Random;

public class KapakSakti extends Preference {

    public KapakSakti(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayoutResource(context.getResources().
                getIdentifier("layout/logo_genk_kapak", null, context.getPackageName()));

    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);

        final boolean selectable = false;
        final Context context = getContext();
        ImageView mGkImg = holder.itemView.findViewById(context.getResources().
                getIdentifier("id/gk_img", null, context.getPackageName()));

        holder.itemView.setFocusable(selectable);
        holder.itemView.setClickable(selectable);
        holder.setDividerAllowedAbove(false);
        holder.setDividerAllowedBelow(false);

        mGkImg.setClickable(true);
        mGkImg.setOnClickListener(view -> {
            final Animation animShake = AnimationUtils.loadAnimation(context, R.anim.gk_shake);
            mGkImg.startAnimation(animShake);
            String[] randomStrings = new String[]{"Genk Kapak", "Bacok ndasmu", "Santuy Boss", "hahahaa!", "Apa!!?", "Gelut kuy"  ,"Waras Gak sih Lu!", "Nekat!!"};
            Toast.makeText(context.getApplicationContext(), randomStrings[new Random().nextInt(randomStrings.length)], Toast.LENGTH_SHORT).show();
        });
    }

}


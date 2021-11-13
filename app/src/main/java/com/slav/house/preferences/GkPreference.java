/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.slav.house.preferences;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import com.example.preferencesettings.R;

import java.util.Random;

public class GkPreference extends Preference {

    private ImageView mBG;

    public GkPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayoutResource(R.layout.gk_preference);
    }

    @Override
    protected void onClick() {
        super.onClick();
        final Context context = getContext();
        getBatikImage(context);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        final Context context = getContext();

        final boolean selectable = isSelectable();
        holder.itemView.setFocusable(selectable);
        holder.itemView.setClickable(selectable);
        holder.setDividerAllowedAbove(false);
        holder.setDividerAllowedBelow(false);
        holder.itemView.setBackgroundColor(Color.TRANSPARENT);
        mBG = (ImageView) holder.findViewById(R.id.card);
        getBatikImage(context);
    }

    private void getBatikImage(Context context) {

        final Random rnd = new Random();

        final String str = "bg_" + rnd.nextInt(5);
        mBG.setImageDrawable(context.getResources().getDrawable(getResourceID(str, "drawable", context.getApplicationContext())));
    }

    protected final static int getResourceID
            (final String resName, final String resType, final Context ctx)
    {
        final int ResourceID =
                ctx.getResources().getIdentifier(resName, resType,
                        ctx.getApplicationInfo().packageName);
        if (ResourceID == 0)
        {
            throw new IllegalArgumentException
                    (
                            "No resource string found with name " + resName
                    );
        }
        else
        {
            return ResourceID;
        }
    }
}

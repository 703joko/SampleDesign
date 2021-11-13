/*
 * Copyright (C) 2020 The Dirty Unicorns Project
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

package com.nusantara.wings.fragments.team;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.preferencesettings.R;

import java.util.ArrayList;
import java.util.List;

//import com.android.settings.R;

public class TeamActivity extends Activity {

    private List<DevInfoAdapter> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_recyclerview);

        initTeam();

        Window window = getWindow();
        window.setGravity(Gravity.BOTTOM);
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT);
    }
    private void initTeam(){
        RecyclerView mRecycleview = findViewById(R.id.listView);

        setTeamMember("Muhammad Fikri", getString(R.string.developer_title)
                        + " / " + getString(R.string.maintainer_title), "Genkzsz11", "Genkzsz11",
                R.drawable.alanndz);
        setTeamMember("Rafi Ramadhan", getString(R.string.developer_title)
                        + " / " + getString(R.string.maintainer_title), "Rafiester", "Rafiester",
                R.drawable.alanndz);
        setTeamMember("Rizky Benggolo", getString(R.string.developer_title)
                        + " / " + getString(R.string.contributor_title), "travarilo", "travarilo",
                R.drawable.alanndz);
        setTeamMember("Andra Ramadan", getString(R.string.maintainer_title)
                        + " / " + getString(R.string.contributor_title), "andrraa", "Andrraa",
                R.drawable.alanndz);
        setTeamMember("Julian Surya", getString(R.string.maintainer_title), "juliansurya", "JulianSurya",
                R.drawable.alanndz);
        setTeamMember("Aoihara", getString(R.string.maintainer_title), "Aoihara", "Aoihara",
                R.drawable.alanndz);
        setTeamMember("Hatsune", getString(R.string.maintainer_title), "Hatsune71", "hats721",
                R.drawable.alanndz);
        setTeamMember("Alien Icecream", getString(R.string.maintainer_title), "1cecreamm", "whothefvckareyou",
                R.drawable.alanndz);
        setTeamMember("Kry9toN", getString(R.string.contributor_title), "Kry9toN", "Kry9toN",
                R.drawable.alanndz);
        setTeamMember("G M L R", getString(R.string.contributor_title), "GMLR", "warga_sosmed",
                R.drawable.alanndz);
        setTeamMember("Harun Al Rasyid", getString(R.string.maintainer_title), "goodmeow", "aarunalr",
                R.drawable.alanndz);
        setTeamMember("Bisma Windiyanto", getString(R.string.contributor_title)
                        + " / " + getString(R.string.designer_title), "bismawy", "bismawy",
                R.drawable.alanndz);
        setTeamMember("Joko Narimo", getString(R.string.developer_title)
                        + " / " + getString(R.string.maintainer_title), "703joko", "jrInfected",
                R.drawable.alanndz);
        setTeamMember("Ayra Hikari", getString(R.string.contributor_title), "AyraHikari", "AyraHikari",
                R.drawable.alanndz);
        setTeamMember("Alanndz", getString(R.string.maintainer_title), "alanndz", "alanndz",
                R.drawable.alanndz);
        setTeamMember("Anggi Al Ansori", getString(R.string.maintainer_title), "anggialansori404", "hikarinochikara",
                R.drawable.alanndz);
        setTeamMember("Dimas Yudha Pratama", getString(R.string.maintainer_title), "dimasyudhaofficial", "dimasyudha",
                R.drawable.alanndz);
        setTeamMember("Irawan's", getString(R.string.maintainer_title), "dodyirawan85", "dodyirawan85",
                R.drawable.alanndz);
        setTeamMember("Aditya Kevin", getString(R.string.maintainer_title), "sweetyicecare", "Gabrielse",
                R.drawable.alanndz);
        setTeamMember("Heinz Der Flugel", getString(R.string.maintainer_title), "fortifying", "heinzdf",
                R.drawable.alanndz);
        setTeamMember("Hiitagiii", getString(R.string.maintainer_title), "azrim", "Hiitagiii",
                R.drawable.alanndz);
        setTeamMember("Muhammad Fauzan", getString(R.string.maintainer_title), "buglessx", "xzanxz",
                R.drawable.alanndz);
        setTeamMember("MocaRafee", getString(R.string.maintainer_title), "Mocarafee", "yuu_ak12",
                R.drawable.alanndz);
        setTeamMember("Ahmad Thoriq Najahi", getString(R.string.contributor_title), "najahiiii", "Najahiii",
                R.drawable.alanndz);
        setTeamMember("【Ｅｋａｒｉｓｔｉ】", getString(R.string.maintainer_title), "Risti699", "kaguyaasama",
                R.drawable.alanndz);
        setTeamMember("Hadad", getString(R.string.maintainer_title), "hdrjt", "hadad",
                R.drawable.alanndz);
        setTeamMember("TRISF", getString(R.string.maintainer_title), "trisfaizal", "trisf",
                R.drawable.alanndz);
        setTeamMember("Galih Gusti Priatna", getString(R.string.maintainer_title), "wulan17", "wulan17",
                R.drawable.alanndz);
        setTeamMember("𝑺𝒏𝒐𝒘𝒇𝒍𝒂𝒌𝒆.", getString(R.string.maintainer_title), "nothingpeace", "yaudahlahgpp",
                R.drawable.alanndz);
        setTeamMember("yincen17", getString(R.string.maintainer_title), "yincen17", "Yincen",
                R.drawable.alanndz);
        setTeamMember("Wadie Habib", getString(R.string.maintainer_title), "wadiehabib", "mans0amador",
                R.drawable.alanndz);
        setTeamMember("Zahid M", getString(R.string.maintainer_title), "zahidmgsk", "zahidmgsk",
                R.drawable.alanndz);
        setTeamMember("Leonardo Araujo Pimentel", getString(R.string.maintainer_title), "batmann4bot", "pimentelleo",
                R.drawable.alanndz);
        setTeamMember("Reza Bagas Rifaldy", getString(R.string.maintainer_title), "GrettoRosella", "GrettoRosella",
                R.drawable.alanndz);
        setTeamMember("家 | Zenka Bestia | 家", getString(R.string.maintainer_title), "ZenkaBestia", "ZenkaBestia",
                R.drawable.alanndz);
        setTeamMember("Nadins", getString(R.string.maintainer_title), "NadinAlissa", "NadinSylaa",
                R.drawable.alanndz);
        setTeamMember("officialputuid", getString(R.string.maintainer_title), "officialputuid", "officialputuid",
                R.drawable.alanndz);
        setTeamMember("ToxicLord", getString(R.string.maintainer_title), "ToxicLord", "ToxicLord501",
                R.drawable.alanndz);
        setTeamMember("Bayerische Motoren Werke", getString(R.string.maintainer_title), "BayerischeMotorenWerke", "bmwtheseries",
                R.drawable.alanndz);
        setTeamMember("Sena", getString(R.string.maintainer_title), "namaskaragusthi", "namaskaragusthi",
                R.drawable.alanndz);

        ListAdapter mAdapter = new ListAdapter(mList);
        mRecycleview.setAdapter(mAdapter);
        mRecycleview.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.notifyDataSetChanged();
    }

    private void setTeamMember(String devName, String devTitle,
                               String githubLink, String telegram, int devImage) {
        DevInfoAdapter adapter;

        adapter = new DevInfoAdapter();
        adapter.setImage(devImage);
        adapter.setDevName(devName);
        adapter.setDevTitle(devTitle);
        adapter.setGithubName(githubLink);
        adapter.setTelegramName(telegram);
        mList.add(adapter);
    }
}

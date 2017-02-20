package com.iplay.mobileguard.strategy.maingridmenu;

import android.content.Context;
import android.content.Intent;

import com.iplay.mobileguard.activity.TrafficStatsActivity;
import com.iplay.mobileguard.strategy.OnClickListener;

/**
 * Created by yu on.
 * Network Flow Count scheme
 * Just start a TrafficStatsActivity
 */
public class TrafficStatsCountScheme implements OnClickListener {
    @Override
    public void onSelected(Context context) {
        context.startActivity(new Intent(context, TrafficStatsActivity.class));
    }
}

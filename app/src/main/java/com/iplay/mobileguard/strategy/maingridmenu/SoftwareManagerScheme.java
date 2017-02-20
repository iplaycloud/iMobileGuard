package com.iplay.mobileguard.strategy.maingridmenu;

import android.content.Context;
import android.content.Intent;

import com.iplay.mobileguard.activity.SoftwareManagerActivity;
import com.iplay.mobileguard.strategy.OnClickListener;

/**
 * Created by yu on.
 * Software Manager scheme
 * just start SoftwareManagerActivity
 */
public class SoftwareManagerScheme implements OnClickListener {
    @Override
    public void onSelected(Context context) {
        context.startActivity(new Intent(context, SoftwareManagerActivity.class));
    }
}

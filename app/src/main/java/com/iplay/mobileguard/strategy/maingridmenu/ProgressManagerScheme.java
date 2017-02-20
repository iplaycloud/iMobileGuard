package com.iplay.mobileguard.strategy.maingridmenu;

import android.content.Context;
import android.content.Intent;

import com.iplay.mobileguard.activity.ProcessManagerActivity;
import com.iplay.mobileguard.strategy.OnClickListener;

/**
 * Created by yu.
 * Progress Manager scheme
 * just start ProcessManagerActivity
 */
public class ProgressManagerScheme implements OnClickListener {
    @Override
    public void onSelected(Context context) {
        context.startActivity(new Intent(context, ProcessManagerActivity.class));
    }
}

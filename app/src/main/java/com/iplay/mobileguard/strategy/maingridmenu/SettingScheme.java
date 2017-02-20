package com.iplay.mobileguard.strategy.maingridmenu;

import android.content.Context;
import android.content.Intent;

import com.iplay.mobileguard.activity.SettingActivity;
import com.iplay.mobileguard.strategy.OnClickListener;

/**
 * Created by yu on.
 * Setting scheme
 */

public class SettingScheme implements OnClickListener {
    @Override
    public void onSelected(Context context) {
        context.startActivity(new Intent(context, SettingActivity.class));
    }
}

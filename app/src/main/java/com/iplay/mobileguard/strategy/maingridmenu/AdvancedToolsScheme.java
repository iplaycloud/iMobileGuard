package com.iplay.mobileguard.strategy.maingridmenu;

import android.content.Context;
import android.content.Intent;

import com.iplay.mobileguard.activity.AdvancedToolsActivity;
import com.iplay.mobileguard.strategy.OnClickListener;

/**
 * Created by yu.
 * Advanced Tools scheme
 */
public class AdvancedToolsScheme implements OnClickListener {
    @Override
    public void onSelected(Context context) {
        context.startActivity(new Intent(context, AdvancedToolsActivity.class));
    }
}

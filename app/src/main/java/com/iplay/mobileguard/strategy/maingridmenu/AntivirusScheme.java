package com.iplay.mobileguard.strategy.maingridmenu;

import android.content.Context;
import android.content.Intent;

import com.iplay.mobileguard.activity.AntivirusActivity;
import com.iplay.mobileguard.strategy.OnClickListener;

/**
 * Created by yu on.
 * Anti-virus scheme
 * Just start AntivirusActivity
 */
public class AntivirusScheme implements OnClickListener {
    @Override
    public void onSelected(Context context) {
        context.startActivity(new Intent(context, AntivirusActivity.class));
    }
}

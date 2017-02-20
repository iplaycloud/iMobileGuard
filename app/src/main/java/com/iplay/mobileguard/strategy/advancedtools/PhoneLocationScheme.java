package com.iplay.mobileguard.strategy.advancedtools;

import android.content.Context;
import android.content.Intent;

import com.iplay.mobileguard.activity.PhoneLocationActivity;
import com.iplay.mobileguard.strategy.OnClickListener;

/**
 * Created by yu.
 * just start PhoneLocationActivity
 */
public class PhoneLocationScheme implements OnClickListener {
    @Override
    public void onSelected(Context context) {
        context.startActivity(new Intent(context, PhoneLocationActivity.class));
    }
}

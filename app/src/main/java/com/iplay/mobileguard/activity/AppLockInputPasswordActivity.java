package com.iplay.mobileguard.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.Toast;

import com.iplay.mobileguard.R;
import com.iplay.mobileguard.activity.base.InputPasswordActivity;
import com.iplay.mobileguard.constant.Constant;
import com.iplay.mobileguard.utils.ConfigUtils;
import com.iplay.mobileguard.utils.EncryptionUtils;

/**
 * app lock input password activity
 */
public class AppLockInputPasswordActivity extends InputPasswordActivity {
    private String trueMd5Password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        trueMd5Password = ConfigUtils.getString(this, Constant.KEY_APP_LOCK_PASSWORD, "");
    }

    @Override
    protected void onOk(String password) {
        if(TextUtils.isEmpty(password)) {
            Toast.makeText(this, R.string.password_can_not_be_empty, Toast.LENGTH_SHORT).show();
            return;
        }
        // check right
        if(!EncryptionUtils.md5N(password, Constant.ENCRYPTION_COUNT).equals(trueMd5Password)) {
            Toast.makeText(this, R.string.password_is_not_true, Toast.LENGTH_SHORT).show();
            return;
        }

        // enter the AppLockActivity
        startActivity(new Intent(this, AppLockActivity.class));
        finish();
    }
}

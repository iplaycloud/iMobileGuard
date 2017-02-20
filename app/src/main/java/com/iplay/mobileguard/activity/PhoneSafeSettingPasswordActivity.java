package com.iplay.mobileguard.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.iplay.mobileguard.R;
import com.iplay.mobileguard.activity.base.SettingPasswordActivity;
import com.iplay.mobileguard.constant.Constant;
import com.iplay.mobileguard.utils.ConfigUtils;
import com.iplay.mobileguard.utils.EncryptionUtils;

/**
 * phone safe set password activity
 */
public class PhoneSafeSettingPasswordActivity extends SettingPasswordActivity {
    private EditText etPassword;
    private EditText etRepassword;


    @Override
    protected void onOk(String password, String repassword) {
        // check empty
        if(TextUtils.isEmpty(password) || TextUtils.isEmpty(repassword)) {
            Toast.makeText(this, R.string.password_can_not_be_empty, Toast.LENGTH_SHORT).show();
            return;
        }
        // check consistent
        if(!password.equals(repassword)) {
            Toast.makeText(this, R.string.two_password_is_not_consistent, Toast.LENGTH_SHORT).show();
            return;
        }
        // save password
        ConfigUtils.putString(this, Constant.KEY_PHONE_SAFE_PASSWORD, EncryptionUtils.md5N(password, Constant.ENCRYPTION_COUNT));

        // enter activity
        startActivity(new Intent(this, PhoneSafeActivity.class));
        finish();
    }
}

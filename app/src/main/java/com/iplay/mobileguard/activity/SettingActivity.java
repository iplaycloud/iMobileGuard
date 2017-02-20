package com.iplay.mobileguard.activity;

import com.iplay.mobileguard.R;
import com.iplay.mobileguard.activity.base.BaseActivityUpEnable;
import com.iplay.mobileguard.fragment.SettingFragment;

/**
 * setting center activity
 */
public class SettingActivity extends BaseActivityUpEnable {

    public SettingActivity() {
        super(R.string.setting);
    }

    /**
     * 1
     */
    @Override
    protected void initView() {
        setContentView(R.layout.activity_setting);
        // replace by fragment
        getFragmentManager().beginTransaction()
                .replace(R.id.activity_setting, new SettingFragment())
                .commit();
    }

    /**
     * 2
     */
    @Override
    protected void initData() {

    }
    /**
     * 3
     */
    @Override
    protected void initEvent() {

    }
}

package com.iplay.mobileguard.activity;

import android.Manifest;

import com.iplay.mobileguard.activity.base.BaseContactsActivity;
import com.iplay.mobileguard.domain.ContactBean;
import com.iplay.mobileguard.engine.ContactsEngine;

import java.util.List;

/**
 * show contacts list
 */
public class ContactsActivity extends BaseContactsActivity {

    @Override
    protected String[] getPermissions() {
        return new String[]{
                Manifest.permission.READ_CONTACTS
        };
    }

    @Override
    protected List<ContactBean> getContactDatas() {
        return ContactsEngine.readContacts(ContactsActivity.this);
    }
}

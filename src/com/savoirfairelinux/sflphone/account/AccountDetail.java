/**
 * Copyright (C) 2004-2012 Savoir-Faire Linux Inc.
 *
 *  Author: Alexandre Savard <alexandre.savard@savoirfairelinux.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  If you own a pjsip commercial license you can also redistribute it
 *  and/or modify it under the terms of the GNU Lesser General Public License
 *  as an android library.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.savoirfairelinux.sflphone.account;

import java.util.ArrayList;
import java.util.HashMap;

public interface AccountDetail {

    public static class PreferenceEntry {
        public String mKey;
        public int mLabelId;
        public boolean isTwoState;
        public String mValue;

        public PreferenceEntry(String key, int labelId) {
            mKey = key;
            mLabelId = labelId;
            isTwoState = false;
            mValue = "";

        }

        public PreferenceEntry(String key, int labelId, boolean twoState) {
            mKey = key;
            mLabelId = labelId;
            isTwoState = twoState;
            mValue = "";
        }

        public PreferenceEntry(String key, int labelId, boolean twoState, String value) {
            mKey = key;
            mLabelId = labelId;
            isTwoState = twoState;
            mValue = value;
        }

        public boolean isChecked() {
            if (mValue.contentEquals("true"))
                return true;
            return false;
        }
    }

    public static final String TAG = "PreferenceHashMap";

    public ArrayList<PreferenceEntry> getDetailValues();

    public ArrayList<String> getValuesOnly();

    public HashMap<String, String> getDetailsHashMap();

    public String getDetailString(String key);

    public void setDetailString(String key, String newValue);

}

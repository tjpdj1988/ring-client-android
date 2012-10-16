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
package com.savoirfairelinux.sflphone.utils;

import com.savoirfairelinux.sflphone.R;
import com.savoirfairelinux.sflphone.service.ISipService;
import com.savoirfairelinux.sflphone.service.ServiceConstants;
import com.savoirfairelinux.sflphone.service.StringMap;

import java.util.Collection;
import java.util.Set;

public interface AccountDetail {

    public static class PreferenceEntry
    {
        public String mKey;
        public int mLabelId;

        public PreferenceEntry(String key, int labelId)
        {
            mKey = key;
            mLabelId = labelId;
        }
    }

    public Set<String> getDetailKeys();

    public Collection<PreferenceEntry> getDetailValues();
}

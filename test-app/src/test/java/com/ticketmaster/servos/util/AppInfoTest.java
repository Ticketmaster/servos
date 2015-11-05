/*
 * Copyright (C) 2015 Ticketmaster
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ticketmaster.servos.util;

import android.content.Context;

import com.ticketmaster.servos.ServosRobolectricTestRunner;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(ServosRobolectricTestRunner.class)
public class AppInfoTest {

    private Context context;

    @Before
    public void setup() {
        context = Robolectric.application;
    }

    // Ignored test since version number will keep changing
    @Ignore
    @Test
    public void itShouldGetVersionName() {
        assertThat(AppInfo.getVersionName(context)).isEqualTo("0.0.1");
    }

    // Ignored test since version number will keep changing
    @Ignore
    @Test
    public void itShouldGetVersionCode() {
        assertThat(AppInfo.getVersionCode(context)).isEqualTo(2);
    }
}

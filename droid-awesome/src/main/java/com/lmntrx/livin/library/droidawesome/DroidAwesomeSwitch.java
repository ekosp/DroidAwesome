/**
 * Copyright 2016 DroidAwesome - Livin Mathew
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.lmntrx.livin.library.droidawesome;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Switch;

/***
 * Created by livin on 27/11/16.
 */

public class DroidAwesomeSwitch extends Switch {
    public DroidAwesomeSwitch(Context context) {
        super(context);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontManager.getTypeface(context));
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DroidAwesomeSwitch(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(FontManager.getTypeface(context));
    }
}

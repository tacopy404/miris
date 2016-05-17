/*
 * Copyright (C) 2015 RECRUIT LIFESTYLE CO., LTD.
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

package com.miris.ui.comp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

public class DropBounceInterpolator implements Interpolator {

    public DropBounceInterpolator() {
    }

    @SuppressWarnings({"UnusedDeclaration"})
    public DropBounceInterpolator(Context context, AttributeSet attrs) {
    }

    @Override
    public float getInterpolation(float v) {
        if (v < 0.25f) {
            return -38.4f * (float) Math.pow(v - 0.125, 2) + 0.6f;
        } else if (v >= 0.5 && v < 0.75) {
            return -19.2f * (float) Math.pow(v - 0.625, 2) + 0.3f;
        } else {
            return 0;
        }
    }
}
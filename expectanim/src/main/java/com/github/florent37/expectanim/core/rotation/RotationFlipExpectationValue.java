/*
 * Copyright 2017 GcsSloop
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
 *
 * Last modified 2017-03-08 01:01:18
 *
 * GitHub:  https://github.com/GcsSloop
 * Website: http://www.gcssloop.com
 * Weibo:   http://weibo.com/GcsSloop
 */

package com.github.florent37.expectanim.core.rotation;

import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Christian Ringshofer on 17/02/2017.
 * <p>
 * A container for storing the rotation values for the flip animation
 */
public class RotationFlipExpectationValue extends RotationExpectation {

    private final float mRotationX, mRotationY;

    /**
     * a new flip expectation value which can be used to flip the view on the x- and y- axis
     * at the same time
     *
     * @param rotationX the x-rotation value around the x axis in degrees
     * @param rotationY the y-rotation value around the y axis in degrees
     */
    public RotationFlipExpectationValue(float rotationX, float rotationY) {
        mRotationX = rotationX;
        mRotationY = rotationY;
    }

    @Override
    public Float getCalculatedRotation(View viewToMove) {
        return null;
    }

    @Override
    @Nullable
    public Float getCalculatedRotationX(View viewToMove) {
        return mRotationX;
    }

    @Override
    @Nullable
    public Float getCalculatedRotationY(View viewToMove) {
        return mRotationY;
    }

}

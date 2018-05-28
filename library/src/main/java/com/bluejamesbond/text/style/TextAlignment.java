package com.bluejamesbond.text.style;

/*
 * Copyright 2015 Mathew Kurian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * TextAlignment.java
 * @author Mathew Kurian
 *
 * From TextJustify-Android Library v2.0
 * https://github.com/bluejamesbond/TextJustify-Android
 *
 * Please report any issues
 * https://github.com/bluejamesbond/TextJustify-Android/issues
 *
 * Date: 1/27/15 3:35 AM
 */

@SuppressWarnings("unused")
public enum TextAlignment {
    LEFT(0), RIGHT(1), JUSTIFIED(2), CENTER(3);

    private final int mId;

    TextAlignment(int id) {
        mId = id;
    }

    public static TextAlignment getById(int id) {
        switch (id) {
            default:
            case 0:
                return LEFT;
            case 1:
                return RIGHT;
            case 2:
                return JUSTIFIED;
            case 3:
                return CENTER;
        }
    }

    public int getId() {
        return mId;
    }
}
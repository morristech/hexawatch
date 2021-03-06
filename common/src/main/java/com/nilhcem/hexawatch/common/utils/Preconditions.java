package com.nilhcem.hexawatch.common.utils;

import android.support.annotation.NonNull;

/**
 * Preconditions inspired by
 * https://github.com/google/guava/blob/master/guava/src/com/google/common/base/Preconditions.java
 */
public class Preconditions {

    private Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean expression, @NonNull String errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}

package com.morax.nobeapplication.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class AndroidUtils {
    public static void hideKeyboard(Activity activity) {
        View view = activity.getCurrentFocus();
        InputMethodManager methodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        assert methodManager != null && view != null;
        methodManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }

    public static void showKeyboard(Activity activity) {
        View view = activity.getCurrentFocus();
        InputMethodManager methodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        assert methodManager != null && view != null;
        methodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
    }
}

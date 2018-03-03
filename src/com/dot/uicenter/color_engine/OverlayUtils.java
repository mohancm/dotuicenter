package com.dot.uicenter.color_engine;

import static com.dot.uicenter.utils.ShellUtils.*;

public class OverlayUtils {

    public static void enableAccentTheme(String pkg) {
        run("cmd overlay enable --user 0 " + pkg);
    }

    /*
    * Accent Theme
    * 0 - Teal [Default]
    * 1 - Pixel
    * 2 - Green
    * 3 - Yellow
    * 4 - Red
    * 5 - Purple
    * 6 - Grey
    * 7 - Sky
    * 8 - Violet
    * 9 - Pink
    * */
    public static void setAccentTheme(int val) {
        run("settings put secure accent_theme " + val);
    }

    /*
    * Main Overlay Theme
    * 0 - Auto
    * 1 - Light
    * 2 - Dark
    * */
    public static void setOverlayTheme(int val) {
        run("settings put secure device_theme " + val);
    }

    /*
    * QS Tiles Tint Mode
    * 0 - Default
    * 1 - Color Accent Track
    * */
    public static void setTintMode(int val) {
        run("settings put secure tint_mode " + val);
    }

    /*
     * Lockscreen Clock Style
     * 0 - DotClock
     * 1 - Stock Clock
     * 2 - Custom 1 [Unavailable]
     * 3 - Custom 2 [Unavailable]
     */
    public static void setClockStyle(int val) {
        run("settings put secure clock_style " + val);
    }

    /*
    * Brightness Warn Mode
    * 0 - Enable
    * 1 - Disable
    * */
    public static void setWarnMode(int val) {
        run("settings put secure brightness_warn_mode " + val);
    }
}
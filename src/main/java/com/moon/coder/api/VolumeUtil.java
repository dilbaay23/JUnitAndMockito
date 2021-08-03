package com.moon.coder.api;

/**
 * Created by Moon on 3/08/2021
 */
public class VolumeUtil {
    public static void maximizeVolume(AudioManager audioManager) {
        if (audioManager.getRingerMode() != RINGER_MODE.RINGER_MODE_SILENT) {
            int max = audioManager.getStreamMaxVolume();
            audioManager.setStreamVolume(max);
        }
    }
}

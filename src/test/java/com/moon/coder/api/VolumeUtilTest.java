package com.moon.coder.api;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Moon on 3/08/2021
 */
class VolumeUtilTest {

    @Mock
    AudioManager audioManager;

    @Test
    void testNormalRingerIsMaximized() {
        // 1.) mock AudioManager
        // 2.) configure Audiomanager to return RINGER_MODE_NORMAL if getRinderMode is called
        // 3.) configure Audiomanager to return 100 if getStreamMaxVolume() is called
        // 4.) call VolumeUtil.maximizeVolume with Audiomanager -> code under test
        // 5.) verify that setStreamVolume(STREAM_RING, 100, 0) was called on audioManager

    }

    @Test
    public void testSilentRingerIsNotDisturbed() {
        // 1. Prepare AudioManager mock
        // 2.) configure audiomanager to return "RINGER_MODE_SILENT" if getRingerMode is called
        // 3.) call VolumeUtil.maximizeVolume with audio manager
        // 4.) verify that getRingerMode()
        // 5.) Ensure that nothing more was called

    }
}
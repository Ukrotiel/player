/*
 * Copyright (C) 2015 IRA-Team
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

package com.irateam.vkplayer.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.irateam.vkplayer.models.Audio;

public abstract class DownloadFinishedReceiver extends BroadcastReceiver {
    public static final String AUDIO_ID = "audio_id";

    @Override
    public void onReceive(Context context, Intent intent) {
        Audio audio = intent.getParcelableExtra(AUDIO_ID);
        onDownloadFinished(audio);
    }

    public abstract void onDownloadFinished(Audio audio);
}

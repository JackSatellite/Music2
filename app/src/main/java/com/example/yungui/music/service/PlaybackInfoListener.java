package com.example.yungui.music.service;

import android.support.v4.media.session.PlaybackStateCompat;

/**
 * 播放信息监听器
 * Created by 22892 on 2018/1/9.
 */

public abstract class PlaybackInfoListener {
    //播放状态改变
    public abstract void OnPlaybackInfoChanged(PlaybackStateCompat stateCompat);

    //播放完成
    public void OnPlayCompleted() {

    }
}

package com.example.android.mytourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CitySongsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    private AudioManager mAudioManager;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT) {

                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {

                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {

                releaseMediaPlayer();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);


        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);


        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.songs_explan1, R.string.songs_info1, R.drawable.ic_play_arrow_white_24dp, R.raw.the_forminx));
        items.add(new Item(R.string.songs_explan2, R.string.songs_info2, R.drawable.ic_play_arrow_white_24dp,R.raw.ta_ladadika));
        items.add(new Item(R.string.songs_explan3, R.string.songs_info3,R.drawable.ic_play_arrow_white_24dp, R.raw.terzis));
        items.add(new Item(R.string.songs_explan4, R.string.songs_info4,R.drawable.ic_play_arrow_white_24dp, R.raw.thessaloniki_mou));
        items.add(new Item(R.string.songs_explan5, R.string.songs_info5,R.drawable.ic_play_arrow_white_24dp, R.raw.sanazito));
        items.add(new Item(R.string.songs_explan6, R.string.songs_info6,R.drawable.ic_play_arrow_white_24dp, R.raw.sto_leuko_ton_purgo));
        items.add(new Item(R.string.songs_explan7, R.string.songs_info7,R.drawable.ic_play_arrow_white_24dp, R.raw.argiros));

        ItemAdapter adapter = new ItemAdapter(this, items, R.color.mainColor);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                releaseMediaPlayer();

                Item item = items.get(position);

                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {

                    mMediaPlayer = MediaPlayer.create(CitySongsActivity.this, item.getAudioResourceId());

                    mMediaPlayer.start();

                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {

        if (mMediaPlayer != null) {

            mMediaPlayer.release();

            mMediaPlayer = null;

            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}
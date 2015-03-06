package com.ford.openxc.webcam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class CameraActivity extends Activity {
  private WebcamPreview webcamPreview;
  private TextView sceneLabel;
  
  private String[] SCENE_MODE = {
    "NONE",
    "BACKLIGHT",
    "BEACH_SNOW",
    "CANDLE_LIGHT",
    "DAWN_DUSK",
    "FALL_COLORS",
    "FIREWORKS",
    "LANDSCAPE",
    "NIGHT",
    "PARTY_INDOOR",
    "PORTRAIT",
    "SPORTS",
    "SUNSET",
    "TEXT"
  };
  
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    sceneLabel = (TextView)this.findViewById(R.id.sceneLabel);
    webcamPreview = (WebcamPreview)this.findViewById(R.id.cp);

    SeekBar seekBar = (SeekBar)this.findViewById(R.id.seekBar);
    seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
      @Override
      public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        webcamPreview.setSceneMode(i);
        sceneLabel.setText(SCENE_MODE[i] + " = " + i);
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {

      }

      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {

      }
    });


  }
}

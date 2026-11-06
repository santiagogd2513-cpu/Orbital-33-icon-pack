package com.orbital33.iconpack;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
 @Override public void onCreate(Bundle state) {
  super.onCreate(state);
  LinearLayout layout = new LinearLayout(this);
  layout.setOrientation(LinearLayout.VERTICAL);
  layout.setGravity(Gravity.CENTER);
  layout.setPadding(32,32,32,32);
  layout.setBackgroundColor(Color.rgb(12,18,34));
  TextView title = new TextView(this);
  title.setText("ORBITAL 33");
  title.setTextColor(Color.WHITE);
  title.setTextSize(28);
  title.setGravity(Gravity.CENTER);
  TextView subtitle = new TextView(this);
  subtitle.setText("3D Icon Pack • Preview 0.1.0\n\nEsferas con degradados dinámicos\nIcono de muestra: Dolphin-style blue orb\n\nCompatibilidad con Theme Park pendiente de validar.");
  subtitle.setTextColor(Color.LTGRAY);
  subtitle.setTextSize(16);
  subtitle.setGravity(Gravity.CENTER);
  layout.addView(title);
  layout.addView(subtitle);
  setContentView(layout);
 }
}

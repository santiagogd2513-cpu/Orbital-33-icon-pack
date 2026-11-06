package com.orbital33.iconpack;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int dp(float value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }

    private TextView text(String value, int size, int color, boolean bold) {
        TextView view = new TextView(this);
        view.setText(value);
        view.setTextSize(size);
        view.setTextColor(color);
        view.setGravity(Gravity.CENTER);
        if (bold) view.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        return view;
    }

    private LinearLayout tile(int drawable, String label) {
        LinearLayout tile = new LinearLayout(this);
        tile.setOrientation(LinearLayout.VERTICAL);
        tile.setGravity(Gravity.CENTER);
        tile.setPadding(dp(8), dp(12), dp(8), dp(12));
        ImageView icon = new ImageView(this);
        icon.setImageResource(drawable);
        icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tile.addView(icon, new LinearLayout.LayoutParams(dp(76), dp(76)));
        TextView caption = text(label, 12, Color.WHITE, false);
        LinearLayout.LayoutParams captionParams = new LinearLayout.LayoutParams(-1, -2);
        captionParams.topMargin = dp(8);
        tile.addView(caption, captionParams);
        return tile;
    }

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        getWindow().setStatusBarColor(Color.rgb(8, 14, 29));
        getWindow().setNavigationBarColor(Color.BLACK);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(20), dp(20), dp(20), dp(12));
        root.setBackgroundColor(Color.rgb(8, 14, 29));

        root.addView(text("ORBITAL 33", 27, Color.WHITE, true));
        TextView subtitle = text("ICON PACK • 3D ORB COLLECTION", 12, Color.rgb(160, 180, 220), true);
        LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(-1, -2);
        subtitleParams.topMargin = dp(5);
        root.addView(subtitle, subtitleParams);

        TextView section = text("Vista previa de iconos", 18, Color.WHITE, true);
        section.setGravity(Gravity.START | Gravity.CENTER_VERTICAL);
        LinearLayout.LayoutParams sectionParams = new LinearLayout.LayoutParams(-1, -2);
        sectionParams.topMargin = dp(26);
        root.addView(section, sectionParams);

        GridLayout grid = new GridLayout(this);
        grid.setColumnCount(3);
        grid.setUseDefaultMargins(true);
        grid.addView(tile(R.drawable.orb_dolphin, "Dolphin · azul"));
        grid.addView(tile(R.drawable.orb_generic, "Esfera genérica"));
        grid.addView(tile(R.drawable.orb_chrome, "Chrome"));
        grid.addView(tile(R.drawable.orb_gmail, "Gmail"));
        grid.addView(tile(R.drawable.orb_maps, "Maps"));
        grid.addView(tile(R.drawable.orb_youtube, "YouTube"));
        grid.addView(tile(R.drawable.orb_playstore, "Play Store"));
        grid.addView(tile(R.drawable.orb_whatsapp, "WhatsApp"));
        grid.addView(tile(R.drawable.orb_instagram, "Instagram"));
        grid.addView(tile(R.drawable.orb_spotify, "Spotify"));
        grid.addView(tile(R.drawable.orb_telegram, "Telegram"));
        grid.addView(tile(R.drawable.orb_discord, "Discord"));
        grid.addView(tile(R.drawable.orb_netflix, "Netflix"));
        grid.addView(tile(R.drawable.orb_1500_0001, "Orbital 0001"));
        grid.addView(tile(R.drawable.orb_1500_0002, "Orbital 0002"));
        grid.addView(tile(R.drawable.orb_1500_0003, "Orbital 0003"));
        grid.addView(tile(R.drawable.orb_1500_0004, "Orbital 0004"));
        grid.addView(tile(R.drawable.orb_1500_0005, "Orbital 0005"));
        ScrollView scroll = new ScrollView(this);
        scroll.addView(grid);
        root.addView(scroll, new LinearLayout.LayoutParams(-1, 0, 1));

        TextView note = text("317 asociaciones de aplicaciones y 1.500 diseños Orbital originales disponibles en el catálogo de iconos.", 12, Color.LTGRAY, false);
        note.setPadding(dp(8), dp(14), dp(8), dp(8));
        root.addView(note);
        setContentView(root);
    }
}
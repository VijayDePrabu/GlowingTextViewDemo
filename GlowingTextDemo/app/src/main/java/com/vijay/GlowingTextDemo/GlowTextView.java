package com.vijay.GlowingTextDemo;

import java.io.File;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class GlowTextView extends TextView {


  public GlowTextView(Context context) {
    super(context);
    init(context);
  }

  public GlowTextView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init(context);
  }

  public GlowTextView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    init(context);
  }

  private void init(Context context) {
    AssetManager assets = context.getAssets();
    final Typeface font = Typeface.createFromAsset(assets,
            "fonts"+ File.separator + "digital-7.ttf");
    setTypeface(font);
  }

}

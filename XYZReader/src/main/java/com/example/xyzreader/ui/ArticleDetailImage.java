package com.example.xyzreader.ui;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;

public class ArticleDetailImage extends AppCompatImageView{

    public ArticleDetailImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int desiredHeight = width * 3 / 4;
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(desiredHeight, View.MeasureSpec.EXACTLY));
    }
}

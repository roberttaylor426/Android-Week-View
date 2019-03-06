package com.alamkanak.weekview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * Created by Raquib-ul-Alam Kanak on 7/21/2014.
 * Website: http://alamkanak.github.io/
 */
public class WeekView extends FrameLayout {

    public final InnerWeekView innerWeekView;

    public WeekView(@NonNull Context context) {
        this(context, null);
    }

    public WeekView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WeekView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.innerWeekView = new InnerWeekView(context, attrs, defStyleAttr);
        this.addView(innerWeekView, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

//        RelativeLayout relativeLayout = new RelativeLayout(context);
//        this.addView(relativeLayout, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
//
//        this.innerWeekView.overlayView = relativeLayout;
    }
}

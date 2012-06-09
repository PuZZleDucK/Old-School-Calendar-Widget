package com.puzzleduck.OldSchoolCalendarWidget;

import android.app.Activity;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.Toast;
import android.util.*;
import android.appwidget.*;

public class OldSchoolCalendarWidgetProvider extends AppWidgetProvider
{

	public static void updateAppWidget(Context context, AppWidgetManager appWidgetManager, int mAppWidgetId, String p3)
	{
		// TODO: Implement this method
		Log.d("cal","update");
	}
	
	
	
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//    }
	
	

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
    }

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        AppWidgetManager mgr = AppWidgetManager.getInstance(context);
        if (intent.getAction().equals("com.example.android.stackwidget.TOAST_ACTION")) {
            int appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,
                    AppWidgetManager.INVALID_APPWIDGET_ID);
            Toast.makeText(context, "Touched view ", Toast.LENGTH_SHORT).show();
        }
        super.onReceive(context, intent);
    }


    @Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds){
        final int N = appWidgetIds.length;
		Log.d("osCal","provider update");
	
        // Perform this loop procedure for each App Widget that belongs to this provider
        for (int i=0; i<N; i++) {
            int appWidgetId = appWidgetIds[i];

			AppWidgetProviderInfo info = appWidgetManager.getAppWidgetInfo(appWidgetId);
			info.updatePeriodMillis = 1000;
			
			
            // Create an Intent to launch ExampleActivity
            Intent intent = new Intent(context, OldSchoolCalendarWidgetConfigure.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

            // Get the layout for the App Widget and attach an on-click listener
            // to the button
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.main);
            views.setOnClickPendingIntent(R.id.button1, pendingIntent);

//breaks widget
		//	views.removeAllViews(R.id.button1);
			
			
            // Tell the AppWidgetManager to perform an update on the current app widget
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }


        super.onUpdate(context, appWidgetManager, appWidgetIds);

	}
	
	
	
}





//calling the onUpdate() callback 

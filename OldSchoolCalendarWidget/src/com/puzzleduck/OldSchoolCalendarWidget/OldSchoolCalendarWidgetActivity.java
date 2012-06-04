package com.puzzleduck.OldSchoolCalendarWidget;

import android.app.Activity;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;

public class OldSchoolCalendarWidgetActivity extends Activity  {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
    
    //old stuff from manifest:
//    <activity 
//    android:name=".OldSchoolCalendarWidgetActivity"
//    android:label="Cal Activity" >
//    <intent-filter>
//        <action android:name="android.intent.action.MAIN" />
//        <category android:name="android.intent.category.INFO" />
//    </intent-filter>
//</activity>
//    


//    <service android:name="OldSchoolCalendarWidgetProvider"
//        android:permission="android.permission.BIND_REMOTEVIEWS"
//        android:exported="false" />
//    
//    <activity
//    	android:name="com.puzzleduck.OldSchoolCalendarWidget.AppWidgetConfigureActivity">
//		<intent-filter>
//    		<action android:name="android.appwidget.action.APPWIDGET_CONFIGURE" />
//		</intent-filter>
//	</activity>

    
    
    
//    <reciever android:name=".OldSchoolCalendarWidgetProvider" android:label="Cal Widget">
//		<intent-filter>
//		    <action android:name="android.appwidget.action.APPWIDGET_UPDATE" />
//		</intent-filter>
//		<meta-data android:name="android.appwidget.provider" 
//		           android:resource="@xml/oldcalendarinfo" />
//    </reciever>
//    
//    <service android:name="OldSchoolCalendarWidgetProvider"
//        android:permission="android.permission.BIND_REMOTEVIEWS"
//        android:exported="false" />
	 
//	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds){
//        final int N = appWidgetIds.length;
//
//        // Perform this loop procedure for each App Widget that belongs to this provider
//        for (int i=0; i<N; i++) {
//            int appWidgetId = appWidgetIds[i];
//
//            // Create an Intent to launch ExampleActivity
//            Intent intent = new Intent(context, AppWidgetConfigureActivity.class);
//            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
//
//            // Get the layout for the App Widget and attach an on-click listener
//            // to the button
//            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.main);
//            views.setOnClickPendingIntent(R.id.button1, pendingIntent);
//
//            // Tell the AppWidgetManager to perform an update on the current app widget
//            appWidgetManager.updateAppWidget(appWidgetId, views);
//        }
//
//		
//	}
	
	
	
}





//calling the onUpdate() callback 
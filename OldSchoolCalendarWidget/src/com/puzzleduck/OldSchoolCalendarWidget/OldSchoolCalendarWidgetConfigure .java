package com.puzzleduck.OldSchoolCalendarWidget;

import android.app.Activity;
import android.os.Bundle;
import android.util.*;
import android.content.*;
import android.appwidget.*;
import android.widget.*;
import android.view.*;

class OldSchoolCalendarWidgetConfigure  extends Activity {


	int mAppWidgetId = 0;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.d("oldCal","test");
		
		setContentView(R.layout.config);
		
		Intent intent = getIntent ();
		Bundle extras = intent.getExtras();
		if ( extras != null ) {
			mAppWidgetId = extras.getInt(
				AppWidgetManager.EXTRA_APPWIDGET_ID ,
				AppWidgetManager.INVALID_APPWIDGET_ID);
		}
		
	//	do cfg here:
		
		
		//move yo onclick widget
	//	AppWidgetManager appWidgetManager = AppWidgetManager .getInstance ( context);
		
		
		//getContext();
		
//		RemoteViews views = new RemoteViews (context.getPackageName(),
//											 R.layout.config );
//		appWidgetManager.updateAppWidget( mAppWidgetId, views );
//		
//		Intent resultValue = new Intent();
//		resultValue .putExtra (AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId );
//		setResult( RESULT_OK , resultValue );
//		finish();
		
		
		View.OnClickListener mOnClickListener = new View .OnClickListener () {
			public void onClick ( View v ) {
				final Context context = OldSchoolCalendarWidgetConfigure.this;
// When the button is clicked, save the string in our prefs and return that the
// clicked OK.
			//	String titlePrefix = mAppWidgetPrefix . getText(). toString ();
			//	saveTitlePref (context , mAppWidgetId , titlePrefix );
// Push widget update to surface with newly set prefix
				AppWidgetManager appWidgetManager = AppWidgetManager . getInstance (context );
				OldSchoolCalendarWidgetProvider.updateAppWidget (context , appWidgetManager ,
														   mAppWidgetId , "prefix string" );
// Make sure we pass back the original appWidgetId
				Intent resultValue = new Intent();
				resultValue . putExtra ( AppWidgetManager . EXTRA_APPWIDGET_ID , mAppWidgetId );
				setResult ( RESULT_OK , resultValue );
				finish ();
			}
		};
		
		
       
    }
}


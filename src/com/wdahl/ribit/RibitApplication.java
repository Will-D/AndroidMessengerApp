package com.wdahl.ribit;

import android.app.Application;

import com.parse.Parse;

public class RibitApplication extends Application {
	
	@Override
	public void onCreate() {
			super.onCreate();
			Parse.initialize(this, "FAm1NQoxeAAr0SsSG8PhUxSh2WaifT0peywCb9Vp", "9v5eXCb9aIVaP2UG73lSIrz045BYGUeEUXDdGTtA");
			
			/*
			ParseObject testObject = new ParseObject("TestObject");
			testObject.put("foo", "bar");
			testObject.saveInBackground();
			*/
			//Log.v("Parse Log", "Parse should have been contacted");
		}
}

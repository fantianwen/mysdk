package com.leenjewel.mysdk.sdk;

import com.leenjewel.mysdk.callback.IMySDKCallback;
import com.leenjewel.mysdk.exception.MySDKDoNotImplementMethod;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;

public class AexamplesdkMySDK implements IMySDK {
	
	private Activity _activity = null;

	@Override
	public void applicationOnCreate(Application application) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "applicationOnCreate");
	}

	@Override
	public void activityOnCreate(Activity activity, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		_activity = activity;
		android.util.Log.d("AexamplesdkMySDK", "activityOnCreate");
	}

	@Override
	public void activityOnStart(Activity activity) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "activityOnStart");
	}

	@Override
	public void activityOnRestart(Activity activity) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "activityOnRestart");
	}

	@Override
	public void activityOnResume(Activity activity) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "activityOnResume");
	}

	@Override
	public void activityOnPause(Activity activity) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "activityOnPause");
	}

	@Override
	public void activityOnStop(Activity activity) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "activityOnStop");
	}

	@Override
	public void activityOnDestroy(Activity activity) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "activityOnDestroy");
	}

	@Override
	public void activityOnSaveInstanceState(Activity activity, Bundle outState) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "activityOnSaveInstanceState");
	}

	@Override
	public void activityOnNewIntent(Activity activity, Intent intent) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "activityOnNewIntent");
	}

	@Override
	public void activityOnActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "activityOnActivityResult");
	}

	@Override
	public int applySDKMethodAndReturnInt(String methodName, String params) throws MySDKDoNotImplementMethod {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "applySDKMethodAndReturnInt");
		return (Integer.valueOf(params) * 10);
	}

	@Override
	public long applySDKMehtodAndReturnLong(String methodName, String params) throws MySDKDoNotImplementMethod {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "applySDKMehtodAndReturnLong");
		return (Long.valueOf(params) * 10);
	}

	@Override
	public float applySDKMethodAndReturnFloat(String methodName, String params) throws MySDKDoNotImplementMethod {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "applySDKMethodAndReturnFloat");
		return (Float.valueOf(params) * 10);
	}

	@Override
	public double applySDKMethodAndReturnDouble(String methodName, String params) throws MySDKDoNotImplementMethod {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "applySDKMethodAndReturnDouble");
		return (Double.valueOf(params) * 10);
	}

	@Override
	public boolean applySDKMethodAndReturnBoolean(String methodName, String params) throws MySDKDoNotImplementMethod {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "applySDKMethodAndReturnBoolean");
		return (!params.equalsIgnoreCase("true"));
	}

	@Override
	public String applySDKMethodAndReturnString(String methodName, String params) throws MySDKDoNotImplementMethod {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "applySDKMethodAndReturnString");
		return "World";
	}

	@Override
	public void applySDKMethodWithCallback(String methodName, String params, IMySDKCallback callback) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "applySDKMethodWithCallback");
		callback.onSuccess("aexamplesdk", methodName, "aexamplesdk-"+methodName+"-"+params);
	}

	@Override
	public void applySDKPay(String productID, String orderID, String params, IMySDKCallback callback) {
		// TODO Auto-generated method stub
		android.util.Log.d("AexamplesdkMySDK", "applySDKPay");
		callback.onPayResult(false, 0, "", "aexamplesdk", productID, orderID, "pay-callback-result");
	}

}

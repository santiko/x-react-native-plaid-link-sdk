
/**
 * This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * Do not edit this file as changes may cause incorrect behavior and will be lost
 * once the code is regenerated.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.plaid;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

public abstract class NativePlaidLinkModuleiOSSpec extends ReactContextBaseJavaModule implements TurboModule {
  public static final String NAME = "RNLinksdk";

  public NativePlaidLinkModuleiOSSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public @Nonnull String getName() {
    return NAME;
  }

  @ReactMethod
  @DoNotStrip
  public abstract void create(String token, boolean noLoadingState);

  @ReactMethod
  @DoNotStrip
  public abstract void open(boolean fullScreen, Callback onSuccess, Callback onExit);

  @ReactMethod
  @DoNotStrip
  public abstract void dismiss();

  @ReactMethod
  @DoNotStrip
  public abstract void addListener(String eventName);

  @ReactMethod
  @DoNotStrip
  public abstract void removeListeners(int count);
}

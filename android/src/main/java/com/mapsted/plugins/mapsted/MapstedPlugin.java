package com.mapsted.plugins.mapsted;

import android.util.Log; // Add this import statement


import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;


// Mapsted SDK
import com.mapsted.map.MapApi;
import com.mapsted.ui.MapUiApi;
import com.mapsted.map.MapstedMapApi;
import com.mapsted.positioning.CoreApi;
import com.mapsted.positioning.coreObjects.BuildingInfo;
import com.mapsted.positioning.SdkError;
import com.mapsted.positioning.SdkStatusUpdate;
import com.mapsted.ui.MapstedMapUiApi;
import com.mapsted.ui.map.MapstedMapActivity;
// Additional imports for launching activity
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import com.mapsted.ui.CustomParams;
import com.mapsted.ui.MapUiApi.MapUiInitCallback;
import com.mapsted.map.views.MapPanType;
import com.mapsted.map.views.MapstedMapRange;
import com.mapsted.map.models.layers.BaseMapStyle;
import com.mapsted.ui.MapstedMapUiApiProvider;
import android.widget.FrameLayout;
import java.util.stream.Collectors;
import android.widget.ProgressBar;
import com.mapsted.ui.search.SearchCallbacksProvider;

import com.getcapacitor.BridgeActivity;

@CapacitorPlugin(name = "Mapsted")
public class MapstedPlugin extends Plugin {

    private Mapsted implementation = new Mapsted();
    private static final String TAG = "MapstedPlugin";

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }
    @PluginMethod
    public void launchMapActivity(PluginCall call) {
        try {
            Intent intent = new Intent(bridge.getActivity(), MapstedMapActivity.class);
            bridge.getActivity().startActivity(intent);
            // Call setupMapUiApi after launching MapstedMapActivity
            //            setupMapUiApi(bridge.getActivity());
            call.resolve();
        } catch (Exception e) {
            call.reject("Failed to launch Map Activity", e);
        }
    }
    // private void setupMapUiApi(AppCompatActivity activity) {
    //        // Check if MapUiApi is initialized
    //        if (mapUiApi == null) {
    //            Log.e(TAG, "MapUiApi is null. Initialization failed.");
    //            return;
    //        }
    //
    //        // Assuming you have a layout file named fragment_map.xml
    //        FrameLayout flBaseMap = activity.findViewById(R.id.flBaseMap);
    //        FrameLayout flMapUi = activity.findViewById(R.id.flMapUi);
    //
    //        // Create CustomParams for MapUiApi initialization
    //        CustomParams params = CustomParams.newBuilder(activity, flBaseMap, flMapUi)
    //                .setBaseMapStyle(BaseMapStyle.GREY)
    //                .setMapPanType(MapPanType.RESTRICT_TO_SELECTED_PROPERTY)
    //                .setMapZoomRange(new MapstedMapRange(6.0f, 24.0f))
    //                .setEnableMapOverlayFeature(true)
    //                .build();
    //
    //        // Check if CustomParams is successfully created
    //        if (params == null) {
    //            Log.e(TAG, "CustomParams is null. Initialization failed.");
    //            return;
    //        }
    //
    //        // Initialize MapUiApi
    //        mapUiApi.setup().initialize(
    //                params,
    //                new MapUiInitCallback() {
    //                    @Override
    //                    public void onCoreInitialized() {
    //                        Log.d(TAG, "MapUiApi: onCoreInitialized");
    //                    }
    //
    //                    @Override
    //                    public void onMapInitialized() {
    //                        Log.d(TAG, "MapUiApi: onMapInitialized");
    //                        // Additional initialization or logging...
    //                    }
    //
    //                    @Override
    //                    public void onSuccess() {
    //                        Log.d(TAG, "MapUiApi: onSuccess");
    //                        // Additional logic...
    //
    //                        // Call other methods or perform actions after MapUiApi initialization
    //                    }
    //
    //                    @Override
    //                    public void onFailure(SdkError sdkError) {
    //                        Log.e(TAG, "MapUiApi: onFailure: " + sdkError);
    //                        // Handle failure appropriately...
    //                    }
    //
    //                    @Override
    //                    public void onStatusUpdate(SdkStatusUpdate sdkUpdate) {
    //                        Log.d(TAG, "MapUiApi: onStatusUpdate: " + sdkUpdate);
    //                        // Handle status updates...
    //                    }
    //                },
    //                new CoreApi.LocationServicesCallback() {
    //                    @Override
    //                    public void onSuccess() {
    //                        Log.d(TAG, "MapUiApi: LocServices: onSuccess");
    //                        // Handle location services success...
    //                    }
    //
    //                    @Override
    //                    public void onFailure(SdkError sdkError) {
    //                        Log.e(TAG, "MapUiApi: LocServices: onFailure: " + sdkError);
    //                        // Handle location services failure...
    //                    }
    //                }
    //        );
    //    }

    @PluginMethod()
    public void getSearchCoreSdkCallback(PluginCall call) {
        // Implement your logic here and return the result using call.resolve() or call.reject()
        // For example:
        try {
            // Your implementation...
            JSObject result = new JSObject();
            result.put("message", "SearchCoreSdkCallback is not implemented");
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error in getSearchCoreSdkCallback", e);
            call.reject("Error occurred", e.getMessage(), e);
        }
    }

    @PluginMethod()
    public void getSearchFeedCallback(PluginCall call) {
        // Implement your logic here and return the result using call.resolve() or call.reject()
        // For example:
        try {
            // Your implementation...
            JSObject result = new JSObject();
            result.put("message", "SearchFeedCallback is not implemented");
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error in getSearchFeedCallback", e);
            call.reject("Error occurred", e.getMessage(), e);
        }
    }

    @PluginMethod()
    public void getSearchAlertCallback(PluginCall call) {
        // Implement your logic here and return the result using call.resolve() or call.reject()
        // For example:
        try {
            // Your implementation...
            JSObject result = new JSObject();
            result.put("message", "SearchAlertCallback is not implemented");
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error in getSearchAlertCallback", e);
            call.reject("Error occurred", e.getMessage(), e);
        }
    }
}

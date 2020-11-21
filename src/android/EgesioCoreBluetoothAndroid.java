package cordova.plugin.egesio.core.bluetooth.android;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// https://www.youtube.com/watch?v=w9zYXelkl6I

/**
 * This class echoes a string called from JavaScript.
 */
public class EgesioCoreBluetoothAndroid extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("startMainProcess")) {
            String message = args.getString(0);
            this.startMainProcess(message, callbackContext);
            return true;
        }
        return false;
    }

    private void startMainProcess(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message + " Respuesta desde nativo!!");
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
    
     private void getConnectionStatus(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

     private void disconnectPeripheral(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

     private void getCurrentMeasurement(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

     private void startContactTracing(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

     private void stopContactTracing(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

}

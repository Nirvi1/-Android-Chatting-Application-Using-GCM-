package com.talky.gcm;

import android.content.Context;
import android.content.Intent;

public final class AppUtilities {
	
	// give your server registration url here
    static final String SERVER_URL = "http://10.0.2.2/gcmphp/registerApp.php"; 

    // Google project id
    static final String SENDER_ID = ""; 

    static final String TAG = "AndroidHive GCM";

    static final String DISPLAY_MESSAGE_ACTION =
            "com.talky.gcm.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";

    /**
     * Notifies UI to display a message.
     * <p>
     * This method is defined in the helper 
     *
     * @param context application's context.
     * @param message message to be displayed.
     */
    static void displayMessage(Context context, String message) {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);
    }
}

package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by mina on 20/02/18.
 */

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {

        String refreshToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("fsfs", refreshToken);

        sendRegisterationTokenToServer(refreshToken);

    }

    private void sendRegisterationTokenToServer(String refreshToken) {
    }
}

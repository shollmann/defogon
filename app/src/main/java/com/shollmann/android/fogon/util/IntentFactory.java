package com.shollmann.android.fogon.util;

import android.content.Intent;

import com.shollmann.android.fogon.DeFogonApplication;
import com.shollmann.android.fogon.ui.activities.FavoriteSongsActivity;
import com.shollmann.android.fogon.ui.activities.HomeActivity;
import com.shollmann.android.fogon.ui.activities.RandomSongsActivity;

public class IntentFactory {

    public static Intent getHomeActivity() {
        Intent intent = new Intent(DeFogonApplication.getApplication(), HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;
    }

    public static Intent getFavoriteSongsActivity() {
        Intent intent = new Intent(DeFogonApplication.getApplication(), FavoriteSongsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;
    }

    public static Intent getRandomSongsActivity() {
        Intent intent = new Intent(DeFogonApplication.getApplication(), RandomSongsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;
    }

    public static Intent getSendEmailActivity(String subject) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{Constants.CONTACT_EMAIL});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        return intent;
    }
}

package ni.org.jug.coyoteapp

import android.app.Application
import com.google.firebase.analytics.FirebaseAnalytics

class CoyoteApp : Application() {

    override fun onCreate() {
        super.onCreate()
        // Obtain the FirebaseAnalytics instance.
        FirebaseAnalytics.getInstance(this)

        InjectorUtil.provideContext(applicationContext)
    }

}

package ni.org.jug.coyoteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.Crashlytics
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info { "Hola mundo desde AnkoLogger :D :D :D" }

        btnTestCrash.setOnClickListener {
            Crashlytics.getInstance().crash() // Force a crash
        }
    }

}

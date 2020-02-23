package ni.org.jug.coyoteapp

import android.content.Context

object InjectorUtil {

    private lateinit var context: Context

    fun provideContext(context: Context) {
        this.context = context
    }

    fun provideResource() = context.resources

}
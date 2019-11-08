package sss.mvvmdemo1.androidfragvmdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println(">>> onCreate() fired")

        setContentView(R.layout.main_activity)      // This can stay as is even though Fragment has data binding active

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, sss.mvvmdemo1.androidfragvmdemo1.ui.main.MainFragment.newInstance())
                .commitNow()
        }

    }

}

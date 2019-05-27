package `in`.januprasad.logger

import `in`.januprasad.libs.Logger
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var logger = Logger.init(log)
        logger.log("hello")
        logger.log("hello")
        logger.log("hello")
        logger.log("hello")
        logger.log("world")
    }
}

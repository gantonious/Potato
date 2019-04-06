package ca.antonious.potato

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ca.antonious.core.getThings
import ca.antonious.potato.core.getRegistry
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val logger by lazy {
        getRegistry().getLogger()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logger.log("Hello")
        message.text = getThings().toString()
    }
}

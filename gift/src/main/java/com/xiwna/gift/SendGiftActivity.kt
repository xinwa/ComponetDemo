package com.xiwna.gift

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xiwna.annotation.RouterAnnotation

@RouterAnnotation("xinwa://send_gift")
class SendGiftActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gift_send_gift_activity)
    }
}
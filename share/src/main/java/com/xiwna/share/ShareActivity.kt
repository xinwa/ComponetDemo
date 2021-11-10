package com.xiwna.share

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xiwna.annotation.RouterAnnotation

@RouterAnnotation("xinwa://share")
class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.share_share_activity)
    }
}
package com.shreenathLogistics.mytoastlibrary

import android.content.Context
import android.widget.Toast

object AwsomeToste {

    fun show(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}


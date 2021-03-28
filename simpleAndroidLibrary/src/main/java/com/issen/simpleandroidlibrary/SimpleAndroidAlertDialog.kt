package com.issen.simpleandroidlibrary

import android.app.AlertDialog
import android.content.Context

public class SimpleAndroidAlertDialog {

    public fun showAlert(context: Context, title: String, message: String) {
        val builder1 = AlertDialog.Builder(context)
        builder1.setMessage(message)
        builder1.setTitle(title)
        builder1.setCancelable(true)

        builder1.setNeutralButton(
            "Ok"
        ) { dialog, id -> dialog.cancel() }

        val alert11 = builder1.create()
        alert11.show()
    }

}
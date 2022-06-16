package pp.sy.myapplication.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log

open class BaseDialog(context: Context) : Dialog(context) {

    private val tag = this.javaClass.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }



}
package pp.sy.myapplication

import android.content.Context
import android.os.Bundle
import pp.sy.myapplication.activity.BaseAppCompatActivity
import pp.sy.myapplication.databinding.ActivityMainBinding
import pp.sy.myapplication.dialog.ExitDialog

class MainActivity : BaseAppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        context = this@MainActivity

        setContentView(binding.root)

        binding.btnShowDialog.setOnClickListener {
            showExitFragment()
        }
    }

    private fun showExitFragment(){
        val exitDialog = ExitDialog(this@MainActivity, object : ExitDialog.ClickButton{
            override fun clickExitButton() {
                finish()
            }
        })
        exitDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        exitDialog.show()
    }

}
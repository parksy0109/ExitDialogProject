package pp.sy.myapplication.dialog

import android.content.Context
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil.setContentView
import pp.sy.myapplication.R
import pp.sy.myapplication.databinding.DialogExitBinding

class ExitDialog(context: Context, private var clickButton: ClickButton) : BaseDialog(
    context
) {

    private lateinit var binding: DialogExitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogExitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loadAnimation = AnimationUtils.loadAnimation(context, R.anim.tanslate_up)

        binding.ivAd.startAnimation(loadAnimation)

        binding.tvCancelButton.setOnClickListener {
            dismiss()
        }

        binding.tvExitButton.setOnClickListener {
            clickButton.clickExitButton()
        }

    }

    interface ClickButton {
        fun clickExitButton()
    }

}
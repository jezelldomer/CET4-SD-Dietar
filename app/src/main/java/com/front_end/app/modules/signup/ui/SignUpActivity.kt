package com.front_end.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivitySignUpBinding
import com.front_end.app.modules.age.ui.AgeActivity
import com.front_end.app.modules.login.ui.LoginActivity
import com.front_end.app.modules.signup.`data`.viewmodel.SignUpVM
import com.front_end.app.modules.signupm.ui.SignUpmActivity
import com.front_end.app.modules.signupu.ui.SignUpuActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private val REQUEST_CODE_SIGN_UPM_ACTIVITY: Int = 912


  private val REQUEST_CODE_SIGN_UPU_ACTIVITY: Int = 716


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = AgeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLOGIN.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorOne.setOnClickListener {
      val destIntent = SignUpmActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UPM_ACTIVITY)
    }
    binding.imageIcons8lgbtSixtyFour.setOnClickListener {
      val destIntent = SignUpuActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UPU_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.front_end.app.modules.details.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.front_end.app.R
import com.front_end.app.appcomponents.base.BaseActivity
import com.front_end.app.databinding.ActivityDetailsBinding
import com.front_end.app.modules.details.`data`.viewmodel.DetailsVM
import com.front_end.app.modules.home.ui.HomeActivity
<<<<<<< HEAD
import com.front_end.app.modules.saved.ui.SavedActivity
import kotlin.Int
=======
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
import kotlin.String
import kotlin.Unit

class DetailsActivity : BaseActivity<ActivityDetailsBinding>(R.layout.activity_details) {
  private val viewModel: DetailsVM by viewModels<DetailsVM>()

<<<<<<< HEAD
  private val REQUEST_CODE_SAVED_ACTIVITY: Int = 646

=======
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowfive.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
<<<<<<< HEAD
    binding.btnSaveResults.setOnClickListener {
      val destIntent = SavedActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SAVED_ACTIVITY)
    }
=======
>>>>>>> 7debd9c21c9b9e51d6cb8a7946f6c7275b1731e8
  }

  companion object {
    const val TAG: String = "DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

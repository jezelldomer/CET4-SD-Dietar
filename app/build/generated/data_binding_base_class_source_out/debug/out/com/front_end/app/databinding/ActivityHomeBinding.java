// Generated by data binding compiler. Do not edit!
package com.front_end.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.front_end.app.R;
import com.front_end.app.modules.home.data.viewmodel.HomeVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityHomeBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnProceed;

  @NonNull
  public final ImageButton btnUser;

  @NonNull
  public final FrameLayout frameStackrectangletwentyfive;

  @NonNull
  public final ImageView imageAirplane;

  @NonNull
  public final ImageView imageFavorite;

  @NonNull
  public final ImageView imageFire;

  @NonNull
  public final ImageView imageRectangleTwentyFive;

  @NonNull
  public final ImageView imageVector;

  @NonNull
  public final ImageView imageVolume;

  @NonNull
  public final LinearLayout linearColumn;

  @NonNull
  public final LinearLayout linearColumnairplane;

  @NonNull
  public final LinearLayout linearColumnfavorite;

  @NonNull
  public final LinearLayout linearColumnfire;

  @NonNull
  public final LinearLayout linearColumngoodmorningus;

  @NonNull
  public final LinearLayout linearColumnrectangletwentyfive;

  @NonNull
  public final LinearLayout linearColumnuser;

  @NonNull
  public final LinearLayout linearColumnvector;

  @NonNull
  public final LinearLayout linearColumnvolume;

  @NonNull
  public final LinearLayout linearRowfire;

  @NonNull
  public final LinearLayout linearRowvector;

  @NonNull
  public final RecyclerView recyclerHome;

  @NonNull
  public final TextView txtBMI;

  @NonNull
  public final TextView txtCreateyourCus;

  @NonNull
  public final TextView txtDiet;

  @NonNull
  public final TextView txtGoodMorningUS;

  @NonNull
  public final TextView txtJournal;

  @NonNull
  public final TextView txtLetsstartwit;

  @NonNull
  public final TextView txtWorkout;

  @Bindable
  protected HomeVM mHomeVM;

  protected ActivityHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnProceed, ImageButton btnUser, FrameLayout frameStackrectangletwentyfive,
      ImageView imageAirplane, ImageView imageFavorite, ImageView imageFire,
      ImageView imageRectangleTwentyFive, ImageView imageVector, ImageView imageVolume,
      LinearLayout linearColumn, LinearLayout linearColumnairplane,
      LinearLayout linearColumnfavorite, LinearLayout linearColumnfire,
      LinearLayout linearColumngoodmorningus, LinearLayout linearColumnrectangletwentyfive,
      LinearLayout linearColumnuser, LinearLayout linearColumnvector,
      LinearLayout linearColumnvolume, LinearLayout linearRowfire, LinearLayout linearRowvector,
      RecyclerView recyclerHome, TextView txtBMI, TextView txtCreateyourCus, TextView txtDiet,
      TextView txtGoodMorningUS, TextView txtJournal, TextView txtLetsstartwit,
      TextView txtWorkout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnProceed = btnProceed;
    this.btnUser = btnUser;
    this.frameStackrectangletwentyfive = frameStackrectangletwentyfive;
    this.imageAirplane = imageAirplane;
    this.imageFavorite = imageFavorite;
    this.imageFire = imageFire;
    this.imageRectangleTwentyFive = imageRectangleTwentyFive;
    this.imageVector = imageVector;
    this.imageVolume = imageVolume;
    this.linearColumn = linearColumn;
    this.linearColumnairplane = linearColumnairplane;
    this.linearColumnfavorite = linearColumnfavorite;
    this.linearColumnfire = linearColumnfire;
    this.linearColumngoodmorningus = linearColumngoodmorningus;
    this.linearColumnrectangletwentyfive = linearColumnrectangletwentyfive;
    this.linearColumnuser = linearColumnuser;
    this.linearColumnvector = linearColumnvector;
    this.linearColumnvolume = linearColumnvolume;
    this.linearRowfire = linearRowfire;
    this.linearRowvector = linearRowvector;
    this.recyclerHome = recyclerHome;
    this.txtBMI = txtBMI;
    this.txtCreateyourCus = txtCreateyourCus;
    this.txtDiet = txtDiet;
    this.txtGoodMorningUS = txtGoodMorningUS;
    this.txtJournal = txtJournal;
    this.txtLetsstartwit = txtLetsstartwit;
    this.txtWorkout = txtWorkout;
  }

  public abstract void setHomeVM(@Nullable HomeVM homeVM);

  @Nullable
  public HomeVM getHomeVM() {
    return mHomeVM;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityHomeBinding>inflateInternal(inflater, R.layout.activity_home, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityHomeBinding>inflateInternal(inflater, R.layout.activity_home, null, false, component);
  }

  public static ActivityHomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityHomeBinding)bind(component, view, R.layout.activity_home);
  }
}

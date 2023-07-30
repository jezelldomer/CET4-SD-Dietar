// Generated by data binding compiler. Do not edit!
package com.front_end.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.front_end.app.R;
import com.front_end.app.modules.target.data.viewmodel.TargetVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTargetBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout frameTarget;

  @NonNull
  public final ImageView image360F247848348;

  @NonNull
  public final LinearLayout linearColumntwo;

  @NonNull
  public final LinearLayout linearRowback;

  @NonNull
  public final TextView txtBack;

  @NonNull
  public final TextView txtFour;

  @NonNull
  public final TextView txtNext;

  @NonNull
  public final TextView txtWeusethisdat;

  @NonNull
  public final TextView txtWhatsyourTar;

  @NonNull
  public final EditText viewRectangleTwentyOne;

  @Bindable
  protected TargetVM mTargetVM;

  protected ActivityTargetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout frameTarget, ImageView image360F247848348, LinearLayout linearColumntwo,
      LinearLayout linearRowback, TextView txtBack, TextView txtFour, TextView txtNext,
      TextView txtWeusethisdat, TextView txtWhatsyourTar, EditText viewRectangleTwentyOne) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameTarget = frameTarget;
    this.image360F247848348 = image360F247848348;
    this.linearColumntwo = linearColumntwo;
    this.linearRowback = linearRowback;
    this.txtBack = txtBack;
    this.txtFour = txtFour;
    this.txtNext = txtNext;
    this.txtWeusethisdat = txtWeusethisdat;
    this.txtWhatsyourTar = txtWhatsyourTar;
    this.viewRectangleTwentyOne = viewRectangleTwentyOne;
  }

  public abstract void setTargetVM(@Nullable TargetVM targetVM);

  @Nullable
  public TargetVM getTargetVM() {
    return mTargetVM;
  }

  @NonNull
  public static ActivityTargetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_target, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTargetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTargetBinding>inflateInternal(inflater, R.layout.activity_target, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTargetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_target, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTargetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTargetBinding>inflateInternal(inflater, R.layout.activity_target, null, false, component);
  }

  public static ActivityTargetBinding bind(@NonNull View view) {
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
  public static ActivityTargetBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTargetBinding)bind(component, view, R.layout.activity_target);
  }
}

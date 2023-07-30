// Generated by data binding compiler. Do not edit!
package com.front_end.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.front_end.app.modules.sched.data.viewmodel.SchedVM;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySchedBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton floatingBtnFloatingactionbutton;

  @NonNull
  public final FrameLayout frameSched;

  @NonNull
  public final FrameLayout frameStackarrowfive;

  @NonNull
  public final FrameLayout frameStackrectanglesix;

  @NonNull
  public final FrameLayout frameStacktodaysplan;

  @NonNull
  public final ImageView imageArrowFive;

  @NonNull
  public final ImageView imageRectangleSix;

  @NonNull
  public final LinearLayout linearColumntodaysplan;

  @NonNull
  public final LinearLayout linearColumnweekday;

  @NonNull
  public final LinearLayout linearRowrectangleten;

  @NonNull
  public final TextView txtHinesDrive;

  @NonNull
  public final TextView txtTime;

  @NonNull
  public final TextView txtTodaysplan;

  @NonNull
  public final TextView txtWeekday;

  @NonNull
  public final TextView txtYouKatieFour;

  @NonNull
  public final View viewRectangleTen;

  @Bindable
  protected SchedVM mSchedVM;

  protected ActivitySchedBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton floatingBtnFloatingactionbutton, FrameLayout frameSched,
      FrameLayout frameStackarrowfive, FrameLayout frameStackrectanglesix,
      FrameLayout frameStacktodaysplan, ImageView imageArrowFive, ImageView imageRectangleSix,
      LinearLayout linearColumntodaysplan, LinearLayout linearColumnweekday,
      LinearLayout linearRowrectangleten, TextView txtHinesDrive, TextView txtTime,
      TextView txtTodaysplan, TextView txtWeekday, TextView txtYouKatieFour,
      View viewRectangleTen) {
    super(_bindingComponent, _root, _localFieldCount);
    this.floatingBtnFloatingactionbutton = floatingBtnFloatingactionbutton;
    this.frameSched = frameSched;
    this.frameStackarrowfive = frameStackarrowfive;
    this.frameStackrectanglesix = frameStackrectanglesix;
    this.frameStacktodaysplan = frameStacktodaysplan;
    this.imageArrowFive = imageArrowFive;
    this.imageRectangleSix = imageRectangleSix;
    this.linearColumntodaysplan = linearColumntodaysplan;
    this.linearColumnweekday = linearColumnweekday;
    this.linearRowrectangleten = linearRowrectangleten;
    this.txtHinesDrive = txtHinesDrive;
    this.txtTime = txtTime;
    this.txtTodaysplan = txtTodaysplan;
    this.txtWeekday = txtWeekday;
    this.txtYouKatieFour = txtYouKatieFour;
    this.viewRectangleTen = viewRectangleTen;
  }

  public abstract void setSchedVM(@Nullable SchedVM schedVM);

  @Nullable
  public SchedVM getSchedVM() {
    return mSchedVM;
  }

  @NonNull
  public static ActivitySchedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_sched, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySchedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySchedBinding>inflateInternal(inflater, R.layout.activity_sched, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySchedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_sched, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySchedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySchedBinding>inflateInternal(inflater, R.layout.activity_sched, null, false, component);
  }

  public static ActivitySchedBinding bind(@NonNull View view) {
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
  public static ActivitySchedBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySchedBinding)bind(component, view, R.layout.activity_sched);
  }
}

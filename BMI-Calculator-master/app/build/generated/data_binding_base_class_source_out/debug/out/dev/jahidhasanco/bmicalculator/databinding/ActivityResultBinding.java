// Generated by data binding compiler. Do not edit!
package dev.jahidhasanco.bmicalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import dev.jahidhasanco.bmicalculator.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityResultBinding extends ViewDataBinding {
  @NonNull
  public final TextView bmiText;

  @NonNull
  public final TextView bmiTextNormal;

  @NonNull
  public final ImageView deleteBtn;

  @NonNull
  public final ImageView deskImage;

  @NonNull
  public final LinearLayout detailView;

  @NonNull
  public final ImageView reloadBtn;

  @NonNull
  public final CardView reloadCardView;

  @NonNull
  public final TextView resultText;

  @NonNull
  public final ImageView shareBtn;

  @NonNull
  public final TextView textView;

  protected ActivityResultBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView bmiText, TextView bmiTextNormal, ImageView deleteBtn, ImageView deskImage,
      LinearLayout detailView, ImageView reloadBtn, CardView reloadCardView, TextView resultText,
      ImageView shareBtn, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bmiText = bmiText;
    this.bmiTextNormal = bmiTextNormal;
    this.deleteBtn = deleteBtn;
    this.deskImage = deskImage;
    this.detailView = detailView;
    this.reloadBtn = reloadBtn;
    this.reloadCardView = reloadCardView;
    this.resultText = resultText;
    this.shareBtn = shareBtn;
    this.textView = textView;
  }

  @NonNull
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_result, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityResultBinding>inflateInternal(inflater, R.layout.activity_result, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_result, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityResultBinding>inflateInternal(inflater, R.layout.activity_result, null, false, component);
  }

  public static ActivityResultBinding bind(@NonNull View view) {
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
  public static ActivityResultBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityResultBinding)bind(component, view, R.layout.activity_result);
  }
}

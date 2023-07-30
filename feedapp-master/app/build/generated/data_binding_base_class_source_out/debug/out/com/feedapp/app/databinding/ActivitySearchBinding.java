// Generated by data binding compiler. Do not edit!
package com.feedapp.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.feedapp.app.R;
import com.feedapp.app.viewModels.SearchViewModel;
import com.google.android.material.appbar.AppBarLayout;
import com.mancj.materialsearchbar.MaterialSearchBar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySearchBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout activitySearchAppbar;

  @NonNull
  public final TextView activitySearchNotFound;

  @NonNull
  public final ProgressBar activitySearchPb;

  @NonNull
  public final RelativeLayout activitySearchRl;

  @NonNull
  public final RelativeLayout activitySearchRlRecent;

  @NonNull
  public final RecyclerView activitySearchRv;

  @NonNull
  public final RecyclerView activitySearchRvRecent;

  @NonNull
  public final MaterialSearchBar activitySearchSearchBar;

  @NonNull
  public final RelativeLayout activitySearchTextChooseLl;

  @NonNull
  public final TextView activitySearchTextCreate;

  @NonNull
  public final RelativeLayout activitySearchTextCreateLl;

  @NonNull
  public final TextView activitySearchTextRecent;

  @Bindable
  protected SearchViewModel mViewmodel;

  protected ActivitySearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout activitySearchAppbar, TextView activitySearchNotFound,
      ProgressBar activitySearchPb, RelativeLayout activitySearchRl,
      RelativeLayout activitySearchRlRecent, RecyclerView activitySearchRv,
      RecyclerView activitySearchRvRecent, MaterialSearchBar activitySearchSearchBar,
      RelativeLayout activitySearchTextChooseLl, TextView activitySearchTextCreate,
      RelativeLayout activitySearchTextCreateLl, TextView activitySearchTextRecent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activitySearchAppbar = activitySearchAppbar;
    this.activitySearchNotFound = activitySearchNotFound;
    this.activitySearchPb = activitySearchPb;
    this.activitySearchRl = activitySearchRl;
    this.activitySearchRlRecent = activitySearchRlRecent;
    this.activitySearchRv = activitySearchRv;
    this.activitySearchRvRecent = activitySearchRvRecent;
    this.activitySearchSearchBar = activitySearchSearchBar;
    this.activitySearchTextChooseLl = activitySearchTextChooseLl;
    this.activitySearchTextCreate = activitySearchTextCreate;
    this.activitySearchTextCreateLl = activitySearchTextCreateLl;
    this.activitySearchTextRecent = activitySearchTextRecent;
  }

  public abstract void setViewmodel(@Nullable SearchViewModel viewmodel);

  @Nullable
  public SearchViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchBinding>inflateInternal(inflater, R.layout.activity_search, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchBinding>inflateInternal(inflater, R.layout.activity_search, null, false, component);
  }

  public static ActivitySearchBinding bind(@NonNull View view) {
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
  public static ActivitySearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySearchBinding)bind(component, view, R.layout.activity_search);
  }
}

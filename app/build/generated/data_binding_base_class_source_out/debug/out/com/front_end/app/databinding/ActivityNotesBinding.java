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
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.front_end.app.R;
import com.front_end.app.modules.notes.data.viewmodel.NotesVM;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityNotesBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton floatingBtnFloatingactionbutton;

  @NonNull
  public final FrameLayout frameNotes;

  @NonNull
  public final FrameLayout frameStackarrowfive;

  @NonNull
  public final FrameLayout frameStacknotes;

  @NonNull
  public final ImageView imageArrowFive;

  @NonNull
  public final ImageView imageIconhamburge;

  @NonNull
  public final LinearLayout linearColumnarrowfive;

  @NonNull
  public final LinearLayout linearRowarrowfive;

  @NonNull
  public final LinearLayout linearRowiconhamburge;

  @NonNull
  public final SearchView searchViewSearchbox;

  @NonNull
  public final Toolbar toolbarToolbar;

  @NonNull
  public final TextView txtNotes;

  @Bindable
  protected NotesVM mNotesVM;

  protected ActivityNotesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton floatingBtnFloatingactionbutton, FrameLayout frameNotes,
      FrameLayout frameStackarrowfive, FrameLayout frameStacknotes, ImageView imageArrowFive,
      ImageView imageIconhamburge, LinearLayout linearColumnarrowfive,
      LinearLayout linearRowarrowfive, LinearLayout linearRowiconhamburge,
      SearchView searchViewSearchbox, Toolbar toolbarToolbar, TextView txtNotes) {
    super(_bindingComponent, _root, _localFieldCount);
    this.floatingBtnFloatingactionbutton = floatingBtnFloatingactionbutton;
    this.frameNotes = frameNotes;
    this.frameStackarrowfive = frameStackarrowfive;
    this.frameStacknotes = frameStacknotes;
    this.imageArrowFive = imageArrowFive;
    this.imageIconhamburge = imageIconhamburge;
    this.linearColumnarrowfive = linearColumnarrowfive;
    this.linearRowarrowfive = linearRowarrowfive;
    this.linearRowiconhamburge = linearRowiconhamburge;
    this.searchViewSearchbox = searchViewSearchbox;
    this.toolbarToolbar = toolbarToolbar;
    this.txtNotes = txtNotes;
  }

  public abstract void setNotesVM(@Nullable NotesVM notesVM);

  @Nullable
  public NotesVM getNotesVM() {
    return mNotesVM;
  }

  @NonNull
  public static ActivityNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_notes, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityNotesBinding>inflateInternal(inflater, R.layout.activity_notes, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNotesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_notes, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityNotesBinding>inflateInternal(inflater, R.layout.activity_notes, null, false, component);
  }

  public static ActivityNotesBinding bind(@NonNull View view) {
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
  public static ActivityNotesBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityNotesBinding)bind(component, view, R.layout.activity_notes);
  }
}

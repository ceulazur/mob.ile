// Generated by view binder compiler. Do not edit!
package br.ufc.mobileproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.ufc.mobileproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button bntLogin;

  @NonNull
  public final ImageView faceboockIcon;

  @NonNull
  public final ImageView googleIcon;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText rePassword;

  @NonNull
  public final ImageView twiterIcon;

  @NonNull
  public final TextView txtViewCancelRegister;

  @NonNull
  public final TextView txtViewLogin;

  @NonNull
  public final TextView txtViewLoginCadastro;

  @NonNull
  public final TextView txtViewLogoLogin;

  @NonNull
  public final EditText username;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull Button bntLogin,
      @NonNull ImageView faceboockIcon, @NonNull ImageView googleIcon, @NonNull ProgressBar loading,
      @NonNull EditText password, @NonNull EditText rePassword, @NonNull ImageView twiterIcon,
      @NonNull TextView txtViewCancelRegister, @NonNull TextView txtViewLogin,
      @NonNull TextView txtViewLoginCadastro, @NonNull TextView txtViewLogoLogin,
      @NonNull EditText username) {
    this.rootView = rootView;
    this.bntLogin = bntLogin;
    this.faceboockIcon = faceboockIcon;
    this.googleIcon = googleIcon;
    this.loading = loading;
    this.password = password;
    this.rePassword = rePassword;
    this.twiterIcon = twiterIcon;
    this.txtViewCancelRegister = txtViewCancelRegister;
    this.txtViewLogin = txtViewLogin;
    this.txtViewLoginCadastro = txtViewLoginCadastro;
    this.txtViewLogoLogin = txtViewLogoLogin;
    this.username = username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bntLogin;
      Button bntLogin = ViewBindings.findChildViewById(rootView, id);
      if (bntLogin == null) {
        break missingId;
      }

      id = R.id.faceboock_icon;
      ImageView faceboockIcon = ViewBindings.findChildViewById(rootView, id);
      if (faceboockIcon == null) {
        break missingId;
      }

      id = R.id.google_icon;
      ImageView googleIcon = ViewBindings.findChildViewById(rootView, id);
      if (googleIcon == null) {
        break missingId;
      }

      id = R.id.loading;
      ProgressBar loading = ViewBindings.findChildViewById(rootView, id);
      if (loading == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.rePassword;
      EditText rePassword = ViewBindings.findChildViewById(rootView, id);
      if (rePassword == null) {
        break missingId;
      }

      id = R.id.twiter_icon;
      ImageView twiterIcon = ViewBindings.findChildViewById(rootView, id);
      if (twiterIcon == null) {
        break missingId;
      }

      id = R.id.txtViewCancelRegister;
      TextView txtViewCancelRegister = ViewBindings.findChildViewById(rootView, id);
      if (txtViewCancelRegister == null) {
        break missingId;
      }

      id = R.id.txtViewLogin;
      TextView txtViewLogin = ViewBindings.findChildViewById(rootView, id);
      if (txtViewLogin == null) {
        break missingId;
      }

      id = R.id.txtViewLoginCadastro;
      TextView txtViewLoginCadastro = ViewBindings.findChildViewById(rootView, id);
      if (txtViewLoginCadastro == null) {
        break missingId;
      }

      id = R.id.txtViewLogoLogin;
      TextView txtViewLogoLogin = ViewBindings.findChildViewById(rootView, id);
      if (txtViewLogoLogin == null) {
        break missingId;
      }

      id = R.id.username;
      EditText username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, bntLogin, faceboockIcon,
          googleIcon, loading, password, rePassword, twiterIcon, txtViewCancelRegister,
          txtViewLogin, txtViewLoginCadastro, txtViewLogoLogin, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

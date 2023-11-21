package br.ufc.mobileproject.ui.perfil;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.ufc.mobileproject.R;
import br.ufc.mobileproject.LoginActivity;
import br.ufc.mobileproject.RegisterActivity;

public class PerfilFragment extends Fragment {

    private PerfilViewModel mViewModel;
    private Button btnMakeLogin, btnCreateAccount;

    public static PerfilFragment newInstance() {
        return new PerfilFragment();
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        View v = inflater.inflate( R.layout.fragment_perfil, container, false );

        btnMakeLogin = ( Button ) v.findViewById( R.id.btnMakeLoginPerfil );
        btnCreateAccount = ( Button ) v.findViewById( R.id.btnCreateAccountPerfil );

        btnMakeLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity( new Intent( getActivity(), LoginActivity.class ) );
            }
        });

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity( new Intent( getActivity(), RegisterActivity.class ) );
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PerfilViewModel.class);
        // TODO: Use the ViewModel
    }

}
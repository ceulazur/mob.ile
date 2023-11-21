package br.ufc.mobileproject.ui.perfil;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.ufc.mobileproject.R;
import br.ufc.mobileproject.ui.account.AccountFragment;
import br.ufc.mobileproject.ui.favorites.FavoritesFragment;
import br.ufc.mobileproject.ui.gallery.GalleryFragment;
import br.ufc.mobileproject.ui.historic.HistoricFragment;

public class PerfilLoggedFragment extends Fragment {

    private PerfilLoggedViewModel mViewModel;
    private Button bntConta, bntEstampas, bntHistorico, bntFavoritos;

    public static PerfilLoggedFragment newInstance() {
        return new PerfilLoggedFragment();
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        View v = inflater.inflate( R.layout.fragment_perfil_logged, container, false );

        bntConta = v.findViewById( R.id.bntConta );
        bntEstampas = v.findViewById( R.id.bntEstampas );
        bntHistorico = v.findViewById( R.id.bntHistorico );
        bntFavoritos = v.findViewById( R.id.bntFavoritos );

        bntConta.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace( R.id.nav_host_fragment_activity_main2, new AccountFragment() ).commit();
            }
        });

        bntEstampas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace( R.id.nav_host_fragment_activity_main2, new GalleryFragment() ).commit();
            }
        });

        bntHistorico.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace( R.id.nav_host_fragment_activity_main2, new HistoricFragment() ).commit();
            }
        });

        bntFavoritos.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace( R.id.nav_host_fragment_activity_main2, new FavoritesFragment() ).commit();
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PerfilLoggedViewModel.class);
        // TODO: Use the ViewModel
    }

}
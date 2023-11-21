package br.ufc.mobileproject.ui.favorites;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import br.ufc.mobileproject.R;
import br.ufc.mobileproject.ui.perfil.PerfilFragment;

public class FavoritesFragment extends Fragment {

    private FavoritesViewModel mViewModel;
    private ImageView ArrowBackFavorites;

    public static FavoritesFragment newInstance() {
        return new FavoritesFragment();
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        View v = inflater.inflate(R.layout.fragment_favorites, container, false);

        ArrowBackFavorites = ( ImageView ) v.findViewById( R.id.imgViewArrowBackFavorites );
        ArrowBackFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace( R.id.nav_host_fragment_activity_main2, new PerfilFragment() ).commit();
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FavoritesViewModel.class);
        // TODO: Use the ViewModel
    }

}
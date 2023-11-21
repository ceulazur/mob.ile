package br.ufc.mobileproject.ui.shopping;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import br.ufc.mobileproject.LoginActivity;
import br.ufc.mobileproject.MainActivity;
import br.ufc.mobileproject.R;
import br.ufc.mobileproject.RegisterActivity;
import br.ufc.mobileproject.ui.home.HomeFragment;

public class ShoppingFragment extends Fragment {

    private ShoppingViewModel mViewModel;
    private Button btnMakeLogin, btnCreateAccount, btnContinue;

    public static ShoppingFragment newInstance() {
        return new ShoppingFragment();
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        View v = inflater.inflate(R.layout.fragment_shopping, container, false);

        btnMakeLogin = ( Button ) v.findViewById( R.id.btnMakeLoginShop );
        btnCreateAccount = ( Button ) v.findViewById( R.id.btnCreateAccountShop );
        btnContinue = ( Button ) v.findViewById( R.id.btnContinueShop );

        btnMakeLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity( new Intent( getActivity(), LoginActivity.class ) );
            }
        });

        btnCreateAccount.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity( new Intent( getActivity(), RegisterActivity.class ) );
            }
        });

        btnContinue.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeFragment homeFragment = new HomeFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace( R.id.nav_host_fragment_activity_main, homeFragment );
                NavController navController = Navigation.findNavController( getActivity(), R.id.nav_host_fragment_activity_main );
                transaction.commit();
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ShoppingViewModel.class);
        // TODO: Use the ViewModel
    }

}
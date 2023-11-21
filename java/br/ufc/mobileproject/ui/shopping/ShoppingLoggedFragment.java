package br.ufc.mobileproject.ui.shopping;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.ufc.mobileproject.R;

public class ShoppingLoggedFragment extends Fragment {

    private ShoppingLoggedViewModel mViewModel;

    public static ShoppingLoggedFragment newInstance() {
        return new ShoppingLoggedFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shopping_logged, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ShoppingLoggedViewModel.class);
        // TODO: Use the ViewModel
    }

}
package br.ufc.mobileproject.dao;

import android.view.View;

public interface ItemClickListnerInterface {
    void onClick( View view, int position, boolean isLongClick );
}

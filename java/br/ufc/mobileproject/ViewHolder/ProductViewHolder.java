package br.ufc.mobileproject.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import br.ufc.mobileproject.R;

import br.ufc.mobileproject.dao.ItemClickListnerInterface;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView NomeProduto_1, NomeProduto_2, DescricaoProduto_1, DescricaoProduto_2, PreçoProduto_1, PreçoProduto_2;
    public ImageView ImagemProduto_1, ImagemProduto_2;
    public ItemClickListnerInterface listner;


    public ProductViewHolder( View itemView ) {
        super( itemView );

        NomeProduto_1 = ( TextView ) itemView.findViewById( R.id.txtViewNomeProduto_1 );
        NomeProduto_2 = ( TextView ) itemView.findViewById( R.id.txtViewNomeProduto_2 );
        DescricaoProduto_1 = ( TextView ) itemView.findViewById( R.id.txtViewDescricaoProduto_1 );
        DescricaoProduto_2 = ( TextView ) itemView.findViewById( R.id.txtViewDescricaoProduto_2 );
        PreçoProduto_1 = ( TextView ) itemView.findViewById( R.id.txtViewPreçoProduto_1 );
        PreçoProduto_2 = ( TextView ) itemView.findViewById( R.id.txtViewPreçoProduto_2 );
        ImagemProduto_1 = ( ImageView ) itemView.findViewById( R.id.imgViewImagemProduto_1 );
        ImagemProduto_2 = ( ImageView ) itemView.findViewById( R.id.imgViewImagemProduto_2 );
    }

    public void setItemclickListner( ItemClickListnerInterface listner ) {
        this.listner = listner;
    }

    @Override
    public void onClick(View view) {
        listner.onClick( view, getAdapterPosition(), false );
    }
}

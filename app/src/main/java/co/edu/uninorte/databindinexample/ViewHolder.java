package co.edu.uninorte.databindinexample;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import co.edu.uninorte.databindinexample.databinding.RowBinding;

/**
 * Created by fdjvf on 4/13/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {


    public RowBinding binder;

    public ViewHolder(View v) {
        super(v);
        binder = DataBindingUtil.bind(v);
    }
}
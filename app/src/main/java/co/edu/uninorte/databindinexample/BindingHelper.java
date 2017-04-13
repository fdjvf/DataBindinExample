package co.edu.uninorte.databindinexample;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

/**
 * Created by fdjvf on 4/13/2017.
 */

public class BindingHelper {

    //Version para RecycleView
    @BindingAdapter("bind:items")
    public static void bindList(RecyclerView view, ObservableArrayList<Person> list) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        view.setLayoutManager(layoutManager);
        view.setAdapter(new ListAdapter(list));
    }
    /* Version para ListView
    @BindingAdapter("bind:items")
    public  static void bindList(ListView view, ObservableArrayList<Person> list) {
        ListAdapter adapter = new ListAdapter(list);
        view.setAdapter(adapter);
    }*/

}

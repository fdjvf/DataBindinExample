package co.edu.uninorte.databindinexample;

import android.databinding.ObservableArrayList;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by fdjvf on 4/13/2017.
 */

public class ListAdapter  extends RecyclerView.Adapter<ViewHolder> {
 /*   private ObservableArrayList<Person> list;
    private LayoutInflater inflater;

    public ListAdapter(ObservableArrayList<Person> l) {
        list = l;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

         RowBinding binding = DataBindingUtil.inflate(inflater, R.layout.row, parent, false);
        binding.setUser(list.get(position));

        return binding.getRoot();
    }*/

     private ObservableArrayList<Person> list;
    public ListAdapter(ObservableArrayList<Person> l) {
            list = l;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            final Person info = list.get(position);
            holder.binder.setUser((info));
            holder.binder.executePendingBindings();
        }

        @Override
        public int getItemCount() {
            return list.size();
        }



}

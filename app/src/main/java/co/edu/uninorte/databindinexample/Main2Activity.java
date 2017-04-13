package co.edu.uninorte.databindinexample;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ListView;

import co.edu.uninorte.databindinexample.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {
    PersonMain temp=new PersonMain();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding binding= DataBindingUtil.setContentView(this, R.layout.activity_main2);

        ObservableArrayList<Person> telu=new ObservableArrayList<>();
        for (int i=0;i<5;i++)
        {
            telu.add(new Person("Fabio",i));
        }
        temp.list=telu;

        binding.setXlist(temp);
    }


    public void click(View view) {

        temp.list.add(new Person("Potato",5));
    }
}

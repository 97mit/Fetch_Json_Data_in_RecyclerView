package com.example.amit.nevaassignment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class NameAdapter extends RecyclerView.Adapter<NameAdapter.ViewHolder> {

    // we define a list from the PersonList java class

    private List<PersonList> nameLists;
    private Context context;

    public NameAdapter(List<PersonList> nameLists, Context context) {

        // generate constructors to initialise the List and Context objects

        this.nameLists = nameLists;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // this method will be called whenever our ViewHolder is created
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        // this method will bind the data to the ViewHolder from whence it'll be shown to other Views

        final PersonList personList = nameLists.get(position);
        holder.name.setText(personList.getName());

        Picasso.with(context)
                .load(personList.getImage())
                .fit()
                .into(holder.image);
        holder.skills.setText(personList.getSkills());
    }

    @Override

    //return the size of the listItems

    public int getItemCount() {
        return nameLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // define the View objects

        public TextView name;
        public ImageView image;
        public TextView skills;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            // initialize the View objects

            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.imageView);
            skills = itemView.findViewById(R.id.skills);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }

    }
}

package com.example.uniproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContactsRecViewAdapter extends RecyclerView.Adapter<ContactsRecViewAdapter.ViewHolder> {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private final Context context;

    public ContactsRecViewAdapter(Context context) {
        this.context = context;
    }

    //Create an instance of viewHolder class for every item in recyclerView
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contacts_list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txtName.setText(contacts.get(i).getName());
        viewHolder.txtEmail.setText(contacts.get(i).getEmail());
        viewHolder.parent.setOnClickListener(view -> Toast.makeText(context, contacts.get(viewHolder.getAdapterPosition()).getName() + " Selected", Toast.LENGTH_SHORT).show());

        Glide.with(context)
                .asBitmap()
                .load(contacts.get(i).getImageUrl())
                .into(viewHolder.image);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView txtName;
        private final TextView txtEmail;
        private final CardView parent;
        private final ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtEmail = itemView.findViewById(R.id.txtEmail);
            image = itemView.findViewById(R.id.image);
            parent = itemView.findViewById(R.id.parent);
        }
    }

}

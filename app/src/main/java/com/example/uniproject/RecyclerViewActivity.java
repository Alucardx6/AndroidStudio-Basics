package com.example.uniproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Margot Robbie", "Marot@gmail.com", "https://observer.com/wp-content/uploads/sites/2/2020/12/Margo-Robbie_Tim-P.-WhitbyGetty-Images-for-Sony-e1607483364790.jpg"));
        contacts.add(new Contact("Cillian Murphy", "Cillian@gmail.com", "https://vz.cnwimg.com/wp-content/uploads/2011/04/GettyImages-615030208.jpg"));
        contacts.add(new Contact("Saoirse Ronan", "Saoirse@gmail.com", "https://www.stylectory.net/wp-content/uploads/2021/01/1050210-800w-768x984-1.jpg"));
        contacts.add(new Contact("Emma Watson", "Emma@gmail.com", "https://www.unwomen.org/sites/default/files/2022-10/UN-Women-Goodwill-Ambassador-Emma-Watson-Credit-Celeste-Sloman-853x1280.jpg"));
        contacts.add(new Contact("Cristian Bale", "Cristian@gmail.com", "https://m.media-amazon.com/images/M/MV5BMTkxMzk4MjQ4MF5BMl5BanBnXkFtZTcwMzExODQxOA@@._V1_.jpg"));
        contacts.add(new Contact("jennifer lawrence", "jennifer@gmail.com", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/Jennifer_Lawrence_in_2016.jpg/1200px-Jennifer_Lawrence_in_2016.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);
        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new LinearLayoutManager(this));
    }
}
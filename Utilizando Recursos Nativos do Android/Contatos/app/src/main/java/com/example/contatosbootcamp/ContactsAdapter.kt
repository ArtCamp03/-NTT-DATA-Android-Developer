package com.example.contatosbootcamp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class ContactsAdapter(val contactsList:ArrayList<Contact>): RecyclerView.Adapter<ContactsAdapter.ViewHolder>{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return ViewHolder(view)
    }



    override fun onBindViewHolder(holder: ContactsAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItem(contact:Contact){
            val textName = itemView.findViewById<TextView>(R.id.contact_name)
            val textPhone = itemView.findViewById<TextView>(R.id.contact_phone_number)

            textName.text = contact.name
            textPhone.text = contact.phoneNumber
        }
    }

}
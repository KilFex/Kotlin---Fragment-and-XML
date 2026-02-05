package com.elmodevs.medicore.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elmodevs.medicore.DataMedical

class MedicalAdapter(val medicalInfo:List<DataMedical>) : RecyclerView.Adapter<MedicalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicalViewHolder {
        val binding = onCreateViewHolder(MedicalViewHolder.)
    }

    override fun getItemCount(): Int  = medicalInfo.size

    override fun onBindViewHolder(holder: MedicalViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
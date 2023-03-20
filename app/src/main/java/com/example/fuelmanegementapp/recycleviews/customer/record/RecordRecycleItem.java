package com.example.fuelmanegementapp.recycleviews.customer.record;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fuelmanegementapp.R;
import com.example.fuelmanegementapp.models.Record;


public class RecordRecycleItem extends RecyclerView.ViewHolder {


    private final TextView txtVehicleReg;
    private final TextView txtRecDate;
    private final TextView txtRecFuel;
    private final TextView txtRecAmount;
    private final TextView txtRecStation;
    private String key;
    private Record record;

    public RecordRecycleItem(ViewGroup parent, AppCompatActivity mContext) {
        super(LayoutInflater.from(mContext).inflate(R.layout.item_record, parent, false));
        
        txtVehicleReg = itemView.findViewById(R.id.txtVehicleReg);
        txtRecDate = itemView.findViewById(R.id.txtRecDate);
        txtRecFuel = itemView.findViewById(R.id.txtRecFuel);
        txtRecAmount = itemView.findViewById(R.id.txtRecAmount);
        txtRecStation = itemView.findViewById(R.id.txtRecStation);
    }

    public void bind(Record record, String key) {
        txtVehicleReg.setText(record.getVehicle().getReg_no());
        txtRecDate.setText(record.getTimestamp());
        txtRecAmount.setText(record.getAmount() +" L");
        txtRecFuel.setText(record.getVehicle().getFuelType().getFuel());
        txtRecStation.setText(record.getFuelStation().getName());
        this.record = record;
        this.key = key;
    }
}

package edu.co.icesi.testclasshttp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DeezerAdapter extends RecyclerView.Adapter<DeezerItemRowView> {

    private ArrayList<DeezerResult> items;

    public DeezerAdapter(){
        items = new ArrayList<>();
    }


    @NonNull
    @Override
    public DeezerItemRowView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View root = inflater.inflate(R.layout.row, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DeezerItemRowView holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

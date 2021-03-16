package edu.co.icesi.testclasshttp;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class DeezerItemRowView extends RecyclerView.ViewHolder {

    private TextView titlerow;

    public DeezerItemRowView(View root) {
        super(root);
        titlerow = root.findViewById(R.id.titlerow);
    }

    public TextView getTitlerow() {
        return titlerow;
    }
}

package mx.edu.utng.titoaprendealeer;

/**
 * Created by ulises on 25/04/2017.
 */
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewAdapterCarrucel extends ArrayAdapter<ImageItemCarrucel> {
private Context context;
private int resource;
private ArrayList<ImageItemCarrucel> data = new ArrayList<ImageItemCarrucel>();


public GridViewAdapterCarrucel(Context context, int resource, ArrayList<ImageItemCarrucel> data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
        }

@NonNull
@Override
public View getView(int position, View convertView, ViewGroup parent)  {

        View rowView = convertView;
        ViewHolder holder;

        if (rowView == null){
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        rowView = inflater.inflate(resource, parent, false);
        holder = new ViewHolder();
        holder.tvTitle = (TextView)rowView.findViewById(R.id.tv_title);
        holder.ivPhoto = (ImageView)rowView.findViewById(R.id.iv_photo);
        rowView.setTag(holder);
        }else{
        holder = (ViewHolder) rowView.getTag();
        }
    ImageItemCarrucel item = data.get(position);
        holder.ivPhoto.setImageBitmap(item.getImage());
        holder.tvTitle.setText(item.getTitle());

        return rowView;
        }

static class ViewHolder{
    TextView tvTitle;
    ImageView ivPhoto;

}
}


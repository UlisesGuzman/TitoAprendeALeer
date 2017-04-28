package mx.edu.utng.titoaprendealeer;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


public class GalleryFragment extends Fragment {
    private GridView gvPhotos;
    private GridViewAdapterCarrucel adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.gallery_fragment_carrucel, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        gvPhotos = (GridView) getView().findViewById(R.id.gv_photos);
        adapter = new GridViewAdapterCarrucel(getActivity(),R.layout.item_layout_carrucel, getData());
        gvPhotos.setAdapter(adapter);

        gvPhotos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageItemCarrucel item = (ImageItemCarrucel) parent.getItemAtPosition(position);

                Intent intent = new Intent(getActivity(),ShowImageActivity.class );
                intent.putExtra("title", item.getTitle());
                intent.putExtra("image", item.getImage());
                startActivity(intent);
            }
        });
    }

    private ArrayList<ImageItemCarrucel> getData(){
        final ArrayList<ImageItemCarrucel> images = new ArrayList<>();
        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);

        for (int i = 0;i < imgs.length(); i++){
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
            images.add(new ImageItemCarrucel(bitmap, "Vocal "+i));

        }
        return images;

    }
}


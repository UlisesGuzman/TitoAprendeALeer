package mx.edu.utng.titoaprendealeer;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DANIEL on 02/03/2017.
 */

public class GalleryTwoFragment extends Fragment {
    private int currentIndex;
    private ArrayList<ImageItemNumeros> imageItems;
    private int[] photos = {
            R.drawable.numero1,
            R.drawable.numero2,
            R.drawable.numero3,
            R.drawable.numero4,
            R.drawable.numero5,
            R.drawable.numero6,
            R.drawable.numero7,
            R.drawable.numero8,
            R.drawable.numero9,
            R.drawable.numero10,
            R.drawable.numero11,
            R.drawable.numero12,
            R.drawable.numero13,
            R.drawable.numero14,
            R.drawable.numero15,
            R.drawable.numero16,
            R.drawable.numero17,
            R.drawable.numero18,
            R.drawable.numero19,
            R.drawable.numero20,
            R.drawable.numero21,
            R.drawable.numero22,
            R.drawable.numero23,
            R.drawable.numero24,
            R.drawable.numero25,
            R.drawable.numero26,
            R.drawable.numero27,
            R.drawable.numero28,
            R.drawable.numero29,
            R.drawable.numero30,
            R.drawable.numero31,
            R.drawable.numero32,
            R.drawable.numero33,
            R.drawable.numero34,
            R.drawable.numero35,
            R.drawable.numero36,
            R.drawable.numero37,
            R.drawable.numero38,
            R.drawable.numero39,
            R.drawable.numero40,
            R.drawable.numero41,
            R.drawable.numero42,
            R.drawable.numero43,
            R.drawable.numero44,
            R.drawable.numero45,
            R.drawable.numero46,
            R.drawable.numero47,
            R.drawable.numero48,
            R.drawable.numero49,
            R.drawable.numero50,
            R.drawable.numero51,
            R.drawable.numero52,
            R.drawable.numero53,
            R.drawable.numero54,
            R.drawable.numero55,
            R.drawable.numero56,
            R.drawable.numero57,
            R.drawable.numero58,
            R.drawable.numero59,
            R.drawable.numero60,
            R.drawable.numero61,
            R.drawable.numero62,
            R.drawable.numero63,
            R.drawable.numero64,
            R.drawable.numero65,
            R.drawable.numero66,
            R.drawable.numero67,
            R.drawable.numero68,
            R.drawable.numero69,
            R.drawable.numero71,
            R.drawable.numero72,
            R.drawable.numero73,
            R.drawable.numero74,
            R.drawable.numero75,
            R.drawable.numero76,
            R.drawable.numero77,
            R.drawable.numero78,
            R.drawable.numero79,
            R.drawable.numero80,
            R.drawable.numero81,
            R.drawable.numero82,
            R.drawable.numero83,
            R.drawable.numero84,
            R.drawable.numero85,
            R.drawable.numero86,
            R.drawable.numero87,
            R.drawable.numero88,
            R.drawable.numero89,
            R.drawable.numero90,
            R.drawable.numero91,
            R.drawable.numero92,
            R.drawable.numero93,
            R.drawable.numero94,
            R.drawable.numero95,
            R.drawable.numero96,
            R.drawable.numero97,
            R.drawable.numero98,
            R.drawable.numero99,
            R.drawable.numero100

    };

    private ViewPager vpGallery;
    private Context context;
    private GalleryManager galleryManager;

    public GalleryTwoFragment() {
        this.currentIndex = 0;
        this.imageItems = new ArrayList();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(
                R.layout.main_fragment, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        context = getActivity();
        FragmentManager fragmentManager = getFragmentManager();
        galleryManager = new GalleryManager(fragmentManager);
        vpGallery =
                (ViewPager) getView().findViewById(R.id.vp_gallery);

        for (int i=0; i< photos.length; i++) {

            galleryManager.addFragment(FragmentImage.newInstace(photos[i]));
        }
        vpGallery.setAdapter(galleryManager);
        getActivity().onWindowFocusChanged(true);
    }

    public class GalleryManager extends FragmentPagerAdapter {
        List<Fragment> fragments;


        public GalleryManager(FragmentManager fm) {
            super(fm);
            fragments = new ArrayList();
        }

        public void addFragment(Fragment fragment){
            fragments.add(fragment);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

    }
    public static class FragmentImage extends Fragment {
        private static  final String KEY_IMAGE = "image";
        private int image;

        public static FragmentImage newInstace(int image){
            FragmentImage fragmentImage = new FragmentImage();
            Bundle bundle = new Bundle();
            bundle.putInt(KEY_IMAGE, image);
            fragmentImage.setArguments(bundle);
            fragmentImage.setRetainInstance(true);
            return fragmentImage;
        }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if(getArguments()!=null){
                image = getArguments().getInt(KEY_IMAGE);
            }
        }
        public FragmentImage(){

        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.gallery_layout, container, false);
            ImageView ivPhoto = (ImageView) rootView.findViewById(R.id.iv_photo);
            ivPhoto.setImageResource(image);
            return rootView;
        }
    }
}